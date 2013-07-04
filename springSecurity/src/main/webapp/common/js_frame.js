
	$(function(){

		/*$('.container-list').height($('.div-main-center').height());
		$('.frame-form-list-tableDiv').attr("height","70px");
		//$('.frame-form-list-tableDiv').attr("max-height","70");
		//alert($('.frame-form-list-tableDiv').height());
		//alert($('.frame-form-list-tableDiv').attr("max-height"));
*/
		/**
		 * List页面查询条件显示和隐藏
		 */
		$('.frame-form-query-navbar').delegate('.icon-circle-arrow-down','click',function(){
			 $('.frame-form-query-condition').slideToggle('slow');
		});
		
		/**
		 * List页面列表操作显示和一藏
		 */
		$('frame-form-list .table-tr-td-opera').closest('tr').hover(function(){
			$(this).find('.table-tr-td-opera').css('visibility','visible');
		},function(){
			$(this).find('.table-tr-td-opera').css('visibility','hidden');
		});
		
		
		/**
		 * 页面分页模块点击 异步加载list内容模块
		 */
		$('.frame-form-list').delegate('.badge','click',function(){
			$('.frame-form-list').load($('#model-form-list').attr("action")+" .frame-form-list",{pageNumber:$(this).attr('data_page')},function(responseText, textStatus, XMLHttpRequest){
			});
		});
		
	});
