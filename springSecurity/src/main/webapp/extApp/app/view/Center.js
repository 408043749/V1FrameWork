Ext.define('pljFWV1.view.Center', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.Center',
	title : '用户管理',
	initComponent : function() {
		Ext.applyIf(this,{
			region:'center',
		    title: 'Hello',
		    width: 200,
		    html: '<p>World!</p>',
		    renderTo: Ext.getBody()
			
		});
		this.callParent(arguments);
	}

});