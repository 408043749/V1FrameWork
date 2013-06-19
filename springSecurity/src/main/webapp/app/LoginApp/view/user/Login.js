 var required = '<span style="color:red;font-weight:bold" data-qtip="Required">*</span>';
Ext.define('LoginApp.view.user.Login',{
	extend:'Ext.form.Panel',
	alias:'widget.edit_login',
        xtype: 'widget.edit_login',
        layout: 'form',
        collapsible: true,
        bodyPadding: '5 5 0',
        title: '登录列表',
        width: 350,
        url:'/security/LoginAction!login',
        frame: true,
        fieldDefaults: {
            msgTarget: 'side',
            labelWidth: 75
        },
        defaultType: 'textfield',
       /* collapsible: true,
        id: 'simpleForm',
        url: 'save-form.php',
        frame: true,
        title: 'Simple Form',
        bodyPadding: '5 5 0',
        width: 350,
        fieldDefaults: {
            msgTarget: 'side',
            labelWidth: 75
        },
        defaultType: 'textfield',*/
        items: [{
            fieldLabel: '姓名',
            name: 'name',
            allowBlank: false
        },{
            fieldLabel: '密码',
            name: 'password',
            allowBlank: false
        }],
        buttons :[
            {
                text: 'Save',
                action: 'save'
            },
            {
                text: 'Cancel',
                scope: this,
                handler: this.close
            }
        ]
});

