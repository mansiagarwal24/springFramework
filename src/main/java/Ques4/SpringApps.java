/*
    Get a Spring Bean from application context and display its properties.
 */
package Ques4;

import Ques3.SportsImp;
import Ques3.SpringBootApp;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class SpringApps {
    public static void main(String[] args) {

        ApplicationContext ap= SpringApplication.run(SpringApps.class, args);
        HotelImpl hp =ap.getBean(HotelImpl.class);

        hp.setLocation("Delhi");
        hp.setHotelName("Leela");

        //hp.getHotel();
        System.out.println("Loc : " + hp.getLocation());
        System.out.println("Name : " + hp.getHotelName());
    }
}
