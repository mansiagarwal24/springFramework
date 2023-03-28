package Ques5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TopicImpl{
    @Autowired
    Topic topic;
    public void getTopic(){
        topic.info();
    }
}
interface Topic{
     void info();
}

@Component
@Primary
class SpringTopic implements Topic{
    @Override
    public void info() {
        System.out.println("Spring Framework");
    }
}
@Component
class MavenTopic implements Topic{
    @Override
    public void info() {
        System.out.println("Maven Topic");
    }
}

