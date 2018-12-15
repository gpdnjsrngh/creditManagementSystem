<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body>
<table class="subjectstable">
			<tr>
				<td class="label">년도</td>
				<td class="label">학기</td>
				<td class="label">이수 학점</td>
				<td class="label">상세보기</td>
			</tr>
			
			<tr>
				<td class="label">2016</td>
				<td class="label">1</td>
				<td class="label"><c:out value="${totals[0]}"/></td>
				<td class="label"><a href="${pageContext.request.contextPath}/subjects20161">링크</a></td>
			</tr>
			<tr>
				<td class="label">2016</td>
				<td class="label">2</td>
				<td class="label"><c:out value="${totals[1]}"/></td>
				<td class="label"><a href="${pageContext.request.contextPath}/subjects20162">링크</a></td>
			</tr>
			
			<tr>
				<td class="label">2017</td>
				<td class="label">1</td>
				<td class="label"><c:out value="${totals[2]}"/></td>
				<td class="label"><a href="${pageContext.request.contextPath}/subjects20171">링크</a></td>
			</tr>
			<tr>
				<td class="label">2017</td>
				<td class="label">2</td>
				<td class="label"><c:out value="${totals[3]}"/></td>
				<td class="label"><a href="${pageContext.request.contextPath}/subjects20172">링크</a></td>
			</tr>
			<tr>
				<td class="label">2018</td>
				<td class="label">1</td>
				<td class="label"><c:out value="${totals[4]}"/></td>
				<td class="label"><a href="${pageContext.request.contextPath}/subjects20181">링크</a></td>
			</tr>
			<tr>
				<td class="label">2018</td>
				<td class="label">2</td>
				<td class="label"><c:out value="${totals[5]}"/></td>
				<td class="label"><a href="${pageContext.request.contextPath}/subjects20182">링크</a></td>
			</tr>
		</table>
</body>
</html>