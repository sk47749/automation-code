package Zoho;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadCreatePage extends ZohoWebtesting {
	public LeadCreatePage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[text()='Leads'])[1]")
	private WebElement leadName;
	
	public void createNewLead() {
		leadName.click();
	}
}
