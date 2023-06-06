package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Send_Reminder_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "View_Status")
	public static WebElement View_Status;

public void verify_View_Status(String data){
		Assert.assertEquals(View_Status,View_Status);
}

public void verify_View_Status_Status(String data){
		//Verifies the Status of the View_Status
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Private")
	public static WebElement Private;

public void verify_Private(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Private.getAttribute("value"),data);
	}

}

public void verify_Private_Status(String data){
		//Verifies the Status of the Private
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Private.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Private.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Private.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Private.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Private(String data){
		if(Private.isSelected());
			Private.click();
}

@FindBy(how= How.ID, using = "To")
	public static WebElement To;

public void verify_To(String data){
		Assert.assertEquals(To,To);
}

public void verify_To_Status(String data){
		//Verifies the Status of the To
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(To.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(To.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!To.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!To.isEnabled());
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

@FindBy(how= How.ID, using = "Reminder_txt_area")
	public static WebElement Reminder_txt_area;

public void verify_Reminder_txt_area(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Reminder_txt_area.getAttribute("value"),data);
	}

}

public void verify_Reminder_txt_area_Status(String data){
		//Verifies the Status of the Reminder_txt_area
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reminder_txt_area.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reminder_txt_area.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reminder_txt_area.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reminder_txt_area.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Reminder_txt_area(String data){
		Reminder_txt_area.clear();
		Reminder_txt_area.sendKeys(data);
}

@FindBy(how= How.ID, using = "Send")
	public static WebElement Send;

public void verify_Send_Status(String data){
		//Verifies the Status of the Send
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Send.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Send.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Send.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Send.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Send(){
		Send.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}