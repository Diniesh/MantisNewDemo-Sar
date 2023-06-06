package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Delete_Activity_note_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Are_you_sure_you_wish_to_delete_this_note_")
	public static WebElement Are_you_sure_you_wish_to_delete_this_note_;

public void verify_Are_you_sure_you_wish_to_delete_this_note_(String data){
		Assert.assertEquals(Are_you_sure_you_wish_to_delete_this_note_,Are_you_sure_you_wish_to_delete_this_note_);
}

public void verify_Are_you_sure_you_wish_to_delete_this_note__Status(String data){
		//Verifies the Status of the Are_you_sure_you_wish_to_delete_this_note_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Are_you_sure_you_wish_to_delete_this_note_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Are_you_sure_you_wish_to_delete_this_note_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Are_you_sure_you_wish_to_delete_this_note_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Are_you_sure_you_wish_to_delete_this_note_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Delete_Note")
	public static WebElement Delete_Note;

public void verify_Delete_Note_Status(String data){
		//Verifies the Status of the Delete_Note
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_Note.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_Note.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_Note.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_Note.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_Note(){
		Delete_Note.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}