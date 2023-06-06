package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class DeleteTag_popup_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "del_tag")
	public static WebElement del_tag;

public void verify_del_tag_Status(String data){
		//Verifies the Status of the del_tag
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(del_tag.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(del_tag.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!del_tag.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!del_tag.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_del_tag(){
		del_tag.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}