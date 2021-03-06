Ext.define('pljFWV1.view.Viewport', {
	extend : 'Ext.Viewport',
	layout : 'border',
	hideBorders : false,
	requires : [ 'pljFWV1.view.North'],
	initComponent : function() {
		Ext.apply(this, {
			items : [
			    Ext.create('pljFWV1.view.North'),
				Ext.create('pljFWV1.view.West'),
				Ext.create('pljFWV1.view.Center'),
				Ext.create('pljFWV1.view.East'),
				Ext.create('pljFWV1.view.South')
			]
		});
		this.callParent(arguments);
	}
});

