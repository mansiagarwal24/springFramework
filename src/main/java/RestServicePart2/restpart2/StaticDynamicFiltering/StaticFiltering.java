package RestServicePart2.restpart2.StaticDynamicFiltering;

import RestServicePart2.restpart2.HateOAS.Student;
import RestServicePart2.restpart2.Versioning.User1;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StaticFiltering {
    List<Person> list = new ArrayList<>();

    @GetMapping("/person")
    public List<Person>getAllPerson(){
        return list;
    }

    @PostMapping("/person")
    public String addPerson(@RequestBody Person p){
        list.add(p);
        return "Person added";
    }

//    @GetMapping("/v1/user")
//    public List<User1>getUser1(){
//        return l1;
//    }
//    @PostMapping("/v1/user")
//    public String addUser1(@RequestBody User1 u){
//        l1.add(u);
//        return "user added";

}
