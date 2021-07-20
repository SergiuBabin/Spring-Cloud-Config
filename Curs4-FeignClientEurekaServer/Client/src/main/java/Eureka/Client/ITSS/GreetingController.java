package Eureka.Client.ITSS;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Random;

/**
 * @author Babin Sergiu
 */

@RestController
public class GreetingController {

    private final Random random = new Random();

    @Value("${words}")
    private String[] wordString;

    @GetMapping("/")
    public String getWord() {
        return wordString[random.nextInt(wordString.length)];
    }


}