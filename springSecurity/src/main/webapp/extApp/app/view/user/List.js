Ext.define('pljFWV1.view.user.List', {
	extend : 'Ext.grid.Panel',
	alias : 'widget.userList',
	title : '用户管理',
	store:'Users',
	autoShow : true,
	autoScroll:true,
	initComponent : function() {
		this.columns = [ {
			header : 'Id',
			dataIndex : 'id',
			flex : 1
		}, {
			header : 'Name',
			dataIndex : 'name',
			flex : 1
		} ];

		this.callParent(arguments);
	}

});