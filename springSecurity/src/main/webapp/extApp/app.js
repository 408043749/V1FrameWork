Ext.require('Ext.container.Viewport');
Ext.application({
    name: 'pljFWV1',//命名空间
    app:'app',
    controllers:[
        'Users'
    ],
    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                	xtype:'userList'
                }
            ]
        });
    }
});