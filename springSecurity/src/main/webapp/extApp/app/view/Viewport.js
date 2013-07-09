Ext.define('pljFWV1.view.Viewport', {
	extend : 'Ext.Viewport',
	layout : 'fit',
	hideBorders : false,
	requires : [ 'pljFWV1.view.Header'],
	initComponent : function() {
		var me = this;
		Ext.apply(me, {
			items : [{
				id:'desk',     
				layout: 'border',     
				items: [
				        Ext.create('pljFWV1.view.Header')
				        
				]
			}]
		});
		me.callParent(arguments);
	}
});

