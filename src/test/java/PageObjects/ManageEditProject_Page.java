package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("deprecation")
public class ManageEditProject_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[@id='project-name']")
	public static WebElement projectnameED_textbox;

public void verify_projectnameED_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(projectnameED_textbox.getAttribute("value"),data);
	}

}

public void verify_projectnameED_textbox_Status(String data){
		//Verifies the Status of the projectnameED_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(projectnameED_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(projectnameED_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!projectnameED_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!projectnameED_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_projectnameED_textbox(String data){
		projectnameED_textbox.clear();
		projectnameED_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='project-description']")
	public static WebElement Description_CNP_ED_textbox;

public void verify_Description_CNP_ED_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Description_CNP_ED_textbox.getAttribute("value"),data);
	}

}

public void verify_Description_CNP_ED_textbox_Status(String data){
		//Verifies the Status of the Description_CNP_ED_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_CNP_ED_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_CNP_ED_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_CNP_ED_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_CNP_ED_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Description_CNP_ED_textbox(String data){
		Description_CNP_ED_textbox.clear();
		Description_CNP_ED_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Update Project']")
	public static WebElement EDIT_project_EP_button;

public void verify_EDIT_project_EP_button_Status(String data){
		//Verifies the Status of the EDIT_project_EP_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(EDIT_project_EP_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(EDIT_project_EP_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!EDIT_project_EP_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!EDIT_project_EP_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_EDIT_project_EP_button(){
		EDIT_project_EP_button.click();
}

@FindBy(how= How.XPATH, using = "//select[@id='project-status']")
	public static WebElement Status_ED_dropdown;

public void verify_Status_ED_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Status_ED_dropdown.getAttribute("value"),data);
	}

}

public void verify_Status_ED_dropdown_Status(String data){
		//Verifies the Status of the Status_ED_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_ED_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_ED_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_ED_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_ED_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Status_ED_dropdown(String data){
		Select dropdown= new Select(Status_ED_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='project-view-state']")
	public static WebElement ViewStatusED_dropdown;

public void verify_ViewStatusED_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ViewStatusED_dropdown.getAttribute("value"),data);
	}

}

public void verify_ViewStatusED_dropdown_Status(String data){
		//Verifies the Status of the ViewStatusED_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ViewStatusED_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ViewStatusED_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ViewStatusED_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ViewStatusED_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_ViewStatusED_dropdown(String data){
		Select dropdown= new Select(ViewStatusED_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='project-inherit-global']")
	public static WebElement InheritanceGlobal_Sts_ED_checkbox;

public void verify_InheritanceGlobal_Sts_ED_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(InheritanceGlobal_Sts_ED_checkbox.getAttribute("value"),data);
	}

}

public void verify_InheritanceGlobal_Sts_ED_checkbox_Status(String data){
		//Verifies the Status of the InheritanceGlobal_Sts_ED_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(InheritanceGlobal_Sts_ED_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(InheritanceGlobal_Sts_ED_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!InheritanceGlobal_Sts_ED_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!InheritanceGlobal_Sts_ED_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_InheritanceGlobal_Sts_ED_checkbox(String data){
		if(InheritanceGlobal_Sts_ED_checkbox.isSelected());
			InheritanceGlobal_Sts_ED_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//button[normalize-space()='Create New Subproject']")
	public static WebElement Createnew_project_button;

public void verify_Createnew_project_button_Status(String data){
		//Verifies the Status of the Createnew_project_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Createnew_project_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Createnew_project_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Createnew_project_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Createnew_project_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Createnew_project_button(){
		Createnew_project_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Add as Subproject']")
	public static WebElement AddSubproject_button;

public void verify_AddSubproject_button_Status(String data){
		//Verifies the Status of the AddSubproject_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddSubproject_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddSubproject_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddSubproject_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddSubproject_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AddSubproject_button(){
		AddSubproject_button.click();
}

@FindBy(how= How.XPATH, using = "//div[@class='widget-main']")
	public static WebElement Select_subprojct_dropdown;

public void verify_Select_subprojct_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Select_subprojct_dropdown.getAttribute("value"),data);
	}

}

public void verify_Select_subprojct_dropdown_Status(String data){
		//Verifies the Status of the Select_subprojct_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Select_subprojct_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Select_subprojct_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Select_subprojct_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Select_subprojct_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Select_subprojct_dropdown(String data){
		Select dropdown= new Select(Select_subprojct_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Delete Project']")
	public static WebElement Deleteproject_ED_button;

public void verify_Deleteproject_ED_button_Status(String data){
		//Verifies the Status of the Deleteproject_ED_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Deleteproject_ED_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Deleteproject_ED_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Deleteproject_ED_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Deleteproject_ED_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Deleteproject_ED_button(){
		Deleteproject_ED_button.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='manage-project-category-copy-form']//select[@name='other_project_id']")
	public static WebElement SelectCategories_dropdown;

public void verify_SelectCategories_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(SelectCategories_dropdown.getAttribute("value"),data);
	}

}

public void verify_SelectCategories_dropdown_Status(String data){
		//Verifies the Status of the SelectCategories_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectCategories_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectCategories_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectCategories_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectCategories_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_SelectCategories_dropdown(String data){
		Select dropdown= new Select(SelectCategories_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Categories From']")
	public static WebElement Categories_From_button;

public void verify_Categories_From_button_Status(String data){
		//Verifies the Status of the Categories_From_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Categories_From_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Categories_From_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Categories_From_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Categories_From_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Categories_From_button(){
		Categories_From_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Categories To']")
	public static WebElement Categories_To_button;

public void verify_Categories_To_button_Status(String data){
		//Verifies the Status of the Categories_To_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Categories_To_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Categories_To_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Categories_To_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Categories_To_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Categories_To_button(){
		Categories_To_button.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='project-add-category-form']//input[@name='name']")
	public static WebElement Category_Textbx_textbox;

public void verify_Category_Textbx_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Category_Textbx_textbox.getAttribute("value"),data);
	}

}

public void verify_Category_Textbx_textbox_Status(String data){
		//Verifies the Status of the Category_Textbx_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_Textbx_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_Textbx_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_Textbx_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_Textbx_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Category_Textbx_textbox(String data){
		Category_Textbx_textbox.clear();
		Category_Textbx_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Add Category']")
	public static WebElement AddCategories_AC_button;

public void verify_AddCategories_AC_button_Status(String data){
		//Verifies the Status of the AddCategories_AC_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddCategories_AC_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddCategories_AC_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddCategories_AC_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddCategories_AC_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AddCategories_AC_button(){
		AddCategories_AC_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='add_and_edit_category']")
	public static WebElement Add_and_EditCategories_button;

public void verify_Add_and_EditCategories_button_Status(String data){
		//Verifies the Status of the Add_and_EditCategories_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_and_EditCategories_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_and_EditCategories_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_and_EditCategories_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_and_EditCategories_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_and_EditCategories_button(){
		Add_and_EditCategories_button.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='manage-project-version-copy-form']//select[@name='other_project_id']")
	public static WebElement SelectVersion_dropdown;

public void verify_SelectVersion_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(SelectVersion_dropdown.getAttribute("value"),data);
	}

}

public void verify_SelectVersion_dropdown_Status(String data){
		//Verifies the Status of the SelectVersion_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectVersion_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectVersion_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectVersion_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectVersion_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_SelectVersion_dropdown(String data){
		Select dropdown= new Select(SelectVersion_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Versions From']")
	public static WebElement Version_From_button;

public void verify_Version_From_button_Status(String data){
		//Verifies the Status of the Version_From_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Version_From_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Version_From_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Version_From_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Version_From_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Version_From_button(){
		Version_From_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Versions To']")
	public static WebElement Version_To_button;

public void verify_Version_To_button_Status(String data){
		//Verifies the Status of the Version_To_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Version_To_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Version_To_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Version_To_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Version_To_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Version_To_button(){
		Version_To_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='version']")
	public static WebElement Version_Textbx_textbox;

public void verify_Version_Textbx_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Version_Textbx_textbox.getAttribute("value"),data);
	}

}

public void verify_Version_Textbx_textbox_Status(String data){
		//Verifies the Status of the Version_Textbx_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Version_Textbx_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Version_Textbx_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Version_Textbx_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Version_Textbx_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Version_Textbx_textbox(String data){
		Version_Textbx_textbox.clear();
		Version_Textbx_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@name='add_version']")
	public static WebElement AddVersion_button;

public void verify_AddVersion_button_Status(String data){
		//Verifies the Status of the AddVersion_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddVersion_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddVersion_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddVersion_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddVersion_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AddVersion_button(){
		AddVersion_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='add_and_edit_version']")
	public static WebElement Add_and_EditVersion_button;

public void verify_Add_and_EditVersion_button_Status(String data){
		//Verifies the Status of the Add_and_EditVersion_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_and_EditVersion_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_and_EditVersion_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_and_EditVersion_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_and_EditVersion_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_and_EditVersion_button(){
		Add_and_EditVersion_button.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='manage-project-custom-field-copy-form']//select[@name='other_project_id']")
	public static WebElement SelectCustomField_dropdown;

public void verify_SelectCustomField_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(SelectCustomField_dropdown.getAttribute("value"),data);
	}

}

public void verify_SelectCustomField_dropdown_Status(String data){
		//Verifies the Status of the SelectCustomField_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectCustomField_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectCustomField_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectCustomField_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectCustomField_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_SelectCustomField_dropdown(String data){
		Select dropdown= new Select(SelectCustomField_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy From']")
	public static WebElement Custom_From_button;

public void verify_Custom_From_button_Status(String data){
		//Verifies the Status of the Custom_From_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Custom_From_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Custom_From_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Custom_From_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Custom_From_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Custom_From_button(){
		Custom_From_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy To']")
	public static WebElement Custom_To_button;

public void verify_Custom_To_button_Status(String data){
		//Verifies the Status of the Custom_To_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Custom_To_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Custom_To_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Custom_To_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Custom_To_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Custom_To_button(){
		Custom_To_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Add This Existing Custom Field']")
	public static WebElement Add_Existing_customField_button;

public void verify_Add_Existing_customField_button_Status(String data){
		//Verifies the Status of the Add_Existing_customField_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_Existing_customField_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_Existing_customField_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_Existing_customField_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_Existing_customField_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_Existing_customField_button(){
		Add_Existing_customField_button.click();
}

@FindBy(how= How.XPATH, using = "//select[@name='field_id']")
	public static WebElement Custom_dropdown_dropdown;

public void verify_Custom_dropdown_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Custom_dropdown_dropdown.getAttribute("value"),data);
	}

}

public void verify_Custom_dropdown_dropdown_Status(String data){
		//Verifies the Status of the Custom_dropdown_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Custom_dropdown_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Custom_dropdown_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Custom_dropdown_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Custom_dropdown_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Custom_dropdown_dropdown(String data){
		Select dropdown= new Select(Custom_dropdown_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Users From']")
	public static WebElement Copy_acc_from_button;

public void verify_Copy_acc_from_button_Status(String data){
		//Verifies the Status of the Copy_acc_from_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Copy_acc_from_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Copy_acc_from_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Copy_acc_from_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Copy_acc_from_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Copy_acc_from_button(){
		Copy_acc_from_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Copy Users To']")
	public static WebElement copy_acc_To_button;

public void verify_copy_acc_To_button_Status(String data){
		//Verifies the Status of the copy_acc_To_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(copy_acc_To_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(copy_acc_To_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!copy_acc_To_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!copy_acc_To_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_copy_acc_To_button(){
		copy_acc_To_button.click();
}

@FindBy(how= How.XPATH, using = "//button[normalize-space()='Show Users with Global Access']")
	public static WebElement Show_users_with_globalaccess_button;

public void verify_Show_users_with_globalaccess_button_Status(String data){
		//Verifies the Status of the Show_users_with_globalaccess_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_users_with_globalaccess_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_users_with_globalaccess_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_users_with_globalaccess_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_users_with_globalaccess_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Show_users_with_globalaccess_button(){
		Show_users_with_globalaccess_button.click();
}

@FindBy(how= How.XPATH, using = "//form[@id='manage-project-users-copy-form']//select[@name='other_project_id']")
	public static WebElement selectManageACcount_dropdown;

public void verify_selectManageACcount_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(selectManageACcount_dropdown.getAttribute("value"),data);
	}

}

public void verify_selectManageACcount_dropdown_Status(String data){
		//Verifies the Status of the selectManageACcount_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(selectManageACcount_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(selectManageACcount_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!selectManageACcount_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!selectManageACcount_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_selectManageACcount_dropdown(String data){
		Select dropdown= new Select(selectManageACcount_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//option[normalize-space()='dhin3348']")
	public static WebElement Username_listbox;

public void verify_Username_listbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Username_listbox.getAttribute("value"),data);
	}

}

public void verify_Username_listbox_Status(String data){
		//Verifies the Status of the Username_listbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Username_listbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Username_listbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Username_listbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Username_listbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Username_listbox(String data){
		Select listboxObject=new Select(Username_listbox);
		listboxObject.selectByValue(data);
		if(!data.isEmpty()) {
			for(String value:data.split(","))
				listboxObject.selectByValue(value);
		}
	}

@FindBy(how= How.XPATH, using = "//select[@id='project-add-users-access-level']")
	public static WebElement AddUser_Accesslevel_dropdown;

public void verify_AddUser_Accesslevel_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AddUser_Accesslevel_dropdown.getAttribute("value"),data);
	}

}

public void verify_AddUser_Accesslevel_dropdown_Status(String data){
		//Verifies the Status of the AddUser_Accesslevel_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddUser_Accesslevel_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddUser_Accesslevel_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddUser_Accesslevel_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddUser_Accesslevel_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_AddUser_Accesslevel_dropdown(String data){
		Select dropdown= new Select(AddUser_Accesslevel_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Add User']")
	public static WebElement Add_user_MEP_button;

public void verify_Add_user_MEP_button_Status(String data){
		//Verifies the Status of the Add_user_MEP_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_user_MEP_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_user_MEP_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_user_MEP_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_user_MEP_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_user_MEP_button(){
		Add_user_MEP_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}