<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 


	<div class="navbar frame-form-query-navbar" style="margin-bottom: 0px;border-bottom: 0px;">
		<div class="navbar-inner">
			<div class="container">

				<!-- .btn-navbar is used as the toggle for collapsed navbar content -->
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>

				<!-- Be sure to leave the brand out there if you want it shown -->
				<a class="brand" href="#"><i class="icon-home"></i></a> <a
					class="brand"">»</a> <a class="brand" href="#"><font size="3">用户管理</font></a>

				<!-- Everything you want hidden at 940px or less, place within here -->
				<div class="nav-collapse collapse">
					<!-- .nav, .navbar-search, .navbar-form, etc -->
				</div>
				<a class="brand icon-circle-arrow-down" style="float: right;" href="#"></a>
			</div>
		</div>
	</div> 
	
	<div class="frame-form-query-condition row-fluid" style="background-color: #fff;padding: 10px;display:none;">
		<!-- 条件查询 -->
		<div class="input-prepend span4">
			<span class="add-on">姓名：</span>
		    <input class="span6" id="prependedInput" type="text" placeholder="Username">
		</div>
		<div class="input-prepend span4">
			<span class="add-on">橘色：</span>
		    <input class="span6" id="prependedInput" type="text" placeholder="Username">
		</div>
		<div class="input-prepend span4">
			<span class="add-on">姓名：</span>
		    <input class="span6" id="prependedInput" type="text" placeholder="Username">
		</div>
		
		<div class="row-fluid">
              <button type="button" class="span6 btn btn-mini  btn-primary">重　　　　置</button>
              <button type="button" class="span6 btn btn-mini  btn-primary">查　　　　询</button>
        </div>
	</div>
	
	<div class="row-fluid div-list" style="" >
		<table class="table table-condensed table-hover">
			<form id="model-form-list" action="<c:url value="/system/user/list" />" style="position: relative;">
				<thead>
					<tr >
						<th width="15px;"></th>
						<th>序号</th>
						<th>
							    姓名
						</th>
						<th>角色</th>
						<th>&nbsp;</th>
					</tr>
				</thead>
			</form>
		
		  <c:forEach items="${rows}" var="item" varStatus="status" >
			<tr class="${status.count%2==0?'success':'odd'}">
				<td><input type="checkbox" value="${item.id }" /> </td>
				<td>${(pageNumber-1)*pagzSize+(status.count) }</td>
				<td>${item.name } <c:out value=""></c:out></td>
				<td>${item.name }</td>
				<td>
					<a href="#" class="table-tr-td-opera" title="查看" ><i class="icon-plus"></i></a>
					<a href="#" class="table-tr-td-opera" title="编辑" ><i class="icon-edit"></i></a>
					<a href="#" class="table-tr-td-opera" title="删除" ><i class="icon-remove"></i></a>
				</td>
	   		</tr>
		  </c:forEach>
		  
		  <c:forEach step="1" begin="${fn:length(rows)}" end="14" varStatus="status" >
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
	</div>
</body>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js_frame.js" ></script>
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
