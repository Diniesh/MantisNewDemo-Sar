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
public class Loginpass_Screen_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[@id='password']")
	public static WebElement Enter_your_password_textbox;

public void verify_Enter_your_password_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Enter_your_password_textbox.getAttribute("value"),data);
	}

}

public void verify_Enter_your_password_textbox_Status(String data){
		//Verifies the Status of the Enter_your_password_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Enter_your_password_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Enter_your_password_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Enter_your_password_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Enter_your_password_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Enter_your_password_textbox(String data){
		Enter_your_password_textbox.clear();
		Enter_your_password_textbox.sendKeys(data);
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

@FindBy(how= How.XPATH, using = "//span[normalize-space()='Keep me logged in']")
	public static WebElement Keep_me_logged_in_checkbox;

public void verify_Keep_me_logged_in_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Keep_me_logged_in_checkbox.getAttribute("value"),data);
	}

}

public void verify_Keep_me_logged_in_checkbox_Status(String data){
		//Verifies the Status of the Keep_me_logged_in_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Keep_me_logged_in_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Keep_me_logged_in_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Keep_me_logged_in_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Keep_me_logged_in_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Keep_me_logged_in_checkbox(String data){
		if(Keep_me_logged_in_checkbox.isSelected());
			Keep_me_logged_in_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//span[contains(text(),'Only allow your session to be used from this IP ad')]")
	public static WebElement Only_allow_your_session_to_be_used_from_this_IP_address__checkbox;

public void verify_Only_allow_your_session_to_be_used_from_this_IP_address__checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Only_allow_your_session_to_be_used_from_this_IP_address__checkbox.getAttribute("value"),data);
	}

}

public void verify_Only_allow_your_session_to_be_used_from_this_IP_address__checkbox_Status(String data){
		//Verifies the Status of the Only_allow_your_session_to_be_used_from_this_IP_address__checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Only_allow_your_session_to_be_used_from_this_IP_address__checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Only_allow_your_session_to_be_used_from_this_IP_address__checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Only_allow_your_session_to_be_used_from_this_IP_address__checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Only_allow_your_session_to_be_used_from_this_IP_address__checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Only_allow_your_session_to_be_used_from_this_IP_address__checkbox(String data){
		if(Only_allow_your_session_to_be_used_from_this_IP_address__checkbox.isSelected());
			Only_allow_your_session_to_be_used_from_this_IP_address__checkbox.click();
}

@FindBy(how= How.XPATH, using = "//a[@class='pull-right']")
	public static WebElement Lost_your_password__hyperlink;

public void verify_Lost_your_password__hyperlink_Status(String data){
		//Verifies the Status of the Lost_your_password__hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Lost_your_password__hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Lost_your_password__hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Lost_your_password__hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Lost_your_password__hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Lost_your_password__hyperlink(){
		Lost_your_password__hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//p[contains(text(),'Your account may be disabled or blocked or the use')]")
	public static WebElement Invalid_credentials_error_message_label;

public void verify_Invalid_credentials_error_message_label(String data){
		Assert.assertEquals(Invalid_credentials_error_message_label,Invalid_credentials_error_message_label);
}

public void verify_Invalid_credentials_error_message_label_Status(String data){
		//Verifies the Status of the Invalid_credentials_error_message_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Invalid_credentials_error_message_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Invalid_credentials_error_message_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Invalid_credentials_error_message_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Invalid_credentials_error_message_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}