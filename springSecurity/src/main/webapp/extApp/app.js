Ext.Loader.setConfig({
	enabled : true
});

var app = Ext.application({
	name : 'pljFWV1',// 命名空间
	app : 'app',
	autoCreateViewport : true,
	controllers : [ 'Viewport','West' ],
	init:function(){

	},
	launch : function() {

	}
});
