
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
