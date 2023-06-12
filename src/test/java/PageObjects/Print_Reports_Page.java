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
public class Print_Reports_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "MantisBT___Demo_label")
	public static WebElement MantisBT___Demo_label;

public void verify_MantisBT___Demo_label(String data){
		Assert.assertEquals(MantisBT___Demo_label,MantisBT___Demo_label);
}

public void verify_MantisBT___Demo_label_Status(String data){
		//Verifies the Status of the MantisBT___Demo_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(MantisBT___Demo_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(MantisBT___Demo_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!MantisBT___Demo_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!MantisBT___Demo_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "D_hyperlink")
	public static WebElement D_hyperlink;

public void verify_D_hyperlink_Status(String data){
		//Verifies the Status of the D_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(D_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(D_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!D_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!D_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_D_hyperlink(){
		D_hyperlink.click();
}

@FindBy(how= How.ID, using = "Comments_hyperlink")
	public static WebElement Comments_hyperlink;

public void verify_Comments_hyperlink_Status(String data){
		//Verifies the Status of the Comments_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Comments_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Comments_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Comments_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Comments_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Comments_hyperlink(){
		Comments_hyperlink.click();
}

@FindBy(how= How.ID, using = "Attachments_hyperlink")
	public static WebElement Attachments_hyperlink;

public void verify_Attachments_hyperlink_Status(String data){
		//Verifies the Status of the Attachments_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attachments_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attachments_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attachments_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attachments_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Attachments_hyperlink(){
		Attachments_hyperlink.click();
}

@FindBy(how= How.ID, using = "Category_label")
	public static WebElement Category_label;

public void verify_Category_label(String data){
		Assert.assertEquals(Category_label,Category_label);
}

public void verify_Category_label_Status(String data){
		//Verifies the Status of the Category_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Severity_label")
	public static WebElement Severity_label;

public void verify_Severity_label(String data){
		Assert.assertEquals(Severity_label,Severity_label);
}

public void verify_Severity_label_Status(String data){
		//Verifies the Status of the Severity_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Status_hyperlink")
	public static WebElement Status_hyperlink;

public void verify_Status_hyperlink_Status(String data){
		//Verifies the Status of the Status_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Status_hyperlink(){
		Status_hyperlink.click();
}

@FindBy(how= How.ID, using = "Updated_date_label")
	public static WebElement Updated_date_label;

public void verify_Updated_date_label(String data){
		Assert.assertEquals(Updated_date_label,Updated_date_label);
}

public void verify_Updated_date_label_Status(String data){
		//Verifies the Status of the Updated_date_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Updated_date_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Updated_date_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Updated_date_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Updated_date_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Summary_hyperlink")
	public static WebElement Summary_hyperlink;

public void verify_Summary_hyperlink_Status(String data){
		//Verifies the Status of the Summary_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Summary_hyperlink(){
		Summary_hyperlink.click();
}

@FindBy(how= How.ID, using = "P_label")
	public static WebElement P_label;

public void verify_P_label(String data){
		Assert.assertEquals(P_label,P_label);
}

public void verify_P_label_Status(String data){
		//Verifies the Status of the P_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(P_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(P_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!P_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!P_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Selected_Issues_CB_checkbox")
	public static WebElement Selected_Issues_CB_checkbox;

public void verify_Selected_Issues_CB_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Selected_Issues_CB_checkbox.getAttribute("value"),data);
	}

}

public void verify_Selected_Issues_CB_checkbox_Status(String data){
		//Verifies the Status of the Selected_Issues_CB_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Selected_Issues_CB_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Selected_Issues_CB_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Selected_Issues_CB_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Selected_Issues_CB_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Selected_Issues_CB_checkbox(String data){
		if(Selected_Issues_CB_checkbox.isSelected());
			Selected_Issues_CB_checkbox.click();
}

@FindBy(how= How.ID, using = "Display_Selected_Only_button")
	public static WebElement Display_Selected_Only_button;

public void verify_Display_Selected_Only_button_Status(String data){
		//Verifies the Status of the Display_Selected_Only_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_Selected_Only_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_Selected_Only_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_Selected_Only_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_Selected_Only_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Display_Selected_Only_button(){
		Display_Selected_Only_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}