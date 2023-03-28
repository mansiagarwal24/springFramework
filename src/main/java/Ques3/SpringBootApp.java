/*
   Use @Component and @Autowired annotations to in Loosely Coupled code for dependency management
 */
package Ques3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootApp{
        public static void main(String[] args) {

          ApplicationContext ap=SpringApplication.run(SpringBootApp.class, args);
          SportsImp sp=ap.getBean(SportsImp.class);
          sp.getSports();
        }

}


