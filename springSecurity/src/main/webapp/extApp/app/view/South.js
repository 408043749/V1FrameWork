Ext.define('pljFWV1.view.South', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.East',
	title : '用户管理',
	initComponent : function() {
		Ext.applyIf(this,{
			region:'south',
		    title: 'Hello',
		    width: 200,
		    html: '<p>World!</p>',
		    renderTo: Ext.getBody()
			
		});
		this.callParent(arguments);
	}

});