package RestServicePart2.restpart2.StaticDynamicFiltering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StaticFiltering {

    @GetMapping("/person")
    public List<Person>getPersonlist(){
        return Arrays.asList(new Person("Mansi",2,"favplace"));
    }
//    @PostMapping("/person")
//    public Person addPerson(@RequestBody Person p1){
//        dataList.add(p1);
//        return p1;
//    }
}
