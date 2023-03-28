/*
    Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
 */
package Ques5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringApp {
    public static void main(String[] args) {

        ApplicationContext ap= SpringApplication.run(SpringApp.class, args);
        TopicImpl tp=ap.getBean(TopicImpl.class);
        tp.getTopic();
    }
}
