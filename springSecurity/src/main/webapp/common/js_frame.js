
	$(function(){
		/*$('.container-list').height($('.div-main-center').height());
		$('.frame-form-list-tableDiv').attr("height","70px");
		//$('.frame-form-list-tableDiv').attr("max-height","70");
		//alert($('.frame-form-list-tableDiv').height());
		//alert($('.frame-form-list-tableDiv').attr("max-height"));
*/
		
		/**
		 * List页面表格操作隐藏与显示
		 */
		$('.frame-form-list').delegate('tr', 'mouseover', function(){
			$(this).find('.table-tr-td-opera').css('visibility','visible');
		});
		$('.frame-form-list').delegate('tr', 'mouseout', function(){
			$(this).find('.table-tr-td-opera').css('visibility','hidden');
		});
		
		/**
		 * 编辑按钮点击事件
		 */
		$('.frame-form-list').delegate('.link-edit', 'click', function(){
			var id = $(this).closest('tr').find('.ck-sub').val();
			var url = $(this).closest('.frame-container-list').find('.btn-add').attr('data-action');
			$('#commonModal').modal('show');
			$('#commonModal .modal-body').load( url,{id:id});
		});
		
		/**
		 * 保存按钮点击事件
		 */
		$('.frame-form-list').delegate('.btn-add', 'click', function(){
			$('#commonModal').modal('show');
			$('#commonModal .modal-body').load( $(this).attr('data-action'),{id:null});
		});
		
		
		/**
		 * 模态对话框的保存按钮点击事件
		 */
		$('#commonModal').delegate('.btn-save', 'click', function(){
			var modelObj = $(this);
			var form = $('#commonModal form:first');
			var msg = $.globalMessenger()["do"]({
				showCloseButton: true,
				errorMessage: "保存失败！",
				progressMessage: '数据保存中...',
				successMessage: '保存成功！'
				}, 
				{
				url: form.attr("action"),
				data: form.serialize(), 
				beforeSend: function(XMLHttpRequest){ 
			            //ShowLoading(); 
			    },
				success: function(data) {
					$('#commonModal').modal('hide');
					modelObj.closest('.frame-container-mgr').find('.badge-first').click();
				}
			});
			
			/*jQuery.ajax({
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
	            	  if(data=='success'){
		            	  $('#commonModal').modal('hide');
		            	  $.globalMessenger().post("保存成功!");
		            	  modelObj.closest('.frame-container-mgr').find('.badge-first').click();
	            	  }
	              }
	        });*/
		});
		
		
		/**
		 * List页面分页点击事件
		 */
		$('.frame-form-list').delegate('.badge','click',function(){
			var formdata = $(this).closest('.frame-container-list').find('form').serialize();
			$('.frame-form-list').load($('#model-form-list').attr("action")+"?"+formdata+" .frame-form-list-tableDiv,.ui-table-footer",{pageNumber:$(this).attr('data_page')},function(responseText, textStatus, XMLHttpRequest){
			});
		});
		
		/**
		 * List页面查询按钮点击事件
		 */
		$('.frame-form-query-condition').delegate('.btn-submit','click',function(){
			var formdata = $(this).closest('form').serialize();
			$('.frame-form-list').load($('#model-form-list').attr("action")+"?"+formdata+" .frame-form-list-tableDiv,.ui-table-footer",{pageNumber:1},function(responseText, textStatus, XMLHttpRequest){
			});
		});
		
	});
