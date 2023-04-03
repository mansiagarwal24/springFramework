package RestServicePart2.restpart2.StaticDynamicFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class DynamicFiltering {


    @GetMapping("/dynamic-api")
    public MappingJacksonValue getPersonlist() {
        Person p = new Person("Mansi", 20, "favplace");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(p);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name","age");
        FilterProvider filters = new SimpleFilterProvider().addFilter("PersonFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

    @GetMapping("/dynamic-api2")
    public MappingJacksonValue getPersonlst() {
        Person p = new Person("Aditi", 25, "filter");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(p);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name");
        FilterProvider filters = new SimpleFilterProvider().addFilter("PersonFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }


}
