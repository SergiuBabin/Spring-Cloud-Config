package Eureka.Client.ITSS;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Babin Sergiu
 */

@RestController
public class GreetingController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public String greeting() {
        return String.format(
                "Hello from '%d'!", port);
    }

}