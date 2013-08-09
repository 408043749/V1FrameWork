<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
	});
</script>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">

				<form:form cssClass="form-horizontal" action='/system/user/save' method="post" modelAttribute="user">
					<form:hidden path="id" />
					<div class="control-group">
						<div class="input-prepend">
							<span class="add-on">姓名：</span> 
							<form:input path="name"  cssClass="span6"   />
						</div>
						<div class="input-prepend">
							<span class="add-on">密码：</span> 
							<form:password path="password"  showPassword="true" cssClass="span6"  />
							
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>