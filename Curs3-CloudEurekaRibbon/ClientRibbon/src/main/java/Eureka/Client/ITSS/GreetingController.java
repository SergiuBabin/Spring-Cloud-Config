package Eureka.Client.ITSS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Babin Sergiu
 */

@RestController
public class GreetingController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/hello")
    public String invokePaymentService() {
        return template.getForObject("http://spring-cloud-eureka-client-peer2/hello", String.class);
    }

    @GetMapping("/test")
    public String test() {
        return "working....";
    }

}

