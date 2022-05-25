package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProjectDetailsImpl;
import com.dao.ProjectDetailsInterface;
import com.model.ProjectTasks;
public class ProjectManagementServlet 
	extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("Inside Servlet");	
			 
			String type = request.getParameter("type");
			
			
			if(type.equals("getDetails"))
			{
			  ProjectDetailsInterface projDet = new ProjectDetailsImpl();
			  
			  request.setAttribute("projList",  projDet.getProjectDetails());
			
			  request.getRequestDispatcher("jsp/projectDetails.jsp").forward(request, response); 		  
			}if(type.equals("getStatus"))
			{
				int projectNo = (Integer.parseInt(request.getParameter("projectNo")));
				String startDate = request.getParameter("startDate");
				String endDate = request.getParameter("endDate");
				System.out.println(projectNo);	
				PrintWriter out = response.getWriter();
				  ProjectDetailsInterface projDet = new ProjectDetailsImpl();
				  List<ProjectTasks> projTasks=projDet.getProjectTasks(projectNo);
				  request.setAttribute("getAlert", "Yes");
				  if(projDet.getProjectCompletionStatus(projTasks,startDate,endDate)) {
				  /*out.println("<script type=\"text/javascript\">");
				   out.println("alert('Project can be completed on time');");
				   out.println("location='jsp/projectData.jsp';");
				   out.println("</script>");*/
					  request.setAttribute("showSuccess", "Yes");
				
				  }else {
					  /*out.println("<script type=\"text/javascript\">");
					   out.println("alert('Project hours are lagging');");
					   out.println("location='jsp/projectData.jsp';");
					   out.println("</script>");*/
					  request.setAttribute("showFailure", "Yes");
				  }
				  request.getRequestDispatcher("jsp/projectData.jsp").forward(request, response); 		  
				}
		}
	}


