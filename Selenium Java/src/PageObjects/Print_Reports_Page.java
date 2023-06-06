package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Print_Reports_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "MantisBT___Demo")
	public static WebElement MantisBT___Demo;

public void verify_MantisBT___Demo(String data){
		Assert.assertEquals(MantisBT___Demo,MantisBT___Demo);
}

public void verify_MantisBT___Demo_Status(String data){
		//Verifies the Status of the MantisBT___Demo
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(MantisBT___Demo.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(MantisBT___Demo.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!MantisBT___Demo.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!MantisBT___Demo.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "D")
	public static WebElement D;

public void verify_D_Status(String data){
		//Verifies the Status of the D
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(D.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(D.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!D.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!D.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_D(){
		D.click();
}

@FindBy(how= How.ID, using = "Comments")
	public static WebElement Comments;

public void verify_Comments_Status(String data){
		//Verifies the Status of the Comments
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Comments.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Comments.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Comments.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Comments.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Comments(){
		Comments.click();
}

@FindBy(how= How.ID, using = "Attachments")
	public static WebElement Attachments;

public void verify_Attachments_Status(String data){
		//Verifies the Status of the Attachments
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attachments.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attachments.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attachments.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attachments.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Attachments(){
		Attachments.click();
}

@FindBy(how= How.ID, using = "Category")
	public static WebElement Category;

public void verify_Category(String data){
		Assert.assertEquals(Category,Category);
}

public void verify_Category_Status(String data){
		//Verifies the Status of the Category
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Severity")
	public static WebElement Severity;

public void verify_Severity(String data){
		Assert.assertEquals(Severity,Severity);
}

public void verify_Severity_Status(String data){
		//Verifies the Status of the Severity
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Status")
	public static WebElement Status;

public void verify_Status_Status(String data){
		//Verifies the Status of the Status
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Status(){
		Status.click();
}

@FindBy(how= How.ID, using = "Updated_date")
	public static WebElement Updated_date;

public void verify_Updated_date(String data){
		Assert.assertEquals(Updated_date,Updated_date);
}

public void verify_Updated_date_Status(String data){
		//Verifies the Status of the Updated_date
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Updated_date.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Updated_date.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Updated_date.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Updated_date.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Summary")
	public static WebElement Summary;

public void verify_Summary_Status(String data){
		//Verifies the Status of the Summary
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Summary(){
		Summary.click();
}

@FindBy(how= How.ID, using = "P")
	public static WebElement P;

public void verify_P(String data){
		Assert.assertEquals(P,P);
}

public void verify_P_Status(String data){
		//Verifies the Status of the P
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(P.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(P.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!P.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!P.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Selected_Issues_CB")
	public static WebElement Selected_Issues_CB;

public void verify_Selected_Issues_CB(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Selected_Issues_CB.getAttribute("value"),data);
	}

}

public void verify_Selected_Issues_CB_Status(String data){
		//Verifies the Status of the Selected_Issues_CB
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Selected_Issues_CB.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Selected_Issues_CB.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Selected_Issues_CB.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Selected_Issues_CB.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Selected_Issues_CB(String data){
		if(Selected_Issues_CB.isSelected());
			Selected_Issues_CB.click();
}

@FindBy(how= How.ID, using = "Display_Selected_Only")
	public static WebElement Display_Selected_Only;

public void verify_Display_Selected_Only_Status(String data){
		//Verifies the Status of the Display_Selected_Only
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_Selected_Only.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_Selected_Only.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_Selected_Only.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_Selected_Only.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Display_Selected_Only(){
		Display_Selected_Only.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}