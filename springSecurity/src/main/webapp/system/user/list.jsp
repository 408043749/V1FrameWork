<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 

<%@ include file="/common/js.jsp" %>

<!DOCTYPE html>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<div>
		<form id="model-form-list" action="<c:url value="/system/user/list" />"></form>
	</div>
	<div class="row-fluid div-list">
		<table class="table table-condensed table-hover">
			<thead>
				<tr >
					<th width="15px;"></th>
					<th>序号</th>
					<th>姓名</th>
					<th>角色</th>
					<th>&nbsp;</th>
				</tr>
			</thead>
		  <c:forEach items="${userList}" var="item" varStatus="status" >
			<tr class="${status.count%2==0?'success':'odd'}">
				<td><input type="checkbox" value="${item.id }" /> </td>
				<td>${status.count }</td>
				<td>${item.name } <c:out value=""></c:out></td>
				<td>${item.name }</td>
				<td>
					<a href="#" class="table-tr-td-opera" title="查看" ><i class="icon-plus"></i></a>
					<a href="#" class="table-tr-td-opera" title="编辑" ><i class="icon-edit"></i></a>
					<a href="#" class="table-tr-td-opera" title="删除" ><i class="icon-remove"></i></a>
				</td>
	   		</tr>
		  </c:forEach>
		  
		  <c:forEach step="1" begin="${fn:length(userList)}" end="14" varStatus="status" >
			<tr class="${status.count%2==0?'success':'odd'}">
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
	   		</tr>
		  </c:forEach>
		</table>
		
		<div class="ui-table-footer ">
				<div class="ui-table-footer-list"><input type="checkbox" /></div>
				<div class="ui-table-footer-list">全选</div>
				<div class="ui-table-footer-list"><a class="btn-add" style="display: block;" ></a></div>
				<div class="ui-table-footer-list"><a class="btn-delete" style="display: block;" ></a></div>
				
				<div class="ui-table-footer-pager">
						<span ">共${totalPage}页</span>
						<span class="badge badge-inverse" data_page="1">«</span>
						<c:forEach items="${pageRage }" var="item" varStatus="status" >
						<span class="badge ${item==pageNumber?'badge-important':'badge-info' }"  data_page="${item}" >${item}</span>
						</c:forEach>
						<span class="badge badge-inverse" data_page="${totalPage}">»</span>
				</div>
				
		</div>
				<div height="100px"><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
	</div>
</body>
<script type="text/javascript">
	$('.table-tr-td-opera').closest('tr').hover(function(){
		$(this).find('.table-tr-td-opera').css('visibility','visible');
	},function(){
		$(this).find('.table-tr-td-opera').css('visibility','hidden');
	});
	
	$('.badge').click(function(){
		$('#body-east').load($('#model-form-list').attr("action"),{pageNumber:$(this).attr('data_page')});
	});
</script>
</html>
