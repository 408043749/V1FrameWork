<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
	
<div class="span3">
	<div class="row-fluid div-main-left ">
		<div class="row-fluid">
			<div class="offset1 span10 offset1 div-thumbnail">
				<ul class="thumbnails">
					<li class="span4">
						<a href="#" class="thumbnail"> 
							<img data-src="holder.js/300x200" alt="" src="/images/user/img-user-default.png">
						</a>
					</li>
					<li>
						<h6>
							欢迎：<security:authentication property="name" />
							所属角色：<security:authentication property="authorities"  />
							<!-- ifAllGranted ： 同时具备某些授权   ifAnyGranted ：有某个授权时  ifNotGranted:未授予某个权限时 -->
							<security:authorize ifAllGranted="ROLE_ADMIN" >
								如果是管理员角色  显示 此行
							</security:authorize>
						</h6>
						<a href="#" style="display: block;">
							<i class="icon-picture"></i>&nbsp;编辑头像
						</a>
						<a href="#" style="display: block;">
							<i class="icon-edit"></i>&nbsp;修改资料
						</a>
					</li>
				</ul>
			</div>
		</div>
		
		<div class="row-fluid offset1 span10 offset1" >
			<div class="line-radius" ></div>
		</div>
		
		<div class="row-fluid container" >
		
		
		</div>
	</div>
		
</div>
