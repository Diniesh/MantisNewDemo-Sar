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
public class Send_Reminder_popup_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Operation_successful__label")
	public static WebElement Operation_successful__label;

public void verify_Operation_successful__label(String data){
		Assert.assertEquals(Operation_successful__label,Operation_successful__label);
}

public void verify_Operation_successful__label_Status(String data){
		//Verifies the Status of the Operation_successful__label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Operation_successful__label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Operation_successful__label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Operation_successful__label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Operation_successful__label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Proceed_button")
	public static WebElement Proceed_button;

public void verify_Proceed_button_Status(String data){
		//Verifies the Status of the Proceed_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Proceed_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Proceed_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Proceed_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Proceed_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Proceed_button(){
		Proceed_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}