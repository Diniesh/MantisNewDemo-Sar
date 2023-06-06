package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Send_Reminder_popup_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Operation_successful_")
	public static WebElement Operation_successful_;

public void verify_Operation_successful_(String data){
		Assert.assertEquals(Operation_successful_,Operation_successful_);
}

public void verify_Operation_successful__Status(String data){
		//Verifies the Status of the Operation_successful_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Operation_successful_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Operation_successful_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Operation_successful_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Operation_successful_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Proceed")
	public static WebElement Proceed;

public void verify_Proceed_Status(String data){
		//Verifies the Status of the Proceed
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Proceed.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Proceed.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Proceed.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Proceed.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Proceed(){
		Proceed.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}