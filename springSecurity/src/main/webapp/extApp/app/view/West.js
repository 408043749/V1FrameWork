Ext.define('pljFWV1.view.West', {
	extend : 'Ext.tree.Panel',
	alias : 'widget.East',
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
                 contentEl: 'west',
                 title: 'Navigation',
                 iconCls: 'nav' // see the HEAD section for style used
             }, {
                 title: 'Settings',
                 html: '<p>Some settings in here.</p>',
                 iconCls: 'settings'
             }, {
                 title: 'Information',
                 html: '<p>Some info in here.</p>',
                 iconCls: 'info'
             }]
			
		});
		this.callParent(arguments);

	}
});