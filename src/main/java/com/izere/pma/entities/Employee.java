package com.izere.pma.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "employee_seq")
	private long empId;



	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private double salary;
	
	@ManyToMany( cascade= {CascadeType.DETACH,CascadeType.MERGE, CascadeType.REFRESH},
			fetch= FetchType.LAZY )
	@JoinTable(name="Employee_Project",
			   joinColumns=@JoinColumn(name="empId"),
			   inverseJoinColumns=@JoinColumn(name="projectId") )
	private List<Project> AssignedProj;
	
	


	public Employee() {
		
	}

	public Employee(String firstName, String lastName, int age, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Project> getAssignedProj() {
		return AssignedProj;
	}

	public void setAssignedProj(List<Project> assignedProj) {
		this.AssignedProj = assignedProj;
		
	}
	

}
