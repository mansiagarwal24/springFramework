package com.restfulServices.Restfulservicepart1.Ques2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class EmployeeDAO {
    private static List<Employee> emp=new ArrayList<>();
    static{
        emp.add(new Employee("Mansi",123,23));
        emp.add(new Employee("Harshit",102,18));
        emp.add(new Employee("Simran",332,23));
        emp.add(new Employee("Vivek",213,20));
        emp.add(new Employee("Kiran",213,22));
        emp.add(new Employee("Vanshika",544,21));
    }

    public List<Employee> findAll(){
        return emp;
    }

    public Employee findOne(int id){
        Predicate<? super Employee> predicate= employee -> employee.getId().equals(id);
        return emp.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id){
        Predicate<? super Employee> predicate= employee -> employee.getId().equals(id);
        emp.removeIf(predicate);
    }

    public Employee createEmp(Employee employee){
        emp.add(employee);
        return employee;
    }

    public void updateEmployee(Employee employee){
        int index;
        for(Employee e:emp){
            if(e.getId().equals(employee.getId())){
                index=emp.indexOf(e);
                emp.set(index,employee);
                break;
            }
        }
    }
}

