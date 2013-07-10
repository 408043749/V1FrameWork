Ext.define('pljFWV1.view.East', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.East',
	title : '用户管理',
	initComponent : function() {
		Ext.applyIf(this,{
			region:'east',
		    title: 'Hello',
		    width: 200,
            split: true,
            collapsible: true,
		    html: '<p>World!</p>',
		    renderTo: Ext.getBody()
			
		});
		this.callParent(arguments);
	}

});