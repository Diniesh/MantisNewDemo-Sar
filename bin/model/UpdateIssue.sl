com.conformiq.creator.structure.v15
creator.gui.screen qml43c0420fa596435caa8f149325e9ee0e "Update Issue scr"
{
	creator.gui.form qml39e42571007f48e280b8273367a95c91 "Update issue form"
	{
		creator.gui.labelwidget qml322ebb758e0447318174ffe23c4defde "Issue ID"
			status = dontcare;
		creator.gui.labelwidget qml1b1104e71f2b4b5db718065f36d9fe49 "ID value"
			status = dontcare;
		creator.gui.labelwidget qml7b93769a24944beaac3d2aa3415281ee "Project"
			status = dontcare;
		creator.gui.labelwidget qmld636a1f2e9614bf6b5d1f58c3f868e9d "Project name"
			status = dontcare;
		creator.gui.dropdown qml4db28bd5631342ad9caac0a2a8670dec "Category UI"
			type = qml93514505a848461ebd7981a535d36186
			status = dontcare;
		creator.gui.dropdown qml25a6b865737b49fd9a2d7d998fe80d85 "View Status UI"
			type = qmlf0d877feffcc4634bd0abaac323646ed
			status = dontcare;
		creator.gui.labelwidget qmlff708a7ae6ae4bcca890b907a7f18bfc "Date Submitted"
			status = dontcare;
		creator.gui.labelwidget qml12b5ad2ab7f44896838648cc1ec334b5 "Last Update "
			status = dontcare;
		creator.gui.labelwidget qml45994b366b6d44d48391af122b4a712e "Reporter"
			status = dontcare;
		creator.gui.hyperlink qml0dca8d8794db4ef286bded59ccd85f4e "user"
			status = dontcare;
		creator.gui.dropdown qml0f55c36ecf7145dfa00827eee79262cb "Assign To UI"
			type = qml28afdca3759a40819e5938db188f45bd
			status = dontcare;
		creator.gui.dropdown qmlc2fc7ed7521c4c4883193e198af1baf2 "Priority UI"
			type = qml4e4c0be27413437db96616c48646ebc3
			status = dontcare;
		creator.gui.dropdown qml585631f1858c4e268889b103aece9098 "Severity UI"
			type = qml0140fd7532214524b94a0353c9d8ca19
			status = dontcare;
		creator.gui.dropdown qml1ac8e8aad09344c295355f87f9238f8e
		"Reproducibiilty UI"
			type = qml45aaeec3b4494921ba048d4edcf13404
			status = dontcare;
		creator.gui.dropdown qmlb0ba0a038971414fadaac2fd11a5f0fe "Status UI"
			type = qml21292586c0e248debef1d626ea7f66fe
			status = dontcare;
		creator.gui.dropdown qml5981cade17ba4c28b5d37c278ecc8a20 "Resolution UI"
			type = qml273c884b28754f1aa95667e23cb55b48
			status = dontcare;
		creator.gui.textbox qmld08de081b2c54abeb944c515cd0fe9e0 "Platform UI"
			type = String
			status = dontcare;
		creator.gui.textbox qml402557f528e74794864122e5423f25dd "OS UI"
			type = String
			status = dontcare;
		creator.gui.textbox qml40ec69249112409cbc565600e4fd799a "OS Version UI"
			type = String
			status = dontcare;
		creator.gui.textbox qmle51b4f138c9144d79e094edd49cc89f6 "Summary UI"
			type = String
			status = dontcare;
		creator.gui.textbox qml7beb0e614be34255b206c6e22b389020 "Description UI"
			type = String
			status = dontcare;
		creator.gui.textbox qmldd953dd7f43b47d0805919e6e7223dea
		"Steps to reproduce UI"
			type = String
			status = dontcare;
		creator.gui.textbox qml6141a91c2627495b8fe1543cafa14133
		"Additional Information UI"
			type = String
			status = dontcare;
		creator.gui.textbox qmle7b196fa03e94dc38ff738629c66dcd8 "Add note UI"
			type = String
			status = dontcare;
		creator.gui.checkbox qml27643c170d3c4fc1b148179c74ea8b14 "private UI"
			status = dontcare
			checked = dontcare;
	}
	creator.gui.button qmld62cc0feaaaf4b3d8382e92b3b5d17d1 "Update details btn"
		status = dontcare;
}
creator.enum qml93514505a848461ebd7981a535d36186 "CategoryUI DD"
{
	creator.enumerationvalue qml203bac327e88482dbb89ff446cf678cc
	"[All Projects] General";
}
creator.enum qmlf0d877feffcc4634bd0abaac323646ed "View statusUI DD"
{
	creator.enumerationvalue qml2916e8cb22564186a04261787b091048 "public";
	creator.enumerationvalue qmlb2cc704409144d558d10f740f2a7968d "private";
}
creator.enum qml28afdca3759a40819e5938db188f45bd "Assign to UI DD"
{
	creator.enumerationvalue qml8da0ba05035a46a7a6c59be945662103 "user1";
	creator.enumerationvalue qmlc855f1de220a4f5990cd1b2f55ce03ad "user2";
}
creator.enum qml0140fd7532214524b94a0353c9d8ca19 "Severity UI DD"
{
	creator.enumerationvalue qml5cd2169d6ffc4deabe03655504748f5e "feature";
	creator.enumerationvalue qmlfe973b323a5348e1bd740a0cad9ad251 "trivial";
	creator.enumerationvalue qml90617f408f0f46edaebbe4b36e899e92 "text";
	creator.enumerationvalue qml1941d7b8049c45d59eec1d260410b3a2 "tweak";
	creator.enumerationvalue qmlf6f322edecb74e2581a38d7ba06d4e4e "minor";
	creator.enumerationvalue qml95bac788ea2a4d59b1cbdd80581b8085 "major";
	creator.enumerationvalue qml66f7a0019b774d3f8d2b369fa7c65f8c "crash";
	creator.enumerationvalue qml1606dc3eda1442fa88b376a0ebd2e1b3 "block";
}
creator.enum qml4e4c0be27413437db96616c48646ebc3 "Priority UI DD"
{
	
	creator.enumerationvalue qml20bd0ae761f14806af62ab9a34764eac "none";
	creator.enumerationvalue qml45bd01debddd4f97919ba8ae8959406f "low";
	creator.enumerationvalue qml6a6dcd3a98b5435e9c3ebfe3358a2b17 "normal";
	creator.enumerationvalue qml81a87605b7e24095a744dd7e6a6ff78f "high";
	creator.enumerationvalue qmldabee8fb8a184938a26b30a60acce728 "urgent";
	creator.enumerationvalue qmle8f36739f67e49efbf2e12a8471bc930 "immediate";
}
creator.enum qml21292586c0e248debef1d626ea7f66fe "Status UI DD"
{
	creator.enumerationvalue qmlcc4893388fc145e1bec2c3b41355e743 "new";
	creator.enumerationvalue qml3a31f0cfdbb04c9a80659439f73b55c1 "feedback";
	creator.enumerationvalue qml70c6cbdf4cf44969bfffb15d561f89e6 "acknowledged";
	creator.enumerationvalue qml6f19334a9afa438fb402af531ab794b1 "confirmed";
	creator.enumerationvalue qml7ddcbb1c10a64f26a7a72e0090b0ded7 "assigned";
	creator.enumerationvalue qmldef2eb2521184dbbb60ba9ff9ff1d97d "resolved";
	creator.enumerationvalue qml4593c7f4f87342f6aa57dd0e289bae05 "closed";
}
creator.enum qml273c884b28754f1aa95667e23cb55b48 "Resolution UI DD"
{
	creator.enumerationvalue qml3a4bf9c7198c4d92ba034ffe90b8a879 "open";
	creator.enumerationvalue qml58fded874d6047508e8fc41579bc0446 "fixed";
	creator.enumerationvalue qml241b5748331d43d297dd270f29880262 "reopened";
	creator.enumerationvalue qml4aab837153c44da8a9a07606fb5bebad
	"unable to reproduce";
	creator.enumerationvalue qmld13c7764c86a4a18b0a3b13cad3e36a3 "not fixable";
	creator.enumerationvalue qmlda26c7f71dea4feb8fa0add5fd133387 "duplicate";
	creator.enumerationvalue qml0d7876d963c94a6abee0947a8d98e488
	"no change required";
	creator.enumerationvalue qmlc3b3e38778e746d5b73f512533ad75a7 "suspended";
	creator.enumerationvalue qml7f698b331810441b9dda753393d348c3 "won\'t fix";
}
creator.enum qml45aaeec3b4494921ba048d4edcf13404 "Reproducibility UI DD"
{
	creator.enumerationvalue qml65d9dcc91b804832941562fad6677e83 "always";
	creator.enumerationvalue qml62f8e1550a0648659b709b47188a2906 "sometimes";
	creator.enumerationvalue qml71a11b86c1f048d09db3f411793a4296 "random";
	creator.enumerationvalue qml642268d8290c4312b4d8d081d41fe993
	"have not tried";
	creator.enumerationvalue qml170375ba576643fbb20bc34e0856ce8d
	"unable to reproduce";
	creator.enumerationvalue qml9183d870fa5a4a058f7928174f487ef5 "N/A";
}