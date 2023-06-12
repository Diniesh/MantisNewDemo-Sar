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
public class DeleteTag_popup_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "del_tag_button")
	public static WebElement del_tag_button;

public void verify_del_tag_button_Status(String data){
		//Verifies the Status of the del_tag_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(del_tag_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(del_tag_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!del_tag_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!del_tag_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_del_tag_button(){
		del_tag_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}