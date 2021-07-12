package Spring.Cloud.Client.ITSS.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Babin Sergiu
 */

@RestController
@RequestMapping("/hello")
public class BasicController {

    @Value("${service.greeting}")
    private String serviceName;

    @GetMapping
    public String getName() {
        return "Hello from " + serviceName;
    }
}
