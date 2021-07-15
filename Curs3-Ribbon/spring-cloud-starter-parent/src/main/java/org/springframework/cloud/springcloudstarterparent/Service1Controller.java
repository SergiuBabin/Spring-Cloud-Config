package org.springframework.cloud.springcloudstarterparent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class Service1Controller {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @GetMapping
    public String welcome(){
        ServiceInstance instance = this.loadBalancer.choose("service2");
        URI uri = URI.create(String.format("http://%s:%s/", instance.getHost(), instance.getPort()));
        return "Welcome to Service1 , Service 2(URI: "+uri+") Response -"
                +restTemplate.getForObject(uri, String.class);
    }
}
