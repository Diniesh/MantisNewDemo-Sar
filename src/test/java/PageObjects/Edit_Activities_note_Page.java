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
public class Edit_Activities_note_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//textarea[@id='bugnote_text']")
	public static WebElement Edit_note_textarea_textbox;

public void verify_Edit_note_textarea_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Edit_note_textarea_textbox.getAttribute("value"),data);
	}

}

public void verify_Edit_note_textarea_textbox_Status(String data){
		//Verifies the Status of the Edit_note_textarea_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit_note_textarea_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit_note_textarea_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit_note_textarea_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit_note_textarea_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Edit_note_textarea_textbox(String data){
		Edit_note_textarea_textbox.clear();
		Edit_note_textarea_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Update Information']")
	public static WebElement Update_Information_button;

public void verify_Update_Information_button_Status(String data){
		//Verifies the Status of the Update_Information_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_Information_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_Information_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_Information_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_Information_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_Information_button(){
		Update_Information_button.click();
}

@FindBy(how= How.ID, using = "Go_back_edit_note_button")
	public static WebElement Go_back_edit_note_button;

public void verify_Go_back_edit_note_button_Status(String data){
		//Verifies the Status of the Go_back_edit_note_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Go_back_edit_note_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Go_back_edit_note_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Go_back_edit_note_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Go_back_edit_note_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Go_back_edit_note_button(){
		Go_back_edit_note_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}