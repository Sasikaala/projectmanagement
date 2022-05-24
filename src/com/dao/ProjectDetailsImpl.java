package com.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.EmployeeDetails;
import com.model.ProjectDetails;
import com.model.ProjectTasks;

public class ProjectDetailsImpl implements ProjectDetailsInterface {
    
	
	@Override
	public List<ProjectDetails> getProjectDetails() {
		//set employee values
	
		
		//Set project details	
		LocalDate futureDate = LocalDate.now().plusMonths(1);
		List<ProjectTasks> projectTasks = getProjectTasks(1991);
		ProjectDetails proj = new ProjectDetails(1991, "Hotel Management",getTotalProjectHours(projectTasks), 10, 110, projectTasks,new Date(),futureDate);
		
		List<ProjectDetails> projectsList = new ArrayList<ProjectDetails>();
		
		projectsList.add(proj);
		
		return projectsList;
	
	}

	@Override
	public List<ProjectTasks> getProjectTasks(int projectNo) {
		
		if(projectNo == 1991) {
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmployeeId(123);
		emp.setEmployeeName("Sasi");
		
		EmployeeDetails emp1 = new EmployeeDetails();
		emp.setEmployeeId(124);
		emp.setEmployeeName("Prem");
		
		EmployeeDetails emp2 = new EmployeeDetails();
		emp.setEmployeeId(12344);
		emp.setEmployeeName("Nithilan");
		
		EmployeeDetails emp3 = new EmployeeDetails();
		emp.setEmployeeId(12432);
		emp.setEmployeeName("Nivethika");
		
		EmployeeDetails emp4 = new EmployeeDetails();
		emp.setEmployeeId(1248);
		emp.setEmployeeName("Nithura");
		
		
		
		
		List<EmployeeDetails> empList =new ArrayList<EmployeeDetails>();
		empList.add(emp);
		empList.add(emp1);
		
		List<EmployeeDetails> empList1 =new ArrayList<EmployeeDetails>();
		empList.add(emp2);
		empList.add(emp3);
		
		List<EmployeeDetails> empList3 =new ArrayList<EmployeeDetails>();
		empList.add(emp4);
		ProjectTasks projTask = new ProjectTasks(1001, 1991, "Room Booking", 40, "Java Developer", empList);
		ProjectTasks projTask1= new ProjectTasks(1002, 1991, "Food Order", 30, "Java Developer", empList1);
		ProjectTasks projTask2 = new ProjectTasks(1002, 1991, "Testing", 30, "Tester", empList3);
		
		
		List<ProjectTasks> projectTasksList =new ArrayList<ProjectTasks>();
		projectTasksList.add(projTask);
		projectTasksList.add(projTask1);
		projectTasksList.add(projTask2);
		
		return projectTasksList;
		}
		return null;
	}
	
	public int getTotalProjectHours(List<ProjectTasks> projectTasks) {
		int totalHours=0;
		for(ProjectTasks projectTask : projectTasks) {
			totalHours+= projectTask.getRequiredHours();
		}
		return totalHours;
		}

}
