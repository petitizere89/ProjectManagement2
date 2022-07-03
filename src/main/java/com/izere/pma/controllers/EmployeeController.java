package com.izere.pma.controllers;

import java.util.List;

import com.izere.pma.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.izere.pma.entities.Employee;

@Controller // this is called a component scanning,
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService; // this is called a Field Injection
	
	/*public EmployeeController(EmployeeDAO empDAO); <--this is called a constructor injection
	 * {
	 *     this.empDAO=empDAO;
	 * } this does not need @Autowired annotation. Only Field Injection and Setter Injection need @Autowired annotation
	 */
	
	@GetMapping
	public String displayEmployees(Model model) {
		
		List<Employee> employees= employeeService.getAll();
		model.addAttribute("employees",employees);
		
		return"/employees/List-Employee";
		
	}
	
	@GetMapping("/newEmployee")
	public String DisplayeEmployeeHTML(Model model) {
		Employee emp = new Employee();
		model.addAttribute("employee",emp);
		
		List<Employee> employee = employeeService.getAll();
		model.addAttribute("empDisplay",employee);
		return "employees/Employee";
	}
	
	
	@PostMapping("/save")
	public String saveEmployee(Employee emp, Model model) {
		employeeService.save(emp);
		return"redirect:/employees/newEmployee";
	}
	
	

}
