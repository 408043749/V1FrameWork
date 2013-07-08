Ext.define('pljFWV1.store.Users', {
	extend : 'Ext.data.Store',
	model:'pljFWV1.model.User',
	autoLoad:true,
	proxy:{
		type:'ajax',
		url:'/system/user/getUserListJson',
		reader:{
			type:'json',
			root:'rows'
		}
	}
});