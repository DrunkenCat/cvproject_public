<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML>
<html lang="fi">
<head>
	<title>Arto Hänninen</title>
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
			<div class="panel panel-default">
				<div class="panel-heading">
    				<h3 class="panel-title">Welcome!</h3>
 				</div>
 				<div class="panel-body">
   					<c:out value="${ bio.bioDescription }"></c:out>
  				</div>
  			</div>
		</div>		
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>
