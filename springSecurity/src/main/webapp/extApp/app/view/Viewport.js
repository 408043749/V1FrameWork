Ext.define('pljFWV1.view.Viewport', {
	extend : 'Ext.Viewport',
	layout : 'border',
	hideBorders : false,
	requires : [ 'pljFWV1.view.Header'],
	initComponent : function() {
		var me = this;
		Ext.apply(me, {
			items : [
			    Ext.create('pljFWV1.view.Header'),
				Ext.create('pljFWV1.view.West'),
				Ext.create('pljFWV1.view.Center'),
				Ext.create('pljFWV1.view.East'),
				Ext.create('pljFWV1.view.South')
			]
		});
		me.callParent(arguments);
	}
});
