package Eureka.Client.ITSS;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Babin Sergiu
 */

@Component
public class Word {
    @Autowired
    Verb verb;

    @Autowired
    Subject subject;

    @Autowired
    Noun noun;

    @Autowired
    Article article;

    @Autowired
    Adjective adjective;

    @HystrixCommand(fallbackMethod = "getVerbFallback")
    public String getVerb() {
        return verb.getWord();
    }

    public String getVerbFallback(){
        return "VERB";
    }

    @HystrixCommand(fallbackMethod = "getSubjectFallBack")
    public String getSubject() {
        return subject.getWord();
    }

    public String getSubjectFallBack(){
        return "SUBJECT";
    }

    @HystrixCommand(fallbackMethod = "getNounFallBack")
    public String getNoun() { return noun.getWord(); }

    public String getNounFallBack(){
        return "NOUN";
    }

    @HystrixCommand(fallbackMethod = "getArticleFallBack")
    public String getArticle() {
        return article.getWord();
    }

    public String getArticleFallBack(){
        return "ARTICLE";
    }

    @HystrixCommand(fallbackMethod = "getAdjectiveFallBack")
    public String getAdjective() {
        return adjective.getWord();
    }

    public String getAdjectiveFallBack(){
        return "ADJECTIVE";
    }


}
