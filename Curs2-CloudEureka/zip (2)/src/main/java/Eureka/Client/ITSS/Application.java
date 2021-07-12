package Eureka.Client.ITSS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application implements GreetingController {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public String greeting() {
		return String.format(
				"Hello from '%s'!");
	}
}
