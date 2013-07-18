var westContoller = Ext.define('pljFWV1.controller.West', {
	extend : 'Ext.app.Controller',
	id:'west',
	views : [ 'West' ],
	stores:[
	        'TreeMenu'
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
		if(record.data.controller){
			var userController = this.getController(record.data.controller);
			var panelCenter = Ext.getCmp('panelCenter');
			if(!panelCenter.getComponent(record.data.id)){
				panelCenter.add({
					title:record.data.name,
					closable :true,
					id:record.data.id,
					height:200,
					autoScroll:true,
					items: {
		                xtype: record.data.url
		            },
					layout:'fit'
				}).show();;
			}
		}
	}
});
