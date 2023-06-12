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
public class Issue_Submit_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Operation_Successful_label")
	public static WebElement Operation_Successful_label;

public void verify_Operation_Successful_label(String data){
		Assert.assertEquals(Operation_Successful_label,Operation_Successful_label);
}

public void verify_Operation_Successful_label_Status(String data){
		//Verifies the Status of the Operation_Successful_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Operation_Successful_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Operation_Successful_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Operation_Successful_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Operation_Successful_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "View_Submitted_Issue__BTN_button")
	public static WebElement View_Submitted_Issue__BTN_button;

public void verify_View_Submitted_Issue__BTN_button_Status(String data){
		//Verifies the Status of the View_Submitted_Issue__BTN_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Submitted_Issue__BTN_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Submitted_Issue__BTN_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Submitted_Issue__BTN_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Submitted_Issue__BTN_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Submitted_Issue__BTN_button(){
		View_Submitted_Issue__BTN_button.click();
}

@FindBy(how= How.ID, using = "View_Issues__BTN_button")
	public static WebElement View_Issues__BTN_button;

public void verify_View_Issues__BTN_button_Status(String data){
		//Verifies the Status of the View_Issues__BTN_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues__BTN_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues__BTN_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues__BTN_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues__BTN_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues__BTN_button(){
		View_Issues__BTN_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}