Ext.onReady(function(){
	//1,开启自动加载、动态加载
	Ext.Loader.setConfig({enabled:true});
	
	Ext.application({
	    name: 'LoginApp',
	    appFolder:'/app/LoginApp',
	    //autoCreateViewport: true,
	    controllers: [
	        'Users'
	    ],
	    launch: function() {
	        /*Ext.create('Ext.container.Viewport', {
	            layout: 'fit',
	            items: [
	                {
	                    title: 'Hello Ext',
	                    html : 'Hello! Welcome to Ext JS.'
	                }
	            ]
	        });*/
	    }
	});
});
