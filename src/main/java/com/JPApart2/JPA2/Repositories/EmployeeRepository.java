package com.JPApart2.JPA2.Repositories;

import com.JPApart2.JPA2.Entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    @Query("select firstName,lastName from Employee where salary>(select AVG(salary) from Employee order by age)order by salary DESC ")
    List<Object[]> findAllByInfo();

    @Modifying
    @Query("delete from Employee where salary = (select MIN(salary) from Employee)")
    void deleteByMinSalary();
}
