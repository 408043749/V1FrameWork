<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
	#legal{
		clear: left;
		display: block;
		margin: 1em;
		border-top: solid 1px #333;
		-webkit-box-shadow: #000 0 -1px 0;
		box-shadow: #000 0 -1px 0;
		border-radius: 4px 4px 0 0;
	}
</style>
<link href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript"  src="${pageContext.request.contextPath}/js/jquery/jquery-1.9.1.min.js"></script>
<script type="text/javascript"  src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" >
 	$(function(){
		$('.login').click(function(){
			if(form1.j_username.value==""){
				alert("请输入用户名！");
				return false;
			}
			if(form1.j_password.value==""){
				alert("请输入密码！");
				return false;
			}
			if(check()==false) return false;
			else $('#form1').submit(); 
			
		});
		
		$('.reset').click(function(){
			form1.reset();
		});
		
		$('#captcha,.captcha-a').click(function(){
			$('#captcha').attr("src","${pageContext.request.contextPath}/image/captcha?time="+new Date());
		});
		
		
	});
function check(){
	/* var id=$('#id').val();
	var password = $('#password').val();
	var flag = true;
	$.ajax({
	  url: '${pageContext.request.contextPath}/login.do',
	  async:false,
	  data: {'id':id,'password':password},
	  success: function(data){
		  if(data=='false'){
			  alert('此ID不存在(或已停用)或密码错误');
			  flag = false;
		  }
	  }
	});
	return flag; */
	return true;
}	 
</script>
</head>

<body style="height:10em;background-image: url('<c:url  value="/images/footer/bg-footer-noise.jpg" />');">
	<header  style="height:10em;background-color: #0769AD"></header>
	<div style="height:10em;background-color: #0769AD">
		<div class="container">
			<!-- Modal -->
			<div id="myModal" class="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-top: 50px;">
			  <div class="modal-header" style="background-color: rgb(11, 90, 151);">
			    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			    <h3  id="myModalLabel" style="color: white;">plj's blog</h3>
			  </div>
			  <div class="modal-body" style="background-image: url('<c:url  value="/images/login/dark-grey-tile.png" />');">
			    <form class="form-horizontal" name="form1" id="form1" method="POST" action="<c:url value="/j_spring_security_check" />" >
				  <div class="control-group">
				    <label class="control-label " style="color: #ccc;" for="id">用户名</label>
				    <div class="controls">
				      <input type="text" id="j_username" name="j_username" style="background: none;color: yellow;" placeholder="username"   />
				    </div>
				  </div>
				  
				  <div class="control-group">
				    <label class="control-label" style="color: #ccc;" for="password">密码</label>
				    <div class="controls">
				    	<%-- ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message } --%>
				      <input type="password" id="j_password" name="j_password" style="background: none;color: yellow;" placeholder="password" />
				    </div>
				  </div>
				  
				  <div class="control-group">
				    <label class="control-label" style="color: #ccc;" for="password">验证码</label>
				    <div class="controls">
				      	<input type="text" id="j_image" name="j_image" style="background: none;color: yellow;" placeholder="验证码" class="span1"    />
				      	<img id="captcha" src='<c:url  value="/image/captcha" />' class="span1"  style="float:none;cursor: pointer;" />
				      	<a style="color: #ccc;font-size: x-small;font-style: italic;cursor: pointer; " class="captcha-a "> 看不清</a>
				    </div>
				  </div>

				</form>
			  </div>
			  <div class="modal-footer" style="background-color: rgb(11, 90, 151);">
			    <button type="reset" class="btn btn-inverse reset" data-dismiss="modal" aria-hidden="true" form="form1">重置</button>
			    <button class="btn btn-inverse login">登录</button>
			  </div>
			</div>

		</div>
	</div>
	
	<div id="legal" class="navbar-fixed-bottom text-center" style="color: #777;">
		 版 权 所  有 者 陈 露 芳, 未 经 书 面 授 权 禁 止 使 用 
	</div>
</body>

<script type="text/javascript">
	var errorCode = ${param.errorCode};
	if(errorCode == 1){
		alert("用户名或密码错误!");
	}else if(errorCode == 5){
		alert("验证码错误!");			
	} 
</script>
</html>
