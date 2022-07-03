package com.izere.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.izere.pma.dao.EmployeeDAO;
import com.izere.pma.dao.ProjectRepository;
import com.izere.pma.entities.Employee;
import com.izere.pma.entities.Project;

@Controller
public class HomeController {
	
	@Value("${version}")
	String ver;
	
    @Autowired
	EmployeeDAO empDao;
    
    @Autowired
    ProjectRepository proDao;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		
		model.addAttribute("versionNumber", ver);
		
		List<Project> projects = proDao.findAll();
		model.addAttribute("homeProjects",projects);
		
		List<Employee> employees = empDao.findAll();
		model.addAttribute("anEmployee",employees);
		return"main/Home";
	}
}
