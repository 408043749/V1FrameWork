Ext.define('pljFWV1.view.Center', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.Center',
	title : '用户管理',
	initComponent : function() {
		Ext.applyIf(this,{
			region:'center',
		    title: 'Hello',
		    width: 200,
		    split: true,
            collapsible: true,
            animCollapse: true,
            margins: '0 5 0 0',
            stateId: 'navigation-panel',
		    html: '<p>World!</p>',
		    renderTo: Ext.getBody()
			
		});
		this.callParent(arguments);
	}

});