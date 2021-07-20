package Eureka.Client.ITSS;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Babin Sergiu
 */


@FeignClient(value = "Verb")
public interface Verb {

    @GetMapping("/")
    public String getWord();
}
