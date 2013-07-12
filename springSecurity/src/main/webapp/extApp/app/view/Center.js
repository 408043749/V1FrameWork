Ext.define('pljFWV1.view.Center', {
	extend : 'Ext.tab.Panel',
	alias : 'widget.Center',
	id:'panelCenter',
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
		    listeners: {
		        beforetabchange: function(tabs, newTab, oldTab) {
		            return newTab.title != 'P2';
		        }
		    },
		    items: [{
		        title: '首页'
		    }, {
		        title: 'P2'
		    }, {
		        title: 'P3'
		    }],
		    renderTo: Ext.getBody()
			
		});
		this.callParent(arguments);
	}

});