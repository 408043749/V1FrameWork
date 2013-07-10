Ext.define('pljFWV1.controller.Viewport', {
	extend : 'Ext.app.Controller',
	views : [ 'North','West' ],
	init:function(){
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
