package RestServicePart2.restpart2.StaticDynamicFiltering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.persistence.Transient;

import java.util.ArrayList;
import java.util.List;

//@JsonFilter("PersonFilter") //used for dynamic filtering part
public class Person {
    //@JsonProperty("user_name")// change name to user name
    private String name;
    private int age;
   @JsonIgnore //(used for static filtering)
    private String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }


}
