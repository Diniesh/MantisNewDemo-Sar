package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Update_Issue_scr_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Issue_ID")
	public static WebElement Issue_ID;

public void verify_Issue_ID(String data){
		Assert.assertEquals(Issue_ID,Issue_ID);
}

public void verify_Issue_ID_Status(String data){
		//Verifies the Status of the Issue_ID
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "ID_value")
	public static WebElement ID_value;

public void verify_ID_value(String data){
		Assert.assertEquals(ID_value,ID_value);
}

public void verify_ID_value_Status(String data){
		//Verifies the Status of the ID_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ID_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ID_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ID_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ID_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Project")
	public static WebElement Project;

public void verify_Project(String data){
		Assert.assertEquals(Project,Project);
}

public void verify_Project_Status(String data){
		//Verifies the Status of the Project
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Project_name")
	public static WebElement Project_name;

public void verify_Project_name(String data){
		Assert.assertEquals(Project_name,Project_name);
}

public void verify_Project_name_Status(String data){
		//Verifies the Status of the Project_name
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_name.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_name.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_name.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_name.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Category_UI")
	public static WebElement Category_UI;

public void verify_Category_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Category_UI.getAttribute("value"),data);
	}

}

public void verify_Category_UI_Status(String data){
		//Verifies the Status of the Category_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Category_UI(String data){
		Select dropdown= new Select(Category_UI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "View_Status_UI")
	public static WebElement View_Status_UI;

public void verify_View_Status_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(View_Status_UI.getAttribute("value"),data);
	}

}

public void verify_View_Status_UI_Status(String data){
		//Verifies the Status of the View_Status_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_View_Status_UI(String data){
		Select dropdown= new Select(View_Status_UI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Date_Submitted")
	public static WebElement Date_Submitted;

public void verify_Date_Submitted(String data){
		Assert.assertEquals(Date_Submitted,Date_Submitted);
}

public void verify_Date_Submitted_Status(String data){
		//Verifies the Status of the Date_Submitted
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_Submitted.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_Submitted.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_Submitted.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_Submitted.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Last_Update")
	public static WebElement Last_Update;

public void verify_Last_Update(String data){
		Assert.assertEquals(Last_Update,Last_Update);
}

public void verify_Last_Update_Status(String data){
		//Verifies the Status of the Last_Update
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_Update.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_Update.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_Update.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_Update.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reporter")
	public static WebElement Reporter;

public void verify_Reporter(String data){
		Assert.assertEquals(Reporter,Reporter);
}

public void verify_Reporter_Status(String data){
		//Verifies the Status of the Reporter
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporter.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporter.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporter.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporter.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "user")
	public static WebElement user;

public void verify_user_Status(String data){
		//Verifies the Status of the user
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(user.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(user.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!user.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!user.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_user(){
		user.click();
}

@FindBy(how= How.ID, using = "Assign_To_UI")
	public static WebElement Assign_To_UI;

public void verify_Assign_To_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Assign_To_UI.getAttribute("value"),data);
	}

}

public void verify_Assign_To_UI_Status(String data){
		//Verifies the Status of the Assign_To_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assign_To_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assign_To_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assign_To_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assign_To_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Assign_To_UI(String data){
		Select dropdown= new Select(Assign_To_UI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Priority_UI")
	public static WebElement Priority_UI;

public void verify_Priority_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Priority_UI.getAttribute("value"),data);
	}

}

public void verify_Priority_UI_Status(String data){
		//Verifies the Status of the Priority_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Priority_UI(String data){
		Select dropdown= new Select(Priority_UI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Severity_UI")
	public static WebElement Severity_UI;

public void verify_Severity_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Severity_UI.getAttribute("value"),data);
	}

}

public void verify_Severity_UI_Status(String data){
		//Verifies the Status of the Severity_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Severity_UI(String data){
		Select dropdown= new Select(Severity_UI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Reproducibiilty_UI")
	public static WebElement Reproducibiilty_UI;

public void verify_Reproducibiilty_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Reproducibiilty_UI.getAttribute("value"),data);
	}

}

public void verify_Reproducibiilty_UI_Status(String data){
		//Verifies the Status of the Reproducibiilty_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reproducibiilty_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reproducibiilty_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reproducibiilty_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reproducibiilty_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Reproducibiilty_UI(String data){
		Select dropdown= new Select(Reproducibiilty_UI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Status_UI")
	public static WebElement Status_UI;

public void verify_Status_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Status_UI.getAttribute("value"),data);
	}

}

public void verify_Status_UI_Status(String data){
		//Verifies the Status of the Status_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Status_UI(String data){
		Select dropdown= new Select(Status_UI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Resolution_UI")
	public static WebElement Resolution_UI;

public void verify_Resolution_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Resolution_UI.getAttribute("value"),data);
	}

}

public void verify_Resolution_UI_Status(String data){
		//Verifies the Status of the Resolution_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Resolution_UI(String data){
		Select dropdown= new Select(Resolution_UI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Platform_UI")
	public static WebElement Platform_UI;

public void verify_Platform_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Platform_UI.getAttribute("value"),data);
	}

}

public void verify_Platform_UI_Status(String data){
		//Verifies the Status of the Platform_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Platform_UI(String data){
		Platform_UI.clear();
		Platform_UI.sendKeys(data);
}

@FindBy(how= How.ID, using = "OS_UI")
	public static WebElement OS_UI;

public void verify_OS_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_UI.getAttribute("value"),data);
	}

}

public void verify_OS_UI_Status(String data){
		//Verifies the Status of the OS_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_OS_UI(String data){
		OS_UI.clear();
		OS_UI.sendKeys(data);
}

@FindBy(how= How.ID, using = "OS_Version_UI")
	public static WebElement OS_Version_UI;

public void verify_OS_Version_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_Version_UI.getAttribute("value"),data);
	}

}

public void verify_OS_Version_UI_Status(String data){
		//Verifies the Status of the OS_Version_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_OS_Version_UI(String data){
		OS_Version_UI.clear();
		OS_Version_UI.sendKeys(data);
}

@FindBy(how= How.ID, using = "Summary_UI")
	public static WebElement Summary_UI;

public void verify_Summary_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Summary_UI.getAttribute("value"),data);
	}

}

public void verify_Summary_UI_Status(String data){
		//Verifies the Status of the Summary_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Summary_UI(String data){
		Summary_UI.clear();
		Summary_UI.sendKeys(data);
}

@FindBy(how= How.ID, using = "Description_UI")
	public static WebElement Description_UI;

public void verify_Description_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Description_UI.getAttribute("value"),data);
	}

}

public void verify_Description_UI_Status(String data){
		//Verifies the Status of the Description_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Description_UI(String data){
		Description_UI.clear();
		Description_UI.sendKeys(data);
}

@FindBy(how= How.ID, using = "Steps_to_reproduce_UI")
	public static WebElement Steps_to_reproduce_UI;

public void verify_Steps_to_reproduce_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Steps_to_reproduce_UI.getAttribute("value"),data);
	}

}

public void verify_Steps_to_reproduce_UI_Status(String data){
		//Verifies the Status of the Steps_to_reproduce_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Steps_to_reproduce_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Steps_to_reproduce_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Steps_to_reproduce_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Steps_to_reproduce_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Steps_to_reproduce_UI(String data){
		Steps_to_reproduce_UI.clear();
		Steps_to_reproduce_UI.sendKeys(data);
}

@FindBy(how= How.ID, using = "Additional_Information_UI")
	public static WebElement Additional_Information_UI;

public void verify_Additional_Information_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Additional_Information_UI.getAttribute("value"),data);
	}

}

public void verify_Additional_Information_UI_Status(String data){
		//Verifies the Status of the Additional_Information_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Additional_Information_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Additional_Information_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Additional_Information_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Additional_Information_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Additional_Information_UI(String data){
		Additional_Information_UI.clear();
		Additional_Information_UI.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_note_UI")
	public static WebElement Add_note_UI;

public void verify_Add_note_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Add_note_UI.getAttribute("value"),data);
	}

}

public void verify_Add_note_UI_Status(String data){
		//Verifies the Status of the Add_note_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_note_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_note_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_note_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_note_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Add_note_UI(String data){
		Add_note_UI.clear();
		Add_note_UI.sendKeys(data);
}

@FindBy(how= How.ID, using = "private_UI")
	public static WebElement private_UI;

public void verify_private_UI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(private_UI.getAttribute("value"),data);
	}

}

public void verify_private_UI_Status(String data){
		//Verifies the Status of the private_UI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(private_UI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(private_UI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!private_UI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!private_UI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_private_UI(String data){
		if(private_UI.isSelected());
			private_UI.click();
}

@FindBy(how= How.ID, using = "Update_details_btn")
	public static WebElement Update_details_btn;

public void verify_Update_details_btn_Status(String data){
		//Verifies the Status of the Update_details_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_details_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_details_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_details_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_details_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_details_btn(){
		Update_details_btn.click();
}

@FindBy(how= How.ID, using = "_All_Projects__General")
	public static WebElement _All_Projects__General;

public void verify__All_Projects__General_Status(String data){
		//Verifies the Status of the _All_Projects__General
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(_All_Projects__General.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(_All_Projects__General.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!_All_Projects__General.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!_All_Projects__General.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click__All_Projects__General(){
		_All_Projects__General.click();
}

@FindBy(how= How.ID, using = "unable_to_reproduce")
	public static WebElement unable_to_reproduce;

public void verify_unable_to_reproduce_Status(String data){
		//Verifies the Status of the unable_to_reproduce
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(unable_to_reproduce.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(unable_to_reproduce.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!unable_to_reproduce.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!unable_to_reproduce.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_unable_to_reproduce(){
		unable_to_reproduce.click();
}

@FindBy(how= How.ID, using = "no_change_required")
	public static WebElement no_change_required;

public void verify_no_change_required_Status(String data){
		//Verifies the Status of the no_change_required
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(no_change_required.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(no_change_required.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!no_change_required.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!no_change_required.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_no_change_required(){
		no_change_required.click();
}

@FindBy(how= How.ID, using = "have_not_tried")
	public static WebElement have_not_tried;

public void verify_have_not_tried_Status(String data){
		//Verifies the Status of the have_not_tried
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(have_not_tried.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(have_not_tried.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!have_not_tried.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!have_not_tried.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_have_not_tried(){
		have_not_tried.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}