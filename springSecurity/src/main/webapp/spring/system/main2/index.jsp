<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ include file="/common/js.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
$(function(){
	$('.frame-body').height($(document).height());
	$('.div-main-left').height($('.frame-body').height()-126);
	$('.div-main-center').height($('.frame-body').height()-126);
	$('.div-main-right').height($('.frame-body').height()-126);
});
</script>
<body style="background-image: url('${pageContext.request.contextPath}/resources/images/left/bg-left.jpg');height:100%}">
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