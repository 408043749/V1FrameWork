<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		$('.softmodel .thumbnail').hover(function(){
			$(this).find('.carousel-caption').toggle('slow');
		});
		$('.btn-save').click(function(){
			var form = $('#softModal form:first');
			jQuery.ajax({
	              url: form.attr("action"),   // 提交的页面
	              data: form.serialize(), // 从表单中获取数据
	              type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
	              beforeSend: function()          // 设置表单提交前方法
	              {
	              },
	              error: function(request) {      // 设置表单提交出错
	                  alert("表单提交出错，请稍候再试");
	              },
	              success: function(data) {
	            	  $('#softModal .close').click();
	              }
	        });
		});
		
	});
</script>
</head>
<body class="framebody-center" >
	  	<div id="softModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h3 id="myModalLabel">Modal header</h3>
			</div>
			<div class="modal-body">
				<!-- 加载远程内容 -->
			</div>
			<div class="modal-footer">
			    <a href="#" class="btn btn-primary btn-save" >保存</a>
			</div>
		</div>
	
	<div class="row-fluid" >
		<div class=" offset1 span10 offset1">
			<div class="row-fluid">
				<div class="span4 softmodel" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>
						      <h3>java</h3>
						      <div class="carousel-caption">
			                      <p>
			                      	<a id="a-softModal" data-toggle="modal"  href="<c:url value="/jsp/blog/article/edit" />" data-target="#softModal" class="a-model"><i class="icon-edit" title="新增"></i></a>
			                      	<a href="#" class="a-model" title="查看" ><i class="icon-eye-open"></i></a>
			                      </p>
			                   </div>
						    </div>
						  </li>
						</ul>
					</div>
				</div>
				<div class="span4" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>

						    </div>
						  </li>
						</ul>
					</div>
				</div>
				<div class="span4" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>
						      java
						    </div>
						  </li>
						</ul>
					</div>
				</div>
			</div>
			
			<div class="row-fluid">
				<div class="span4" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>
						      java
						    </div>
						  </li>
						</ul>
					</div>
				</div>
				<div class="span4" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>
						      java
						    </div>
						  </li>
						</ul>
					</div>
				</div>
				<div class="span4" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>
						      java
						    </div>
						  </li>
						</ul>
					</div>
				</div>
			</div>
			
			<div class="row-fluid">
				<div class="span4" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>
						      java
						    </div>
						  </li>
						</ul>
					</div>
				</div>
				<div class="span4" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>
						      java
						    </div>
						  </li>
						</ul>
					</div>
				</div>
				<div class="span4" style="text-align: center;">
					<div class="row-fluid div-thumbnail">
						<ul class="thumbnails">
						  <li class="span12">
						    <div class="thumbnail">
						      <i class="icon-coffee" style="font-size: 128px;color: white;"></i>
						      java
						    </div>
						  </li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>