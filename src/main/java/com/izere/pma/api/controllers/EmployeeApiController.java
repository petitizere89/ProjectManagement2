package com.izere.pma.api.controllers;

import com.izere.pma.dao.EmployeeRepository;
import com.izere.pma.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app-api/employees")
public class EmployeeApiController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public Iterable<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeRepository.findByEmpId(id).get(0);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PutMapping(path = "/{id}", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Employee update(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PatchMapping(path = "/{id}", consumes = "application/json")
    public Employee partialUpdate(@PathVariable( "id") Long id, @RequestBody Employee patchEmployee) {
      Employee employee = employeeRepository.findById(id).get();
      if(patchEmployee.getFirstName() != null){
          employee.setFirstName(patchEmployee.getFirstName());
        }
      if(patchEmployee.getLastName() != null) {
          employee.setLastName(patchEmployee.getLastName());
      }
      return employeeRepository.save(employee);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        try {
            employeeRepository.deleteById(id);

        }catch (EmptyResultDataAccessException e){
        }
    }
}
