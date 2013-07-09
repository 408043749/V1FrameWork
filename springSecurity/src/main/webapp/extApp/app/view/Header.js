Ext.define('pljFWV1.view.Header', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.Header',
	title : '用户管理',
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