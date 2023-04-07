package com.JPApart2.JPA2;

import com.JPApart2.JPA2.ComponentMapping.EmpRepository;
import com.JPApart2.JPA2.ComponentMapping.Employe;
import com.JPApart2.JPA2.ComponentMapping.Salary;
import com.JPApart2.JPA2.JPQL_Native.Employee;
import com.JPApart2.JPA2.InheritanceMapping.TwoWheeler;
import com.JPApart2.JPA2.InheritanceMapping.VehicleRepository;
import com.JPApart2.JPA2.JPQL_Native.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class   Jpa2ApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	EmpRepository repo;
	@Autowired
	VehicleRepository vehicleRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateMethod(){
		Employee emp = new Employee();
		emp.setAge(21);
		emp.setFirstName("Esha");
		emp.setLastName("Gupta");
		emp.setSalary(35000d);

		Employee emp2 = new Employee();
		emp2.setAge(25);
		emp2.setFirstName("Riya");
		emp2.setLastName("Taneja");
		emp2.setSalary(25000d);

		Employee emp3 = new Employee();
		emp3.setAge(22);
		emp3.setFirstName("Abhishek");
		emp3.setLastName("Singh");
		emp3.setSalary(40000d);

		employeeRepository.save(emp);
		employeeRepository.save(emp2);
		employeeRepository.save(emp3);
	}

	@Test
	public void findAllByInfo(){
		List<Object[]> obj = employeeRepository.findAllByInfo(employeeRepository.avgSalary());
		for(Object[] objects : obj){
			System.out.print(objects[0]);
			System.out.print(" "+objects[1]);
			System.out.print(" "+objects[2]);
			System.out.println(" "+objects[3]);
		}
	}

	@Test
	public void updateEmpWithNewSalary(){
		employeeRepository.updateEmpNewSalary(25000d,employeeRepository.avgSalary());
	}

//	@Test
//	public void testAvgSalary(){
//		System.out.println(employeeRepository.avgSalary());
//	}

	@Test
	@Transactional
	public void deleteByMinSalary(){
		employeeRepository.deleteByMinSalary(employeeRepository.minSalary());
	}

	@Test
	public void findAllEmpEndsWithSingh(){
		List<Object[]> obj = employeeRepository.findAllEmpWith("Singh");
		for(Object[] objects : obj){
			System.out.print(" "+objects[0]);
			System.out.print(" "+objects[1]);
			System.out.println(" "+objects[2]);
		}
	}

	@Test
	public void testDeleteEmpWithAge(){
		employeeRepository.deleteEmployeeGreaterThanAge45(24);
	}

	//INHERITANCE MAPPING
	@Test
	public void testCreateVehicleEntity(){
		TwoWheeler veh = new TwoWheeler();
		veh.setSpeed(20);
		veh.setVehicleNo("DL-1234S");
		veh.setSeats(2);
		veh.setWheels(2);

		vehicleRepository.save(veh);
	}

	//COMPONENT TESTING
	@Test
	public void testComponentMapping(){
		Employe e = new Employe();
		e.setId(1);
		e.setAge(20);
		e.setFirstName("Mansi");
		e.setLastName("Aggarwal");
		Salary sal = new Salary();
		sal.setBasicSalary(200000);
		sal.setBonusSalary(3500f);
		sal.setSpecialAllowanceSalary(250.67f);
		sal.setTaxAmount(200.54f);
		e.setSalary(sal);

		repo.save(e);
	}
}
