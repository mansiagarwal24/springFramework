package com.SpringBoot.SpringBootAssignment;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface EmployeeDao extends CrudRepository<Employee,Long> {

}
