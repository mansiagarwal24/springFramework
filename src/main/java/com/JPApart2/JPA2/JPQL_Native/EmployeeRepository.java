package com.JPApart2.JPA2.JPQL_Native;

import com.JPApart2.JPA2.JPQL_Native.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    //JPQL QUERIES
    @Query("select firstName,lastName,salary,age from Employee where salary > :avgSalary ORDER BY age ASC,salary DESC ")
    List<Object[]> findAllByInfo(@Param("avgSalary") double salary);

    @Modifying
    @Transactional
    @Query("update Employee SET salary= :newSalary where salary < :avgSalary")
    void updateEmpNewSalary(@Param("newSalary") double newSalary, @Param("avgSalary") double avgSalary);

    @Query("select AVG(salary) from Employee" )
    double avgSalary();

//    @Modifying
//    @Transactional
//    @Query("Update Employee SET salary=:increment WHERE salary<:avgSalary")
//    void updateEmployeesBySalary(@Param("increment") int increment,@Param("avgSalary") Long avgSalary);
//
//    @Query("Select AVG(salary) from Employee")
//    Long avgSalary();

    @Modifying
    @Query("delete from Employee where salary = :minSalary")
    void deleteByMinSalary(@Param("minSalary") double minSalary);

    @Query("select MIN(salary) from Employee" )
    double minSalary();

    //NATIVE QUERIES
    @Query(value = "select emp_id,emp_first_name,emp_age from employee_table where emp_last_name=:last_name", nativeQuery = true)
    List<Object[]> findAllEmpWith(@Param("last_name") String last_name);

    @Modifying
    @Transactional
    @Query(value ="delete from employee_table where (emp_age > :age);" ,nativeQuery = true)
    void deleteEmployeeGreaterThanAge45(@Param("age") int age);
}
