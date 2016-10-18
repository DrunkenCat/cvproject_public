<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>Education | Arto Hänninen</title>
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
   					My work history
  				</div>
			</div>
			
			<c:forEach var="i" items="${ education }">
			<div class="panel panel-default content-panel">
			
					<div class="panel-heading">
    					<h3 class="panel-title"><c:out value="${ i.title }"></c:out></h3>
 					</div>
 					
 					<table class="table table-condensed">
 						<tr>
 							<th class="tdLeft">School</th>
 							<th class="tdCenterLeft">Started</th>
 							<c:if test="${ !empty i.schoolEndDate }">
 								<th class="tdCenterRight">Ended</th>
 							</c:if>
 							<c:if test="${ !empty i.average }">
 								<th class="tdRight">Average</th>
 							</c:if>
 						</tr>

   						<tr>
   							<td class="tdLeft"><c:out value="${ i.schoolName }"></c:out></td>	
   							<td class="tdCenterLeft"><c:out value="${ i.schoolStartDate }"></c:out></td>
   							<td class="tdCenterRight"><c:out value="${ i.schoolEndDate }"></c:out></td>	
   							<c:if test="${ !empty i.average }">
   								<td class="tdRight"><c:out value="${ i.average }"></c:out></td>
   							</c:if>				
   						</tr>
   					</table>   						
   					<table class="table table-condensed">
   						<tr>
   							<th>Degree</th>
   						</tr>
   						<tr>
   							<td><c:out value="${ i.degree }"></c:out></td>
   						</tr>
   					</table> 
   						
   					<c:if test="${ !empty i.thesis }">			
   						<table class="table table-condensed">
   							<tr>
   								<th class="tdLeft">Thesis</th>
								<th class="tdRight">Thesis Grade</th>
   							</tr> 						
   							<tr>
   								<td class="tdLeft"><c:out value="${ i.thesis }"></c:out></td>
   								<td class="tdRight"><c:out value="${ i.thesisGrade }"></c:out></td>
   							</tr> 						
   						</table>
   					</c:if>				
  				</div>
  			</c:forEach>
  			
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>