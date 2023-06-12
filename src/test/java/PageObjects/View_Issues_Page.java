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
public class View_Issues_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Reset_button")
	public static WebElement Reset_button;

public void verify_Reset_button_Status(String data){
		//Verifies the Status of the Reset_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reset_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reset_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reset_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reset_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Reset_button(){
		Reset_button.click();
}

@FindBy(how= How.ID, using = "Save_button")
	public static WebElement Save_button;

public void verify_Save_button_Status(String data){
		//Verifies the Status of the Save_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Save_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Save_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Save_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Save_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Save_button(){
		Save_button.click();
}

@FindBy(how= How.ID, using = "ReporterHL_hyperlink")
	public static WebElement ReporterHL_hyperlink;

public void verify_ReporterHL_hyperlink_Status(String data){
		//Verifies the Status of the ReporterHL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ReporterHL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ReporterHL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ReporterHL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ReporterHL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ReporterHL_hyperlink(){
		ReporterHL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Reporter_dropdown")
	public static WebElement Reporter_dropdown;

public void verify_Reporter_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Reporter_dropdown.getAttribute("value"),data);
	}

}

public void verify_Reporter_dropdown_Status(String data){
		//Verifies the Status of the Reporter_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporter_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporter_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporter_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporter_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Reporter_dropdown(String data){
		Select dropdown= new Select(Reporter_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Assigned_To_dropdown")
	public static WebElement Assigned_To_dropdown;

public void verify_Assigned_To_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Assigned_To_dropdown.getAttribute("value"),data);
	}

}

public void verify_Assigned_To_dropdown_Status(String data){
		//Verifies the Status of the Assigned_To_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assigned_To_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assigned_To_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assigned_To_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assigned_To_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Assigned_To_dropdown(String data){
		Select dropdown= new Select(Assigned_To_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Monitored_By_dropdown")
	public static WebElement Monitored_By_dropdown;

public void verify_Monitored_By_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Monitored_By_dropdown.getAttribute("value"),data);
	}

}

public void verify_Monitored_By_dropdown_Status(String data){
		//Verifies the Status of the Monitored_By_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Monitored_By_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Monitored_By_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Monitored_By_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Monitored_By_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Monitored_By_dropdown(String data){
		Select dropdown= new Select(Monitored_By_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Note_By_dropdown")
	public static WebElement Note_By_dropdown;

public void verify_Note_By_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Note_By_dropdown.getAttribute("value"),data);
	}

}

public void verify_Note_By_dropdown_Status(String data){
		//Verifies the Status of the Note_By_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Note_By_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Note_By_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Note_By_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Note_By_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Note_By_dropdown(String data){
		Select dropdown= new Select(Note_By_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Priority_dropdown")
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

@FindBy(how= How.ID, using = "Severity_dropdown")
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

@FindBy(how= How.ID, using = "View_Status_dropdown")
	public static WebElement View_Status_dropdown;

public void verify_View_Status_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(View_Status_dropdown.getAttribute("value"),data);
	}

}

public void verify_View_Status_dropdown_Status(String data){
		//Verifies the Status of the View_Status_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_View_Status_dropdown(String data){
		Select dropdown= new Select(View_Status_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Show_Sticky_Issues_dropdown")
	public static WebElement Show_Sticky_Issues_dropdown;

public void verify_Show_Sticky_Issues_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Show_Sticky_Issues_dropdown.getAttribute("value"),data);
	}

}

public void verify_Show_Sticky_Issues_dropdown_Status(String data){
		//Verifies the Status of the Show_Sticky_Issues_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_Sticky_Issues_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_Sticky_Issues_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_Sticky_Issues_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_Sticky_Issues_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Show_Sticky_Issues_dropdown(String data){
		Select dropdown= new Select(Show_Sticky_Issues_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Assigned_To_HL_hyperlink")
	public static WebElement Assigned_To_HL_hyperlink;

public void verify_Assigned_To_HL_hyperlink_Status(String data){
		//Verifies the Status of the Assigned_To_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assigned_To_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assigned_To_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assigned_To_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assigned_To_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Assigned_To_HL_hyperlink(){
		Assigned_To_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Monitored_By_HL_hyperlink")
	public static WebElement Monitored_By_HL_hyperlink;

public void verify_Monitored_By_HL_hyperlink_Status(String data){
		//Verifies the Status of the Monitored_By_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Monitored_By_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Monitored_By_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Monitored_By_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Monitored_By_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Monitored_By_HL_hyperlink(){
		Monitored_By_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Note_By_HL_hyperlink")
	public static WebElement Note_By_HL_hyperlink;

public void verify_Note_By_HL_hyperlink_Status(String data){
		//Verifies the Status of the Note_By_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Note_By_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Note_By_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Note_By_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Note_By_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Note_By_HL_hyperlink(){
		Note_By_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Priority_HL_hyperlink")
	public static WebElement Priority_HL_hyperlink;

public void verify_Priority_HL_hyperlink_Status(String data){
		//Verifies the Status of the Priority_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Priority_HL_hyperlink(){
		Priority_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Severity_HL_hyperlink")
	public static WebElement Severity_HL_hyperlink;

public void verify_Severity_HL_hyperlink_Status(String data){
		//Verifies the Status of the Severity_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Severity_HL_hyperlink(){
		Severity_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "View_Status_HL_hyperlink")
	public static WebElement View_Status_HL_hyperlink;

public void verify_View_Status_HL_hyperlink_Status(String data){
		//Verifies the Status of the View_Status_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Status_HL_hyperlink(){
		View_Status_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Show_Sticky_Issues_HL_hyperlink")
	public static WebElement Show_Sticky_Issues_HL_hyperlink;

public void verify_Show_Sticky_Issues_HL_hyperlink_Status(String data){
		//Verifies the Status of the Show_Sticky_Issues_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_Sticky_Issues_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_Sticky_Issues_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_Sticky_Issues_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_Sticky_Issues_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Show_Sticky_Issues_HL_hyperlink(){
		Show_Sticky_Issues_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Category_HL_hyperlink")
	public static WebElement Category_HL_hyperlink;

public void verify_Category_HL_hyperlink_Status(String data){
		//Verifies the Status of the Category_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Category_HL_hyperlink(){
		Category_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Category_dropdown")
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

@FindBy(how= How.ID, using = "Hide_Status_dropdown")
	public static WebElement Hide_Status_dropdown;

public void verify_Hide_Status_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Hide_Status_dropdown.getAttribute("value"),data);
	}

}

public void verify_Hide_Status_dropdown_Status(String data){
		//Verifies the Status of the Hide_Status_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Hide_Status_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Hide_Status_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Hide_Status_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Hide_Status_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Hide_Status_dropdown(String data){
		Select dropdown= new Select(Hide_Status_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Status_dropdown")
	public static WebElement Status_dropdown;

public void verify_Status_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Status_dropdown.getAttribute("value"),data);
	}

}

public void verify_Status_dropdown_Status(String data){
		//Verifies the Status of the Status_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Status_dropdown(String data){
		Select dropdown= new Select(Status_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Resolution_dropdown")
	public static WebElement Resolution_dropdown;

public void verify_Resolution_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Resolution_dropdown.getAttribute("value"),data);
	}

}

public void verify_Resolution_dropdown_Status(String data){
		//Verifies the Status of the Resolution_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Resolution_dropdown(String data){
		Select dropdown= new Select(Resolution_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Filter_By_Date_Submitted_HL_hyperlink")
	public static WebElement Filter_By_Date_Submitted_HL_hyperlink;

public void verify_Filter_By_Date_Submitted_HL_hyperlink_Status(String data){
		//Verifies the Status of the Filter_By_Date_Submitted_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Filter_By_Date_Submitted_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Filter_By_Date_Submitted_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Filter_By_Date_Submitted_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Filter_By_Date_Submitted_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Filter_By_Date_Submitted_HL_hyperlink(){
		Filter_By_Date_Submitted_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Filter_by_Date_Submitted_checkbox")
	public static WebElement Filter_by_Date_Submitted_checkbox;

public void verify_Filter_by_Date_Submitted_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Filter_by_Date_Submitted_checkbox.getAttribute("value"),data);
	}

}

public void verify_Filter_by_Date_Submitted_checkbox_Status(String data){
		//Verifies the Status of the Filter_by_Date_Submitted_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Filter_by_Date_Submitted_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Filter_by_Date_Submitted_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Filter_by_Date_Submitted_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Filter_by_Date_Submitted_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Filter_by_Date_Submitted_checkbox(String data){
		if(Filter_by_Date_Submitted_checkbox.isSelected());
			Filter_by_Date_Submitted_checkbox.click();
}

@FindBy(how= How.ID, using = "Submitted_Start_Date_calendar")
	public static WebElement Submitted_Start_Date_calendar;

public void verify_Submitted_Start_Date_calendar(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Submitted_Start_Date_calendar.getAttribute("value"),data);
	}

}

public void verify_Submitted_Start_Date_calendar_Status(String data){
		//Verifies the Status of the Submitted_Start_Date_calendar
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submitted_Start_Date_calendar.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submitted_Start_Date_calendar.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submitted_Start_Date_calendar.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submitted_Start_Date_calendar.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Submitted_Start_Date_calendar(String data){
		Submitted_Start_Date_calendar.click();
}

@FindBy(how= How.ID, using = "Submited_End_Date_calendar")
	public static WebElement Submited_End_Date_calendar;

public void verify_Submited_End_Date_calendar(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Submited_End_Date_calendar.getAttribute("value"),data);
	}

}

public void verify_Submited_End_Date_calendar_Status(String data){
		//Verifies the Status of the Submited_End_Date_calendar
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submited_End_Date_calendar.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submited_End_Date_calendar.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submited_End_Date_calendar.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submited_End_Date_calendar.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Submited_End_Date_calendar(String data){
		Submited_End_Date_calendar.click();
}

@FindBy(how= How.ID, using = "Filter_By_Last_Updated_Date_HL_hyperlink")
	public static WebElement Filter_By_Last_Updated_Date_HL_hyperlink;

public void verify_Filter_By_Last_Updated_Date_HL_hyperlink_Status(String data){
		//Verifies the Status of the Filter_By_Last_Updated_Date_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Filter_By_Last_Updated_Date_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Filter_By_Last_Updated_Date_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Filter_By_Last_Updated_Date_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Filter_By_Last_Updated_Date_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Filter_By_Last_Updated_Date_HL_hyperlink(){
		Filter_By_Last_Updated_Date_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Filter_by_Last_Updated_Date_checkbox")
	public static WebElement Filter_by_Last_Updated_Date_checkbox;

public void verify_Filter_by_Last_Updated_Date_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Filter_by_Last_Updated_Date_checkbox.getAttribute("value"),data);
	}

}

public void verify_Filter_by_Last_Updated_Date_checkbox_Status(String data){
		//Verifies the Status of the Filter_by_Last_Updated_Date_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Filter_by_Last_Updated_Date_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Filter_by_Last_Updated_Date_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Filter_by_Last_Updated_Date_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Filter_by_Last_Updated_Date_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Filter_by_Last_Updated_Date_checkbox(String data){
		if(Filter_by_Last_Updated_Date_checkbox.isSelected());
			Filter_by_Last_Updated_Date_checkbox.click();
}

@FindBy(how= How.ID, using = "Updated_Start_Date_calendar")
	public static WebElement Updated_Start_Date_calendar;

public void verify_Updated_Start_Date_calendar(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Updated_Start_Date_calendar.getAttribute("value"),data);
	}

}

public void verify_Updated_Start_Date_calendar_Status(String data){
		//Verifies the Status of the Updated_Start_Date_calendar
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Updated_Start_Date_calendar.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Updated_Start_Date_calendar.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Updated_Start_Date_calendar.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Updated_Start_Date_calendar.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Updated_Start_Date_calendar(String data){
		Updated_Start_Date_calendar.click();
}

@FindBy(how= How.ID, using = "Updated_End_Date_calendar")
	public static WebElement Updated_End_Date_calendar;

public void verify_Updated_End_Date_calendar(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Updated_End_Date_calendar.getAttribute("value"),data);
	}

}

public void verify_Updated_End_Date_calendar_Status(String data){
		//Verifies the Status of the Updated_End_Date_calendar
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Updated_End_Date_calendar.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Updated_End_Date_calendar.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Updated_End_Date_calendar.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Updated_End_Date_calendar.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Updated_End_Date_calendar(String data){
		Updated_End_Date_calendar.click();
}

@FindBy(how= How.ID, using = "Hide_Status_HL_hyperlink")
	public static WebElement Hide_Status_HL_hyperlink;

public void verify_Hide_Status_HL_hyperlink_Status(String data){
		//Verifies the Status of the Hide_Status_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Hide_Status_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Hide_Status_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Hide_Status_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Hide_Status_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Hide_Status_HL_hyperlink(){
		Hide_Status_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Status_HL_hyperlink")
	public static WebElement Status_HL_hyperlink;

public void verify_Status_HL_hyperlink_Status(String data){
		//Verifies the Status of the Status_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Status_HL_hyperlink(){
		Status_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Resolution__HL_hyperlink")
	public static WebElement Resolution__HL_hyperlink;

public void verify_Resolution__HL_hyperlink_Status(String data){
		//Verifies the Status of the Resolution__HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution__HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution__HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution__HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution__HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Resolution__HL_hyperlink(){
		Resolution__HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Profile_dropdown")
	public static WebElement Profile_dropdown;

public void verify_Profile_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Profile_dropdown.getAttribute("value"),data);
	}

}

public void verify_Profile_dropdown_Status(String data){
		//Verifies the Status of the Profile_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Profile_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Profile_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Profile_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Profile_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Profile_dropdown(String data){
		Select dropdown= new Select(Profile_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Platform_dropdown")
	public static WebElement Platform_dropdown;

public void verify_Platform_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Platform_dropdown.getAttribute("value"),data);
	}

}

public void verify_Platform_dropdown_Status(String data){
		//Verifies the Status of the Platform_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Platform_dropdown(String data){
		Select dropdown= new Select(Platform_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "OS_dropdown")
	public static WebElement OS_dropdown;

public void verify_OS_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_dropdown.getAttribute("value"),data);
	}

}

public void verify_OS_dropdown_Status(String data){
		//Verifies the Status of the OS_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_OS_dropdown(String data){
		Select dropdown= new Select(OS_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "OS_Version_dropdown")
	public static WebElement OS_Version_dropdown;

public void verify_OS_Version_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_Version_dropdown.getAttribute("value"),data);
	}

}

public void verify_OS_Version_dropdown_Status(String data){
		//Verifies the Status of the OS_Version_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_OS_Version_dropdown(String data){
		Select dropdown= new Select(OS_Version_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Relationships_dropdown")
	public static WebElement Relationships_dropdown;

public void verify_Relationships_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Relationships_dropdown.getAttribute("value"),data);
	}

}

public void verify_Relationships_dropdown_Status(String data){
		//Verifies the Status of the Relationships_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Relationships_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Relationships_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Relationships_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Relationships_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Relationships_dropdown(String data){
		Select dropdown= new Select(Relationships_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Profile_HL_hyperlink")
	public static WebElement Profile_HL_hyperlink;

public void verify_Profile_HL_hyperlink_Status(String data){
		//Verifies the Status of the Profile_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Profile_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Profile_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Profile_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Profile_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Profile_HL_hyperlink(){
		Profile_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Platform_HL_hyperlink")
	public static WebElement Platform_HL_hyperlink;

public void verify_Platform_HL_hyperlink_Status(String data){
		//Verifies the Status of the Platform_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Platform_HL_hyperlink(){
		Platform_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "OS_HL_hyperlink")
	public static WebElement OS_HL_hyperlink;

public void verify_OS_HL_hyperlink_Status(String data){
		//Verifies the Status of the OS_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OS_HL_hyperlink(){
		OS_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "OS_Version_HL_hyperlink")
	public static WebElement OS_Version_HL_hyperlink;

public void verify_OS_Version_HL_hyperlink_Status(String data){
		//Verifies the Status of the OS_Version_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OS_Version_HL_hyperlink(){
		OS_Version_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Relationships_HL_hyperlink")
	public static WebElement Relationships_HL_hyperlink;

public void verify_Relationships_HL_hyperlink_Status(String data){
		//Verifies the Status of the Relationships_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Relationships_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Relationships_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Relationships_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Relationships_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Relationships_HL_hyperlink(){
		Relationships_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Tags_HL_hyperlink")
	public static WebElement Tags_HL_hyperlink;

public void verify_Tags_HL_hyperlink_Status(String data){
		//Verifies the Status of the Tags_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tags_HL_hyperlink(){
		Tags_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Tags_textbox")
	public static WebElement Tags_textbox;

public void verify_Tags_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Tags_textbox.getAttribute("value"),data);
	}

}

public void verify_Tags_textbox_Status(String data){
		//Verifies the Status of the Tags_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Tags_textbox(String data){
		Tags_textbox.clear();
		Tags_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Show_HL_hyperlink")
	public static WebElement Show_HL_hyperlink;

public void verify_Show_HL_hyperlink_Status(String data){
		//Verifies the Status of the Show_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Show_HL_hyperlink(){
		Show_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Show_textbox")
	public static WebElement Show_textbox;

public void verify_Show_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Show_textbox.getAttribute("value"),data);
	}

}

public void verify_Show_textbox_Status(String data){
		//Verifies the Status of the Show_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Show_textbox(String data){
		Show_textbox.clear();
		Show_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Sort_by_HL_hyperlink")
	public static WebElement Sort_by_HL_hyperlink;

public void verify_Sort_by_HL_hyperlink_Status(String data){
		//Verifies the Status of the Sort_by_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sort_by_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sort_by_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sort_by_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sort_by_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Sort_by_HL_hyperlink(){
		Sort_by_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Report_FIL_dropdown")
	public static WebElement Report_FIL_dropdown;

public void verify_Report_FIL_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Report_FIL_dropdown.getAttribute("value"),data);
	}

}

public void verify_Report_FIL_dropdown_Status(String data){
		//Verifies the Status of the Report_FIL_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Report_FIL_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Report_FIL_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Report_FIL_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Report_FIL_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Report_FIL_dropdown(String data){
		Select dropdown= new Select(Report_FIL_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Ordered_by_dropdown")
	public static WebElement Ordered_by_dropdown;

public void verify_Ordered_by_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Ordered_by_dropdown.getAttribute("value"),data);
	}

}

public void verify_Ordered_by_dropdown_Status(String data){
		//Verifies the Status of the Ordered_by_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Ordered_by_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Ordered_by_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Ordered_by_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Ordered_by_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Ordered_by_dropdown(String data){
		Select dropdown= new Select(Ordered_by_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Match_Type_HL_hyperlink")
	public static WebElement Match_Type_HL_hyperlink;

public void verify_Match_Type_HL_hyperlink_Status(String data){
		//Verifies the Status of the Match_Type_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Match_Type_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Match_Type_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Match_Type_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Match_Type_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Match_Type_HL_hyperlink(){
		Match_Type_HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Match_Type_dropdown")
	public static WebElement Match_Type_dropdown;

public void verify_Match_Type_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Match_Type_dropdown.getAttribute("value"),data);
	}

}

public void verify_Match_Type_dropdown_Status(String data){
		//Verifies the Status of the Match_Type_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Match_Type_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Match_Type_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Match_Type_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Match_Type_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Match_Type_dropdown(String data){
		Select dropdown= new Select(Match_Type_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Highlight_changed__hours__HL_hyperlink")
	public static WebElement Highlight_changed__hours__HL_hyperlink;

public void verify_Highlight_changed__hours__HL_hyperlink_Status(String data){
		//Verifies the Status of the Highlight_changed__hours__HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Highlight_changed__hours__HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Highlight_changed__hours__HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Highlight_changed__hours__HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Highlight_changed__hours__HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Highlight_changed__hours__HL_hyperlink(){
		Highlight_changed__hours__HL_hyperlink.click();
}

@FindBy(how= How.ID, using = "Highlight_changed_textbox")
	public static WebElement Highlight_changed_textbox;

public void verify_Highlight_changed_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Highlight_changed_textbox.getAttribute("value"),data);
	}

}

public void verify_Highlight_changed_textbox_Status(String data){
		//Verifies the Status of the Highlight_changed_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Highlight_changed_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Highlight_changed_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Highlight_changed_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Highlight_changed_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Highlight_changed_textbox(String data){
		Highlight_changed_textbox.clear();
		Highlight_changed_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Relationship_Text_textbox")
	public static WebElement Relationship_Text_textbox;

public void verify_Relationship_Text_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Relationship_Text_textbox.getAttribute("value"),data);
	}

}

public void verify_Relationship_Text_textbox_Status(String data){
		//Verifies the Status of the Relationship_Text_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Relationship_Text_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Relationship_Text_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Relationship_Text_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Relationship_Text_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Relationship_Text_textbox(String data){
		Relationship_Text_textbox.clear();
		Relationship_Text_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Search_textbox")
	public static WebElement Search_textbox;

public void verify_Search_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Search_textbox.getAttribute("value"),data);
	}

}

public void verify_Search_textbox_Status(String data){
		//Verifies the Status of the Search_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Search_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Search_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Search_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Search_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Search_textbox(String data){
		Search_textbox.clear();
		Search_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Apply_Filter_button")
	public static WebElement Apply_Filter_button;

public void verify_Apply_Filter_button_Status(String data){
		//Verifies the Status of the Apply_Filter_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Apply_Filter_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Apply_Filter_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Apply_Filter_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Apply_Filter_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Apply_Filter_button(){
		Apply_Filter_button.click();
}

@FindBy(how= How.ID, using = "Print_Reports_btn_button")
	public static WebElement Print_Reports_btn_button;

public void verify_Print_Reports_btn_button_Status(String data){
		//Verifies the Status of the Print_Reports_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Print_Reports_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Print_Reports_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Print_Reports_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Print_Reports_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Print_Reports_btn_button(){
		Print_Reports_btn_button.click();
}

@FindBy(how= How.ID, using = "CSV_Export_btn_button")
	public static WebElement CSV_Export_btn_button;

public void verify_CSV_Export_btn_button_Status(String data){
		//Verifies the Status of the CSV_Export_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CSV_Export_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CSV_Export_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CSV_Export_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CSV_Export_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CSV_Export_btn_button(){
		CSV_Export_btn_button.click();
}

@FindBy(how= How.ID, using = "Excel_Export_btn_button")
	public static WebElement Excel_Export_btn_button;

public void verify_Excel_Export_btn_button_Status(String data){
		//Verifies the Status of the Excel_Export_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Excel_Export_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Excel_Export_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Excel_Export_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Excel_Export_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Excel_Export_btn_button(){
		Excel_Export_btn_button.click();
}

@FindBy(how= How.ID, using = "Summary_btn_button")
	public static WebElement Summary_btn_button;

public void verify_Summary_btn_button_Status(String data){
		//Verifies the Status of the Summary_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Summary_btn_button(){
		Summary_btn_button.click();
}

@FindBy(how= How.ID, using = "Issue_CB_VI_checkbox")
	public static WebElement Issue_CB_VI_checkbox;

public void verify_Issue_CB_VI_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Issue_CB_VI_checkbox.getAttribute("value"),data);
	}

}

public void verify_Issue_CB_VI_checkbox_Status(String data){
		//Verifies the Status of the Issue_CB_VI_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_CB_VI_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_CB_VI_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_CB_VI_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_CB_VI_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Issue_CB_VI_checkbox(String data){
		if(Issue_CB_VI_checkbox.isSelected());
			Issue_CB_VI_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//td[@class='column-id']//a[contains(text(),'0000013')]")
	public static WebElement Issue_ID__VI_hyperlink;

public void verify_Issue_ID__VI_hyperlink_Status(String data){
		//Verifies the Status of the Issue_ID__VI_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID__VI_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID__VI_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID__VI_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID__VI_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID__VI_hyperlink(){
		Issue_ID__VI_hyperlink.click();
}

@FindBy(how= How.ID, using = "Issue_Edit_VI_hyperlink")
	public static WebElement Issue_Edit_VI_hyperlink;

public void verify_Issue_Edit_VI_hyperlink_Status(String data){
		//Verifies the Status of the Issue_Edit_VI_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Edit_VI_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Edit_VI_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Edit_VI_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Edit_VI_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Edit_VI_hyperlink(){
		Issue_Edit_VI_hyperlink.click();
}

@FindBy(how= How.ID, using = "Category_VI_label")
	public static WebElement Category_VI_label;

public void verify_Category_VI_label(String data){
		Assert.assertEquals(Category_VI_label,Category_VI_label);
}

public void verify_Category_VI_label_Status(String data){
		//Verifies the Status of the Category_VI_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_VI_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_VI_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_VI_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_VI_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Severity_VI_label")
	public static WebElement Severity_VI_label;

public void verify_Severity_VI_label(String data){
		Assert.assertEquals(Severity_VI_label,Severity_VI_label);
}

public void verify_Severity_VI_label_Status(String data){
		//Verifies the Status of the Severity_VI_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_VI_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_VI_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_VI_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_VI_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Status_VI_label")
	public static WebElement Status_VI_label;

public void verify_Status_VI_label(String data){
		Assert.assertEquals(Status_VI_label,Status_VI_label);
}

public void verify_Status_VI_label_Status(String data){
		//Verifies the Status of the Status_VI_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_VI_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_VI_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_VI_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_VI_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Updated_VI_label")
	public static WebElement Updated_VI_label;

public void verify_Updated_VI_label(String data){
		Assert.assertEquals(Updated_VI_label,Updated_VI_label);
}

public void verify_Updated_VI_label_Status(String data){
		//Verifies the Status of the Updated_VI_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Updated_VI_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Updated_VI_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Updated_VI_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Updated_VI_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Summary_VI_label")
	public static WebElement Summary_VI_label;

public void verify_Summary_VI_label(String data){
		Assert.assertEquals(Summary_VI_label,Summary_VI_label);
}

public void verify_Summary_VI_label_Status(String data){
		//Verifies the Status of the Summary_VI_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_VI_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_VI_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_VI_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_VI_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Select_All_VI_checkbox")
	public static WebElement Select_All_VI_checkbox;

public void verify_Select_All_VI_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Select_All_VI_checkbox.getAttribute("value"),data);
	}

}

public void verify_Select_All_VI_checkbox_Status(String data){
		//Verifies the Status of the Select_All_VI_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Select_All_VI_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Select_All_VI_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Select_All_VI_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Select_All_VI_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Select_All_VI_checkbox(String data){
		if(Select_All_VI_checkbox.isSelected());
			Select_All_VI_checkbox.click();
}

@FindBy(how= How.ID, using = "Sorted_by_VI_dropdown")
	public static WebElement Sorted_by_VI_dropdown;

public void verify_Sorted_by_VI_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Sorted_by_VI_dropdown.getAttribute("value"),data);
	}

}

public void verify_Sorted_by_VI_dropdown_Status(String data){
		//Verifies the Status of the Sorted_by_VI_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sorted_by_VI_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sorted_by_VI_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sorted_by_VI_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sorted_by_VI_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Sorted_by_VI_dropdown(String data){
		Select dropdown= new Select(Sorted_by_VI_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Ok_button")
	public static WebElement Ok_button;

public void verify_Ok_button_Status(String data){
		//Verifies the Status of the Ok_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Ok_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Ok_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Ok_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Ok_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Ok_button(){
		Ok_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}