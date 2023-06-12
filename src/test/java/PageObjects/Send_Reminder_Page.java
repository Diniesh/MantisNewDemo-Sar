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
public class Send_Reminder_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "View_Status_label")
	public static WebElement View_Status_label;

public void verify_View_Status_label(String data){
		Assert.assertEquals(View_Status_label,View_Status_label);
}

public void verify_View_Status_label_Status(String data){
		//Verifies the Status of the View_Status_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Private_checkbox")
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

@FindBy(how= How.ID, using = "To_label")
	public static WebElement To_label;

public void verify_To_label(String data){
		Assert.assertEquals(To_label,To_label);
}

public void verify_To_label_Status(String data){
		//Verifies the Status of the To_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(To_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(To_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!To_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!To_label.isEnabled());
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

@FindBy(how= How.ID, using = "Reminder_txt_area_textbox")
	public static WebElement Reminder_txt_area_textbox;

public void verify_Reminder_txt_area_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Reminder_txt_area_textbox.getAttribute("value"),data);
	}

}

public void verify_Reminder_txt_area_textbox_Status(String data){
		//Verifies the Status of the Reminder_txt_area_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reminder_txt_area_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reminder_txt_area_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reminder_txt_area_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reminder_txt_area_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Reminder_txt_area_textbox(String data){
		Reminder_txt_area_textbox.clear();
		Reminder_txt_area_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Send_button")
	public static WebElement Send_button;

public void verify_Send_button_Status(String data){
		//Verifies the Status of the Send_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Send_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Send_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Send_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Send_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Send_button(){
		Send_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}