package com.izere.pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.izere.pma.dto.ProjectChart;
import com.izere.pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project,Long>{
	
	@Override
	public List<Project> findAll();
	
//	@Query("SELECT stage as label, COUNT(*) as value "
//			+ "FROM project "
//			+ "GROUP BY stage")
//	public List<ProjectChart> projectPieChart();
}
