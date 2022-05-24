package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDetailsImpl;
import com.dao.ProjectDetailsInterface;
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
			}
		}
	}


