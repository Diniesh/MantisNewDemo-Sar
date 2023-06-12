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
public class Login_Screen_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[@id='username']")
	public static WebElement username_textbox;

public void verify_username_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(username_textbox.getAttribute("value"),data);
	}

}

public void verify_username_textbox_Status(String data){
		//Verifies the Status of the username_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(username_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(username_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!username_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!username_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_username_textbox(String data){
		username_textbox.clear();
		username_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Login']")
	public static WebElement Login_button;

public void verify_Login_button_Status(String data){
		//Verifies the Status of the Login_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Login_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Login_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Login_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Login_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Login_button(){
		Login_button.click();
}

@FindBy(how= How.XPATH, using = "//p[contains(text(),'Your account may be disabled or blocked or the use')]")
	public static WebElement Empty_username_error_message_label;

public void verify_Empty_username_error_message_label(String data){
		Assert.assertEquals(Empty_username_error_message_label,Empty_username_error_message_label);
}

public void verify_Empty_username_error_message_label_Status(String data){
		//Verifies the Status of the Empty_username_error_message_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Empty_username_error_message_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Empty_username_error_message_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Empty_username_error_message_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Empty_username_error_message_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//a[contains(text(),'Signup for a new account')]")
	public static WebElement Sign_up_for_a_new_account_hyperlink;

public void verify_Sign_up_for_a_new_account_hyperlink_Status(String data){
		//Verifies the Status of the Sign_up_for_a_new_account_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sign_up_for_a_new_account_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sign_up_for_a_new_account_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sign_up_for_a_new_account_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sign_up_for_a_new_account_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Sign_up_for_a_new_account_hyperlink(){
		Sign_up_for_a_new_account_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}