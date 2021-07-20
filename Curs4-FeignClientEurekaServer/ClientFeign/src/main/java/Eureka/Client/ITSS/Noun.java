package Eureka.Client.ITSS;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Babin Sergiu
 */

@FeignClient("Noun")
@Component
public interface Noun {
    @GetMapping("/")
    String getWord();
}