package com.izere.pma.api.controllers;

import com.izere.pma.dao.ProjectRepository;
import com.izere.pma.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app-api/projects")
public class ProjectApiController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Project getProjectById(@PathVariable("id") Long id) {
        return projectRepository.findById(id).get();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Project createProjectById(@RequestBody Project project){
        return projectRepository.save(project);
    }

    @PatchMapping(path = "/{id}", consumes =  "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Project update(@PathVariable("id") Long id, @RequestBody Project project) {
        Project project1 = projectRepository.findById(id).get();
        if(project.getName() !=null) {
            project1.setName(project.getName());
        }
        if(project.getEmployees() != null) {
            project1.setEmployees(project.getEmployees());
        }
        return projectRepository.save(project1);
    }

    @DeleteMapping(path = "/{id}", consumes = "application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") Long id) {
        projectRepository.deleteById(id);
    }

}
