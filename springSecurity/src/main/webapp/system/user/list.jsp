<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%-- <div class="container container-list" style="background-color: #fff;">
	<div class="navbar frame-form-query-navbar">
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
	
	<div class="frame-form-query-condition row-fluid">
		<div class="row-fluid span11 offset1">
			<!-- 条件查询 -->
			<div class="row-fluid">
				<div class="input-prepend ">
					<span class="add-on">姓名：</span>
				    <input class="span6" id="prependedInput" type="text" placeholder="Username">
				</div>
				<div class="input-prepend ">
					<span class="add-on">橘色：</span>
				    <input class="span6" id="prependedInput" type="text" placeholder="Username">
				</div>
				<div class="input-prepend ">
					<span class="add-on">姓名：</span>
				    <input class="span6" id="prependedInput" type="text" placeholder="Username">
				</div>
			</div>
			<!-- 按钮组 -->
			<div class="row-fluid span3 offset8 text-right">
              <button type="button" class=" btn   btn-primary " ><i class="icon-remove-sign"></i> 重置</button>
              <button type="button" class=" btn   btn-primary"  ><i class="icon-search"></i> 查询</button>
        	</div>
		</div>
	</div>
	
	<div class="row-fluid frame-form-list">
		<div class="row-fluid frame-form-list-tableDiv">
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
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
			1<br/>
		</div>
		
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
</div> --%>

<div class="frame-container-mgr">

	<div class="frame-container-edit">
		<!-- 模态对话框  默认隐藏 -->
		<div id="commonModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3 id="commonModalLabel">Modal header</h3>
			</div>
			<div class="modal-body">
				<!-- 加载远程内容 -->
			</div>
			<div class="modal-footer">
			    <a href="#" class="btn btn-primary btn-save" >保存</a>
			</div>
		</div>
	</div>
	
	<div class="frame-container-list span12">
		<div class="frame-form-query-condition  span3">
			<div class="div-condition row-fluid">
				<form:form id="model-form-list" cssClass="form-horizontal" action='/system/user/list' method="post" modelAttribute="user">
					<div class="input-prepend ">
						<span class="add-on">姓名：</span>
						<form:input path="name" cssClass="span6 typeaheadlike" placeholder="Username"  data-url="/system/user/getUserJson" />
					</div>
					<div class="input-prepend ">
						<span class="add-on">姓名：</span>
					   	<select class="span10">
					   		<option>qdsfsdf</option>
					   	</select>
					</div>
					<div class="input-prepend ">
						<button type="button" class=" btn   btn-primary btn-reset" ><i class="icon-remove-sign"></i> 重置</button>
		              	<button type="button" class=" btn   btn-primary btn-submit"  ><i class="icon-search"></i> 查询</button>
					</div>
				</form:form>
			</div>
		</div>
		
		
		<div class="row-fluid frame-form-list span9">
			<div class="row-fluid frame-form-list-tableDiv">
				<table class="table table-condensed table-hover">
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
				
				  <c:forEach items="${rows}" var="item" varStatus="status" >
					<tr class="frame-form-list-table-tr ${status.count%2==0?'success':'odd'}">
						<td><input type="checkbox" class="ck-sub" value="${item.id }" /> </td>
						<td>${(pageNumber-1)*pagzSize+(status.count) }</td>
						<td>${item.name } <c:out value=""></c:out></td>
						<td>${item.name }</td>
						<td>
							<a href="#" class="table-tr-td-opera link-view" title="查看" ><i class="icon-plus"></i></a>
							<a href="#" class="table-tr-td-opera link-edit" title="编辑" ><i class="icon-edit"></i></a>
							<a href="#" class="table-tr-td-opera link-delete" title="删除" ><i class="icon-remove"></i></a>
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
			</div>
			
			<div class="ui-table-footer">
				<div class="ui-table-footer-list"><input type="checkbox" /></div>
				<div class="ui-table-footer-list">全选</div>
				<div class="ui-table-footer-list"><a class="btn-add"  data-action='/system/user/edit' style="display: block;cursor: pointer;"></a></div>
				<div class="ui-table-footer-list"><a class="btn-delete" data-action='/system/user/deleteAll' style="display: block;cursor: pointer;" ></a></div>
				
				<div class="ui-table-footer-pager">
						<span ">共${totalPage}页</span>
						<span class="badge badge-inverse badge-first" data_page="1">«</span>
						<c:forEach items="${pageRage }" var="item" varStatus="status" >
						<span class="badge ${item==pageNumber?'badge-important':'badge-info' }"  data_page="${item}" >${item}</span>
						</c:forEach>
						<span class="badge badge-inverse badge-end" data_page="${totalPage}">»</span>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js_frame.js" ></script>
