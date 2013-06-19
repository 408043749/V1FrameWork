<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>企业员工管理信息系统</title>
<link href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.9.1.min.js"></script>
<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
body > .modal,body > .modal >.modal-footer ,body > .modal  .modal-footer{
	background-color: rgba(81, 92, 148, 0.55);
	color: #fff;
}

body > .modal{
	min-height: 340px;
}
body > .modal > .modal-body,body > .modal > form  > .modal-body{
	max-height: 340px;
}
body{
	background-color: rgb(112, 127, 207);
}

.table tbody tr.info>td{
	background-color: rgba(81, 92, 148, 0.55);
}
.table tbody tr.error>td{
	background-color: rgba(81, 92, 148, 0.55);
}
.table tbody tr.warning>td{
	background-color: rgba(81, 92, 148, 0.55);
}
a{
	color : rgb(221, 180, 212);
}
a:hover{
	color: rgb(226, 33, 184);
}
</style>


</head>

<body>
</body>
</html>
