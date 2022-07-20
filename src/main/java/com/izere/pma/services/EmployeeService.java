package com.izere.pma.services;

import com.izere.pma.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.izere.pma.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //without @Service annotation, this class wont be scanned by SpringBoot
public class EmployeeService {

// Field Injection
  @Autowired
EmployeeRepository employeeDAO;

  public List<Employee> getAll() {
    return employeeDAO.findAll();
  }

  public Employee save(Employee employee) {
    return employeeDAO.save(employee);
  }

//  public Employee delete(Employee employee) {
//    return employeeDAO.delete(employee);
//  }


//  Constructor Injection. Does not need @Autowired annotation 
//  public EmployeeService(Employee empServ) {
//	  super();
//	  this.empServ=empServ;
//  }
//
//  @Autowired //Setter Injection, need @Autowried to work
//  public void setEmpServ(Employee empServ) {
//	this.empServ = empServ;
//  }
//  
  
   // SELECT * FROM employee where salary > 5000;
   // SELECT * FROM emplyee where
}
