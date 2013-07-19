

Ext.define('pljFWV1.controller.Menu',{
	extend:'Ext.app.Controller',
	views:[
	       'menu.List',
	       'menu.Edit'
	],
	models: ['Menu'],
	stores:[
	        'TreeMenu','TreeMenuGrid'
	],
	init:function(){
		this.control({
			'menuList  button[itemId=tar-btn-add]':{
				click:function(){
					var view = Ext.widget('menuEdit');
				}
			},
			'menuList  button[itemId=tar-btn-delete]':{
				click:function(){
					alert('delete');
				}
			}
		});
	}
})