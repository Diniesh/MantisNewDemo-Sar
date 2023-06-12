package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	Login_screen_with_username_inputsCredentials_check
*/
public class Login_screen_with_username_inputsCredentials_check extends PageObjectBase
{

	public Login_screen_with_username_inputsCredentials_check()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD, final String Step_3_username_textbox_TEXTBOX, final String Step_5_Empty_username_error_message_label_LABEL_Verification, final String Step_6_Application_error__1904_label_LABEL_Verification, final String Step_5_Enter_your_password_textbox_TEXTBOX) throws Exception

	{

	Launch_URL_Page launch_url_page_init=PageFactory.initElements(driver, Launch_URL_Page.class);

	Login_Screen_Page login_screen_page_init=PageFactory.initElements(driver, Login_Screen_Page.class);

	Loginpass_Screen_Page loginpass_screen_page_init=PageFactory.initElements(driver, Loginpass_Screen_Page.class);

	Mantis_Home_Page mantis_home_page_init=PageFactory.initElements(driver, Mantis_Home_Page.class);

	SignUp_screen_Page signup_screen_page_init=PageFactory.initElements(driver, SignUp_screen_Page.class);

	Signup_error_screen_Page signup_error_screen_page_init=PageFactory.initElements(driver, Signup_error_screen_Page.class);

	Issue_Submit_Page issue_submit_page_init=PageFactory.initElements(driver, Issue_Submit_Page.class);

	Report_Issue_Page report_issue_page_init=PageFactory.initElements(driver, Report_Issue_Page.class);

	Update_Issue_scr_Page update_issue_scr_page_init=PageFactory.initElements(driver, Update_Issue_scr_Page.class);

	View_issue_details_Page view_issue_details_page_init=PageFactory.initElements(driver, View_issue_details_Page.class);

	Edit_Activities_note_Page edit_activities_note_page_init=PageFactory.initElements(driver, Edit_Activities_note_Page.class);

	Delete_Activity_note_Page delete_activity_note_page_init=PageFactory.initElements(driver, Delete_Activity_note_Page.class);

	Send_Reminder_popup_Page send_reminder_popup_page_init=PageFactory.initElements(driver, Send_Reminder_popup_Page.class);

	Send_Reminder_Page send_reminder_page_init=PageFactory.initElements(driver, Send_Reminder_Page.class);

	View_Issues_Page view_issues_page_init=PageFactory.initElements(driver, View_Issues_Page.class);

	Print_Reports_Page print_reports_page_init=PageFactory.initElements(driver, Print_Reports_Page.class);

	ManageEditProject_Page manageeditproject_page_init=PageFactory.initElements(driver, ManageEditProject_Page.class);

	Manage_Screen_Page manage_screen_page_init=PageFactory.initElements(driver, Manage_Screen_Page.class);

	DeleteTag_popup_Page deletetag_popup_page_init=PageFactory.initElements(driver, DeleteTag_popup_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Login_screen_with_username_inputsCredentials_check", "TC_Login_screen_with_username_inputsCredentials_check", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform Launch URL Action");

	testReport.fillTableStep("Step 1", "Perform Launch URL Action");

	launch_url_page_init.enter_URL_field(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify Login Screen screen");

	testReport.fillTableStep("Step 2", "verify Login Screen screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Login_screen_with_username_inputsCredentials_check","Step_2");

	Reporter.log("Step - 3- Fill User Name form Login Screen screen");

	testReport.fillTableStep("Step 3", "Fill User Name form Login Screen screen");

	login_screen_page_init.set_username_textbox(Step_3_username_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Login_screen_with_username_inputsCredentials_check","Step_3");

	Reporter.log("Step - 4- click Login button Login Screen screen User Name form");

	testReport.fillTableStep("Step 4", "click Login button Login Screen screen User Name form");

	login_screen_page_init.click_Login_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Login_screen_with_username_inputsCredentials_check","Step_4");

	Reporter.log("Step - 5- Fill Password form Loginpass Screen screen");

	testReport.fillTableStep("Step 5", "Fill Password form Loginpass Screen screen");

	loginpass_screen_page_init.set_Enter_your_password_textbox(Step_5_Enter_your_password_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Login_screen_with_username_inputsCredentials_check","Step_5");

	Reporter.log("Step - 6- click Login button Loginpass Screen screen Password form");

	testReport.fillTableStep("Step 6", "click Login button Loginpass Screen screen Password form");

	loginpass_screen_page_init.click_Login_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Login_screen_with_username_inputsCredentials_check","Step_6");

	Reporter.log("Step - 7- verify Mantis Home screen");

	testReport.fillTableStep("Step 7", "verify Mantis Home screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Login_screen_with_username_inputsCredentials_check","Step_7");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_5");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Login_screen_with_username_inputsCredentials_check");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
