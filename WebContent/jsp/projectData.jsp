<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.model.EmployeeDetails"%>
<%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
<%@page import="com.model.ProjectDetails"%>
<%@page import="com.model.ProjectTasks"%>
<%@page import="java.util.Iterator"%> 
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<script type="text/javascript">
var Msg ='<%=request.getAttribute("getAlert")%>';
 if (Msg != "null") {
	 function alertName(){
		 var Msg1 ='<%=request.getAttribute("showSuccess")%>';
		 if (Msg != "Yes") {
				 alert("Project can be completed on time");
		 }
				 else
					 alert("Project cannot be completed on time"); 
	 } 
 }
 </script>
<%
 String projectName = request.getParameter("projectName");
String projectNo = request.getParameter("projectNo");
String duration = request.getParameter("duration");
String utilizedHours = request.getParameter("utilizedHours");
String remainingTime = request.getParameter("remainingTime");
String startDate = request.getParameter("startDate");
String endDate = request.getParameter("endDate");
ArrayList<ProjectTasks> projTasks = (ArrayList)session.getAttribute("projTasks");

%>

<table border=1 cellspacing=0>
  <tr>
    <th>Project No</th>
    <th>Project Name</th>
    <th>Duration</th>
    <th>Utilized Hours</th>
    <th>Remaining time</th>
    <th>Project Tasks Details</th>
    <th>Start Date</th>
    <th>End Date</th> 
    
  </tr>
  <tr>
    <td><%=projectNo%></td>
    <td><%=projectName%></td>
    <td><%=duration%><br/><br/> </td>
    <td><%=utilizedHours%></td>
    <td><%=remainingTime%></td>
    <td>
    <table border=1>
	<tr>
    <th>Task Name</th>
    <th>Required Hours</th>
    <th>Utilized Hours</th>
    <th>Resource Type</th>
  </tr>
   <%  if(projTasks != null)  // Null check for the object
{
	Iterator<ProjectTasks> iterator = projTasks.iterator();  // Iterator interface
	
	while(iterator.hasNext())  // iterate through all the data until the last record
	{
		ProjectTasks projTask = iterator.next(); //assign individual employee record to the employee class object
	%>

	<tr>
	<td>
		<%=projTask.getTaskName()%>
	</td>
	<td>
		<%=projTask.getRequiredHours()%>
	</td>
	<td>
		<%=projTask.getUtilizedHours()%>
	</td>
	<td>
		<%=projTask.getResourceType()%>
	</td>
	</tr>
	
	<%
	}
	
}
    %>
    </table>
    <strong><a href="<%=request.getContextPath()%>/ProjectManagementServlet?type=getStatus&projectNo=<%=projectNo%>&startDate=<%=startDate%>&endDate=<%=endDate%>">Get Progress</a></strong> 
    </td>
    <td><%=startDate%></td>
    <td><%=endDate%></td> 
  </tr>
 
</table>
<script type="text/javascript"> window.onload = alertName; </script>
</body>
</html>