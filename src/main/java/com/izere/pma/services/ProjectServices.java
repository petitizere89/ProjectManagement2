package com.izere.pma.services;

import com.izere.pma.dao.ProjectRepository;
import com.izere.pma.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServices {

    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAll(){
        return projectRepository.findAll();
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
