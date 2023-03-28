package Ques3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SportsImp{
    @Autowired
    Sport sport;
    public void getSports(){
        sport.info();
    }

}
interface Sport{
     void info();
}


class Badminton implements Sport{
    @Override
    public void info() {
        System.out.println("Badminton");
    }
}
@Component
class Cricket implements Sport{
    @Override
    public void info() {
        System.out.println("Cricket");
    }
}

