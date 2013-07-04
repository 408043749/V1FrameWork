
	$(function(){

		/*$('.container-list').height($('.div-main-center').height());
		$('.frame-form-list-tableDiv').attr("height","70px");
		//$('.frame-form-list-tableDiv').attr("max-height","70");
		//alert($('.frame-form-list-tableDiv').height());
		//alert($('.frame-form-list-tableDiv').attr("max-height"));
*/
		/**
		 * Listҳ���ѯ������ʾ������
		 */
		$('.frame-form-query-navbar').delegate('.icon-circle-arrow-down','click',function(){
			 $('.frame-form-query-condition').slideToggle('slow');
		});
		
		/**
		 * Listҳ���б������ʾ��һ��
		 */
		$('.frame-form-list .table-tr-td-opera').closest('tr').hover(function(){
			$(this).find('.table-tr-td-opera').css('visibility','visible');
		},function(){
			$(this).find('.table-tr-td-opera').css('visibility','hidden');
		});
		
		
		/**
		 * ҳ���ҳģ���� �첽����list����ģ��
		 */
		$('.frame-form-list').delegate('.badge','click',function(){
			$('.frame-form-list').load($('#model-form-list').attr("action")+" .frame-form-list-tableDiv,.ui-table-footer",{pageNumber:$(this).attr('data_page')},function(responseText, textStatus, XMLHttpRequest){
			});
		});
		$('.frame-form-query-condition').delegate('.btn-submit','click',function(){
			var formdata = $(this).closest('form').serialize();
			$('.frame-form-list').load($('#model-form-list').attr("action")+"?"+formdata+" .frame-form-list-tableDiv,.ui-table-footer",{pageNumber:$(this).attr('data_page')},function(responseText, textStatus, XMLHttpRequest){
			});
		});
		
	});
