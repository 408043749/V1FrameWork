<%@ page language="java" contentType="text/html;"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Message List</title>
</head>
<body>
	<c:forEach items="${messages }" var="message">
	<table>
		<tr>
			<td>Author</td>
			<td>${message.author }</td>
		</tr>
		<tr>
			<td>Title</td>
			<td>${message.title }</td>
		</tr>
		<tr>
			<td>Body</td>
			<td>${message.body }</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="messageDelete?messageId=123" />Delete
			</td>
		</tr>
	</table>	
	<hr />
	</c:forEach>
	
	<a href="<c:url value="jsp/messagePost.jsp"></c:url>">Post</a>
	<a href="<c:url value="/spring_security_login"></c:url>">Login</a>
</body>
</html>