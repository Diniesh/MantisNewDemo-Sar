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
public class Mantis_Home_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Mantis_Navbar_menuitem")
	public static WebElement Mantis_Navbar_menuitem;

public void click_Mantis_Navbar_menuitem(){
		Mantis_Navbar_menuitem.click();
}

public void onHover_Mantis_Navbar_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Mantis_Navbar_menuitem).perform();
}

@FindBy(how= How.ID, using = "My_Account_DD_menuitem")
	public static WebElement My_Account_DD_menuitem;

public void click_My_Account_DD_menuitem(){
		My_Account_DD_menuitem.click();
}

public void onHover_My_Account_DD_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(My_Account_DD_menuitem).perform();
}

@FindBy(how= How.ID, using = "username_menuitem")
	public static WebElement username_menuitem;

public void click_username_menuitem(){
		username_menuitem.click();
}

public void onHover_username_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(username_menuitem).perform();
}

@FindBy(how= How.ID, using = "Report_menuitem")
	public static WebElement Report_menuitem;

public void click_Report_menuitem(){
		Report_menuitem.click();
}

public void onHover_Report_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Report_menuitem).perform();
}

@FindBy(how= How.ID, using = "Report_Issuse_Button_menuitem")
	public static WebElement Report_Issuse_Button_menuitem;

public void click_Report_Issuse_Button_menuitem(){
		Report_Issuse_Button_menuitem.click();
}

public void onHover_Report_Issuse_Button_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Report_Issuse_Button_menuitem).perform();
}

@FindBy(how= How.ID, using = "Invite_menuitem")
	public static WebElement Invite_menuitem;

public void click_Invite_menuitem(){
		Invite_menuitem.click();
}

public void onHover_Invite_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Invite_menuitem).perform();
}

@FindBy(how= How.ID, using = "Invite_Users_menuitem")
	public static WebElement Invite_Users_menuitem;

public void click_Invite_Users_menuitem(){
		Invite_Users_menuitem.click();
}

public void onHover_Invite_Users_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Invite_Users_menuitem).perform();
}

@FindBy(how= How.ID, using = "Demo_menuitem")
	public static WebElement Demo_menuitem;

public void click_Demo_menuitem(){
		Demo_menuitem.click();
}

public void onHover_Demo_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Demo_menuitem).perform();
}

@FindBy(how= How.ID, using = "All_Projects_menuitem")
	public static WebElement All_Projects_menuitem;

public void click_All_Projects_menuitem(){
		All_Projects_menuitem.click();
}

public void onHover_All_Projects_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(All_Projects_menuitem).perform();
}

@FindBy(how= How.ID, using = "username_DD_menuitem")
	public static WebElement username_DD_menuitem;

public void click_username_DD_menuitem(){
		username_DD_menuitem.click();
}

public void onHover_username_DD_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(username_DD_menuitem).perform();
}

@FindBy(how= How.ID, using = "My_Account_menuitem")
	public static WebElement My_Account_menuitem;

public void click_My_Account_menuitem(){
		My_Account_menuitem.click();
}

public void onHover_My_Account_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(My_Account_menuitem).perform();
}

@FindBy(how= How.ID, using = "RSS_menuitem")
	public static WebElement RSS_menuitem;

public void click_RSS_menuitem(){
		RSS_menuitem.click();
}

public void onHover_RSS_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(RSS_menuitem).perform();
}

@FindBy(how= How.ID, using = "Logout_menuitem")
	public static WebElement Logout_menuitem;

public void click_Logout_menuitem(){
		Logout_menuitem.click();
}

public void onHover_Logout_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Logout_menuitem).perform();
}

@FindBy(how= How.ID, using = "Mantis_Vertical_menuitem")
	public static WebElement Mantis_Vertical_menuitem;

public void click_Mantis_Vertical_menuitem(){
		Mantis_Vertical_menuitem.click();
}

public void onHover_Mantis_Vertical_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Mantis_Vertical_menuitem).perform();
}

@FindBy(how= How.ID, using = "Sections_menuitem")
	public static WebElement Sections_menuitem;

public void click_Sections_menuitem(){
		Sections_menuitem.click();
}

public void onHover_Sections_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Sections_menuitem).perform();
}

@FindBy(how= How.ID, using = "My_View_menuitem")
	public static WebElement My_View_menuitem;

public void click_My_View_menuitem(){
		My_View_menuitem.click();
}

public void onHover_My_View_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(My_View_menuitem).perform();
}

@FindBy(how= How.ID, using = "View_Issues_menuitem")
	public static WebElement View_Issues_menuitem;

public void click_View_Issues_menuitem(){
		View_Issues_menuitem.click();
}

public void onHover_View_Issues_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(View_Issues_menuitem).perform();
}

@FindBy(how= How.ID, using = "Report_Issues_menuitem")
	public static WebElement Report_Issues_menuitem;

public void click_Report_Issues_menuitem(){
		Report_Issues_menuitem.click();
}

public void onHover_Report_Issues_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Report_Issues_menuitem).perform();
}

@FindBy(how= How.ID, using = "Change_Log_menuitem")
	public static WebElement Change_Log_menuitem;

public void click_Change_Log_menuitem(){
		Change_Log_menuitem.click();
}

public void onHover_Change_Log_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Change_Log_menuitem).perform();
}

@FindBy(how= How.ID, using = "Road_Map_menuitem")
	public static WebElement Road_Map_menuitem;

public void click_Road_Map_menuitem(){
		Road_Map_menuitem.click();
}

public void onHover_Road_Map_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Road_Map_menuitem).perform();
}

@FindBy(how= How.ID, using = "Summary_menuitem")
	public static WebElement Summary_menuitem;

public void click_Summary_menuitem(){
		Summary_menuitem.click();
}

public void onHover_Summary_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Summary_menuitem).perform();
}

@FindBy(how= How.ID, using = "Manage_menuitem")
	public static WebElement Manage_menuitem;

public void click_Manage_menuitem(){
		Manage_menuitem.click();
}

public void onHover_Manage_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Manage_menuitem).perform();
}

@FindBy(how= How.ID, using = "Assigne_to_me__Unresolved__menuitem")
	public static WebElement Assigne_to_me__Unresolved__menuitem;

public void click_Assigne_to_me__Unresolved__menuitem(){
		Assigne_to_me__Unresolved__menuitem.click();
}

public void onHover_Assigne_to_me__Unresolved__menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Assigne_to_me__Unresolved__menuitem).perform();
}

@FindBy(how= How.ID, using = "Issue_ID_SELF_hyperlink")
	public static WebElement Issue_ID_SELF_hyperlink;

public void verify_Issue_ID_SELF_hyperlink_Status(String data){
		//Verifies the Status of the Issue_ID_SELF_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_SELF_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_SELF_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_SELF_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_SELF_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_SELF_hyperlink(){
		Issue_ID_SELF_hyperlink.click();
}

@FindBy(how= How.ID, using = "Issue_Name_SELF_hyperlink")
	public static WebElement Issue_Name_SELF_hyperlink;

public void verify_Issue_Name_SELF_hyperlink_Status(String data){
		//Verifies the Status of the Issue_Name_SELF_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_SELF_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_SELF_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_SELF_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_SELF_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_SELF_hyperlink(){
		Issue_Name_SELF_hyperlink.click();
}

@FindBy(how= How.ID, using = "View_Issues_SELF_button")
	public static WebElement View_Issues_SELF_button;

public void verify_View_Issues_SELF_button_Status(String data){
		//Verifies the Status of the View_Issues_SELF_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_SELF_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_SELF_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_SELF_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_SELF_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_SELF_button(){
		View_Issues_SELF_button.click();
}

@FindBy(how= How.ID, using = "fghj_label")
	public static WebElement fghj_label;

public void verify_fghj_label(String data){
		Assert.assertEquals(fghj_label,fghj_label);
}

public void verify_fghj_label_Status(String data){
		//Verifies the Status of the fghj_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(fghj_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(fghj_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!fghj_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!fghj_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Unassigned_label")
	public static WebElement Unassigned_label;

public void verify_Unassigned_label(String data){
		Assert.assertEquals(Unassigned_label,Unassigned_label);
}

public void verify_Unassigned_label_Status(String data){
		//Verifies the Status of the Unassigned_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Unassigned_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Unassigned_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Unassigned_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Unassigned_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Issue_ID_UN_hyperlink")
	public static WebElement Issue_ID_UN_hyperlink;

public void verify_Issue_ID_UN_hyperlink_Status(String data){
		//Verifies the Status of the Issue_ID_UN_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_UN_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_UN_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_UN_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_UN_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_UN_hyperlink(){
		Issue_ID_UN_hyperlink.click();
}

@FindBy(how= How.ID, using = "Issue_Name_UN_hyperlink")
	public static WebElement Issue_Name_UN_hyperlink;

public void verify_Issue_Name_UN_hyperlink_Status(String data){
		//Verifies the Status of the Issue_Name_UN_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_UN_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_UN_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_UN_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_UN_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_UN_hyperlink(){
		Issue_Name_UN_hyperlink.click();
}

@FindBy(how= How.ID, using = "View_Issues_UN_button")
	public static WebElement View_Issues_UN_button;

public void verify_View_Issues_UN_button_Status(String data){
		//Verifies the Status of the View_Issues_UN_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_UN_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_UN_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_UN_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_UN_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_UN_button(){
		View_Issues_UN_button.click();
}

@FindBy(how= How.ID, using = "Reported_by_me_button")
	public static WebElement Reported_by_me_button;

public void verify_Reported_by_me_button_Status(String data){
		//Verifies the Status of the Reported_by_me_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reported_by_me_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reported_by_me_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reported_by_me_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reported_by_me_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Reported_by_me_button(){
		Reported_by_me_button.click();
}

@FindBy(how= How.ID, using = "Issue_ID_REP_ME_hyperlink")
	public static WebElement Issue_ID_REP_ME_hyperlink;

public void verify_Issue_ID_REP_ME_hyperlink_Status(String data){
		//Verifies the Status of the Issue_ID_REP_ME_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_REP_ME_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_REP_ME_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_REP_ME_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_REP_ME_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_REP_ME_hyperlink(){
		Issue_ID_REP_ME_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "(((//div[@id='reported']//div[@class='widget-body']//div[@class='widget-main no-padding']//div[@class='table-responsive']//table[@class='table table-bordered table-condensed table-striped table-hover']//tbody//tr[@class='my-buglist-bug '])[1]//td)[2]//span)[2]//a")
	public static WebElement Issue_Name_REP_ME_hyperlink;

public void verify_Issue_Name_REP_ME_hyperlink_Status(String data){
		//Verifies the Status of the Issue_Name_REP_ME_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_REP_ME_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_REP_ME_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_REP_ME_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_REP_ME_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_REP_ME_hyperlink(){
		Issue_Name_REP_ME_hyperlink.click();
}

@FindBy(how= How.ID, using = "View_Issues_REP_ME_button")
	public static WebElement View_Issues_REP_ME_button;

public void verify_View_Issues_REP_ME_button_Status(String data){
		//Verifies the Status of the View_Issues_REP_ME_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_REP_ME_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_REP_ME_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_REP_ME_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_REP_ME_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_REP_ME_button(){
		View_Issues_REP_ME_button.click();
}

@FindBy(how= How.ID, using = "Resolved_button")
	public static WebElement Resolved_button;

public void verify_Resolved_button_Status(String data){
		//Verifies the Status of the Resolved_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolved_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolved_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolved_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolved_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Resolved_button(){
		Resolved_button.click();
}

@FindBy(how= How.ID, using = "Issue_ID_RES_hyperlink")
	public static WebElement Issue_ID_RES_hyperlink;

public void verify_Issue_ID_RES_hyperlink_Status(String data){
		//Verifies the Status of the Issue_ID_RES_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_RES_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_RES_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_RES_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_RES_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_RES_hyperlink(){
		Issue_ID_RES_hyperlink.click();
}

@FindBy(how= How.ID, using = "Issue_Name_RES_hyperlink")
	public static WebElement Issue_Name_RES_hyperlink;

public void verify_Issue_Name_RES_hyperlink_Status(String data){
		//Verifies the Status of the Issue_Name_RES_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_RES_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_RES_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_RES_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_RES_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_RES_hyperlink(){
		Issue_Name_RES_hyperlink.click();
}

@FindBy(how= How.ID, using = "View_Issues_RES_button")
	public static WebElement View_Issues_RES_button;

public void verify_View_Issues_RES_button_Status(String data){
		//Verifies the Status of the View_Issues_RES_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_RES_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_RES_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_RES_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_RES_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_RES_button(){
		View_Issues_RES_button.click();
}

@FindBy(how= How.ID, using = "Recently_Modified_button")
	public static WebElement Recently_Modified_button;

public void verify_Recently_Modified_button_Status(String data){
		//Verifies the Status of the Recently_Modified_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Recently_Modified_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Recently_Modified_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Recently_Modified_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Recently_Modified_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Recently_Modified_button(){
		Recently_Modified_button.click();
}

@FindBy(how= How.ID, using = "Issue_ID_REC_hyperlink")
	public static WebElement Issue_ID_REC_hyperlink;

public void verify_Issue_ID_REC_hyperlink_Status(String data){
		//Verifies the Status of the Issue_ID_REC_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_REC_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_REC_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_REC_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_REC_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_REC_hyperlink(){
		Issue_ID_REC_hyperlink.click();
}

@FindBy(how= How.ID, using = "Issue_Name_REC_hyperlink")
	public static WebElement Issue_Name_REC_hyperlink;

public void verify_Issue_Name_REC_hyperlink_Status(String data){
		//Verifies the Status of the Issue_Name_REC_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_REC_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_REC_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_REC_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_REC_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_REC_hyperlink(){
		Issue_Name_REC_hyperlink.click();
}

@FindBy(how= How.ID, using = "View_Issues_REC_button")
	public static WebElement View_Issues_REC_button;

public void verify_View_Issues_REC_button_Status(String data){
		//Verifies the Status of the View_Issues_REC_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_REC_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_REC_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_REC_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_REC_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_REC_button(){
		View_Issues_REC_button.click();
}

@FindBy(how= How.ID, using = "Timeline_button")
	public static WebElement Timeline_button;

public void verify_Timeline_button_Status(String data){
		//Verifies the Status of the Timeline_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Timeline_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Timeline_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Timeline_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Timeline_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Timeline_button(){
		Timeline_button.click();
}

@FindBy(how= How.ID, using = "Previous_button")
	public static WebElement Previous_button;

public void verify_Previous_button_Status(String data){
		//Verifies the Status of the Previous_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Previous_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Previous_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Previous_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Previous_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Previous_button(){
		Previous_button.click();
}

@FindBy(how= How.ID, using = "username_TIMELINE_hyperlink")
	public static WebElement username_TIMELINE_hyperlink;

public void verify_username_TIMELINE_hyperlink_Status(String data){
		//Verifies the Status of the username_TIMELINE_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(username_TIMELINE_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(username_TIMELINE_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!username_TIMELINE_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!username_TIMELINE_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_username_TIMELINE_hyperlink(){
		username_TIMELINE_hyperlink.click();
}

@FindBy(how= How.ID, using = "Issue_ID_TIMELINE_hyperlink")
	public static WebElement Issue_ID_TIMELINE_hyperlink;

public void verify_Issue_ID_TIMELINE_hyperlink_Status(String data){
		//Verifies the Status of the Issue_ID_TIMELINE_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_TIMELINE_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_TIMELINE_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_TIMELINE_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_TIMELINE_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_TIMELINE_hyperlink(){
		Issue_ID_TIMELINE_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}