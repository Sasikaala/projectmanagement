package com.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ProjectDetails {
	private int projectNo;
	private String projectName;
	private int duration;
	private int utilizedHours;
	private int remainingTime;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<ProjectTasks> tasks;
	
	
	public ProjectDetails(int projectNo, String projectName, int duration, int utilizedHours, int remainingTime,
			List<ProjectTasks> tasks,LocalDate startDate,LocalDate endDate) {
		super();
		this.projectNo = projectNo;
		this.projectName = projectName;
		this.duration = duration;
		this.utilizedHours = utilizedHours;
		this.remainingTime = remainingTime;
		this.setTasks(tasks);
		this.startDate = startDate;
		this.setEndDate(endDate);
	}
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getUtilizedHours() {
		return utilizedHours;
	}
	public void setUtilizedHours(int utilizedHours) {
		this.utilizedHours = utilizedHours;
	}
	public int getRemainingTime() {
		return remainingTime;
	}
	public void setRemainingTime(int remainingTime) {
		this.remainingTime = remainingTime;
	}
	public List<ProjectTasks> getTasks() {
		return tasks;
	}
	public void setTasks(List<ProjectTasks> tasks) {
		this.tasks = tasks;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "ProjectDetails [projectNo=" + projectNo + ", projectName=" + projectName + ", duration=" + duration
				+ ", utilizedHours=" + utilizedHours + ", remainingTime=" + remainingTime + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", tasks=" + tasks + "]";
	}

}
