package com.dao;

import java.util.List;

import com.model.ProjectDetails;
import com.model.ProjectTasks;

public interface ProjectDetailsInterface {
	
	//This method retrieves list of projects
	public List<ProjectDetails> getProjectDetails();
	//This method retrieves list of project tasks
	public List<ProjectTasks> getProjectTasks(int projectNo);

}
