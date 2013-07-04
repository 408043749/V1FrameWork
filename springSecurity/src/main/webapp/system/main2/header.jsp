<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 头部 -->
	<header>
		<div class="navbar navbar-inverse">
			<div class="navbar-inner">
				<div class="container">
	
					<!-- .btn-navbar is used as the toggle for collapsed navbar content -->
					<a class="btn btn-navbar" data-toggle="collapse"
						data-target=".nav-collapse"> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
					</a>
	
					<!-- Be sure to leave the brand out there if you want it shown -->
					<a class="brand" href="#">Plj'BLOG</a>
	
					<!-- Everything you want hidden at 940px or less, place within here -->
					<div class="nav-collapse collapse">
						<ul class="nav">
							<li><a href="#" class="menu-a" data-url="/system/user/list">用户管理</a></li>
							<li><a href='<c:url value="/j_spring_security_logout" />'>注销</a></li>
						</ul>
				</div>
			</div>
		</div>
	</header>
</body>

<script type="text/javascript">
	$(function(){
		$('.menu-a').click(function(){
			$('#body-east').load($(this).attr("data-url"));
		});
	});
</script>
</html>