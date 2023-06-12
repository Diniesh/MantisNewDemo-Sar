com.conformiq.creator.structure.v15
creator.gui.screen qmlfaa46842c3fb4e5ca3defa9296fbda99 "ManageEditProject"
{
	creator.gui.form qml633d9743ce5f4d5e805c9c5d55ae567b "edit_new_project_ME"
	{
		creator.gui.textbox qmlcfe6d5bd3e404fb9998098fdda40d598 "projectnameED"
			annotations = [ "selenium:XPATH" = "//input[@id='project-name']";]
			type = String
			status = dontcare;
		creator.gui.textbox qmlfe8ee5ce8a8e4eea920c8af8e931e40f "Description_CNP_ED"
			annotations = [ "selenium:XPATH" ="//textarea[@id='project-description']";]
			type = String
			status = dontcare;
		creator.gui.button qmlb0eb614c8ea9423ca8fe3e033cfafd48 "EDIT_project_EP"
			annotations = [ "selenium:XPATH" = "//input[@value='Update Project']";
		]
			status = dontcare;
		creator.gui.dropdown qml43b664edbe364de086f3950156fc9445 "Status_ED"
			annotations = ["selenium:XPATH" = "//select[@id='project-status']";]
			type = qml08097e5e8d714399b7e3bc199e4cba50
			status = dontcare;
		
		creator.gui.dropdown qmlcb1e9b33517d425697377ebd48098fee "ViewStatusED"
			annotations = ["selenium:XPATH" = "//select[@id='project-view-state']";]
			type = qmlab245c988c8545a5b03a91a4dcc8b8cc
			status = dontcare;
		creator.gui.checkbox qmlbabde295e1e742808f75e599ac789cef
		"InheritanceGlobal_Sts_ED"
			annotations = ["selenium:XPATH" = "//input[@id='project-inherit-global']";]
			status = dontcare
			checked = dontcare;
	}
	creator.gui.form qml43d705d50a0c45c0a78d4dba378719c6 "Subproject_SP"
	{
		creator.gui.button qml89076d0acf604e80a434b4a18208dd65 "Createnew_project"
			annotations = ["selenium:XPATH" = "//button[normalize-space()='Create New Subproject']";]
			status = dontcare;
		
		creator.gui.button qml1e13c911348c4735bf39e1e0ee45ebae "AddSubproject"
			annotations = ["selenium:XPATH" = "//input[@value='Add as Subproject']";]
			status = dontcare;
		creator.gui.dropdown qml7fc8f16b9ed44cec94d864e49063bad5 "Select_subprojct"
			annotations = ["selenium:XPATH" = "//div[@class='widget-main']";]
			type = qmle5f6ba9fc63946c993ea3ce3ca1da4a2
			status = dontcare;
	}
	creator.gui.button qml7e9454f6ed6c48778cfee79e1d7eca84 "Deleteproject_ED"
		annotations = ["selenium:XPATH" = "//input[@value='Delete Project']";]
		status = dontcare;
	creator.gui.form qmle2717706c8d9411397df2eaae3c12347 "Categories_MEP"
	{
		creator.gui.dropdown qml922ef30681a3463e98b7038a5f27342a "SelectCategories"
			annotations = ["selenium:XPATH" = "//form[@id='manage-project-category-copy-form']//select[@name='other_project_id']";]
			type = qmla20263bd6d234b7d98b7d7586a58b556
			status = dontcare;
		creator.gui.button qmlbd69fd76a87c4cf3af02b62e39f5ca2a "Categories_From"
			annotations = ["selenium:XPATH" = "//input[@value='Copy Categories From']";]
			status = dontcare;
		creator.gui.button qmlb6fcb984eb1342f585779bee0042cead "Categories_To"
			annotations = ["selenium:XPATH" = "//input[@value='Copy Categories To']";]
			status = dontcare;
		creator.gui.textbox qml932dfd9e85ea4b7fa1205ba08020cee2 "Category_Textbx"
			annotations = ["selenium:XPATH" = "//form[@id='project-add-category-form']//input[@name='name']";]
			type = String
			status = dontcare;
		creator.gui.button qmlfbe63db5c6d54908b29645c3f7e5bf23 "AddCategories_AC"
			annotations = ["selenium:XPATH" = "//input[@value='Add Category']";]
			status = dontcare;
		creator.gui.button qmla04775fe3a7445e5af7809a8b086d8ad
		"Add and EditCategories"
			annotations = ["selenium:XPATH" = "//input[@name='add_and_edit_category']";]
			status = dontcare;
	}
	creator.gui.form qml28f80ebd1acf4c13b8a626cb5a27fa71 "Version_MEP"
	{
		creator.gui.dropdown qmlecf0e0c7220b4e5e999531a2ded2307f "SelectVersion"
			annotations = ["selenium:XPATH" = "//form[@id='manage-project-version-copy-form']//select[@name='other_project_id']";]
			type = qml29e8eebbafe44c1a8cb011df06cd5306
			status = dontcare;
		creator.gui.button qmldca9fc0c87f640e0a9ad8bc84fe097ad "Version_From"
			annotations = ["selenium:XPATH" = "//input[@value='Copy Versions From']";]
			status = dontcare;
		creator.gui.button qml9b7cc1b5c73a4d878e45f6a7f4e2efd6 "Version_To"
			annotations = ["selenium:XPATH" = "//input[@value='Copy Versions To']";]
			status = dontcare;
		creator.gui.textbox qmld1ad2c6f43d84572b053b727c292b81f "Version_Textbx"
			annotations = ["selenium:XPATH" = "//input[@name='version']";]
			type = String
			status = dontcare;
		creator.gui.button qml1d8967a54c5f4c01a84aaf16fc95335f "AddVersion"
			annotations = ["selenium:XPATH" = "//input[@name='add_version']";]
			status = dontcare;
		creator.gui.button qml21df506ce4ce4e5fa4c9bc1782f71fb1 "Add and EditVersion"
			annotations = ["selenium:XPATH" = "//input[@name='add_and_edit_version']";]
			status = dontcare;
	}
	creator.gui.form qml067a7293cdd34ad4a463cb0557144214 "CustomField_MEP"
	{
		creator.gui.dropdown qml5266c29971ee46d7b43a14cc2c91af18 "SelectCustomField"
			annotations = ["selenium:XPATH" = "//form[@id='manage-project-custom-field-copy-form']//select[@name='other_project_id']";]
			type = qmlf74b27d5bdfd405a8866b7793f3b3f11
			status = dontcare;
		creator.gui.button qml2fbc135b9e1645f9975b0ec6f732d11c "Custom_From"
			annotations = ["selenium:XPATH" = "//input[@value='Copy From']";]
			status = dontcare;
		creator.gui.button qml9f7b22ea4f364ae3922aca863c6d972b "Custom_To"
			annotations = ["selenium:XPATH" = "//input[@value='Copy To']";]
			status = dontcare;
		
		
		creator.gui.button qml27259df38cc747ac9b12d974be955d6a
		"Add Existing_customField"
			annotations = ["selenium:XPATH" = "//input[@value='Add This Existing Custom Field']";]
			status = dontcare;
		creator.gui.dropdown qml48a5f90299ed4d7384f9a021fcb8213c "Custom_dropdown"
			annotations = ["selenium:XPATH" = "//select[@name='field_id']";]
			type = qmlaca944d183624e3e90d336d8d8e94ef6
			status = dontcare;
	}
	creator.gui.form qml66f0d4a34b364b4780a001901c87d92e "Manageaccount_MEP"
	{
		creator.gui.button qml6505cd60e5b64720b915cb1f623943e2 "Copy_acc_from"
			annotations = ["selenium:XPATH" = "//input[@value='Copy Users From']";]
			status = dontcare;
		creator.gui.button qml1307e87c172f45c39f6ddb56428b2670 "copy_acc_To"
			annotations = ["selenium:XPATH" = "//input[@value='Copy Users To']";]
			status = dontcare;
		creator.gui.button qml9b47c7edc028409f97d62c172dce4e26
		"Show_users with globalaccess"
			annotations = ["selenium:XPATH" = "//button[normalize-space()='Show Users with Global Access']";]
			status = dontcare;
		creator.gui.dropdown qml1fc10171aa2b4b9f9a9b6dc4517c1e2e
		"selectManageACcount"
			annotations = ["selenium:XPATH" = "//form[@id='manage-project-users-copy-form']//select[@name='other_project_id']";]
			type = qml01a5fd5159b146f3b929a738b8eca0bd
			status = dontcare;
	}
	creator.gui.form qmld3c0d48ce359446aa51438931cfee9ec "Adduser_MEP"
	{
		creator.gui.listbox qml5afe9b2dfa5f41fa8c88ac054d7209f8 "Username"
			annotations = ["selenium:XPATH" = "//option[normalize-space()='dhin3348']";]
			status = dontcare
			items = [ ];
		creator.gui.dropdown qml7b6bf56e33d049aa8b8990d4654cace4
		"AddUser_Accesslevel"
			annotations = ["selenium:XPATH" = "//select[@id='project-add-users-access-level']";]
			type = qmle4a26c0470e14b278c1da513d43ce04d
			status = dontcare;
		creator.gui.button qmlf2d0b2328d3a42248a14b86cec1a52ce "Add user_MEP"
			annotations =["selenium:XPATH" = "//input[@value='Add User']";]
			status = dontcare;
	}
}
creator.enum qmlab245c988c8545a5b03a91a4dcc8b8cc "Viewsts_ED"
{
	creator.enumerationvalue qml24577e52403c4cca8ce010942053352f "PublicED";
	creator.enumerationvalue qmlbe654a2c0fba4c6985fe30c523dcd449 "privateED";
	
}
creator.enum qml08097e5e8d714399b7e3bc199e4cba50 "Status_Enum_EP"
{
	creator.enumerationvalue qml85b169249837482e857682cab13f9030
	"development_EP";
	creator.enumerationvalue qmld00bef78e2a24a37884ada091d7fc910 "release_EP";
	creator.enumerationvalue qml60f307b2e51f48eb858ef5e3cab1f5ba "stable_EP";
	creator.enumerationvalue qmlced16c8849574587abea8788c6220700 "obsolete_EP";
}
creator.enum qmle5f6ba9fc63946c993ea3ce3ca1da4a2 "Subproject"
{
	creator.enumerationvalue qmlda415a18d4e544d0a7d8e7fe8b341873 "S_project1";
	creator.enumerationvalue qmlb120a19f0be54a2194961ac8f903370b "S_project2";
}
creator.enum qmla20263bd6d234b7d98b7d7586a58b556 "Categories_Enum"
{
	creator.enumerationvalue qml33ab1fd0fcd34bba914b4cc7476594b9 "Cat_1";
	creator.enumerationvalue qmlb0550206235f49359222d9b1e6d0b950 "Cat_2";
}
creator.enum qml29e8eebbafe44c1a8cb011df06cd5306 "Version_ENUM"
{
	creator.enumerationvalue qml397a719fe51f4ba0bbc0e15eaf68695f "Version_1";
	creator.enumerationvalue qml94af77b8c43d4ac280424b6f6167ac3f "Version_2";
}
creator.enum qmlf74b27d5bdfd405a8866b7793f3b3f11 "Custom_ENUM"
{
	creator.enumerationvalue qml9566723d2df04e5aae8772333789e108 "Custom_1";
	creator.enumerationvalue qmld1e2c8f4ce994a0eb9eceaef0004220a "Custom_2";
}
creator.enum qmlaca944d183624e3e90d336d8d8e94ef6 "CustomDropdown"
{
	creator.enumerationvalue qml04103e7876614cdfbf36977379dd540a
	"Custom_project";
}
creator.enum qml01a5fd5159b146f3b929a738b8eca0bd "manageacc_enum"
{
	creator.enumerationvalue qml136d57bb0e7d45b79cc0e46eb5efb2fb "Account_1";
}
creator.enum qmle4a26c0470e14b278c1da513d43ce04d "accesslevel_MEP"
{
	creator.enumerationvalue qml0e34450f559a4836a11369e8553797ab "viewer_AL";
	creator.enumerationvalue qmla3f2e9fb345e4538a940f5420eac09b8 "developer_AL";
	creator.enumerationvalue qml2d80ace0ff25435489c41d3c7107ec94 "updater_AL";
	creator.enumerationvalue qml5191d7df313446a3bb9d632be57811ce
	"administrator_AL";
	creator.enumerationvalue qmlc708134db7eb48acac267fd6d4baa3d0 "manager_AL";
	creator.enumerationvalue qml176fea998b74467d979c02cc1021c282 "reporter_AL";
}