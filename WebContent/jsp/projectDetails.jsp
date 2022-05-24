<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Management</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
<%@page import="com.model.ProjectDetails"%>
<%@page import="java.util.Iterator"%> 

<strong><a href="<%=request.getContextPath()%>/ProjectManagementServlet?type=getDetails">Show Project Details</a></strong>
<br></br>
<% ArrayList<ProjectDetails> projList = (ArrayList) request.getAttribute("projList"); %> <%--Assigning ArrayList object containing project data to the local object --%>



<%
// Iterating through projectList

if(request.getAttribute("projList") != null)  // Null check for the object
{%>
<table cellspacing="2" border = 1 width = "50%" cellpadding="2">

	<tr><th>Projects</th>
	
	<%Iterator<ProjectDetails> iterator = projList.iterator();  // Iterator interface
	
	while(iterator.hasNext())  // iterate through all the data until the last record,
	{
		ProjectDetails projDetails = iterator.next(); //assign individual project record to the ProjectDetails class object
		session.setAttribute("projTasks",projDetails.getTasks());
	%>
	
		<tr><td><a href="jsp/projectData.jsp?projectNo=<%=projDetails.getProjectNo()%>&projectName=<%=projDetails.getProjectName()%>&duration=<%=projDetails.getDuration()%>&utilizedHours=<%=projDetails.getUtilizedHours()%>&remainingTime=<%=projDetails.getRemainingTime()%> "><%=projDetails.getProjectName()%></a></td>
		
	</tr>
	<%
	}
}
%>
</table>

</body>
</html>