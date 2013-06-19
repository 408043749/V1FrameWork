<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ include file="/common/js.jsp" %>
    
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
<body style="background-image: url('${pageContext.request.contextPath}/resources/images/left/bg-left.jpg');">
	<!-- 头部 -->
	<%@ include file="header.jsp" %>
	
	<!-- 主体内容 -->
	<div class="row-fluid frame-body">
		<%@ include file="left.jsp" %>
		<%@ include file="east.jsp" %>
	</div>
	<!-- 页尾 -->
	<%@ include file="footer.jsp" %>
</body>
</html>