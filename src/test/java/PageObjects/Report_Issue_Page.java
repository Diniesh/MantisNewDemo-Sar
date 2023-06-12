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
public class Report_Issue_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//select[@id='category_id']")
	public static WebElement Category_dropdown;

public void verify_Category_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Category_dropdown.getAttribute("value"),data);
	}

}

public void verify_Category_dropdown_Status(String data){
		//Verifies the Status of the Category_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Category_dropdown(String data){
		Select dropdown= new Select(Category_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='reproducibility']")
	public static WebElement Reproducibility_dropdown;

public void verify_Reproducibility_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Reproducibility_dropdown.getAttribute("value"),data);
	}

}

public void verify_Reproducibility_dropdown_Status(String data){
		//Verifies the Status of the Reproducibility_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reproducibility_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reproducibility_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reproducibility_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reproducibility_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Reproducibility_dropdown(String data){
		Select dropdown= new Select(Reproducibility_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='severity']")
	public static WebElement Severity_dropdown;

public void verify_Severity_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Severity_dropdown.getAttribute("value"),data);
	}

}

public void verify_Severity_dropdown_Status(String data){
		//Verifies the Status of the Severity_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Severity_dropdown(String data){
		Select dropdown= new Select(Severity_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='priority']")
	public static WebElement Priority_dropdown;

public void verify_Priority_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Priority_dropdown.getAttribute("value"),data);
	}

}

public void verify_Priority_dropdown_Status(String data){
		//Verifies the Status of the Priority_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Priority_dropdown(String data){
		Select dropdown= new Select(Priority_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='handler_id']")
	public static WebElement Assign_to_dropdown;

public void verify_Assign_to_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Assign_to_dropdown.getAttribute("value"),data);
	}

}

public void verify_Assign_to_dropdown_Status(String data){
		//Verifies the Status of the Assign_to_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assign_to_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assign_to_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assign_to_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assign_to_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Assign_to_dropdown(String data){
		Select dropdown= new Select(Assign_to_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='summary']")
	public static WebElement Summary_TEXT_textbox;

public void verify_Summary_TEXT_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Summary_TEXT_textbox.getAttribute("value"),data);
	}

}

public void verify_Summary_TEXT_textbox_Status(String data){
		//Verifies the Status of the Summary_TEXT_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_TEXT_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_TEXT_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_TEXT_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_TEXT_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Summary_TEXT_textbox(String data){
		Summary_TEXT_textbox.clear();
		Summary_TEXT_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='description']")
	public static WebElement Description_textbox;

public void verify_Description_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Description_textbox.getAttribute("value"),data);
	}

}

public void verify_Description_textbox_Status(String data){
		//Verifies the Status of the Description_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Description_textbox(String data){
		Description_textbox.clear();
		Description_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='platform']")
	public static WebElement Platform_textbox;

public void verify_Platform_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Platform_textbox.getAttribute("value"),data);
	}

}

public void verify_Platform_textbox_Status(String data){
		//Verifies the Status of the Platform_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Platform_textbox(String data){
		Platform_textbox.clear();
		Platform_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='os']")
	public static WebElement OS_textbox;

public void verify_OS_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_textbox.getAttribute("value"),data);
	}

}

public void verify_OS_textbox_Status(String data){
		//Verifies the Status of the OS_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_OS_textbox(String data){
		OS_textbox.clear();
		OS_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='os_build']")
	public static WebElement OS_Version_textbox;

public void verify_OS_Version_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_Version_textbox.getAttribute("value"),data);
	}

}

public void verify_OS_Version_textbox_Status(String data){
		//Verifies the Status of the OS_Version_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_OS_Version_textbox(String data){
		OS_Version_textbox.clear();
		OS_Version_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='steps_to_reproduce']")
	public static WebElement Steps_to_Reproduce_textbox;

public void verify_Steps_to_Reproduce_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Steps_to_Reproduce_textbox.getAttribute("value"),data);
	}

}

public void verify_Steps_to_Reproduce_textbox_Status(String data){
		//Verifies the Status of the Steps_to_Reproduce_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Steps_to_Reproduce_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Steps_to_Reproduce_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Steps_to_Reproduce_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Steps_to_Reproduce_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Steps_to_Reproduce_textbox(String data){
		Steps_to_Reproduce_textbox.clear();
		Steps_to_Reproduce_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='additional_info']")
	public static WebElement Additional_Information_textbox;

public void verify_Additional_Information_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Additional_Information_textbox.getAttribute("value"),data);
	}

}

public void verify_Additional_Information_textbox_Status(String data){
		//Verifies the Status of the Additional_Information_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Additional_Information_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Additional_Information_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Additional_Information_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Additional_Information_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Additional_Information_textbox(String data){
		Additional_Information_textbox.clear();
		Additional_Information_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='tag_string']")
	public static WebElement Attach_Tags_textbox;

public void verify_Attach_Tags_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Attach_Tags_textbox.getAttribute("value"),data);
	}

}

public void verify_Attach_Tags_textbox_Status(String data){
		//Verifies the Status of the Attach_Tags_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attach_Tags_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attach_Tags_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attach_Tags_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attach_Tags_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Attach_Tags_textbox(String data){
		Attach_Tags_textbox.clear();
		Attach_Tags_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//span[normalize-space()='check to report more issues']")
	public static WebElement Report_Stay_checkbox;

public void verify_Report_Stay_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Report_Stay_checkbox.getAttribute("value"),data);
	}

}

public void verify_Report_Stay_checkbox_Status(String data){
		//Verifies the Status of the Report_Stay_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Report_Stay_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Report_Stay_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Report_Stay_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Report_Stay_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Report_Stay_checkbox(String data){
		if(Report_Stay_checkbox.isSelected());
			Report_Stay_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Submit Issue']")
	public static WebElement Submit_Issue_button;

public void verify_Submit_Issue_button_Status(String data){
		//Verifies the Status of the Submit_Issue_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submit_Issue_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submit_Issue_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submit_Issue_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submit_Issue_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Submit_Issue_button(){
		Submit_Issue_button.click();
}

@FindBy(how= How.XPATH, using = "//i[@title='+']")
	public static WebElement Select_Profile_hyperlink;

public void verify_Select_Profile_hyperlink_Status(String data){
		//Verifies the Status of the Select_Profile_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Select_Profile_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Select_Profile_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Select_Profile_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Select_Profile_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Select_Profile_hyperlink(){
		Select_Profile_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//i[@class='fa fa-cloud-upload upload-icon ace-icon blue fa-3x']")
	public static WebElement Upload_Files_hyperlink;

public void verify_Upload_Files_hyperlink_Status(String data){
		//Verifies the Status of the Upload_Files_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Upload_Files_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Upload_Files_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Upload_Files_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Upload_Files_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Upload_Files_hyperlink(){
		Upload_Files_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//select[@id='tag_select']")
	public static WebElement Existing_tags_dropdown;

public void verify_Existing_tags_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Existing_tags_dropdown.getAttribute("value"),data);
	}

}

public void verify_Existing_tags_dropdown_Status(String data){
		//Verifies the Status of the Existing_tags_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Existing_tags_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Existing_tags_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Existing_tags_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Existing_tags_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Existing_tags_dropdown(String data){
		Select dropdown= new Select(Existing_tags_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//span[normalize-space()='public']")
	public static WebElement View_Status_radiobutton;

public void verify_View_Status_radiobutton(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(View_Status_radiobutton.getAttribute("name"),data);
	}

}

public void verify_View_Status_radiobutton_Status(String data){
		//Verifies the Status of the View_Status_radiobutton
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_radiobutton.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_radiobutton.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_radiobutton.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_radiobutton.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_View_Status_radiobutton(){
		if(View_Status_radiobutton.isSelected());
			View_Status_radiobutton.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}