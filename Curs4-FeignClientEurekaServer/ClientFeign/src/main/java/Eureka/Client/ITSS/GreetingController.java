package Eureka.Client.ITSS;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Babin Sergiu
 */

@RestController
public class GreetingController {

    @Autowired
    Word word;

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String getWord() {
        return String.format("%s %s %s %s %s (from Feign with port = %s)", word.getSubject(), word.getVerb(), word.getArticle(), word.getAdjective(), word.getNoun(), port);
    }


}