package com.JPApart2.JPA2;

import com.JPApart2.JPA2.Entities.Employee;
import com.JPApart2.JPA2.Repositories.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class   Jpa2ApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateMethod(){
		Employee emp = new Employee();
		emp.setAge(21);
		emp.setFirstName("Esha");
		emp.setLastName("Gupta");
		emp.setSalary(35000);

		Employee emp2 = new Employee();
		emp.setAge(25);
		emp.setFirstName("Riya");
		emp.setLastName("Taneja");
		emp.setSalary(25000);

		Employee emp3 = new Employee();
		emp.setAge(22);
		emp.setFirstName("Abhishek");
		emp.setLastName("Singh");
		emp.setSalary(40000);

		employeeRepository.saveAll(List.of(emp,emp2,emp3));
	}

	@Test
	public void findAllByInfo(){
		List<Object[]> obj = employeeRepository.findAllByInfo();
		for(Object[] objects : obj){
			System.out.println(objects[0]);
			//System.out.println(objects[1]);
		}
	}

	@Test
	@Transactional
	public void deleteByMinSalary(){
		employeeRepository.deleteByMinSalary();
	}
}
