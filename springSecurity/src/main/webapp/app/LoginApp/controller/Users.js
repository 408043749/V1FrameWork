Ext.define('LoginApp.controller.Users',{
	extend: 'Ext.app.Controller',
	views:['user.Login'],
    init: function() {
    	var mainwindow 
			= Ext.create('Ext.container.Viewport',{
	    		padding:0,
	    		id:'mainwindow',
	    		layout:'border',
	    		items: [{ 
	            	xtype:'widget.edit_login',
	            	id:'centerframe',
	                region:'center'//指定子面板所在区域为center  
	            },{
	            	region:'west',
	            	html:'<div style="background-color:#8968CD;width:100%;height:100%;"></div>',
	            	width:'30%'
	            },{
	            	region:'north',
            		html:'<div style="background-color:#8968CD;width:100%;height:100%;"></div>',
	            	height:'30%'
	            },{
	            	region:'south',
	            	html:'<div style="background-color:#8968CD;width:100%;height:100%;"></div>',
	            	height:'30%'
	            },{
	            	region:'east',
	            	html:'<div style="background-color:#8968CD;width:100%;height:100%;"></div>',
	            	width:'30%',
	            	height:'10%'
	            }]
			});
			
	        this.control({
	            'button[action=save]': {
						click:this.fn_login
	            }
	        });
    },
    
    fn_login:function(button){
    	Ext.getCmp('centerframe').submit({
	    	success: function(form, action) {
		       //Ext.Msg.alert('Success', action.result.msg);
	    		window.location.href='/example/HelloWorld.jsp';
		    },
		    failure: function(form, action) {
		    	alert('failure');
		        switch (action.failureType) {
		            case Ext.form.action.Action.CLIENT_INVALID:
		                Ext.Msg.alert('Failure', 'Form fields may not be submitted with invalid values');
		                break;
		            case Ext.form.action.Action.CONNECT_FAILURE:
		                Ext.Msg.alert('Failure', 'Ajax communication failed');
		                break;
		            case Ext.form.action.Action.SERVER_INVALID:
		               Ext.Msg.alert('Failure', action.result.a);
		       }
		    }
    	});
    }
    
});