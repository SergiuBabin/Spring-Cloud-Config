package Eureka.Client.ITSS;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author Babin Sergiu
 */

@Component
@Configuration
@ConfigurationProperties(prefix = "application")
public class AppWords {

    private List<String> words;

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}