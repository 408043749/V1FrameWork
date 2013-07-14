var westContoller = Ext.define('pljFWV1.controller.West', {
	extend : 'Ext.app.Controller',
	id:'west',
	views : [ 'West' ],
	stores:[
	        'Menu'
	],
	init:function(app){
		//alert('west');
		this.control({
			'treepanel':{
				itemclick:this.treeItemClick
			}
		});
	},
	treeItemClick:function(treepanel, record, item, index, e, eOpts){
		var userController = this.getController("pljFWV1.controller.Users");
		var panelCenter = Ext.getCmp('panelCenter');
		if(!panelCenter.getComponent(record.data.uuid)){
			panelCenter.add({
				title:record.data.name,
				closable :true,
				id:record.data.uuid,
				height:200,
				autoScroll:true,
				items: {
	                xtype: 'userList'
	            },
				layout:'fit'
			}).show();;
		}
	}
});
