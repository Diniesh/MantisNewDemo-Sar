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
public class Update_Issue_scr_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Issue_ID_label")
	public static WebElement Issue_ID_label;

public void verify_Issue_ID_label(String data){
		Assert.assertEquals(Issue_ID_label,Issue_ID_label);
}

public void verify_Issue_ID_label_Status(String data){
		//Verifies the Status of the Issue_ID_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "ID_value_label")
	public static WebElement ID_value_label;

public void verify_ID_value_label(String data){
		Assert.assertEquals(ID_value_label,ID_value_label);
}

public void verify_ID_value_label_Status(String data){
		//Verifies the Status of the ID_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ID_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ID_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ID_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ID_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Project_label")
	public static WebElement Project_label;

public void verify_Project_label(String data){
		Assert.assertEquals(Project_label,Project_label);
}

public void verify_Project_label_Status(String data){
		//Verifies the Status of the Project_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Project_name_label")
	public static WebElement Project_name_label;

public void verify_Project_name_label(String data){
		Assert.assertEquals(Project_name_label,Project_name_label);
}

public void verify_Project_name_label_Status(String data){
		//Verifies the Status of the Project_name_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_name_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_name_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_name_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_name_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Category_UI_dropdown")
	public static WebElement Category_UI_dropdown;

public void verify_Category_UI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Category_UI_dropdown.getAttribute("value"),data);
	}

}

public void verify_Category_UI_dropdown_Status(String data){
		//Verifies the Status of the Category_UI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_UI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_UI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_UI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_UI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Category_UI_dropdown(String data){
		Select dropdown= new Select(Category_UI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "View_Status_UI_dropdown")
	public static WebElement View_Status_UI_dropdown;

public void verify_View_Status_UI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(View_Status_UI_dropdown.getAttribute("value"),data);
	}

}

public void verify_View_Status_UI_dropdown_Status(String data){
		//Verifies the Status of the View_Status_UI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_UI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_UI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_UI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_UI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_View_Status_UI_dropdown(String data){
		Select dropdown= new Select(View_Status_UI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Date_Submitted_label")
	public static WebElement Date_Submitted_label;

public void verify_Date_Submitted_label(String data){
		Assert.assertEquals(Date_Submitted_label,Date_Submitted_label);
}

public void verify_Date_Submitted_label_Status(String data){
		//Verifies the Status of the Date_Submitted_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_Submitted_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_Submitted_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_Submitted_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_Submitted_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Last_Update__label")
	public static WebElement Last_Update__label;

public void verify_Last_Update__label(String data){
		Assert.assertEquals(Last_Update__label,Last_Update__label);
}

public void verify_Last_Update__label_Status(String data){
		//Verifies the Status of the Last_Update__label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_Update__label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_Update__label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_Update__label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_Update__label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reporter_label")
	public static WebElement Reporter_label;

public void verify_Reporter_label(String data){
		Assert.assertEquals(Reporter_label,Reporter_label);
}

public void verify_Reporter_label_Status(String data){
		//Verifies the Status of the Reporter_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporter_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporter_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporter_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporter_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "user_hyperlink")
	public static WebElement user_hyperlink;

public void verify_user_hyperlink_Status(String data){
		//Verifies the Status of the user_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(user_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(user_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!user_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!user_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_user_hyperlink(){
		user_hyperlink.click();
}

@FindBy(how= How.ID, using = "Assign_To_UI_dropdown")
	public static WebElement Assign_To_UI_dropdown;

public void verify_Assign_To_UI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Assign_To_UI_dropdown.getAttribute("value"),data);
	}

}

public void verify_Assign_To_UI_dropdown_Status(String data){
		//Verifies the Status of the Assign_To_UI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assign_To_UI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assign_To_UI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assign_To_UI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assign_To_UI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Assign_To_UI_dropdown(String data){
		Select dropdown= new Select(Assign_To_UI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Priority_UI_dropdown")
	public static WebElement Priority_UI_dropdown;

public void verify_Priority_UI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Priority_UI_dropdown.getAttribute("value"),data);
	}

}

public void verify_Priority_UI_dropdown_Status(String data){
		//Verifies the Status of the Priority_UI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_UI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_UI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_UI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_UI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Priority_UI_dropdown(String data){
		Select dropdown= new Select(Priority_UI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Severity_UI_dropdown")
	public static WebElement Severity_UI_dropdown;

public void verify_Severity_UI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Severity_UI_dropdown.getAttribute("value"),data);
	}

}

public void verify_Severity_UI_dropdown_Status(String data){
		//Verifies the Status of the Severity_UI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_UI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_UI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_UI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_UI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Severity_UI_dropdown(String data){
		Select dropdown= new Select(Severity_UI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Reproducibiilty_UI_dropdown")
	public static WebElement Reproducibiilty_UI_dropdown;

public void verify_Reproducibiilty_UI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Reproducibiilty_UI_dropdown.getAttribute("value"),data);
	}

}

public void verify_Reproducibiilty_UI_dropdown_Status(String data){
		//Verifies the Status of the Reproducibiilty_UI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reproducibiilty_UI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reproducibiilty_UI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reproducibiilty_UI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reproducibiilty_UI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Reproducibiilty_UI_dropdown(String data){
		Select dropdown= new Select(Reproducibiilty_UI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Status_UI_dropdown")
	public static WebElement Status_UI_dropdown;

public void verify_Status_UI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Status_UI_dropdown.getAttribute("value"),data);
	}

}

public void verify_Status_UI_dropdown_Status(String data){
		//Verifies the Status of the Status_UI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_UI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_UI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_UI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_UI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Status_UI_dropdown(String data){
		Select dropdown= new Select(Status_UI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Resolution_UI_dropdown")
	public static WebElement Resolution_UI_dropdown;

public void verify_Resolution_UI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Resolution_UI_dropdown.getAttribute("value"),data);
	}

}

public void verify_Resolution_UI_dropdown_Status(String data){
		//Verifies the Status of the Resolution_UI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution_UI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution_UI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution_UI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution_UI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Resolution_UI_dropdown(String data){
		Select dropdown= new Select(Resolution_UI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Platform_UI_textbox")
	public static WebElement Platform_UI_textbox;

public void verify_Platform_UI_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Platform_UI_textbox.getAttribute("value"),data);
	}

}

public void verify_Platform_UI_textbox_Status(String data){
		//Verifies the Status of the Platform_UI_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_UI_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_UI_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_UI_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_UI_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Platform_UI_textbox(String data){
		Platform_UI_textbox.clear();
		Platform_UI_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "OS_UI_textbox")
	public static WebElement OS_UI_textbox;

public void verify_OS_UI_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_UI_textbox.getAttribute("value"),data);
	}

}

public void verify_OS_UI_textbox_Status(String data){
		//Verifies the Status of the OS_UI_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_UI_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_UI_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_UI_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_UI_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_OS_UI_textbox(String data){
		OS_UI_textbox.clear();
		OS_UI_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "OS_Version_UI_textbox")
	public static WebElement OS_Version_UI_textbox;

public void verify_OS_Version_UI_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_Version_UI_textbox.getAttribute("value"),data);
	}

}

public void verify_OS_Version_UI_textbox_Status(String data){
		//Verifies the Status of the OS_Version_UI_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version_UI_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version_UI_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version_UI_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version_UI_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_OS_Version_UI_textbox(String data){
		OS_Version_UI_textbox.clear();
		OS_Version_UI_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Summary_UI_textbox")
	public static WebElement Summary_UI_textbox;

public void verify_Summary_UI_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Summary_UI_textbox.getAttribute("value"),data);
	}

}

public void verify_Summary_UI_textbox_Status(String data){
		//Verifies the Status of the Summary_UI_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_UI_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_UI_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_UI_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_UI_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Summary_UI_textbox(String data){
		Summary_UI_textbox.clear();
		Summary_UI_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Description_UI_textbox")
	public static WebElement Description_UI_textbox;

public void verify_Description_UI_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Description_UI_textbox.getAttribute("value"),data);
	}

}

public void verify_Description_UI_textbox_Status(String data){
		//Verifies the Status of the Description_UI_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_UI_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_UI_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_UI_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_UI_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Description_UI_textbox(String data){
		Description_UI_textbox.clear();
		Description_UI_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Steps_to_reproduce_UI_textbox")
	public static WebElement Steps_to_reproduce_UI_textbox;

public void verify_Steps_to_reproduce_UI_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Steps_to_reproduce_UI_textbox.getAttribute("value"),data);
	}

}

public void verify_Steps_to_reproduce_UI_textbox_Status(String data){
		//Verifies the Status of the Steps_to_reproduce_UI_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Steps_to_reproduce_UI_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Steps_to_reproduce_UI_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Steps_to_reproduce_UI_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Steps_to_reproduce_UI_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Steps_to_reproduce_UI_textbox(String data){
		Steps_to_reproduce_UI_textbox.clear();
		Steps_to_reproduce_UI_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Additional_Information_UI_textbox")
	public static WebElement Additional_Information_UI_textbox;

public void verify_Additional_Information_UI_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Additional_Information_UI_textbox.getAttribute("value"),data);
	}

}

public void verify_Additional_Information_UI_textbox_Status(String data){
		//Verifies the Status of the Additional_Information_UI_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Additional_Information_UI_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Additional_Information_UI_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Additional_Information_UI_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Additional_Information_UI_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Additional_Information_UI_textbox(String data){
		Additional_Information_UI_textbox.clear();
		Additional_Information_UI_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_note_UI_textbox")
	public static WebElement Add_note_UI_textbox;

public void verify_Add_note_UI_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Add_note_UI_textbox.getAttribute("value"),data);
	}

}

public void verify_Add_note_UI_textbox_Status(String data){
		//Verifies the Status of the Add_note_UI_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_note_UI_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_note_UI_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_note_UI_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_note_UI_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Add_note_UI_textbox(String data){
		Add_note_UI_textbox.clear();
		Add_note_UI_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "private_UI_checkbox")
	public static WebElement private_UI_checkbox;

public void verify_private_UI_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(private_UI_checkbox.getAttribute("value"),data);
	}

}

public void verify_private_UI_checkbox_Status(String data){
		//Verifies the Status of the private_UI_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(private_UI_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(private_UI_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!private_UI_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!private_UI_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_private_UI_checkbox(String data){
		if(private_UI_checkbox.isSelected());
			private_UI_checkbox.click();
}

@FindBy(how= How.ID, using = "Update_details_btn_button")
	public static WebElement Update_details_btn_button;

public void verify_Update_details_btn_button_Status(String data){
		//Verifies the Status of the Update_details_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_details_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_details_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_details_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_details_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_details_btn_button(){
		Update_details_btn_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}