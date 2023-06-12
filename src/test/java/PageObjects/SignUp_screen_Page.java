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
public class SignUp_screen_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "username_textbox")
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

@FindBy(how= How.ID, using = "email_textbox")
	public static WebElement email_textbox;

public void verify_email_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(email_textbox.getAttribute("value"),data);
	}

}

public void verify_email_textbox_Status(String data){
		//Verifies the Status of the email_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(email_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(email_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!email_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!email_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_email_textbox(String data){
		email_textbox.clear();
		email_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "captcha_box_textbox")
	public static WebElement captcha_box_textbox;

public void verify_captcha_box_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(captcha_box_textbox.getAttribute("value"),data);
	}

}

public void verify_captcha_box_textbox_Status(String data){
		//Verifies the Status of the captcha_box_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(captcha_box_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(captcha_box_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!captcha_box_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!captcha_box_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_captcha_box_textbox(String data){
		captcha_box_textbox.clear();
		captcha_box_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Read_captcha_button")
	public static WebElement Read_captcha_button;

public void verify_Read_captcha_button_Status(String data){
		//Verifies the Status of the Read_captcha_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Read_captcha_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Read_captcha_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Read_captcha_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Read_captcha_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Read_captcha_button(){
		Read_captcha_button.click();
}

@FindBy(how= How.ID, using = "Reload_captcha_button")
	public static WebElement Reload_captcha_button;

public void verify_Reload_captcha_button_Status(String data){
		//Verifies the Status of the Reload_captcha_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reload_captcha_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reload_captcha_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reload_captcha_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reload_captcha_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Reload_captcha_button(){
		Reload_captcha_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Signup']")
	public static WebElement Signup_button;

public void verify_Signup_button_Status(String data){
		//Verifies the Status of the Signup_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Signup_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Signup_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Signup_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Signup_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Signup_button(){
		Signup_button.click();
}

@FindBy(how= How.ID, using = "Login_hyperlink")
	public static WebElement Login_hyperlink;

public void verify_Login_hyperlink_Status(String data){
		//Verifies the Status of the Login_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Login_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Login_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Login_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Login_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Login_hyperlink(){
		Login_hyperlink.click();
}

@FindBy(how= How.ID, using = "Lost_your_password_hyperlink")
	public static WebElement Lost_your_password_hyperlink;

public void verify_Lost_your_password_hyperlink_Status(String data){
		//Verifies the Status of the Lost_your_password_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Lost_your_password_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Lost_your_password_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Lost_your_password_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Lost_your_password_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Lost_your_password_hyperlink(){
		Lost_your_password_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}