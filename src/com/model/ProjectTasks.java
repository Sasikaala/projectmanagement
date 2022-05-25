package com.model;

import java.io.Serializable;
import java.util.List;

public class ProjectTasks implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int taskNo;
	private int projectNo;
	private String taskName;
	private int requiredHours;
	private int utilizedHours;
	private String resourceType;
	private List<EmployeeDetails> projectMembers;
	public ProjectTasks(int taskNo, int projectNo, String taskName, int requiredHours, String resourceType,List<EmployeeDetails> projectMembers,int utilizedHours) {
		super();
		this.taskNo = taskNo;
		this.projectNo = projectNo;
		this.taskName = taskName;
		this.requiredHours = requiredHours;
		this.resourceType = resourceType;
		this.setProjectMembers(projectMembers);
		this.utilizedHours = utilizedHours;
	}
	public int getTaskNo() {
		return taskNo;
	}
	public void setTaskNo(int taskNo) {
		this.taskNo = taskNo;
	}
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getRequiredHours() {
		return requiredHours;
	}
	public void setRequiredHours(int requiredHours) {
		this.requiredHours = requiredHours;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public List<EmployeeDetails> getProjectMembers() {
		return projectMembers;
	}
	public void setProjectMembers(List<EmployeeDetails> projectMembers) {
		this.projectMembers = projectMembers;
	}
	public int getUtilizedHours() {
		return utilizedHours;
	}
	public void setUtilizedHours(int utilizedHours) {
		this.utilizedHours = utilizedHours;
	}
	

}
