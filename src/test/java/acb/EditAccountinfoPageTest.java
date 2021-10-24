package acb;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import com.CMP.qa.base.TestBase;
//import com.CMP.qa.pages.EditAccountinfoPage;
//import com.CMP.qa.pages.HomePage;
//import com.CMP.qa.pages.LoginPage;
//
//
////@Listeners(listeners.Listeners.class)
public class EditAccountinfoPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	EditAccountinfoPage editAccountinfoPage;

	public EditAccountinfoPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		editAccountinfoPage = new EditAccountinfoPage();

	}

	public void initialization() {
		// TODO Auto-generated method stub
		
	}

	@Test(priority = 1)
	public void AccountInformEditTest() {
//		Object prop;
//		//loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		//homePage.clickonEditaccinfoLink();
//		/editAccountinfoPage.AccountInformEdit(prop.getProperty("FirstName"), prop.getProperty("LastName"),
//				prop.getProperty("E-Mail"), prop.getProperty("Telephone"));
//		String ExpText="Success: Your account has been successfully updated.";
//        Assert.assertEquals( "Success: Your account has been successfully updated.", ExpText);
//	

	}

}
