Ext.define('pljFWV1.view.North', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.frameNorth',
	title : '用户管理',
	autoShow:true,
	initComponent : function() {
		Ext.applyIf(this,{
			region:'north',
		    title: 'Hello',
		    width: 200,
		    html: '<p>World!</p>',
		    renderTo: Ext.getBody()
		});
		this.callParent(arguments);
	}

});