package zohoTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Zoho.LoginPage;
import Zoho.ZohoWebtesting;

public class LoginTest extends ZohoWebtesting {
	LoginPage ob;

	@BeforeTest
	public void getlaunchurl() {
		urllaunch("https://www.zoho.com/crm/");
		ob = new LoginPage();
	}

	@Test(priority = 1)

	public void gettitle() {
		ob.getTitle();
	}

	@Test(priority = 2)
	public void signInZohoPortal() throws InterruptedException {
		ob.clickSignIn();
	}
//	@Test (priority=3)
//	public void leadCreateNew() throws InterruptedException {
//		ob.createNewLead();
//	}
//	@Test(priority=4)
//	public void clickOnFirstLead() throws InterruptedException {
//		ob.editLeadName();
//	}
//	@Test(priority=5)
//	public void leadFilter() throws InterruptedException {
//		ob.scrollTheFilterByFields();
//	}
//	@Test(priority=6)
//	public void deleteLeadPermanant() throws InterruptedException {
//		ob.deleteLeadWhichIsCreated();
//	}
}
