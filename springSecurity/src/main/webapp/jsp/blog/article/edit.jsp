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

				<form:form cssClass="form-horizontal" action='/jsp/blog/article/save' method="post" modelAttribute="article	">
					<div class="control-group">
						 <label class="control-label" for="inputEmail">标题</label>
						<div class="controls">
							<form:input path="title"  />
						</div>
					</div>
					<div class="control-group">
						 <label class="control-label" for="inputPassword">关键字</label>
						<div class="controls">
							<form:input path="keyWord"  />
						</div>
					</div>
					<div class="control-group">
						 <label class="control-label" for="inputPassword">内容</label>
						<div class="controls">
							<form:textarea path="content" rows="20" />
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>