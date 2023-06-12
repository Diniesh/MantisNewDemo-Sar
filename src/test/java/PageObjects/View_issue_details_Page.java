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
public class View_issue_details_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "ID_txt_label")
	public static WebElement ID_txt_label;

public void verify_ID_txt_label(String data){
		Assert.assertEquals(ID_txt_label,ID_txt_label);
}

public void verify_ID_txt_label_Status(String data){
		//Verifies the Status of the ID_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ID_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ID_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ID_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ID_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "ID_Value_label")
	public static WebElement ID_Value_label;

public void verify_ID_Value_label(String data){
		Assert.assertEquals(ID_Value_label,ID_Value_label);
}

public void verify_ID_Value_label_Status(String data){
		//Verifies the Status of the ID_Value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ID_Value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ID_Value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ID_Value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ID_Value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Project_txt_label")
	public static WebElement Project_txt_label;

public void verify_Project_txt_label(String data){
		Assert.assertEquals(Project_txt_label,Project_txt_label);
}

public void verify_Project_txt_label_Status(String data){
		//Verifies the Status of the Project_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Project_value_label")
	public static WebElement Project_value_label;

public void verify_Project_value_label(String data){
		Assert.assertEquals(Project_value_label,Project_value_label);
}

public void verify_Project_value_label_Status(String data){
		//Verifies the Status of the Project_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Category_txt_label")
	public static WebElement Category_txt_label;

public void verify_Category_txt_label(String data){
		Assert.assertEquals(Category_txt_label,Category_txt_label);
}

public void verify_Category_txt_label_Status(String data){
		//Verifies the Status of the Category_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Category_value_label")
	public static WebElement Category_value_label;

public void verify_Category_value_label(String data){
		Assert.assertEquals(Category_value_label,Category_value_label);
}

public void verify_Category_value_label_Status(String data){
		//Verifies the Status of the Category_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "View_status_txt_label")
	public static WebElement View_status_txt_label;

public void verify_View_status_txt_label(String data){
		Assert.assertEquals(View_status_txt_label,View_status_txt_label);
}

public void verify_View_status_txt_label_Status(String data){
		//Verifies the Status of the View_status_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_status_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_status_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_status_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_status_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "View_status_value_label")
	public static WebElement View_status_value_label;

public void verify_View_status_value_label(String data){
		Assert.assertEquals(View_status_value_label,View_status_value_label);
}

public void verify_View_status_value_label_Status(String data){
		//Verifies the Status of the View_status_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_status_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_status_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_status_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_status_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Date_submitted_txt_label")
	public static WebElement Date_submitted_txt_label;

public void verify_Date_submitted_txt_label(String data){
		Assert.assertEquals(Date_submitted_txt_label,Date_submitted_txt_label);
}

public void verify_Date_submitted_txt_label_Status(String data){
		//Verifies the Status of the Date_submitted_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_submitted_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_submitted_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_submitted_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_submitted_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Date_submitted_value_label")
	public static WebElement Date_submitted_value_label;

public void verify_Date_submitted_value_label(String data){
		Assert.assertEquals(Date_submitted_value_label,Date_submitted_value_label);
}

public void verify_Date_submitted_value_label_Status(String data){
		//Verifies the Status of the Date_submitted_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_submitted_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_submitted_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_submitted_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_submitted_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Last_update_label")
	public static WebElement Last_update_label;

public void verify_Last_update_label(String data){
		Assert.assertEquals(Last_update_label,Last_update_label);
}

public void verify_Last_update_label_Status(String data){
		//Verifies the Status of the Last_update_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_update_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_update_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_update_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_update_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Last_update_value_label")
	public static WebElement Last_update_value_label;

public void verify_Last_update_value_label(String data){
		Assert.assertEquals(Last_update_value_label,Last_update_value_label);
}

public void verify_Last_update_value_label_Status(String data){
		//Verifies the Status of the Last_update_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_update_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_update_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_update_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_update_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reporter_txt_label")
	public static WebElement Reporter_txt_label;

public void verify_Reporter_txt_label(String data){
		Assert.assertEquals(Reporter_txt_label,Reporter_txt_label);
}

public void verify_Reporter_txt_label_Status(String data){
		//Verifies the Status of the Reporter_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporter_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporter_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporter_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporter_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reporter_value_hyperlink")
	public static WebElement Reporter_value_hyperlink;

public void verify_Reporter_value_hyperlink_Status(String data){
		//Verifies the Status of the Reporter_value_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporter_value_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporter_value_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporter_value_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporter_value_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Reporter_value_hyperlink(){
		Reporter_value_hyperlink.click();
}

@FindBy(how= How.ID, using = "Priority_txt_label")
	public static WebElement Priority_txt_label;

public void verify_Priority_txt_label(String data){
		Assert.assertEquals(Priority_txt_label,Priority_txt_label);
}

public void verify_Priority_txt_label_Status(String data){
		//Verifies the Status of the Priority_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Priority_value_label")
	public static WebElement Priority_value_label;

public void verify_Priority_value_label(String data){
		Assert.assertEquals(Priority_value_label,Priority_value_label);
}

public void verify_Priority_value_label_Status(String data){
		//Verifies the Status of the Priority_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Status_txt_label")
	public static WebElement Status_txt_label;

public void verify_Status_txt_label(String data){
		Assert.assertEquals(Status_txt_label,Status_txt_label);
}

public void verify_Status_txt_label_Status(String data){
		//Verifies the Status of the Status_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Status_value_label")
	public static WebElement Status_value_label;

public void verify_Status_value_label(String data){
		Assert.assertEquals(Status_value_label,Status_value_label);
}

public void verify_Status_value_label_Status(String data){
		//Verifies the Status of the Status_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Platform_txt_label")
	public static WebElement Platform_txt_label;

public void verify_Platform_txt_label(String data){
		Assert.assertEquals(Platform_txt_label,Platform_txt_label);
}

public void verify_Platform_txt_label_Status(String data){
		//Verifies the Status of the Platform_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Platform_value_label")
	public static WebElement Platform_value_label;

public void verify_Platform_value_label(String data){
		Assert.assertEquals(Platform_value_label,Platform_value_label);
}

public void verify_Platform_value_label_Status(String data){
		//Verifies the Status of the Platform_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Assigned_to_txt_label")
	public static WebElement Assigned_to_txt_label;

public void verify_Assigned_to_txt_label(String data){
		Assert.assertEquals(Assigned_to_txt_label,Assigned_to_txt_label);
}

public void verify_Assigned_to_txt_label_Status(String data){
		//Verifies the Status of the Assigned_to_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assigned_to_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assigned_to_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assigned_to_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assigned_to_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Severity_txt_label")
	public static WebElement Severity_txt_label;

public void verify_Severity_txt_label(String data){
		Assert.assertEquals(Severity_txt_label,Severity_txt_label);
}

public void verify_Severity_txt_label_Status(String data){
		//Verifies the Status of the Severity_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Severity_value_label")
	public static WebElement Severity_value_label;

public void verify_Severity_value_label(String data){
		Assert.assertEquals(Severity_value_label,Severity_value_label);
}

public void verify_Severity_value_label_Status(String data){
		//Verifies the Status of the Severity_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Resolution_txt_label")
	public static WebElement Resolution_txt_label;

public void verify_Resolution_txt_label(String data){
		Assert.assertEquals(Resolution_txt_label,Resolution_txt_label);
}

public void verify_Resolution_txt_label_Status(String data){
		//Verifies the Status of the Resolution_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Resolution_value_label")
	public static WebElement Resolution_value_label;

public void verify_Resolution_value_label(String data){
		Assert.assertEquals(Resolution_value_label,Resolution_value_label);
}

public void verify_Resolution_value_label_Status(String data){
		//Verifies the Status of the Resolution_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "OS_txt_label")
	public static WebElement OS_txt_label;

public void verify_OS_txt_label(String data){
		Assert.assertEquals(OS_txt_label,OS_txt_label);
}

public void verify_OS_txt_label_Status(String data){
		//Verifies the Status of the OS_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "OS_value_label")
	public static WebElement OS_value_label;

public void verify_OS_value_label(String data){
		Assert.assertEquals(OS_value_label,OS_value_label);
}

public void verify_OS_value_label_Status(String data){
		//Verifies the Status of the OS_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reporoducability_txt_label")
	public static WebElement Reporoducability_txt_label;

public void verify_Reporoducability_txt_label(String data){
		Assert.assertEquals(Reporoducability_txt_label,Reporoducability_txt_label);
}

public void verify_Reporoducability_txt_label_Status(String data){
		//Verifies the Status of the Reporoducability_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporoducability_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporoducability_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporoducability_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporoducability_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reproducibility_value_label")
	public static WebElement Reproducibility_value_label;

public void verify_Reproducibility_value_label(String data){
		Assert.assertEquals(Reproducibility_value_label,Reproducibility_value_label);
}

public void verify_Reproducibility_value_label_Status(String data){
		//Verifies the Status of the Reproducibility_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reproducibility_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reproducibility_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reproducibility_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reproducibility_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "OS_Version_txt_label")
	public static WebElement OS_Version_txt_label;

public void verify_OS_Version_txt_label(String data){
		Assert.assertEquals(OS_Version_txt_label,OS_Version_txt_label);
}

public void verify_OS_Version_txt_label_Status(String data){
		//Verifies the Status of the OS_Version_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "OS_version_value_label")
	public static WebElement OS_version_value_label;

public void verify_OS_version_value_label(String data){
		Assert.assertEquals(OS_version_value_label,OS_version_value_label);
}

public void verify_OS_version_value_label_Status(String data){
		//Verifies the Status of the OS_version_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_version_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_version_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_version_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_version_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Summary_txt_label")
	public static WebElement Summary_txt_label;

public void verify_Summary_txt_label(String data){
		Assert.assertEquals(Summary_txt_label,Summary_txt_label);
}

public void verify_Summary_txt_label_Status(String data){
		//Verifies the Status of the Summary_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Summary_value_label")
	public static WebElement Summary_value_label;

public void verify_Summary_value_label(String data){
		Assert.assertEquals(Summary_value_label,Summary_value_label);
}

public void verify_Summary_value_label_Status(String data){
		//Verifies the Status of the Summary_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Description_txt_label")
	public static WebElement Description_txt_label;

public void verify_Description_txt_label(String data){
		Assert.assertEquals(Description_txt_label,Description_txt_label);
}

public void verify_Description_txt_label_Status(String data){
		//Verifies the Status of the Description_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Description_value_label")
	public static WebElement Description_value_label;

public void verify_Description_value_label(String data){
		Assert.assertEquals(Description_value_label,Description_value_label);
}

public void verify_Description_value_label_Status(String data){
		//Verifies the Status of the Description_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Steps_to_reproduce_txt_label")
	public static WebElement Steps_to_reproduce_txt_label;

public void verify_Steps_to_reproduce_txt_label(String data){
		Assert.assertEquals(Steps_to_reproduce_txt_label,Steps_to_reproduce_txt_label);
}

public void verify_Steps_to_reproduce_txt_label_Status(String data){
		//Verifies the Status of the Steps_to_reproduce_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Steps_to_reproduce_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Steps_to_reproduce_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Steps_to_reproduce_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Steps_to_reproduce_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Steps_to_reproduce_value_label")
	public static WebElement Steps_to_reproduce_value_label;

public void verify_Steps_to_reproduce_value_label(String data){
		Assert.assertEquals(Steps_to_reproduce_value_label,Steps_to_reproduce_value_label);
}

public void verify_Steps_to_reproduce_value_label_Status(String data){
		//Verifies the Status of the Steps_to_reproduce_value_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Steps_to_reproduce_value_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Steps_to_reproduce_value_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Steps_to_reproduce_value_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Steps_to_reproduce_value_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Additional_Info_txt_label")
	public static WebElement Additional_Info_txt_label;

public void verify_Additional_Info_txt_label(String data){
		Assert.assertEquals(Additional_Info_txt_label,Additional_Info_txt_label);
}

public void verify_Additional_Info_txt_label_Status(String data){
		//Verifies the Status of the Additional_Info_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Additional_Info_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Additional_Info_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Additional_Info_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Additional_Info_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Additional_info_txt_label")
	public static WebElement Additional_info_txt_label;

public void verify_Additional_info_txt_label(String data){
		Assert.assertEquals(Additional_info_txt_label,Additional_info_txt_label);
}

public void verify_Additional_info_txt_label_Status(String data){
		//Verifies the Status of the Additional_info_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Additional_info_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Additional_info_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Additional_info_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Additional_info_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Tags_txt_label")
	public static WebElement Tags_txt_label;

public void verify_Tags_txt_label(String data){
		Assert.assertEquals(Tags_txt_label,Tags_txt_label);
}

public void verify_Tags_txt_label_Status(String data){
		//Verifies the Status of the Tags_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Tag_1_button")
	public static WebElement Tag_1_button;

public void verify_Tag_1_button_Status(String data){
		//Verifies the Status of the Tag_1_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_1_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_1_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_1_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_1_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tag_1_button(){
		Tag_1_button.click();
}

@FindBy(how= How.ID, using = "Tag_2_button")
	public static WebElement Tag_2_button;

public void verify_Tag_2_button_Status(String data){
		//Verifies the Status of the Tag_2_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_2_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_2_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_2_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_2_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tag_2_button(){
		Tag_2_button.click();
}

@FindBy(how= How.ID, using = "Tag_3_button")
	public static WebElement Tag_3_button;

public void verify_Tag_3_button_Status(String data){
		//Verifies the Status of the Tag_3_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_3_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_3_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_3_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_3_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tag_3_button(){
		Tag_3_button.click();
}

@FindBy(how= How.ID, using = "clear_button")
	public static WebElement clear_button;

public void verify_clear_button_Status(String data){
		//Verifies the Status of the clear_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(clear_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(clear_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!clear_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!clear_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_clear_button(){
		clear_button.click();
}

@FindBy(how= How.ID, using = "Attach_tags_txt_label")
	public static WebElement Attach_tags_txt_label;

public void verify_Attach_tags_txt_label(String data){
		Assert.assertEquals(Attach_tags_txt_label,Attach_tags_txt_label);
}

public void verify_Attach_tags_txt_label_Status(String data){
		//Verifies the Status of the Attach_tags_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attach_tags_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attach_tags_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attach_tags_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attach_tags_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//input[@id='tag_string']")
	public static WebElement seperated_by_comma_textbox;

public void verify_seperated_by_comma_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(seperated_by_comma_textbox.getAttribute("value"),data);
	}

}

public void verify_seperated_by_comma_textbox_Status(String data){
		//Verifies the Status of the seperated_by_comma_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(seperated_by_comma_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(seperated_by_comma_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!seperated_by_comma_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!seperated_by_comma_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_seperated_by_comma_textbox(String data){
		seperated_by_comma_textbox.clear();
		seperated_by_comma_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='tag_select']")
	public static WebElement Tags_DD_option_dropdown;

public void verify_Tags_DD_option_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Tags_DD_option_dropdown.getAttribute("value"),data);
	}

}

public void verify_Tags_DD_option_dropdown_Status(String data){
		//Verifies the Status of the Tags_DD_option_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags_DD_option_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags_DD_option_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags_DD_option_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags_DD_option_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Tags_DD_option_dropdown(String data){
		Select dropdown= new Select(Tags_DD_option_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Attach_tags_button")
	public static WebElement Attach_tags_button;

public void verify_Attach_tags_button_Status(String data){
		//Verifies the Status of the Attach_tags_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attach_tags_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attach_tags_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attach_tags_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attach_tags_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Attach_tags_button(){
		Attach_tags_button.click();
}

@FindBy(how= How.ID, using = "Edit_btn_button")
	public static WebElement Edit_btn_button;

public void verify_Edit_btn_button_Status(String data){
		//Verifies the Status of the Edit_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Edit_btn_button(){
		Edit_btn_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Attach']")
	public static WebElement Assign_to_btn_button;

public void verify_Assign_to_btn_button_Status(String data){
		//Verifies the Status of the Assign_to_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assign_to_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assign_to_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assign_to_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assign_to_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Assign_to_btn_button(){
		Assign_to_btn_button.click();
}

@FindBy(how= How.ID, using = "Assign_DD_dropdown")
	public static WebElement Assign_DD_dropdown;

public void verify_Assign_DD_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Assign_DD_dropdown.getAttribute("value"),data);
	}

}

public void verify_Assign_DD_dropdown_Status(String data){
		//Verifies the Status of the Assign_DD_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assign_DD_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assign_DD_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assign_DD_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assign_DD_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Assign_DD_dropdown(String data){
		Select dropdown= new Select(Assign_DD_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Change_status_to_button")
	public static WebElement Change_status_to_button;

public void verify_Change_status_to_button_Status(String data){
		//Verifies the Status of the Change_status_to_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Change_status_to_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Change_status_to_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Change_status_to_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Change_status_to_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Change_status_to_button(){
		Change_status_to_button.click();
}

@FindBy(how= How.XPATH, using = "//select[@name='new_status']")
	public static WebElement Chenage_status_to_DD_dropdown;

public void verify_Chenage_status_to_DD_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Chenage_status_to_DD_dropdown.getAttribute("value"),data);
	}

}

public void verify_Chenage_status_to_DD_dropdown_Status(String data){
		//Verifies the Status of the Chenage_status_to_DD_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Chenage_status_to_DD_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Chenage_status_to_DD_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Chenage_status_to_DD_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Chenage_status_to_DD_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Chenage_status_to_DD_dropdown(String data){
		Select dropdown= new Select(Chenage_status_to_DD_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Moniter_btn_button")
	public static WebElement Moniter_btn_button;

public void verify_Moniter_btn_button_Status(String data){
		//Verifies the Status of the Moniter_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Moniter_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Moniter_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Moniter_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Moniter_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Moniter_btn_button(){
		Moniter_btn_button.click();
}

@FindBy(how= How.ID, using = "Stick_btn_button")
	public static WebElement Stick_btn_button;

public void verify_Stick_btn_button_Status(String data){
		//Verifies the Status of the Stick_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Stick_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Stick_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Stick_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Stick_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Stick_btn_button(){
		Stick_btn_button.click();
}

@FindBy(how= How.ID, using = "Clone_btn_button")
	public static WebElement Clone_btn_button;

public void verify_Clone_btn_button_Status(String data){
		//Verifies the Status of the Clone_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Clone_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Clone_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Clone_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Clone_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Clone_btn_button(){
		Clone_btn_button.click();
}

@FindBy(how= How.ID, using = "Close_btn_button")
	public static WebElement Close_btn_button;

public void verify_Close_btn_button_Status(String data){
		//Verifies the Status of the Close_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Close_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Close_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Close_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Close_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Close_btn_button(){
		Close_btn_button.click();
}

@FindBy(how= How.ID, using = "Delete_btn_button")
	public static WebElement Delete_btn_button;

public void verify_Delete_btn_button_Status(String data){
		//Verifies the Status of the Delete_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_btn_button(){
		Delete_btn_button.click();
}

@FindBy(how= How.ID, using = "Assigned_to_value_hyperlink")
	public static WebElement Assigned_to_value_hyperlink;

public void verify_Assigned_to_value_hyperlink_Status(String data){
		//Verifies the Status of the Assigned_to_value_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assigned_to_value_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assigned_to_value_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assigned_to_value_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assigned_to_value_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Assigned_to_value_hyperlink(){
		Assigned_to_value_hyperlink.click();
}

@FindBy(how= How.ID, using = "unnamed_dropdown")
	public static WebElement unnamed_dropdown;

public void verify_unnamed_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(unnamed_dropdown.getAttribute("value"),data);
	}

}

public void verify_unnamed_dropdown_Status(String data){
		//Verifies the Status of the unnamed_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(unnamed_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(unnamed_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!unnamed_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!unnamed_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_unnamed_dropdown(String data){
		Select dropdown= new Select(unnamed_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Current_issue_DD_dropdown")
	public static WebElement Current_issue_DD_dropdown;

public void verify_Current_issue_DD_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Current_issue_DD_dropdown.getAttribute("value"),data);
	}

}

public void verify_Current_issue_DD_dropdown_Status(String data){
		//Verifies the Status of the Current_issue_DD_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Current_issue_DD_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Current_issue_DD_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Current_issue_DD_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Current_issue_DD_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Current_issue_DD_dropdown(String data){
		Select dropdown= new Select(Current_issue_DD_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Current_Issue_textbox_textbox")
	public static WebElement Current_Issue_textbox_textbox;

public void verify_Current_Issue_textbox_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Current_Issue_textbox_textbox.getAttribute("value"),data);
	}

}

public void verify_Current_Issue_textbox_textbox_Status(String data){
		//Verifies the Status of the Current_Issue_textbox_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Current_Issue_textbox_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Current_Issue_textbox_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Current_Issue_textbox_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Current_Issue_textbox_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Current_Issue_textbox_textbox(String data){
		Current_Issue_textbox_textbox.clear();
		Current_Issue_textbox_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_btn_Relationships_button")
	public static WebElement Add_btn_Relationships_button;

public void verify_Add_btn_Relationships_button_Status(String data){
		//Verifies the Status of the Add_btn_Relationships_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_btn_Relationships_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_btn_Relationships_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_btn_Relationships_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_btn_Relationships_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_btn_Relationships_button(){
		Add_btn_Relationships_button.click();
}

@FindBy(how= How.ID, using = "User_list_textbox_textbox")
	public static WebElement User_list_textbox_textbox;

public void verify_User_list_textbox_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(User_list_textbox_textbox.getAttribute("value"),data);
	}

}

public void verify_User_list_textbox_textbox_Status(String data){
		//Verifies the Status of the User_list_textbox_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(User_list_textbox_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(User_list_textbox_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!User_list_textbox_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!User_list_textbox_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_User_list_textbox_textbox(String data){
		User_list_textbox_textbox.clear();
		User_list_textbox_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_users_button")
	public static WebElement Add_users_button;

public void verify_Add_users_button_Status(String data){
		//Verifies the Status of the Add_users_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_users_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_users_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_users_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_users_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_users_button(){
		Add_users_button.click();
}

@FindBy(how= How.ID, using = "View_Status_txt_label")
	public static WebElement View_Status_txt_label;

public void verify_View_Status_txt_label(String data){
		Assert.assertEquals(View_Status_txt_label,View_Status_txt_label);
}

public void verify_View_Status_txt_label_Status(String data){
		//Verifies the Status of the View_Status_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//span[@class='lbl padding-6']")
	public static WebElement Private_checkbox;

public void verify_Private_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Private_checkbox.getAttribute("value"),data);
	}

}

public void verify_Private_checkbox_Status(String data){
		//Verifies the Status of the Private_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Private_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Private_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Private_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Private_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Private_checkbox(String data){
		if(Private_checkbox.isSelected());
			Private_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//textarea[@id='bugnote_text']")
	public static WebElement Note_teatarea_textbox;

public void verify_Note_teatarea_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Note_teatarea_textbox.getAttribute("value"),data);
	}

}

public void verify_Note_teatarea_textbox_Status(String data){
		//Verifies the Status of the Note_teatarea_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Note_teatarea_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Note_teatarea_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Note_teatarea_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Note_teatarea_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Note_teatarea_textbox(String data){
		Note_teatarea_textbox.clear();
		Note_teatarea_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Upload_FIles_hyperlink")
	public static WebElement Upload_FIles_hyperlink;

public void verify_Upload_FIles_hyperlink_Status(String data){
		//Verifies the Status of the Upload_FIles_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Upload_FIles_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Upload_FIles_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Upload_FIles_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Upload_FIles_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Upload_FIles_hyperlink(){
		Upload_FIles_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Add Note']")
	public static WebElement Add_Note_btn_button;

public void verify_Add_Note_btn_button_Status(String data){
		//Verifies the Status of the Add_Note_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_Note_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_Note_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_Note_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_Note_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_Note_btn_button(){
		Add_Note_btn_button.click();
}

@FindBy(how= How.ID, using = "Issue_History_button")
	public static WebElement Issue_History_button;

public void verify_Issue_History_button_Status(String data){
		//Verifies the Status of the Issue_History_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_History_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_History_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_History_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_History_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_History_button(){
		Issue_History_button.click();
}

@FindBy(how= How.ID, using = "Date_Modefied_label")
	public static WebElement Date_Modefied_label;

public void verify_Date_Modefied_label(String data){
		Assert.assertEquals(Date_Modefied_label,Date_Modefied_label);
}

public void verify_Date_Modefied_label_Status(String data){
		//Verifies the Status of the Date_Modefied_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_Modefied_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_Modefied_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_Modefied_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_Modefied_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Username_hyperlink")
	public static WebElement Username_hyperlink;

public void verify_Username_hyperlink_Status(String data){
		//Verifies the Status of the Username_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Username_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Username_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Username_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Username_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Username_hyperlink(){
		Username_hyperlink.click();
}

@FindBy(how= How.ID, using = "Field_label")
	public static WebElement Field_label;

public void verify_Field_label(String data){
		Assert.assertEquals(Field_label,Field_label);
}

public void verify_Field_label_Status(String data){
		//Verifies the Status of the Field_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Field_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Field_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Field_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Field_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Change_label")
	public static WebElement Change_label;

public void verify_Change_label(String data){
		Assert.assertEquals(Change_label,Change_label);
}

public void verify_Change_label_Status(String data){
		//Verifies the Status of the Change_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Change_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Change_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Change_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Change_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Activities_label")
	public static WebElement Activities_label;

public void verify_Activities_label(String data){
		Assert.assertEquals(Activities_label,Activities_label);
}

public void verify_Activities_label_Status(String data){
		//Verifies the Status of the Activities_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Activities_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Activities_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Activities_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Activities_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//button[normalize-space()='Make Public']")
	public static WebElement Make_public_button;

public void verify_Make_public_button_Status(String data){
		//Verifies the Status of the Make_public_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Make_public_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Make_public_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Make_public_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Make_public_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Make_public_button(){
		Make_public_button.click();
}

@FindBy(how= How.XPATH, using = "//div[@class='btn-group visible-on-hover']//button[@type='submit'][normalize-space()='Delete']")
	public static WebElement Delete_activities_button;

public void verify_Delete_activities_button_Status(String data){
		//Verifies the Status of the Delete_activities_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_activities_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_activities_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_activities_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_activities_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_activities_button(){
		Delete_activities_button.click();
}

@FindBy(how= How.XPATH, using = "//div[@class='btn-group visible-on-hover']//button[@type='submit'][normalize-space()='Edit']")
	public static WebElement Edit_activities_button;

public void verify_Edit_activities_button_Status(String data){
		//Verifies the Status of the Edit_activities_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit_activities_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit_activities_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit_activities_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit_activities_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Edit_activities_button(){
		Edit_activities_button.click();
}

@FindBy(how= How.XPATH, using = "//tr[@id='c1']//td[@class='category']//a[contains(text(),'administrator')]")
	public static WebElement username_hl_hyperlink;

public void verify_username_hl_hyperlink_Status(String data){
		//Verifies the Status of the username_hl_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(username_hl_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(username_hl_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!username_hl_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!username_hl_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_username_hl_hyperlink(){
		username_hl_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='~0000001']")
	public static WebElement issue_id_hl_hyperlink;

public void verify_issue_id_hl_hyperlink_Status(String data){
		//Verifies the Status of the issue_id_hl_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(issue_id_hl_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(issue_id_hl_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!issue_id_hl_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!issue_id_hl_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_issue_id_hl_hyperlink(){
		issue_id_hl_hyperlink.click();
}

@FindBy(how= How.ID, using = "Activity_Notes_txt_label")
	public static WebElement Activity_Notes_txt_label;

public void verify_Activity_Notes_txt_label(String data){
		Assert.assertEquals(Activity_Notes_txt_label,Activity_Notes_txt_label);
}

public void verify_Activity_Notes_txt_label_Status(String data){
		//Verifies the Status of the Activity_Notes_txt_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Activity_Notes_txt_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Activity_Notes_txt_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Activity_Notes_txt_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Activity_Notes_txt_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//a[normalize-space()='Send a Reminder']")
	public static WebElement Send_a_reminder_btn_button;

public void verify_Send_a_reminder_btn_button_Status(String data){
		//Verifies the Status of the Send_a_reminder_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Send_a_reminder_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Send_a_reminder_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Send_a_reminder_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Send_a_reminder_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Send_a_reminder_btn_button(){
		Send_a_reminder_btn_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Jump to Notes']")
	public static WebElement Jump_to_notes_btn_button;

public void verify_Jump_to_notes_btn_button_Status(String data){
		//Verifies the Status of the Jump_to_notes_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Jump_to_notes_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Jump_to_notes_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Jump_to_notes_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Jump_to_notes_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Jump_to_notes_btn_button(){
		Jump_to_notes_btn_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Jump to History']")
	public static WebElement Jump_to_history_btn_button;

public void verify_Jump_to_history_btn_button_Status(String data){
		//Verifies the Status of the Jump_to_history_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Jump_to_history_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Jump_to_history_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Jump_to_history_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Jump_to_history_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Jump_to_history_btn_button(){
		Jump_to_history_btn_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='<<']")
	public static WebElement Prev__Issue_btn_button;

public void verify_Prev__Issue_btn_button_Status(String data){
		//Verifies the Status of the Prev__Issue_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Prev__Issue_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Prev__Issue_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Prev__Issue_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Prev__Issue_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Prev__Issue_btn_button(){
		Prev__Issue_btn_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='>>']")
	public static WebElement Next_issue_btn_button;

public void verify_Next_issue_btn_button_Status(String data){
		//Verifies the Status of the Next_issue_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Next_issue_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Next_issue_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Next_issue_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Next_issue_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Next_issue_btn_button(){
		Next_issue_btn_button.click();
}

@FindBy(how= How.ID, using = "unnamed_button")
	public static WebElement unnamed_button;

public void verify_unnamed_button_Status(String data){
		//Verifies the Status of the unnamed_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(unnamed_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(unnamed_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!unnamed_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!unnamed_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_unnamed_button(){
		unnamed_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}