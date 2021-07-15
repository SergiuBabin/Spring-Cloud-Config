package Eureka.Client.ITSS;

import Eureka.Client.ITSS.Entity.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Babin Sergiu
 */

@RestController
public class GreetingController {

    private final Random random = new Random();

    @Value("${application.words}")
    private String[] wordString;

    @GetMapping("/")
    public String[] getWord() {
        return wordString;
    }
}