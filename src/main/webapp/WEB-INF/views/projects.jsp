<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>Work history | Arto Hänninen</title>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

	<link href="<c:url value='/resources/css/bootstrap.min.css' />" rel="stylesheet">
	<link href="<c:url value='/resources/css/custom.css' />" rel="stylesheet">
	
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div id="container">
		
		<jsp:include page="navbar.jsp"></jsp:include>
	
		<div class="content">
			<div class="panel panel-default" id="summary">
 				<div class="panel-body">
   					My projects
  				</div>
			</div>
			
			<c:forEach var="i" items="${ projects }">
			<div class="panel panel-default content-panel">
			
					<div class="panel-heading">
    					<a href="${ i.projectUrl }"><h3 class="panel-title"><c:out value="${ i.projectName }"></c:out></h3></a>
 					</div>
 					
 					<table class="table table-condensed">
   						<tr>
   							<th>Description</th>
   						</tr>
   						<tr>
   							<td><c:out value="${ i.projectDescription }"></c:out></td>
   						</tr>
   					</table>
 					 					
 					 <table class="table table-condensed">
   						<tr>
   							<th>My role(s)</th>
   						</tr>
   						<tr>
   							<td><c:out value="${ i.projectRole }"></c:out></td>
   						</tr>
   					</table>
					
  				</div>
  			</c:forEach>
  			
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>