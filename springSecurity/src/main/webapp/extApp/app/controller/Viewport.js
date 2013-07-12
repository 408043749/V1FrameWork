Ext.define('pljFWV1.controller.Viewport', {
	extend : 'Ext.app.Controller',
	views : [ 'North','West' ],
	init:function(app){
		//var westcontroller= app.getController("pljFWV1.controller.West");//动态加载WEST控制器
		this.control({
			'viewport > panel':{
				render:this.onPanelRender
			}
		});
	},
	onPanelRender:function(){
		alert('onPanelRender');
	}
});
