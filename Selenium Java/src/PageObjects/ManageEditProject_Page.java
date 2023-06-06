package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ManageEditProject_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[@id='project-name']")
	public static WebElement projectnameED;

public void verify_projectnameED(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(projectnameED.getAttribute("value"),data);
	}

}

public void verify_projectnameED_Status(String data){
		//Verifies the Status of the projectnameED
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(projectnameED.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(projectnameED.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!projectnameED.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!projectnameED.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_projectnameED(String data){
		projectnameED.clear();
		projectnameED.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='project-description']")
	public static WebElement Description_CNP_ED;

public void verify_Description_CNP_ED(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Description_CNP_ED.getAttribute("value"),data);
	}

}

public void verify_Description_CNP_ED_Status(String data){
		//Verifies the Status of the Description_CNP_ED
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_CNP_ED.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_CNP_ED.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_CNP_ED.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_CNP_ED.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Description_CNP_ED(String data){
		Description_CNP_ED.clear();
		Description_CNP_ED.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Update Project']")
	public static WebElement EDIT_project_EP;

public void verify_EDIT_project_EP_Status(String data){
		//Verifies the Status of the EDIT_project_EP
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(EDIT_project_EP.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(EDIT_project_EP.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!EDIT_project_EP.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!EDIT_project_EP.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_EDIT_project_EP(){
		EDIT_project_EP.click();
}

@FindBy(how= How.XPATH, using = "//select[@id='project-status']")
	public static WebElement Status_ED;

public void verify_Status_ED(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Status_ED.getAttribute("value"),data);
	}

}

public void verify_Status_ED_Status(String data){
		//Verifies the Status of the Status_ED
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_ED.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_ED.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_ED.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_ED.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Status_ED(String data){
		Select dropdown= new Select(Status_ED);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='project-view-state']")
	public static WebElement ViewStatusED;

public void verify_ViewStatusED(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ViewStatusED.getAttribute("value"),data);
	}

}

public void verify_ViewStatusED_Status(String data){
		//Verifies the Status of the ViewStatusED
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ViewStatusED.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ViewStatusED.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ViewStatusED.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ViewStatusED.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_ViewStatusED(String data){
		Select dropdown= new Select(ViewStatusED);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "InheritanceGlobal_Sts_ED")
	public static WebElement InheritanceGlobal_Sts_ED;

public void verify_InheritanceGlobal_Sts_ED(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(InheritanceGlobal_Sts_ED.getAttribute("value"),data);
	}

}

public void verify_InheritanceGlobal_Sts_ED_Status(String data){
		//Verifies the Status of the InheritanceGlobal_Sts_ED
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(InheritanceGlobal_Sts_ED.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(InheritanceGlobal_Sts_ED.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!InheritanceGlobal_Sts_ED.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!InheritanceGlobal_Sts_ED.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_InheritanceGlobal_Sts_ED(String data){
		if(InheritanceGlobal_Sts_ED.isSelected());
			InheritanceGlobal_Sts_ED.click();
}

@FindBy(how= How.XPATH, using = "//button[normalize-space()='Create New Subproject']")
	public static WebElement Createnew_project;

public void verify_Createnew_project_Status(String data){
		//Verifies the Status of the Createnew_project
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Createnew_project.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Createnew_project.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Createnew_project.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Createnew_project.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Createnew_project(){
		Createnew_project.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Add as Subproject']")
	public static WebElement AddSubproject;

public void verify_AddSubproject_Status(String data){
		//Verifies the Status of the AddSubproject
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddSubproject.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddSubproject.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddSubproject.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddSubproject.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AddSubproject(){
		AddSubproject.click();
}

@FindBy(how= How.XPATH, using = "//div[@class='widget-main']")
	public static WebElement Select_subprojct;

public void verify_Select_subprojct(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Select_subprojct.getAttribute("value"),data);
	}

}

public void verify_Select_subprojct_Status(String data){
		//Verifies the Status of the Select_subprojct
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Select_subprojct.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Select_subprojct.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Select_subprojct.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Select_subprojct.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Select_subprojct(String data){
		Select dropdown= new Select(Select_subprojct);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Delete Project']")
	public static WebElement Deleteproject_ED;

public void verify_Deleteproject_ED_Status(String data){
		//Verifies the Status of the Deleteproject_ED
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Deleteproject_ED.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Deleteproject_ED.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Deleteproject_ED.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Deleteproject_ED.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Deleteproject_ED(){
		Deleteproject_ED.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='manage-project-category-copy-form']//select[@name='other_project_id']")
	public static WebElement SelectCategories;

public void verify_SelectCategories(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(SelectCategories.getAttribute("value"),data);
	}

}

public void verify_SelectCategories_Status(String data){
		//Verifies the Status of the SelectCategories
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectCategories.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectCategories.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectCategories.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectCategories.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_SelectCategories(String data){
		Select dropdown= new Select(SelectCategories);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Categories From']")
	public static WebElement Categories_From;

public void verify_Categories_From_Status(String data){
		//Verifies the Status of the Categories_From
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Categories_From.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Categories_From.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Categories_From.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Categories_From.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Categories_From(){
		Categories_From.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Categories To']")
	public static WebElement Categories_To;

public void verify_Categories_To_Status(String data){
		//Verifies the Status of the Categories_To
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Categories_To.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Categories_To.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Categories_To.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Categories_To.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Categories_To(){
		Categories_To.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='project-add-category-form']//input[@name='name']")
	public static WebElement Category_Textbx;

public void verify_Category_Textbx(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Category_Textbx.getAttribute("value"),data);
	}

}

public void verify_Category_Textbx_Status(String data){
		//Verifies the Status of the Category_Textbx
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_Textbx.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_Textbx.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_Textbx.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_Textbx.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Category_Textbx(String data){
		Category_Textbx.clear();
		Category_Textbx.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Add Category']")
	public static WebElement AddCategories_AC;

public void verify_AddCategories_AC_Status(String data){
		//Verifies the Status of the AddCategories_AC
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddCategories_AC.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddCategories_AC.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddCategories_AC.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddCategories_AC.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AddCategories_AC(){
		AddCategories_AC.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='add_and_edit_category']")
	public static WebElement Add_and_EditCategories;

public void verify_Add_and_EditCategories_Status(String data){
		//Verifies the Status of the Add_and_EditCategories
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_and_EditCategories.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_and_EditCategories.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_and_EditCategories.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_and_EditCategories.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_and_EditCategories(){
		Add_and_EditCategories.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='manage-project-version-copy-form']//select[@name='other_project_id']")
	public static WebElement SelectVersion;

public void verify_SelectVersion(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(SelectVersion.getAttribute("value"),data);
	}

}

public void verify_SelectVersion_Status(String data){
		//Verifies the Status of the SelectVersion
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectVersion.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectVersion.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectVersion.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectVersion.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_SelectVersion(String data){
		Select dropdown= new Select(SelectVersion);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Versions From']")
	public static WebElement Version_From;

public void verify_Version_From_Status(String data){
		//Verifies the Status of the Version_From
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Version_From.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Version_From.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Version_From.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Version_From.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Version_From(){
		Version_From.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Versions To']")
	public static WebElement Version_To;

public void verify_Version_To_Status(String data){
		//Verifies the Status of the Version_To
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Version_To.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Version_To.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Version_To.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Version_To.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Version_To(){
		Version_To.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='version']")
	public static WebElement Version_Textbx;

public void verify_Version_Textbx(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Version_Textbx.getAttribute("value"),data);
	}

}

public void verify_Version_Textbx_Status(String data){
		//Verifies the Status of the Version_Textbx
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Version_Textbx.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Version_Textbx.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Version_Textbx.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Version_Textbx.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Version_Textbx(String data){
		Version_Textbx.clear();
		Version_Textbx.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@name='add_version']")
	public static WebElement AddVersion;

public void verify_AddVersion_Status(String data){
		//Verifies the Status of the AddVersion
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddVersion.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddVersion.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddVersion.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddVersion.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AddVersion(){
		AddVersion.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='add_and_edit_version']")
	public static WebElement Add_and_EditVersion;

public void verify_Add_and_EditVersion_Status(String data){
		//Verifies the Status of the Add_and_EditVersion
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_and_EditVersion.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_and_EditVersion.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_and_EditVersion.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_and_EditVersion.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_and_EditVersion(){
		Add_and_EditVersion.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='manage-project-custom-field-copy-form']//select[@name='other_project_id']")
	public static WebElement SelectCustomField;

public void verify_SelectCustomField(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(SelectCustomField.getAttribute("value"),data);
	}

}

public void verify_SelectCustomField_Status(String data){
		//Verifies the Status of the SelectCustomField
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectCustomField.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectCustomField.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectCustomField.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectCustomField.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_SelectCustomField(String data){
		Select dropdown= new Select(SelectCustomField);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy From']")
	public static WebElement Custom_From;

public void verify_Custom_From_Status(String data){
		//Verifies the Status of the Custom_From
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Custom_From.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Custom_From.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Custom_From.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Custom_From.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Custom_From(){
		Custom_From.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy To']")
	public static WebElement Custom_To;

public void verify_Custom_To_Status(String data){
		//Verifies the Status of the Custom_To
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Custom_To.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Custom_To.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Custom_To.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Custom_To.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Custom_To(){
		Custom_To.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Add This Existing Custom Field']")
	public static WebElement Add_Existing_customField;

public void verify_Add_Existing_customField_Status(String data){
		//Verifies the Status of the Add_Existing_customField
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_Existing_customField.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_Existing_customField.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_Existing_customField.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_Existing_customField.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_Existing_customField(){
		Add_Existing_customField.click();
}

@FindBy(how= How.XPATH, using = "//select[@name='field_id']")
	public static WebElement Custom_dropdown;

public void verify_Custom_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Custom_dropdown.getAttribute("value"),data);
	}

}

public void verify_Custom_dropdown_Status(String data){
		//Verifies the Status of the Custom_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Custom_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Custom_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Custom_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Custom_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Custom_dropdown(String data){
		Select dropdown= new Select(Custom_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Users From']")
	public static WebElement Copy_acc_from;

public void verify_Copy_acc_from_Status(String data){
		//Verifies the Status of the Copy_acc_from
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Copy_acc_from.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Copy_acc_from.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Copy_acc_from.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Copy_acc_from.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Copy_acc_from(){
		Copy_acc_from.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Users To']")
	public static WebElement copy_acc_To;

public void verify_copy_acc_To_Status(String data){
		//Verifies the Status of the copy_acc_To
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(copy_acc_To.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(copy_acc_To.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!copy_acc_To.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!copy_acc_To.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_copy_acc_To(){
		copy_acc_To.click();
}

@FindBy(how= How.XPATH, using = "//button[normalize-space()='Show Users with Global Access']")
	public static WebElement Show_users_with_globalaccess;

public void verify_Show_users_with_globalaccess_Status(String data){
		//Verifies the Status of the Show_users_with_globalaccess
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_users_with_globalaccess.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_users_with_globalaccess.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_users_with_globalaccess.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_users_with_globalaccess.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Show_users_with_globalaccess(){
		Show_users_with_globalaccess.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='manage-project-users-copy-form']//select[@name='other_project_id']")
	public static WebElement selectManageACcount;

public void verify_selectManageACcount(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(selectManageACcount.getAttribute("value"),data);
	}

}

public void verify_selectManageACcount_Status(String data){
		//Verifies the Status of the selectManageACcount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(selectManageACcount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(selectManageACcount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!selectManageACcount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!selectManageACcount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_selectManageACcount(String data){
		Select dropdown= new Select(selectManageACcount);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//option[normalize-space()='dhin3348']")
	public static WebElement Username;

public void verify_Username(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Username.getAttribute("value"),data);
	}

}

public void verify_Username_Status(String data){
		//Verifies the Status of the Username
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Username.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Username.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Username.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Username.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Username(String data){
		Select dropdown= new Select(Username);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='project-add-users-access-level']")
	public static WebElement AddUser_Accesslevel;

public void verify_AddUser_Accesslevel(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AddUser_Accesslevel.getAttribute("value"),data);
	}

}

public void verify_AddUser_Accesslevel_Status(String data){
		//Verifies the Status of the AddUser_Accesslevel
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddUser_Accesslevel.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddUser_Accesslevel.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddUser_Accesslevel.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddUser_Accesslevel.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_AddUser_Accesslevel(String data){
		Select dropdown= new Select(AddUser_Accesslevel);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Add User']")
	public static WebElement Add_user_MEP;

public void verify_Add_user_MEP_Status(String data){
		//Verifies the Status of the Add_user_MEP
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_user_MEP.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_user_MEP.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_user_MEP.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_user_MEP.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_user_MEP(){
		Add_user_MEP.click();
}

@FindBy(how= How.ID, using = "development_EP")
	public static WebElement development_EP;

public void verify_development_EP_Status(String data){
		//Verifies the Status of the development_EP
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(development_EP.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(development_EP.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!development_EP.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!development_EP.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_development_EP(){
		development_EP.click();
}

@FindBy(how= How.ID, using = "Custom_project")
	public static WebElement Custom_project;

public void verify_Custom_project_Status(String data){
		//Verifies the Status of the Custom_project
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Custom_project.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Custom_project.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Custom_project.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Custom_project.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Custom_project(){
		Custom_project.click();
}

@FindBy(how= How.ID, using = "administrator_AL")
	public static WebElement administrator_AL;

public void verify_administrator_AL_Status(String data){
		//Verifies the Status of the administrator_AL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(administrator_AL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(administrator_AL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!administrator_AL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!administrator_AL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_administrator_AL(){
		administrator_AL.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}