package com.izere.pma;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.izere.pma.dao.EmployeeDAO;
import com.izere.pma.dao.ProjectRepository;
import com.izere.pma.entities.Employee;
import com.izere.pma.entities.Project;

@SpringBootApplication
public class ProjectManagementApplication {

    @Autowired
    ProjectRepository proRepo;

    @Autowired
    EmployeeDAO empDAO;

    public static void main(String[] args) {

        SpringApplication.run(ProjectManagementApplication.class, args);
    }

	/*
 	@Bean
	CommandLineRunner runner() {

		return args -> {
			//public Employee(String firstName, String lastName, int age, double salary) {
//
			Employee emp1 = new Employee("John", "Warton", 22,32);
			Employee emp2 = new Employee("Mike", "Lanister", 11,21);
			Employee emp3 = new Employee("Steve", "Reeves", 55,3242334);
//
			Employee emp4 = new Employee("Ronald", "Connor", 43,3234452);
			Employee emp5 = new Employee("Jim", "Salvator", 25,33434);
			Employee emp6 = new Employee("Peter", "Henley", 55,3323);
//
			Employee emp7 = new Employee("Richard", "Carson", 33,2432);
			Employee emp8 = new Employee("Honor", "Miles", 21,66544);
			Employee emp9 = new Employee("Tony", "Roggers", 44,32);
//
//
			Project pro1 = new Project("Large Production Deploy", "NOTSTARTED", "This requires all hands on deck for"
					+ "the final deployment of the software into production");
			Project pro2 = new Project("New Employee Budget",  "COMPLETED", "Decide on a new employee bonus budget"
					+ "for the year and figureout who will be promoted");
			Project pro3 = new Project("Office Reconstruction", "INPROGRESS", "The office building in Monroe has "
					+ "been damaged due to hurricane in the region. This needs to be reconstructed");
			Project pro4 = new Project("Improve Intranet Security", "INPROGRESS", "With the recent data hack, the office"
					+ "security needs to be improved and proper security team needs to be hired for "
					+ "implementation");
//
//
//
//			// need to set both sides of the relationship manually
//
			pro1.addEmployees(emp1);
			pro1.addEmployees(emp2);
			pro2.addEmployees(emp1);
			pro3.addEmployees(emp1);
			pro4.addEmployees(emp1);
			pro4.addEmployees(emp3);
//
//
//			// need to set both sides of the relationship manually
//
			emp1.setAssignedProj(Arrays.asList(pro1, pro3, pro4));
			emp2.setAssignedProj(Arrays.asList(pro1));
			emp3.setAssignedProj(Arrays.asList(pro2, pro4));
////
////			// save employees in database
////
			empDAO.save(emp1);
			empDAO.save(emp2);
			empDAO.save(emp3);
			empDAO.save(emp4);
			empDAO.save(emp5);
			empDAO.save(emp6);
			empDAO.save(emp7);
			empDAO.save(emp8);
			empDAO.save(emp9);
////
////
////			// save projects in database
////
			proRepo.save(pro1);
			proRepo.save(pro2);
			proRepo.save(pro3);
			proRepo.save(pro4);
//
//
		};
//
	}
 */

}