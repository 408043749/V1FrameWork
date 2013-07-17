Ext.create('Ext.data.Store', {
    storeId:'simpsonsStore',
    fields:['name', 'email', 'phone'],
    data:{'items':[
        { 'name': 'Lisa',  "email":"lisa@simpsons.com",  "phone":"555-111-1224"  },
        { 'name': 'Bart',  "email":"bart@simpsons.com",  "phone":"555-222-1234" },
        { 'name': 'Homer', "email":"home@simpsons.com",  "phone":"555-222-1244"  },
        { 'name': 'Marge', "email":"marge@simpsons.com", "phone":"555-222-1254"  }
    ]},
    proxy: {
        type: 'memory',
        reader: {
            type: 'json',
            root: 'items'
        }
    }
});

Ext.define('pljFWV1.view.menu.List', {
	extend : 'Ext.grid.Panel',
	alias : 'widget.menuList',
	store: 'Menu',
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