Ext.define('pljFWV1.view.menu.List', {
	extend : 'Ext.tree.Panel',
	alias : 'widget.menuList',
	store: 'TreeMenuGrid',
	autoShow : true,
	rootVisible: false,
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