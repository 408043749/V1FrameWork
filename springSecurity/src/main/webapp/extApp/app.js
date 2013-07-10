Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'pljFWV1',// 命名空间
	app : 'app',
	autoCreateViewport : true,
	controllers : [ 'Viewport' ],
	launch : function() {
	}
});
