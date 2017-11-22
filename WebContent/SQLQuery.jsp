<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<sql:setDataSource
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://cs3.calstatela.edu/cs3220stu67?verifyServerCertificate=false&useSSL=true"
	user="cs3220stu67"
	password="8xkG!NlF"
	/>
	
	
	<!--the catch here catches an error thrown by the query command
		such as a executeUpdate error -->
	<c:catch var="catchException">
		<c:if test="${not empty param.sql}">
		    <sql:query var="queries">
			${param.sql}
			</sql:query>
	    </c:if>
    </c:catch>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<title>JSTL SQL Query</title>
</head>
<body>
	<div class="container">
	
		<div class="page-header">
			<h3>SQL Query</h3>
		</div>
		
		<div class="well">
			<form action="SQLQuery.jsp" method="post">
			
			
<!-- 				First checks if the query has been entered or not if a query has been entered it would have gone through the catch statement from earlier and thrown an exception if there was an error -->
<!-- 				if there was an error it prompts the user that an invalid query has been inputed			 -->
				<c:if test="${not empty param.sql}">
					<c:if test="${catchException != null}">
						<p class="lead text-danger">Invalid Query: <code>${param.sql} </code></p>
					</c:if>
				</c:if>
				
				<div class="form-group">
					<textarea class="form-control" rows="5" name="sql"></textarea>
				</div>
				
				<div class="text-center">
					<input class="btn btn-primary" type="submit" name="subQuery" value="Execute Query">
				</div>
		    
			</form>
		</div>
		
		<c:if test="${queries.rowCount > 0}">
		
			<p><strong>${queries.rowCount} record(s)</strong> returned for: <code>${param.sql}</code></p>
		
			<table class="table table-striped table-bordered table-hover">
			
				<tr>
				<c:forEach items="${queries.columnNames}" var="colName">
					<th> ${colName}</th>
				</c:forEach>
				</tr>
				
				<c:forEach items="${queries.rowsByIndex}" var="row">
					<tr>
				 	 <c:forEach items="${row}" var="col">
				  		<td>${col}</td>
				  	</c:forEach>
					</tr>
				</c:forEach>
				
			</table>
		</c:if>
		
	</div>
</body>
</html>