<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="subject" items="${subjects}">
	<p>
	<!-- Offer의 toString으로 출력되는 거임 -->
		<c:out value="${subject}"> </c:out>
	</p>
</c:forEach>

<c:out value="총 이수 학점 수: ${totalCredit}"> </c:out>
</body>
</html>