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
public class Manage_Screen_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "I_tab_tab")
	public static WebElement I_tab_tab;

public void verify_I_tab_tab(String data){
		Assert.assertEquals(I_tab_tab,I_tab_tab);
}

public void verify_I_tab_tab_Status(String data){
		//Verifies the Status of the I_tab_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(I_tab_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(I_tab_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!I_tab_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!I_tab_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_I_tab_tab(){
		I_tab_tab.click();
}

public void onHover_I_tab_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(I_tab_tab).perform();
}

@FindBy(how= How.ID, using = "Site_information_label")
	public static WebElement Site_information_label;

public void verify_Site_information_label(String data){
		Assert.assertEquals(Site_information_label,Site_information_label);
}

public void verify_Site_information_label_Status(String data){
		//Verifies the Status of the Site_information_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Site_information_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Site_information_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Site_information_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Site_information_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Manage_users_tab")
	public static WebElement Manage_users_tab;

public void verify_Manage_users_tab(String data){
		Assert.assertEquals(Manage_users_tab,Manage_users_tab);
}

public void verify_Manage_users_tab_Status(String data){
		//Verifies the Status of the Manage_users_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Manage_users_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Manage_users_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Manage_users_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Manage_users_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Manage_users_tab(){
		Manage_users_tab.click();
}

public void onHover_Manage_users_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Manage_users_tab).perform();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='All']")
	public static WebElement All_button;

public void verify_All_button_Status(String data){
		//Verifies the Status of the All_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(All_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(All_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!All_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!All_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_All_button(){
		All_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='A']")
	public static WebElement A_button;

public void verify_A_button_Status(String data){
		//Verifies the Status of the A_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(A_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(A_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!A_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!A_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_A_button(){
		A_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='B']")
	public static WebElement B_button;

public void verify_B_button_Status(String data){
		//Verifies the Status of the B_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(B_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(B_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!B_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!B_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_B_button(){
		B_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='C']")
	public static WebElement c_button;

public void verify_c_button_Status(String data){
		//Verifies the Status of the c_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(c_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(c_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!c_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!c_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_c_button(){
		c_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='D']")
	public static WebElement D_button;

public void verify_D_button_Status(String data){
		//Verifies the Status of the D_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(D_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(D_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!D_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!D_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_D_button(){
		D_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='E']")
	public static WebElement E_button;

public void verify_E_button_Status(String data){
		//Verifies the Status of the E_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(E_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(E_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!E_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!E_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_E_button(){
		E_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='S']")
	public static WebElement S_button;

public void verify_S_button_Status(String data){
		//Verifies the Status of the S_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(S_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(S_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!S_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!S_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_S_button(){
		S_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='R']")
	public static WebElement R_button;

public void verify_R_button_Status(String data){
		//Verifies the Status of the R_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(R_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(R_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!R_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!R_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_R_button(){
		R_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Q']")
	public static WebElement Q_button;

public void verify_Q_button_Status(String data){
		//Verifies the Status of the Q_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Q_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Q_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Q_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Q_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Q_button(){
		Q_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='N']")
	public static WebElement N_button;

public void verify_N_button_Status(String data){
		//Verifies the Status of the N_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(N_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(N_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!N_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!N_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_N_button(){
		N_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='M']")
	public static WebElement M_button;

public void verify_M_button_Status(String data){
		//Verifies the Status of the M_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(M_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(M_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!M_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!M_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_M_button(){
		M_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='J']")
	public static WebElement J_button;

public void verify_J_button_Status(String data){
		//Verifies the Status of the J_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(J_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(J_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!J_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!J_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_J_button(){
		J_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='L']")
	public static WebElement L_button;

public void verify_L_button_Status(String data){
		//Verifies the Status of the L_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(L_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(L_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!L_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!L_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_L_button(){
		L_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='O']")
	public static WebElement O_button;

public void verify_O_button_Status(String data){
		//Verifies the Status of the O_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(O_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(O_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!O_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!O_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_O_button(){
		O_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='I']")
	public static WebElement I_button;

public void verify_I_button_Status(String data){
		//Verifies the Status of the I_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(I_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(I_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!I_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!I_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_I_button(){
		I_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='H']")
	public static WebElement H_button;

public void verify_H_button_Status(String data){
		//Verifies the Status of the H_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(H_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(H_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!H_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!H_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_H_button(){
		H_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='P']")
	public static WebElement P_button;

public void verify_P_button_Status(String data){
		//Verifies the Status of the P_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(P_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(P_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!P_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!P_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_P_button(){
		P_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='K']")
	public static WebElement K_button;

public void verify_K_button_Status(String data){
		//Verifies the Status of the K_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(K_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(K_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!K_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!K_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_K_button(){
		K_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='G']")
	public static WebElement G_button;

public void verify_G_button_Status(String data){
		//Verifies the Status of the G_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(G_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(G_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!G_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!G_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_G_button(){
		G_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='F']")
	public static WebElement F_button;

public void verify_F_button_Status(String data){
		//Verifies the Status of the F_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(F_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(F_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!F_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!F_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_F_button(){
		F_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='T']")
	public static WebElement T_button;

public void verify_T_button_Status(String data){
		//Verifies the Status of the T_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(T_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(T_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!T_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!T_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_T_button(){
		T_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Z']")
	public static WebElement Z_button;

public void verify_Z_button_Status(String data){
		//Verifies the Status of the Z_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Z_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Z_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Z_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Z_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Z_button(){
		Z_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Y']")
	public static WebElement Y_button;

public void verify_Y_button_Status(String data){
		//Verifies the Status of the Y_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Y_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Y_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Y_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Y_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Y_button(){
		Y_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='1']")
	public static WebElement One_button;

public void verify_One_button_Status(String data){
		//Verifies the Status of the One_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(One_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(One_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!One_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!One_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_One_button(){
		One_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='3']")
	public static WebElement Three_button;

public void verify_Three_button_Status(String data){
		//Verifies the Status of the Three_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Three_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Three_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Three_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Three_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Three_button(){
		Three_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='2']")
	public static WebElement Two_button;

public void verify_Two_button_Status(String data){
		//Verifies the Status of the Two_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Two_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Two_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Two_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Two_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Two_button(){
		Two_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='U']")
	public static WebElement U_button;

public void verify_U_button_Status(String data){
		//Verifies the Status of the U_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(U_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(U_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!U_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!U_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_U_button(){
		U_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='X']")
	public static WebElement X_button;

public void verify_X_button_Status(String data){
		//Verifies the Status of the X_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(X_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(X_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!X_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!X_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_X_button(){
		X_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='V']")
	public static WebElement V_button;

public void verify_V_button_Status(String data){
		//Verifies the Status of the V_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(V_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(V_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!V_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!V_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_V_button(){
		V_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='5']")
	public static WebElement Five_button;

public void verify_Five_button_Status(String data){
		//Verifies the Status of the Five_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Five_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Five_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Five_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Five_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Five_button(){
		Five_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='6']")
	public static WebElement Six_button;

public void verify_Six_button_Status(String data){
		//Verifies the Status of the Six_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Six_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Six_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Six_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Six_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Six_button(){
		Six_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='4']")
	public static WebElement Four_button;

public void verify_Four_button_Status(String data){
		//Verifies the Status of the Four_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Four_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Four_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Four_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Four_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Four_button(){
		Four_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='8']")
	public static WebElement Eight_button;

public void verify_Eight_button_Status(String data){
		//Verifies the Status of the Eight_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Eight_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Eight_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Eight_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Eight_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Eight_button(){
		Eight_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='7']")
	public static WebElement Seven_button;

public void verify_Seven_button_Status(String data){
		//Verifies the Status of the Seven_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Seven_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Seven_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Seven_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Seven_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Seven_button(){
		Seven_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='9']")
	public static WebElement Nine_button;

public void verify_Nine_button_Status(String data){
		//Verifies the Status of the Nine_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Nine_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Nine_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Nine_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Nine_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Nine_button(){
		Nine_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='New']")
	public static WebElement New_button;

public void verify_New_button_Status(String data){
		//Verifies the Status of the New_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(New_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(New_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!New_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!New_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_New_button(){
		New_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Unused']")
	public static WebElement unused_button;

public void verify_unused_button_Status(String data){
		//Verifies the Status of the unused_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(unused_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(unused_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!unused_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!unused_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_unused_button(){
		unused_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@id='user-username']")
	public static WebElement CA_username_textbox;

public void verify_CA_username_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_username_textbox.getAttribute("value"),data);
	}

}

public void verify_CA_username_textbox_Status(String data){
		//Verifies the Status of the CA_username_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_username_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_username_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_username_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_username_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_CA_username_textbox(String data){
		CA_username_textbox.clear();
		CA_username_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='user-realname']")
	public static WebElement CA_realname_textbox;

public void verify_CA_realname_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_realname_textbox.getAttribute("value"),data);
	}

}

public void verify_CA_realname_textbox_Status(String data){
		//Verifies the Status of the CA_realname_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_realname_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_realname_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_realname_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_realname_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_CA_realname_textbox(String data){
		CA_realname_textbox.clear();
		CA_realname_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='email-field']")
	public static WebElement CA_Email_textbox;

public void verify_CA_Email_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_Email_textbox.getAttribute("value"),data);
	}

}

public void verify_CA_Email_textbox_Status(String data){
		//Verifies the Status of the CA_Email_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_Email_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_Email_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_Email_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_Email_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_CA_Email_textbox(String data){
		CA_Email_textbox.clear();
		CA_Email_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[1]")
	public static WebElement CA_Enable_checkbox;

public void verify_CA_Enable_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_Enable_checkbox.getAttribute("value"),data);
	}

}

public void verify_CA_Enable_checkbox_Status(String data){
		//Verifies the Status of the CA_Enable_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_Enable_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_Enable_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_Enable_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_Enable_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_CA_Enable_checkbox(String data){
		if(CA_Enable_checkbox.isSelected());
			CA_Enable_checkbox.click();
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[2]")
	public static WebElement CA_Protected_checkbox;

public void verify_CA_Protected_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(CA_Protected_checkbox.getAttribute("value"),data);
	}

}

public void verify_CA_Protected_checkbox_Status(String data){
		//Verifies the Status of the CA_Protected_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CA_Protected_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CA_Protected_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CA_Protected_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CA_Protected_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_CA_Protected_checkbox(String data){
		if(CA_Protected_checkbox.isSelected());
			CA_Protected_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//select[@id='user-access-level']")
	public static WebElement AcessLevel_CA_dropdown;

public void verify_AcessLevel_CA_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AcessLevel_CA_dropdown.getAttribute("value"),data);
	}

}

public void verify_AcessLevel_CA_dropdown_Status(String data){
		//Verifies the Status of the AcessLevel_CA_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AcessLevel_CA_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AcessLevel_CA_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AcessLevel_CA_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AcessLevel_CA_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_AcessLevel_CA_dropdown(String data){
		Select dropdown= new Select(AcessLevel_CA_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Create User']")
	public static WebElement Createuser_CA_button;

public void verify_Createuser_CA_button_Status(String data){
		//Verifies the Status of the Createuser_CA_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Createuser_CA_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Createuser_CA_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Createuser_CA_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Createuser_CA_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Createuser_CA_button(){
		Createuser_CA_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Create New Account']")
	public static WebElement Craete_account_Ma_button;

public void verify_Craete_account_Ma_button_Status(String data){
		//Verifies the Status of the Craete_account_Ma_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Craete_account_Ma_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Craete_account_Ma_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Craete_account_Ma_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Craete_account_Ma_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Craete_account_Ma_button(){
		Craete_account_Ma_button.click();
}

@FindBy(how= How.XPATH, using = "//span[normalize-space()='Hide Inactive']")
	public static WebElement Hide_Inactive_checkbox;

public void verify_Hide_Inactive_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Hide_Inactive_checkbox.getAttribute("value"),data);
	}

}

public void verify_Hide_Inactive_checkbox_Status(String data){
		//Verifies the Status of the Hide_Inactive_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Hide_Inactive_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Hide_Inactive_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Hide_Inactive_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Hide_Inactive_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Hide_Inactive_checkbox(String data){
		if(Hide_Inactive_checkbox.isSelected());
			Hide_Inactive_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//span[normalize-space()='Show Disabled']")
	public static WebElement Show_Disabled_checkbox;

public void verify_Show_Disabled_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Show_Disabled_checkbox.getAttribute("value"),data);
	}

}

public void verify_Show_Disabled_checkbox_Status(String data){
		//Verifies the Status of the Show_Disabled_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_Disabled_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_Disabled_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_Disabled_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_Disabled_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Show_Disabled_checkbox(String data){
		if(Show_Disabled_checkbox.isSelected());
			Show_Disabled_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//input[@id='search']")
	public static WebElement Username_Realname_or_Email_textbox;

public void verify_Username_Realname_or_Email_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Username_Realname_or_Email_textbox.getAttribute("value"),data);
	}

}

public void verify_Username_Realname_or_Email_textbox_Status(String data){
		//Verifies the Status of the Username_Realname_or_Email_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Username_Realname_or_Email_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Username_Realname_or_Email_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Username_Realname_or_Email_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Username_Realname_or_Email_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Username_Realname_or_Email_textbox(String data){
		Username_Realname_or_Email_textbox.clear();
		Username_Realname_or_Email_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Apply Filter']")
	public static WebElement Apply_Filter_button;

public void verify_Apply_Filter_button_Status(String data){
		//Verifies the Status of the Apply_Filter_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Apply_Filter_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Apply_Filter_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Apply_Filter_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Apply_Filter_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Apply_Filter_button(){
		Apply_Filter_button.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Username']")
	public static WebElement Username_hyperlink;

public void verify_Username_hyperlink_Status(String data){
		//Verifies the Status of the Username_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Username_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Username_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Username_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Username_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Username_hyperlink(){
		Username_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Real Name']")
	public static WebElement Real_name_hyperlink;

public void verify_Real_name_hyperlink_Status(String data){
		//Verifies the Status of the Real_name_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Real_name_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Real_name_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Real_name_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Real_name_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Real_name_hyperlink(){
		Real_name_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='E-mail']")
	public static WebElement Email_hyperlink;

public void verify_Email_hyperlink_Status(String data){
		//Verifies the Status of the Email_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Email_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Email_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Email_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Email_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Email_hyperlink(){
		Email_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Access Level']")
	public static WebElement Access_Level_hyperlink;

public void verify_Access_Level_hyperlink_Status(String data){
		//Verifies the Status of the Access_Level_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Access_Level_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Access_Level_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Access_Level_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Access_Level_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Access_Level_hyperlink(){
		Access_Level_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Enabled']")
	public static WebElement Enabled_hyperlink;

public void verify_Enabled_hyperlink_Status(String data){
		//Verifies the Status of the Enabled_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Enabled_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Enabled_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Enabled_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Enabled_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Enabled_hyperlink(){
		Enabled_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Protected']")
	public static WebElement Protected_hyperlink;

public void verify_Protected_hyperlink_Status(String data){
		//Verifies the Status of the Protected_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Protected_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Protected_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Protected_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Protected_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Protected_hyperlink(){
		Protected_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Date Created']")
	public static WebElement Date_Created_hyperlink;

public void verify_Date_Created_hyperlink_Status(String data){
		//Verifies the Status of the Date_Created_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_Created_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_Created_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_Created_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_Created_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Date_Created_hyperlink(){
		Date_Created_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Last Visit']")
	public static WebElement Last_Visit_hyperlink;

public void verify_Last_Visit_hyperlink_Status(String data){
		//Verifies the Status of the Last_Visit_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_Visit_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_Visit_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_Visit_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_Visit_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Last_Visit_hyperlink(){
		Last_Visit_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//tbody//tr//td//a[contains(text(),'administrator')]")
	public static WebElement administrator_hyperlink;

public void verify_administrator_hyperlink_Status(String data){
		//Verifies the Status of the administrator_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(administrator_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(administrator_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!administrator_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!administrator_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_administrator_hyperlink(){
		administrator_hyperlink.click();
}

@FindBy(how= How.ID, using = "Manage_Projects_tab")
	public static WebElement Manage_Projects_tab;

public void verify_Manage_Projects_tab(String data){
		Assert.assertEquals(Manage_Projects_tab,Manage_Projects_tab);
}

public void verify_Manage_Projects_tab_Status(String data){
		//Verifies the Status of the Manage_Projects_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Manage_Projects_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Manage_Projects_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Manage_Projects_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Manage_Projects_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Manage_Projects_tab(){
		Manage_Projects_tab.click();
}

public void onHover_Manage_Projects_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Manage_Projects_tab).perform();
}

@FindBy(how= How.ID, using = "Projects_tab")
	public static WebElement Projects_tab;

public void verify_Projects_tab(String data){
		Assert.assertEquals(Projects_tab,Projects_tab);
}

public void verify_Projects_tab_Status(String data){
		//Verifies the Status of the Projects_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Projects_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Projects_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Projects_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Projects_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Projects_tab(){
		Projects_tab.click();
}

public void onHover_Projects_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Projects_tab).perform();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Name']")
	public static WebElement Name_HL_hyperlink;

public void verify_Name_HL_hyperlink_Status(String data){
		//Verifies the Status of the Name_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Name_HL_hyperlink(){
		Name_HL_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Description']")
	public static WebElement Description_HL_hyperlink;

public void verify_Description_HL_hyperlink_Status(String data){
		//Verifies the Status of the Description_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Description_HL_hyperlink(){
		Description_HL_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Status']")
	public static WebElement Status_HL_hyperlink;

public void verify_Status_HL_hyperlink_Status(String data){
		//Verifies the Status of the Status_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Status_HL_hyperlink(){
		Status_HL_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='Enabled']")
	public static WebElement Enabled_HL_hyperlink;

public void verify_Enabled_HL_hyperlink_Status(String data){
		//Verifies the Status of the Enabled_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Enabled_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Enabled_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Enabled_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Enabled_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Enabled_HL_hyperlink(){
		Enabled_HL_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//tbody//tr//td//a[contains(text(),'Automation')]")
	public static WebElement Projectname_HL_hyperlink;

public void verify_Projectname_HL_hyperlink_Status(String data){
		//Verifies the Status of the Projectname_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Projectname_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Projectname_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Projectname_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Projectname_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Projectname_HL_hyperlink(){
		Projectname_HL_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[normalize-space()='View Status']")
	public static WebElement View_Status_HL_hyperlink;

public void verify_View_Status_HL_hyperlink_Status(String data){
		//Verifies the Status of the View_Status_HL_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_HL_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_HL_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_HL_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_HL_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Status_HL_hyperlink(){
		View_Status_HL_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//button[normalize-space()='Create New Project']")
	public static WebElement Create_Projects_MP_button;

public void verify_Create_Projects_MP_button_Status(String data){
		//Verifies the Status of the Create_Projects_MP_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Create_Projects_MP_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Create_Projects_MP_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Create_Projects_MP_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Create_Projects_MP_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Create_Projects_MP_button(){
		Create_Projects_MP_button.click();
}

@FindBy(how= How.XPATH, using = "(//button[@type='submit'][normalize-space()='Edit'])[1]")
	public static WebElement Edit_GC_button;

public void verify_Edit_GC_button_Status(String data){
		//Verifies the Status of the Edit_GC_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit_GC_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit_GC_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit_GC_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit_GC_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Edit_GC_button(){
		Edit_GC_button.click();
}

@FindBy(how= How.XPATH, using = "(//button[@type='submit'][normalize-space()='Delete'])[1]")
	public static WebElement Delete_GC_button;

public void verify_Delete_GC_button_Status(String data){
		//Verifies the Status of the Delete_GC_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_GC_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_GC_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_GC_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_GC_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_GC_button(){
		Delete_GC_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='name']")
	public static WebElement Text_global_categories_textbox_textbox;

public void verify_Text_global_categories_textbox_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Text_global_categories_textbox_textbox.getAttribute("value"),data);
	}

}

public void verify_Text_global_categories_textbox_textbox_Status(String data){
		//Verifies the Status of the Text_global_categories_textbox_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Text_global_categories_textbox_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Text_global_categories_textbox_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Text_global_categories_textbox_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Text_global_categories_textbox_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Text_global_categories_textbox_textbox(String data){
		Text_global_categories_textbox_textbox.clear();
		Text_global_categories_textbox_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Add Category']")
	public static WebElement Add_Category_GC_button;

public void verify_Add_Category_GC_button_Status(String data){
		//Verifies the Status of the Add_Category_GC_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_Category_GC_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_Category_GC_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_Category_GC_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_Category_GC_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_Category_GC_button(){
		Add_Category_GC_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='add_and_edit_category']")
	public static WebElement Add_and_Edit_Category_GC_button;

public void verify_Add_and_Edit_Category_GC_button_Status(String data){
		//Verifies the Status of the Add_and_Edit_Category_GC_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_and_Edit_Category_GC_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_and_Edit_Category_GC_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_and_Edit_Category_GC_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_and_Edit_Category_GC_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_and_Edit_Category_GC_button(){
		Add_and_Edit_Category_GC_button.click();
}

@FindBy(how= How.ID, using = "Manage_Tags_tab")
	public static WebElement Manage_Tags_tab;

public void verify_Manage_Tags_tab(String data){
		Assert.assertEquals(Manage_Tags_tab,Manage_Tags_tab);
}

public void verify_Manage_Tags_tab_Status(String data){
		//Verifies the Status of the Manage_Tags_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Manage_Tags_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Manage_Tags_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Manage_Tags_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Manage_Tags_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Manage_Tags_tab(){
		Manage_Tags_tab.click();
}

public void onHover_Manage_Tags_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Manage_Tags_tab).perform();
}

@FindBy(how= How.ID, using = "Tags_tab")
	public static WebElement Tags_tab;

public void verify_Tags_tab(String data){
		Assert.assertEquals(Tags_tab,Tags_tab);
}

public void verify_Tags_tab_Status(String data){
		//Verifies the Status of the Tags_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tags_tab(){
		Tags_tab.click();
}

public void onHover_Tags_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Tags_tab).perform();
}

@FindBy(how= How.ID, using = "Name_manage_Tags_label")
	public static WebElement Name_manage_Tags_label;

public void verify_Name_manage_Tags_label(String data){
		Assert.assertEquals(Name_manage_Tags_label,Name_manage_Tags_label);
}

public void verify_Name_manage_Tags_label_Status(String data){
		//Verifies the Status of the Name_manage_Tags_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_manage_Tags_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_manage_Tags_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_manage_Tags_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_manage_Tags_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Created_hl_label")
	public static WebElement Created_hl_label;

public void verify_Created_hl_label(String data){
		Assert.assertEquals(Created_hl_label,Created_hl_label);
}

public void verify_Created_hl_label_Status(String data){
		//Verifies the Status of the Created_hl_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Created_hl_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Created_hl_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Created_hl_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Created_hl_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Date_Created_HL_label")
	public static WebElement Date_Created_HL_label;

public void verify_Date_Created_HL_label(String data){
		Assert.assertEquals(Date_Created_HL_label,Date_Created_HL_label);
}

public void verify_Date_Created_HL_label_Status(String data){
		//Verifies the Status of the Date_Created_HL_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_Created_HL_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_Created_HL_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_Created_HL_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_Created_HL_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Last_Updated_HL_label")
	public static WebElement Last_Updated_HL_label;

public void verify_Last_Updated_HL_label(String data){
		Assert.assertEquals(Last_Updated_HL_label,Last_Updated_HL_label);
}

public void verify_Last_Updated_HL_label_Status(String data){
		//Verifies the Status of the Last_Updated_HL_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_Updated_HL_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_Updated_HL_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_Updated_HL_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_Updated_HL_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//a[normalize-space()='dd']")
	public static WebElement TagName_hyperlink;

public void verify_TagName_hyperlink_Status(String data){
		//Verifies the Status of the TagName_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TagName_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TagName_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TagName_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TagName_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TagName_hyperlink(){
		TagName_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//input[@id='tag-name']")
	public static WebElement Name_Textbox_create_tags_textbox;

public void verify_Name_Textbox_create_tags_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Name_Textbox_create_tags_textbox.getAttribute("value"),data);
	}

}

public void verify_Name_Textbox_create_tags_textbox_Status(String data){
		//Verifies the Status of the Name_Textbox_create_tags_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_Textbox_create_tags_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_Textbox_create_tags_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_Textbox_create_tags_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_Textbox_create_tags_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Name_Textbox_create_tags_textbox(String data){
		Name_Textbox_create_tags_textbox.clear();
		Name_Textbox_create_tags_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='tag-description']")
	public static WebElement Tag_Description_textbox;

public void verify_Tag_Description_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Tag_Description_textbox.getAttribute("value"),data);
	}

}

public void verify_Tag_Description_textbox_Status(String data){
		//Verifies the Status of the Tag_Description_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_Description_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_Description_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_Description_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_Description_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Tag_Description_textbox(String data){
		Tag_Description_textbox.clear();
		Tag_Description_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@name='config_set']")
	public static WebElement Create_Tags_CT_button;

public void verify_Create_Tags_CT_button_Status(String data){
		//Verifies the Status of the Create_Tags_CT_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Create_Tags_CT_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Create_Tags_CT_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Create_Tags_CT_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Create_Tags_CT_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Create_Tags_CT_button(){
		Create_Tags_CT_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@id='project-name']")
	public static WebElement projectnameCNP_textbox;

public void verify_projectnameCNP_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(projectnameCNP_textbox.getAttribute("value"),data);
	}

}

public void verify_projectnameCNP_textbox_Status(String data){
		//Verifies the Status of the projectnameCNP_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(projectnameCNP_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(projectnameCNP_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!projectnameCNP_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!projectnameCNP_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_projectnameCNP_textbox(String data){
		projectnameCNP_textbox.clear();
		projectnameCNP_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='project-description']")
	public static WebElement Description_CNP_textbox;

public void verify_Description_CNP_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Description_CNP_textbox.getAttribute("value"),data);
	}

}

public void verify_Description_CNP_textbox_Status(String data){
		//Verifies the Status of the Description_CNP_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_CNP_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_CNP_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_CNP_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_CNP_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Description_CNP_textbox(String data){
		Description_CNP_textbox.clear();
		Description_CNP_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Add Project']")
	public static WebElement Add_project_CNP_button;

public void verify_Add_project_CNP_button_Status(String data){
		//Verifies the Status of the Add_project_CNP_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_project_CNP_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_project_CNP_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_project_CNP_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_project_CNP_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_project_CNP_button(){
		Add_project_CNP_button.click();
}

@FindBy(how= How.XPATH, using = "//select[@id='project-status']")
	public static WebElement Status_dropdown;

public void verify_Status_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Status_dropdown.getAttribute("value"),data);
	}

}

public void verify_Status_dropdown_Status(String data){
		//Verifies the Status of the Status_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Status_dropdown(String data){
		Select dropdown= new Select(Status_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='project-view-state']")
	public static WebElement ViewStatus_dropdown;

public void verify_ViewStatus_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ViewStatus_dropdown.getAttribute("value"),data);
	}

}

public void verify_ViewStatus_dropdown_Status(String data){
		//Verifies the Status of the ViewStatus_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ViewStatus_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ViewStatus_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ViewStatus_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ViewStatus_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_ViewStatus_dropdown(String data){
		Select dropdown= new Select(ViewStatus_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//span[@class='lbl']")
	public static WebElement InheritanceGlobal_Sts_checkbox;

public void verify_InheritanceGlobal_Sts_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(InheritanceGlobal_Sts_checkbox.getAttribute("value"),data);
	}

}

public void verify_InheritanceGlobal_Sts_checkbox_Status(String data){
		//Verifies the Status of the InheritanceGlobal_Sts_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(InheritanceGlobal_Sts_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(InheritanceGlobal_Sts_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!InheritanceGlobal_Sts_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!InheritanceGlobal_Sts_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_InheritanceGlobal_Sts_checkbox(String data){
		if(InheritanceGlobal_Sts_checkbox.isSelected());
			InheritanceGlobal_Sts_checkbox.click();
}

@FindBy(how= How.ID, using = "Manage_Custom_Fields_tab")
	public static WebElement Manage_Custom_Fields_tab;

public void verify_Manage_Custom_Fields_tab(String data){
		Assert.assertEquals(Manage_Custom_Fields_tab,Manage_Custom_Fields_tab);
}

public void verify_Manage_Custom_Fields_tab_Status(String data){
		//Verifies the Status of the Manage_Custom_Fields_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Manage_Custom_Fields_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Manage_Custom_Fields_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Manage_Custom_Fields_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Manage_Custom_Fields_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Manage_Custom_Fields_tab(){
		Manage_Custom_Fields_tab.click();
}

public void onHover_Manage_Custom_Fields_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Manage_Custom_Fields_tab).perform();
}

@FindBy(how= How.XPATH, using = "//div[normalize-space()='Type']")
	public static WebElement Type_hyperlink;

public void verify_Type_hyperlink_Status(String data){
		//Verifies the Status of the Type_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Type_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Type_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Type_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Type_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Type_hyperlink(){
		Type_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//div[normalize-space()='Name']")
	public static WebElement Name_hyperlink;

public void verify_Name_hyperlink_Status(String data){
		//Verifies the Status of the Name_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Name_hyperlink(){
		Name_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//div[normalize-space()='Default Value']")
	public static WebElement Default_values_hyperlink;

public void verify_Default_values_hyperlink_Status(String data){
		//Verifies the Status of the Default_values_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Default_values_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Default_values_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Default_values_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Default_values_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Default_values_hyperlink(){
		Default_values_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//div[normalize-space()='Possible Values']")
	public static WebElement Possilbe_values_hyperlink;

public void verify_Possilbe_values_hyperlink_Status(String data){
		//Verifies the Status of the Possilbe_values_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Possilbe_values_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Possilbe_values_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Possilbe_values_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Possilbe_values_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Possilbe_values_hyperlink(){
		Possilbe_values_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//div[normalize-space()='Project Count']")
	public static WebElement Project_Count_hyperlink;

public void verify_Project_Count_hyperlink_Status(String data){
		//Verifies the Status of the Project_Count_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_Count_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_Count_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_Count_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_Count_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Project_Count_hyperlink(){
		Project_Count_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//input[@name='name']")
	public static WebElement Enter_Field_textbox;

public void verify_Enter_Field_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Enter_Field_textbox.getAttribute("value"),data);
	}

}

public void verify_Enter_Field_textbox_Status(String data){
		//Verifies the Status of the Enter_Field_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Enter_Field_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Enter_Field_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Enter_Field_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Enter_Field_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Enter_Field_textbox(String data){
		Enter_Field_textbox.clear();
		Enter_Field_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='New Custom Field']")
	public static WebElement NewCustomField_button;

public void verify_NewCustomField_button_Status(String data){
		//Verifies the Status of the NewCustomField_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(NewCustomField_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(NewCustomField_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!NewCustomField_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!NewCustomField_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_NewCustomField_button(){
		NewCustomField_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@id='custom-field-name']")
	public static WebElement Name_textbox;

public void verify_Name_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Name_textbox.getAttribute("value"),data);
	}

}

public void verify_Name_textbox_Status(String data){
		//Verifies the Status of the Name_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Name_textbox(String data){
		Name_textbox.clear();
		Name_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='custom-field-type']")
	public static WebElement Type_textbox;

public void verify_Type_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Type_textbox.getAttribute("value"),data);
	}

}

public void verify_Type_textbox_Status(String data){
		//Verifies the Status of the Type_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Type_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Type_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Type_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Type_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Type_textbox(String data){
		Type_textbox.clear();
		Type_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='custom-field-possible-values']")
	public static WebElement Possible_values_textbox;

public void verify_Possible_values_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Possible_values_textbox.getAttribute("value"),data);
	}

}

public void verify_Possible_values_textbox_Status(String data){
		//Verifies the Status of the Possible_values_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Possible_values_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Possible_values_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Possible_values_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Possible_values_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Possible_values_textbox(String data){
		Possible_values_textbox.clear();
		Possible_values_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='custom-field-default-value']")
	public static WebElement Default_values_textbox;

public void verify_Default_values_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Default_values_textbox.getAttribute("value"),data);
	}

}

public void verify_Default_values_textbox_Status(String data){
		//Verifies the Status of the Default_values_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Default_values_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Default_values_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Default_values_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Default_values_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Default_values_textbox(String data){
		Default_values_textbox.clear();
		Default_values_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='custom-field-valid-regexp']")
	public static WebElement Regular_Expression_textbox;

public void verify_Regular_Expression_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Regular_Expression_textbox.getAttribute("value"),data);
	}

}

public void verify_Regular_Expression_textbox_Status(String data){
		//Verifies the Status of the Regular_Expression_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Regular_Expression_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Regular_Expression_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Regular_Expression_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Regular_Expression_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Regular_Expression_textbox(String data){
		Regular_Expression_textbox.clear();
		Regular_Expression_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='custom-field-length-max']")
	public static WebElement Max_length_textbox;

public void verify_Max_length_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Max_length_textbox.getAttribute("value"),data);
	}

}

public void verify_Max_length_textbox_Status(String data){
		//Verifies the Status of the Max_length_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Max_length_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Max_length_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Max_length_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Max_length_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Max_length_textbox(String data){
		Max_length_textbox.clear();
		Max_length_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='custom-field-length-min']")
	public static WebElement Min_length_textbox;

public void verify_Min_length_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Min_length_textbox.getAttribute("value"),data);
	}

}

public void verify_Min_length_textbox_Status(String data){
		//Verifies the Status of the Min_length_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Min_length_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Min_length_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Min_length_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Min_length_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Min_length_textbox(String data){
		Min_length_textbox.clear();
		Min_length_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='custom-field-access-level-rw']")
	public static WebElement WriteAccess_dropdown;

public void verify_WriteAccess_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(WriteAccess_dropdown.getAttribute("value"),data);
	}

}

public void verify_WriteAccess_dropdown_Status(String data){
		//Verifies the Status of the WriteAccess_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(WriteAccess_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(WriteAccess_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!WriteAccess_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!WriteAccess_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_WriteAccess_dropdown(String data){
		Select dropdown= new Select(WriteAccess_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='custom-field-access-level-r']")
	public static WebElement Readaccess_dropdown;

public void verify_Readaccess_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Readaccess_dropdown.getAttribute("value"),data);
	}

}

public void verify_Readaccess_dropdown_Status(String data){
		//Verifies the Status of the Readaccess_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Readaccess_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Readaccess_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Readaccess_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Readaccess_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Readaccess_dropdown(String data){
		Select dropdown= new Select(Readaccess_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[1]")
	public static WebElement Add_filter_checkbox;

public void verify_Add_filter_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Add_filter_checkbox.getAttribute("value"),data);
	}

}

public void verify_Add_filter_checkbox_Status(String data){
		//Verifies the Status of the Add_filter_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_filter_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_filter_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_filter_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_filter_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Add_filter_checkbox(String data){
		if(Add_filter_checkbox.isSelected());
			Add_filter_checkbox.click();
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[2]")
	public static WebElement Display_When_Reporting_Issues_checkbox;

public void verify_Display_When_Reporting_Issues_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Display_When_Reporting_Issues_checkbox.getAttribute("value"),data);
	}

}

public void verify_Display_When_Reporting_Issues_checkbox_Status(String data){
		//Verifies the Status of the Display_When_Reporting_Issues_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_When_Reporting_Issues_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_When_Reporting_Issues_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_When_Reporting_Issues_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_When_Reporting_Issues_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Display_When_Reporting_Issues_checkbox(String data){
		if(Display_When_Reporting_Issues_checkbox.isSelected());
			Display_When_Reporting_Issues_checkbox.click();
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[3]")
	public static WebElement Display_When_Updating_Issues_textbox;

public void verify_Display_When_Updating_Issues_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Display_When_Updating_Issues_textbox.getAttribute("value"),data);
	}

}

public void verify_Display_When_Updating_Issues_textbox_Status(String data){
		//Verifies the Status of the Display_When_Updating_Issues_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_When_Updating_Issues_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_When_Updating_Issues_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_When_Updating_Issues_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_When_Updating_Issues_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Display_When_Updating_Issues_textbox(String data){
		Display_When_Updating_Issues_textbox.clear();
		Display_When_Updating_Issues_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[4]")
	public static WebElement Display_When_Resolving_Issues_checkbox;

public void verify_Display_When_Resolving_Issues_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Display_When_Resolving_Issues_checkbox.getAttribute("value"),data);
	}

}

public void verify_Display_When_Resolving_Issues_checkbox_Status(String data){
		//Verifies the Status of the Display_When_Resolving_Issues_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_When_Resolving_Issues_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_When_Resolving_Issues_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_When_Resolving_Issues_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_When_Resolving_Issues_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Display_When_Resolving_Issues_checkbox(String data){
		if(Display_When_Resolving_Issues_checkbox.isSelected());
			Display_When_Resolving_Issues_checkbox.click();
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[5]")
	public static WebElement Display_When_Closing_Issues_checkbox;

public void verify_Display_When_Closing_Issues_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Display_When_Closing_Issues_checkbox.getAttribute("value"),data);
	}

}

public void verify_Display_When_Closing_Issues_checkbox_Status(String data){
		//Verifies the Status of the Display_When_Closing_Issues_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Display_When_Closing_Issues_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Display_When_Closing_Issues_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Display_When_Closing_Issues_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Display_When_Closing_Issues_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Display_When_Closing_Issues_checkbox(String data){
		if(Display_When_Closing_Issues_checkbox.isSelected());
			Display_When_Closing_Issues_checkbox.click();
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[6]")
	public static WebElement Required_On_Report_checkbox;

public void verify_Required_On_Report_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Required_On_Report_checkbox.getAttribute("value"),data);
	}

}

public void verify_Required_On_Report_checkbox_Status(String data){
		//Verifies the Status of the Required_On_Report_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Required_On_Report_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Required_On_Report_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Required_On_Report_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Required_On_Report_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Required_On_Report_checkbox(String data){
		if(Required_On_Report_checkbox.isSelected());
			Required_On_Report_checkbox.click();
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[7]")
	public static WebElement Required_On_Update_checkbox;

public void verify_Required_On_Update_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Required_On_Update_checkbox.getAttribute("value"),data);
	}

}

public void verify_Required_On_Update_checkbox_Status(String data){
		//Verifies the Status of the Required_On_Update_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Required_On_Update_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Required_On_Update_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Required_On_Update_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Required_On_Update_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Required_On_Update_checkbox(String data){
		if(Required_On_Update_checkbox.isSelected());
			Required_On_Update_checkbox.click();
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[8]")
	public static WebElement Required_On_Resolve_checkbox;

public void verify_Required_On_Resolve_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Required_On_Resolve_checkbox.getAttribute("value"),data);
	}

}

public void verify_Required_On_Resolve_checkbox_Status(String data){
		//Verifies the Status of the Required_On_Resolve_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Required_On_Resolve_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Required_On_Resolve_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Required_On_Resolve_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Required_On_Resolve_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Required_On_Resolve_checkbox(String data){
		if(Required_On_Resolve_checkbox.isSelected());
			Required_On_Resolve_checkbox.click();
}

@FindBy(how= How.XPATH, using = "(//span[@class='lbl'])[9]")
	public static WebElement Required_On_Close_checkbox;

public void verify_Required_On_Close_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Required_On_Close_checkbox.getAttribute("value"),data);
	}

}

public void verify_Required_On_Close_checkbox_Status(String data){
		//Verifies the Status of the Required_On_Close_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Required_On_Close_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Required_On_Close_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Required_On_Close_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Required_On_Close_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Required_On_Close_checkbox(String data){
		if(Required_On_Close_checkbox.isSelected());
			Required_On_Close_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Update Custom Field']")
	public static WebElement UpdateCustomField_MCF_button;

public void verify_UpdateCustomField_MCF_button_Status(String data){
		//Verifies the Status of the UpdateCustomField_MCF_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(UpdateCustomField_MCF_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(UpdateCustomField_MCF_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!UpdateCustomField_MCF_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!UpdateCustomField_MCF_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_UpdateCustomField_MCF_button(){
		UpdateCustomField_MCF_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Delete Custom Field']")
	public static WebElement Delete_Custom_Field_button;

public void verify_Delete_Custom_Field_button_Status(String data){
		//Verifies the Status of the Delete_Custom_Field_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_Custom_Field_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_Custom_Field_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_Custom_Field_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_Custom_Field_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_Custom_Field_button(){
		Delete_Custom_Field_button.click();
}

@FindBy(how= How.XPATH, using = "//a[@class='btn btn-primary btn-white btn-round btn-xs']")
	public static WebElement Remove_button;

public void verify_Remove_button_Status(String data){
		//Verifies the Status of the Remove_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Remove_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Remove_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Remove_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Remove_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Remove_button(){
		Remove_button.click();
}

@FindBy(how= How.XPATH, using = "//select[@id='custom-field-project-id']")
	public static WebElement Project_CF_listbox;

public void verify_Project_CF_listbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Project_CF_listbox.getAttribute("value"),data);
	}

}

public void verify_Project_CF_listbox_Status(String data){
		//Verifies the Status of the Project_CF_listbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_CF_listbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_CF_listbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_CF_listbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_CF_listbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Project_CF_listbox(String data){
		Select listboxObject=new Select(Project_CF_listbox);
		listboxObject.selectByValue(data);
		if(!data.isEmpty()) {
			for(String value:data.split(","))
				listboxObject.selectByValue(value);
		}
	}

@FindBy(how= How.XPATH, using = "//input[@id='custom-field-sequence']")
	public static WebElement Sequence_textbox;

public void verify_Sequence_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Sequence_textbox.getAttribute("value"),data);
	}

}

public void verify_Sequence_textbox_Status(String data){
		//Verifies the Status of the Sequence_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sequence_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sequence_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sequence_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sequence_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Sequence_textbox(String data){
		Sequence_textbox.clear();
		Sequence_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Link Custom Field']")
	public static WebElement LinkCustomField_button;

public void verify_LinkCustomField_button_Status(String data){
		//Verifies the Status of the LinkCustomField_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LinkCustomField_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LinkCustomField_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LinkCustomField_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LinkCustomField_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LinkCustomField_button(){
		LinkCustomField_button.click();
}

@FindBy(how= How.ID, using = "ManageGlobalCategories_tab")
	public static WebElement ManageGlobalCategories_tab;

public void verify_ManageGlobalCategories_tab(String data){
		Assert.assertEquals(ManageGlobalCategories_tab,ManageGlobalCategories_tab);
}

public void verify_ManageGlobalCategories_tab_Status(String data){
		//Verifies the Status of the ManageGlobalCategories_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageGlobalCategories_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageGlobalCategories_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageGlobalCategories_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageGlobalCategories_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageGlobalCategories_tab(){
		ManageGlobalCategories_tab.click();
}

public void onHover_ManageGlobalCategories_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(ManageGlobalCategories_tab).perform();
}

@FindBy(how= How.ID, using = "Profile_MGC_tab")
	public static WebElement Profile_MGC_tab;

public void verify_Profile_MGC_tab(String data){
		Assert.assertEquals(Profile_MGC_tab,Profile_MGC_tab);
}

public void verify_Profile_MGC_tab_Status(String data){
		//Verifies the Status of the Profile_MGC_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Profile_MGC_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Profile_MGC_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Profile_MGC_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Profile_MGC_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Profile_MGC_tab(){
		Profile_MGC_tab.click();
}

public void onHover_Profile_MGC_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Profile_MGC_tab).perform();
}

@FindBy(how= How.XPATH, using = "")
	public static WebElement Platform_p_label;

public void verify_Platform_p_label(String data){
		Assert.assertEquals(Platform_p_label,Platform_p_label);
}

public void verify_Platform_p_label_Status(String data){
		//Verifies the Status of the Platform_p_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_p_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_p_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_p_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_p_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "")
	public static WebElement os_p_label;

public void verify_os_p_label(String data){
		Assert.assertEquals(os_p_label,os_p_label);
}

public void verify_os_p_label_Status(String data){
		//Verifies the Status of the os_p_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(os_p_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(os_p_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!os_p_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!os_p_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "")
	public static WebElement Os_version_P_label;

public void verify_Os_version_P_label(String data){
		Assert.assertEquals(Os_version_P_label,Os_version_P_label);
}

public void verify_Os_version_P_label_Status(String data){
		//Verifies the Status of the Os_version_P_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Os_version_P_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Os_version_P_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Os_version_P_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Os_version_P_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "")
	public static WebElement Actions_P_label;

public void verify_Actions_P_label(String data){
		Assert.assertEquals(Actions_P_label,Actions_P_label);
}

public void verify_Actions_P_label_Status(String data){
		//Verifies the Status of the Actions_P_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Actions_P_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Actions_P_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Actions_P_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Actions_P_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//button[normalize-space()='Edit']")
	public static WebElement Edit_P_button;

public void verify_Edit_P_button_Status(String data){
		//Verifies the Status of the Edit_P_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit_P_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit_P_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit_P_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit_P_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Edit_P_button(){
		Edit_P_button.click();
}

@FindBy(how= How.XPATH, using = "//button[normalize-space()='Delete']")
	public static WebElement Delete_P_button;

public void verify_Delete_P_button_Status(String data){
		//Verifies the Status of the Delete_P_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_P_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_P_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_P_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_P_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_P_button(){
		Delete_P_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@id='platform']")
	public static WebElement Platform_AP_textbox;

public void verify_Platform_AP_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Platform_AP_textbox.getAttribute("value"),data);
	}

}

public void verify_Platform_AP_textbox_Status(String data){
		//Verifies the Status of the Platform_AP_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_AP_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_AP_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_AP_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_AP_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Platform_AP_textbox(String data){
		Platform_AP_textbox.clear();
		Platform_AP_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='os']")
	public static WebElement Os_AP_textbox;

public void verify_Os_AP_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Os_AP_textbox.getAttribute("value"),data);
	}

}

public void verify_Os_AP_textbox_Status(String data){
		//Verifies the Status of the Os_AP_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Os_AP_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Os_AP_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Os_AP_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Os_AP_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Os_AP_textbox(String data){
		Os_AP_textbox.clear();
		Os_AP_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='os_build']")
	public static WebElement Os_version_AP_textbox;

public void verify_Os_version_AP_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Os_version_AP_textbox.getAttribute("value"),data);
	}

}

public void verify_Os_version_AP_textbox_Status(String data){
		//Verifies the Status of the Os_version_AP_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Os_version_AP_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Os_version_AP_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Os_version_AP_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Os_version_AP_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Os_version_AP_textbox(String data){
		Os_version_AP_textbox.clear();
		Os_version_AP_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='description']")
	public static WebElement System_Description_AP_textbox;

public void verify_System_Description_AP_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(System_Description_AP_textbox.getAttribute("value"),data);
	}

}

public void verify_System_Description_AP_textbox_Status(String data){
		//Verifies the Status of the System_Description_AP_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(System_Description_AP_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(System_Description_AP_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!System_Description_AP_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!System_Description_AP_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_System_Description_AP_textbox(String data){
		System_Description_AP_textbox.clear();
		System_Description_AP_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//button[@class='btn btn-primary btn-white btn-round']")
	public static WebElement Addprofile_AP_button;

public void verify_Addprofile_AP_button_Status(String data){
		//Verifies the Status of the Addprofile_AP_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Addprofile_AP_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Addprofile_AP_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Addprofile_AP_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Addprofile_AP_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Addprofile_AP_button(){
		Addprofile_AP_button.click();
}

@FindBy(how= How.ID, using = "update_and_Del_Tags_button")
	public static WebElement update_and_Del_Tags_button;

public void verify_update_and_Del_Tags_button_Status(String data){
		//Verifies the Status of the update_and_Del_Tags_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(update_and_Del_Tags_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(update_and_Del_Tags_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!update_and_Del_Tags_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!update_and_Del_Tags_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_update_and_Del_Tags_button(){
		update_and_Del_Tags_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Update Tag']")
	public static WebElement UpdateTag_button;

public void verify_UpdateTag_button_Status(String data){
		//Verifies the Status of the UpdateTag_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(UpdateTag_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(UpdateTag_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!UpdateTag_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!UpdateTag_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_UpdateTag_button(){
		UpdateTag_button.click();
}

@FindBy(how= How.XPATH, using = "//a[@class='btn btn-primary btn-white btn-round btn-sm pull-right']")
	public static WebElement AttachedIssues_button;

public void verify_AttachedIssues_button_Status(String data){
		//Verifies the Status of the AttachedIssues_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AttachedIssues_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AttachedIssues_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AttachedIssues_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AttachedIssues_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AttachedIssues_button(){
		AttachedIssues_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Delete Tag']")
	public static WebElement DeleteTag_button;

public void verify_DeleteTag_button_Status(String data){
		//Verifies the Status of the DeleteTag_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(DeleteTag_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(DeleteTag_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!DeleteTag_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!DeleteTag_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_DeleteTag_button(){
		DeleteTag_button.click();
}

@FindBy(how= How.ID, using = "TagId_UT_textbox")
	public static WebElement TagId_UT_textbox;

public void verify_TagId_UT_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TagId_UT_textbox.getAttribute("value"),data);
	}

}

public void verify_TagId_UT_textbox_Status(String data){
		//Verifies the Status of the TagId_UT_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TagId_UT_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TagId_UT_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TagId_UT_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TagId_UT_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TagId_UT_textbox(String data){
		TagId_UT_textbox.clear();
		TagId_UT_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@id='tag-name']")
	public static WebElement Name_UT_textbox;

public void verify_Name_UT_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Name_UT_textbox.getAttribute("value"),data);
	}

}

public void verify_Name_UT_textbox_Status(String data){
		//Verifies the Status of the Name_UT_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_UT_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_UT_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_UT_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_UT_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Name_UT_textbox(String data){
		Name_UT_textbox.clear();
		Name_UT_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='tag-user-id']")
	public static WebElement Creator_UT_dt_dropdown;

public void verify_Creator_UT_dt_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Creator_UT_dt_dropdown.getAttribute("value"),data);
	}

}

public void verify_Creator_UT_dt_dropdown_Status(String data){
		//Verifies the Status of the Creator_UT_dt_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Creator_UT_dt_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Creator_UT_dt_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Creator_UT_dt_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Creator_UT_dt_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Creator_UT_dt_dropdown(String data){
		Select dropdown= new Select(Creator_UT_dt_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//textarea[@id='tag-description']")
	public static WebElement Tag_description_textbox;

public void verify_Tag_description_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Tag_description_textbox.getAttribute("value"),data);
	}

}

public void verify_Tag_description_textbox_Status(String data){
		//Verifies the Status of the Tag_description_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_description_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_description_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_description_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_description_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Tag_description_textbox(String data){
		Tag_description_textbox.clear();
		Tag_description_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//div[@class='main-content']//div[3]")
	public static WebElement updateTag_btn_button;

public void verify_updateTag_btn_button_Status(String data){
		//Verifies the Status of the updateTag_btn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(updateTag_btn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(updateTag_btn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!updateTag_btn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!updateTag_btn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_updateTag_btn_button(){
		updateTag_btn_button.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Delete Tag'")
	public static WebElement DeleteTags_UT_button;

public void verify_DeleteTags_UT_button_Status(String data){
		//Verifies the Status of the DeleteTags_UT_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(DeleteTags_UT_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(DeleteTags_UT_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!DeleteTags_UT_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!DeleteTags_UT_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_DeleteTags_UT_button(){
		DeleteTags_UT_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
}