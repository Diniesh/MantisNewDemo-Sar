com.conformiq.creator.structure.v15
creator.gui.screen qml91594035f0724937ba29f5671644936a "SignUp screen"
{
	creator.gui.form qml98840f00c1a244a4a2bcdcadf5cac07f "Signup form"
	{
		creator.gui.textbox qmldb0c5ba1a3df43c7ad75b404b9f8780b "username"
			type = String
			status = dontcare;
		creator.gui.textbox qml900c7169e0c54bc1bb8fba9dd9f2e915 "email"
			type = String
			status = dontcare;
		creator.gui.textbox qml49140d076c4445ad880de2eccbbaa823 "captcha box"
			type = String
			status = dontcare;
		creator.gui.button qml1aed0841f33d4c168abc426df1730e6a "Read captcha"
			status = dontcare;
		creator.gui.button qmlfc5df9d0f02f4b698d52ff0fce56a501 "Reload captcha"
			status = dontcare;
		creator.gui.button qmlef9e24d2a5784aa09b167477780d714e "Signup"
		annotations=["selenium:XPATH" = "//input[@value='Signup']";]
			status = dontcare;

	
	}
	creator.gui.hyperlink qml0d94bf93a0304e149d6b876c997babdc "Login"
		status = dontcare;
	creator.gui.hyperlink qml25b60ae8f0cd40449f1b7544a601bfd3
	"Lost your password"
		status = dontcare;
}
creator.gui.screen qml465842ccf31748f8b4602aa9f5407f82 "Signup/password reset error screen"
{
	creator.gui.labelwidget qmla3e95f6f494648ed88c1a5b8d3aa7f22
	"Application error #number"
	annotations=["selenium:XPATH" = "//p[@class='bold']";]
		status = dontcare;
}
creator.gui.screen qml1e1ab8fef38644289d83880206fc6863
"Forgot password screen"
{
	creator.gui.form qml55dabddffb15477e9bd77db6bcb0e7bb "Password reset"
	{
		creator.gui.textbox qml4d385a520d9449d2ac6a1356d3361378 "username"
			type = String
			status = dontcare;
		creator.gui.textbox qmlf9332b898d5442738815fc89fc3c7c22 "email"
			type = String
			status = dontcare;
		creator.gui.button qml2fa8c967aa524e68b7ddd7d92edb4d7e "submit"
			status = dontcare;
	}
	creator.gui.hyperlink qml1a38f4eac21a4dfcbcf00df2712e4df0 "Login"
		status = dontcare;
	creator.gui.hyperlink qml31885a8291174ba495f63dd1b823d73a
	"Signup for a new account"
		status = dontcare;
}