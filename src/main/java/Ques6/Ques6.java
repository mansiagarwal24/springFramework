/*
  Perform Constructor Injection in a Spring Bean
 */
package Ques6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
class MessageSender {

    private MessageService messageService;

    @Autowired
    public MessageSender(MessageService messageService){
        this.messageService=messageService;
    }

    public void message(){
        messageService.sendMessage();
    }

}

interface MessageService {
    void sendMessage();
}

@Component
@Qualifier("EmailService")
@Primary
class EmailService implements MessageService{
    @Override
    public void sendMessage(){
        System.out.println("Email Message");
    }
}

@Component
@Qualifier("SMSService")
class SMSService implements MessageService{

    @Override
    public void sendMessage(){
        System.out.println("SMS Message");
    }
}
@SpringBootApplication
public class Ques6 {
    public static void main(String[] args) {
        ApplicationContext ac= SpringApplication.run(Ques6.class);
        MessageSender ms = ac.getBean(MessageSender.class);
        ms.message();
        System.out.println(ms);
    }

}
