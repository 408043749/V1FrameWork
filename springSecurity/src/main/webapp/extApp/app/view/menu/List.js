
Ext.define('pljFWV1.view.menu.List', {
	extend : 'Ext.tree.Panel',
	alias : 'widget.menuList',
	store: 'TreeMenuGrid',
	autoShow : true,
	rootVisible: false,
	tbar:[
	        {
	        	itemId:'tar-btn-add',
	            text: '新增'
	        },
	        {
	        	itemId:'tar-btn-delete',
	            text : '删除'
	        },
	        '->',
	        {
	            xtype    : 'textfield',
	            name     : 'field1',
	            emptyText: 'enter search term'
	        }
	    ],
	initComponent : function() {
		this.columns = [  {
			xtype:'treecolumn',
			header : '菜单名称',
			dataIndex : 'name',
			flex : 2
		},{
			header : 'Id',
			dataIndex : 'id',
			flex: 2,
            sortable: true
		}];

		this.callParent(arguments);
	}

});