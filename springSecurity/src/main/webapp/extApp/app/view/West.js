Ext.define('pljFWV1.view.West', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.frameWest',
	initComponent : function() {
		Ext.applyIf(this,{
			 region: 'west',
             stateId: 'navigation-panel',
             id: 'west-panel', // see Ext.getCmp() below
             title: 'West',
             split: true,
             width: 200,
             minWidth: 175,
             maxWidth: 400,
             collapsible: true,
             animCollapse: true,
             margins: '0 0 0 5',
             layout: 'accordion',
             items: [{
                 title: '模块内容',
                 layout:'fit',
                 items:[{
                	 xtype:'treepanel',
                	 store:'Menu',
                	 width: 200,
            	    height: 150,
            	    rootVisible: false,
            	    renderTo: Ext.getBody()
                 }]
             },{
                 title: '系统管理',
                 html: 'Panel content!'
             },{
                 title: '文档帮助',
                 html: 'Panel content!'
             }],
             renderTo: Ext.getBody()
			
		});
		this.callParent(arguments);

	}
});
