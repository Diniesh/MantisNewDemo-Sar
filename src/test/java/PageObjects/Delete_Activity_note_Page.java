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
public class Delete_Activity_note_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Are_you_sure_you_wish_to_delete_this_note__label")
	public static WebElement Are_you_sure_you_wish_to_delete_this_note__label;

public void verify_Are_you_sure_you_wish_to_delete_this_note__label(String data){
		Assert.assertEquals(Are_you_sure_you_wish_to_delete_this_note__label,Are_you_sure_you_wish_to_delete_this_note__label);
}

public void verify_Are_you_sure_you_wish_to_delete_this_note__label_Status(String data){
		//Verifies the Status of the Are_you_sure_you_wish_to_delete_this_note__label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Are_you_sure_you_wish_to_delete_this_note__label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Are_you_sure_you_wish_to_delete_this_note__label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Are_you_sure_you_wish_to_delete_this_note__label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Are_you_sure_you_wish_to_delete_this_note__label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Delete_Note_button")
	public static WebElement Delete_Note_button;

public void verify_Delete_Note_button_Status(String data){
		//Verifies the Status of the Delete_Note_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_Note_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_Note_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_Note_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_Note_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_Note_button(){
		Delete_Note_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}