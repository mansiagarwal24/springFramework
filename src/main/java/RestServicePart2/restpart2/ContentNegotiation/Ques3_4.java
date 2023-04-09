package RestServicePart2.restpart2.ContentNegotiation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.MediaName;
import javax.print.attribute.standard.MediaTray;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Ques3_4 {
    List<User>list=new ArrayList<>();

    @GetMapping(value = "/users",produces ="MediaType_application/xml")
    public List<User> getuser(){
        return list;
    }
    @PostMapping(value = "/users",consumes ="MediaType_application/xml")
    public User adduser(@RequestBody User u){
        list.add(u);
        return u;
    }


}
