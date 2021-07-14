package Spring.Cloud.Eureka.ITSS.Client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Babin Sergiu
 */

@RestController
@RequestMapping("/hello-worlds")
public class BasicController {

    @Value("${app.service.name}")
    private String serviceName;

    @GetMapping("/{name}")
    public String getHelloWorld (@PathVariable String name)
    {
        return "Hello World "+name;
    }
}
