package com.restfulServices.Restfulservicepart1.Ques2;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResource {
    private EmployeeDAO empService;
    public EmployeeResource(EmployeeDAO empService){
        this.empService=empService;
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmp(){
        return empService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getSpecificEmp(@PathVariable int id){
        Employee emp = empService.findOne(id);
        if(emp==null){
            throw new EmployeeNotFoundException("id:"+id);
        }
        return emp;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmp(@PathVariable int id) {
        empService.deleteById(id);
    }

    @PostMapping("/employees")
    public void createEmployee(@Valid @RequestBody Employee employee){
       empService.createEmp(employee);
    }

    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee employee){
        empService.updateEmployee(employee);
    }
}
