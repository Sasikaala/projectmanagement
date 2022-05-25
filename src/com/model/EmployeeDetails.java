package com.model;

import java.io.Serializable;

public class EmployeeDetails implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String employeeName;
	private int employeeId;
	private int projectNo;
	private int utilizedHours;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public int getUtilizedHours() {
		return utilizedHours;
	}
	public void setUtilizedHours(int utilizedHours) {
		this.utilizedHours = utilizedHours;
	}

}
