Ext.define('pljFWV1.controller.Users',{
	extend:'Ext.app.Controller',
	views:[
	       'user.List',
	       'user.Edit'
	],
	stores:[
	        'Users'
	],
	init:function(){
		this.control({
			'userList':{
				itemdblclick:this.editUser
			},
			'userEdit button[action=save]':{
				click:this.saveOrUpdate
			}
		});
	},
	editUser:function(grid,record){
		var view = Ext.widget('userEdit');
		view.down('form').loadRecord(record);
	},
	saveOrUpdate:function(button){
		var window = button.up('window')
		var form = window.down('form');
		form.submit({
			url:'/system/user/save',
			success:function(data){
				var record = form.getRecord();
				record.set(form.getValues());
				window.close();
			}
		});
	}
})