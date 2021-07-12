package Eureka.Client.ITSS;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Babin Sergiu
 */

public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();
}
