package com.SpringBoot.SpringBootAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class EmployeeController implements CommandLineRunner {
    @Autowired
    EmployeeDao ed;
    List<Employee> employeeList = new ArrayList<>();

    @GetMapping("/employee")
    public List<Employee> getEmployeeList(){
        ed.findAll().forEach(employeeList::add);
        return employeeList;
    }

    @Override
    public void run(String... args) throws Exception {
        ed.save(new Employee("Mansi",1,"SDE"));
        ed.save(new Employee("Manvi",2,"SDE"));
    }
}
