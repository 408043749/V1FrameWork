var westContoller = Ext.define('pljFWV1.controller.West', {
	extend : 'Ext.app.Controller',
	id:'west',
	views : [ 'West' ],
	stores:[
	        'Menu'
	],
	init:function(){
		//alert('west');
		this.control({
			'treepanel':{
				itemclick:this.treeItemClick
			}
		});
	},
	treeItemClick:function(treepanel, record, item, index, e, eOpts){
		Ext.create('Ext.tab.Panel', {
		    renderTo: Ext.getDom('panelCenter'),
		    height: 100,
		    width: 200,
		    items: [
		        {
		            // Explicitly define the xtype of this Component configuration.
		            // This tells the Container (the tab panel in this case)
		            // to instantiate a Ext.panel.Panel when it deems necessary
		            xtype: 'panel',
		            title: 'Tab One',
		            html: 'The first tab',
		            listeners: {
		                render: function() {
		                   // Ext.MessageBox.alert('Rendered One', 'Tab One was rendered.');
		                }
		            }
		        },
		        {
		            // this component configuration does not have an xtype since 'panel' is the default
		            // xtype for all Component configurations in a Container
		            title: 'Tab Two',
		            html: 'The second tab',
		            listeners: {
		                render: function() {
		                  //  Ext.MessageBox.alert('Rendered One', 'Tab Two was rendered.');
		                }
		            }
		        }
		    ]
		});
	}
});
