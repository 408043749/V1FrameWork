

Ext.define('pljFWV1.controller.Menu',{
	extend:'Ext.app.Controller',
	views:[
	       'menu.List'
	],
	models: ['Menu'],
	stores:[
	        'TreeMenu','TreeMenuGrid'
	],
	init:function(){
		this.control({
			'menuList':{
				//itemdblclick:this.editUser
			}
		});
	}
})