package com.Sprinddatajpa.JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class JpaApplicationTests {
	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateEmployee(){
		Employee emp = new Employee();
		//emp.setId(3);
		emp.setName("Ravi");
		emp.setAge(28);
		emp.setLocation("Gurgaon");

		Employee emp1 = new Employee();
		emp1.setName("Shruti");
		emp1.setAge(25);
		emp1.setLocation("Chennai");

		repository.saveAll(List.of(emp,emp1));
	}

	@Test
	public void testReadData(){
		Employee emp = repository.findById(1).get();
		assertNotNull(emp);
		assertEquals("Mansi",emp.getName());
		System.out.println(emp.getLocation());
	}

	@Test
	public void testUpdateData(){
		Employee employee = repository.findById(1).get();
		employee.setAge(21);
		repository.save(employee);
	}

	@Test
	public void testDeleteData(){
		repository.deleteById(2);
	}

	@Test
	public void testCount(){
		System.out.println("Total Records: "+repository.count());
	}

	@Test
	public void testFindByName(){
		List<Employee> emp = repository.findByName("Mansi");
		emp.forEach(e-> System.out.println(e.getId()));
	}

	@Test
	public void testFindByNameLike(){
		List<Employee> emp = repository.findByNameLike("A%");
		emp.forEach(e-> System.out.println(e.getId()+" "+e.getName()));
	}

	@Test
	public void testFindByAgeBetween(){
		List<Employee> emp = repository.findByAgeBetween(28,32);
		emp.forEach(e-> System.out.println(e.getName()));
	}

	@Test
	public void testPagingAndSorting(){
		Pageable page = PageRequest.of(0,4,Sort.Direction.ASC,"age");
		repository.findAll(page).forEach(e-> System.out.println(e.getName()+" "+e.getAge()));
	}

}
