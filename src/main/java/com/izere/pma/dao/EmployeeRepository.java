package com.izere.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.izere.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	@Override
	public List<Employee> findAll();


	List<Employee> findByEmpId(Long id);

//	@Query("SELECT e.first_name as firstName, e.last_name as lastName, COUNT(pe.emp_id) as projectCount "
//			+ "FROM employee e left join employee_project pe ON pe.emp_id= e.emp_id "
//			+ "GROUP BY e.first_name, e.last_name ORDER BY 3 DESC")
//	public List<EmployeeProjects> projectEmployee();
}
