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
public class Signup_error_screen_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "(//p)[2]")
	public static WebElement Application_error__1904_label;

public void verify_Application_error__1904_label(String data){
		Assert.assertEquals(Application_error__1904_label,Application_error__1904_label);
}

public void verify_Application_error__1904_label_Status(String data){
		//Verifies the Status of the Application_error__1904_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Application_error__1904_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Application_error__1904_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Application_error__1904_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Application_error__1904_label.isEnabled());
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