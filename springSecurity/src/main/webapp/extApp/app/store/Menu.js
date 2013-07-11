Ext.define('pljFWV1.store.Menu', {
	extend : 'Ext.data.TreeStore',
	model:'pljFWV1.model.Menu',
	autoLoad:true,
	proxy:{
		type:'ajax',
		url:'/system/menu/getMenuByParentUuidJson',
		reader:{
			type:'json',
			root:'root'
		}
	},
    root: {
        text: '根节点',
        id: '0',
        expanded: true
    },
});