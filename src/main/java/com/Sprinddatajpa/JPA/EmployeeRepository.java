package com.Sprinddatajpa.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>,PagingAndSortingRepository<Employee,Integer> {

    //Finder method Name
    List<Employee> findByName(String name);

    //Finder method Between
    List<Employee> findByAgeBetween(int age1,int age2);

    //Finder method Like
    List<Employee> findByNameLike(String name);
}
