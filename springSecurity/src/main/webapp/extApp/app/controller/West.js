Ext.define('pljFWV1.controller.West', {
	extend : 'Ext.app.Controller',
	id:'west',
	views : [ 'West' ],
	stores:[
	        'Menu'
	],
	init:function(){
		alert('west');
	}
});
