package Zoho;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ZohoWebtesting{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}	
	
	public void getTitle() {
		String titel=driver.getTitle();
		System.out.println("titel is:-"+titel);
	}
	
	@FindBy(xpath = "//a[@class='zgh-login']")
	private WebElement signIn;
	
	@FindBy(xpath = "//button[@id='nextbtn']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//span[text()='Sign in']/ancestor::button[@class='btn blue']")
	private WebElement signInCrmPortal;
	
	@FindBy(xpath = "//button[@class='remind_me_later link-btn'])[1]")
	private WebElement skipForNow;
	
	@FindBy(xpath = "//a[@id='Visible_Leads']")
	private WebElement leadName;
	
	@FindBy(xpath = "//button[text()='Create Lead']")
	private WebElement createLeadButton;
	
	@FindBy(xpath = "(//lyte-icon[@class='dropdown'])[2]")
	private WebElement clickNoneOption;
	
	@FindBy(xpath = "//lyte-drop-body[@id='Salutation']/lyte-drop-item[text()='Mr.']")
	private List<WebElement> firstSirName;
	
	@FindBy(xpath = "//lyte-yield[text()='Edit']")
	private WebElement clickLeadEdit;
	
	@FindBy(xpath = "//lyte-drop-body[contains(@role,'listbox')]/lyte-drop-item[text()='Advertisement']")
	private List<WebElement> leadSource;
	
	@FindBy(xpath = "(//lyte-icon[@class='dropdown'])[3]")
	private WebElement leadSourceNoneOptionClick;
	
	@FindBy(xpath = "//lyte-drop-body[contains(@role,'listbox')]/lyte-drop-item[text()='Attempted to Contact']")
	private List<WebElement> leadStatus;
	
	@FindBy(xpath = "(//lyte-icon[@class='dropdown'])[5]")
	private WebElement leadStatusNoneOptionClick;
	
	@FindBy(xpath = "(//lyte-icon[@class='dropdown'])[4]")
	private WebElement leadIndustryNonOption;
	
	@FindBy(xpath = "//lyte-drop-body[contains(@role,'listbox')]/lyte-drop-item[text()='ASP (Application Service Provider)']")
	private List<WebElement> leadIndustry;
	
	@FindBy(xpath = "//button[@type='button']/descendant::lyte-yield[text()='Save']")
	private WebElement saveLead;
	
	@FindBy(xpath = "//lyte-checkbox[@id='field_City']//span[@class='lyteCheckBoxDefault']")
	private WebElement cityCheckbox;
	
	@FindBy(xpath = "//lyte-yield[text()='Apply Filter']")
	private WebElement clickAplyFilterLead;
	
	@FindBy(xpath = "//lyte-menu-body[@id='quickActionsOptionsList']/lyte-menu-item[text()='Delete']")
	private List<WebElement> deleteLead;
	
	@FindBy(xpath = "//button[@type='button']/lyte-yield[text()='Delete']")
	private WebElement deleteComfirmationButton;
	
	@FindBy(xpath = "(//lyte-icon[@class='dropdown'])[6]")
	private WebElement ratingNonOptionClick;
	
	@FindBy(xpath = "//lyte-drop-body[@role='listbox']/lyte-drop-item[text()='Active']")
	private List<WebElement> activeRating;
	
	@FindBy(xpath = "//span[@class='lyteCheckBoxDefault']")
	private WebElement emailOptOutClickCheckbox;
		
	public void clickSignIn() throws InterruptedException {
		signIn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("shahrukhh@gmail.com");
		nextButton.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shahrukh1#");
		signInCrmPortal.click();
		Thread.sleep(5000);
		skipForNow.click();
		Thread.sleep(5000);	
		
}
	public void createNewLead() throws InterruptedException {
		try {
		Thread.sleep(2000);
		leadName.click();					
		Thread.sleep(2000);
		createLeadButton.click();
		Thread.sleep(5000);
		clickNoneOption.click();
		Thread.sleep(2000);
		for(WebElement element:firstSirName) {
			Thread.sleep(1000);
			if(element.getText().equalsIgnoreCase("Mr."));
			Thread.sleep(1000);
			element.click();
			
}
		driver.findElement(By.xpath("//input[@id='Crm_Leads_FIRSTNAME_LInput']")).sendKeys("Shahrukh");
		 driver.findElement(By.xpath("(//div[@class='custabDivCreate textFld ']/descendant::div/input[@id='inputId'])[1]")).sendKeys("Zoho.com");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_LASTNAME_LInput']")).sendKeys("Khan");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_DESIGNATION_LInput']")).sendKeys("QA Engineer");
		driver.findElement(By.xpath("//input[@id= 'Crm_Leads_EMAIL_LInput']")).sendKeys("shahrukhrwwj@gmail.com");
		driver.findElement(By.xpath("//input[@id= 'Crm_Leads_PHONE_LInput']")).sendKeys("9720422617");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//input[@id= 'Crm_Leads_PHONE_LInput']")));
		driver.findElement(By.xpath("//input[@id='Crm_Leads_MOBILE_LInput']")).sendKeys("+91-9720422617");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_FAX_LInput']")).sendKeys("shahrukhkhan123");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_WEBSITE_LInput']")).sendKeys("https://www.zoho.com/crm/");
		Thread.sleep(5000); 
		leadSourceNoneOptionClick.click();
		Thread.sleep(2000);
		for(WebElement leadSourceElement:leadSource) {
			Thread.sleep(1000);
			if(leadSourceElement.getText().equalsIgnoreCase("Advertisement"));
			Thread.sleep(1000);
			leadSourceElement.click();							
}	
		leadStatusNoneOptionClick.click();
		Thread.sleep(2000);
		for(WebElement leadStatusElement:leadStatus) {
			Thread.sleep(1000);
			if(leadStatusElement.getText().equalsIgnoreCase("Attempted to Contact"));
			Thread.sleep(1000);
			leadStatusElement.click();

}
		leadIndustryNonOption.click();
		Thread.sleep(2000);
		for(WebElement leadindustryElement:leadIndustry) {
			Thread.sleep(1000);
			if(leadindustryElement.getText().equalsIgnoreCase("ASP (Application Service Provider)"));
			Thread.sleep(2000);
			leadindustryElement.click();
}
		driver.findElement(By.xpath("//input[@id='Crm_Leads_EMPCT_LInput']")).sendKeys("200");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_ANNUALREVENUE_LInput']")).sendKeys("100000");		
		ratingNonOptionClick.click();
		Thread.sleep(1000);
		for(WebElement ratingElement:activeRating) {
			Thread.sleep(1000);
			if(ratingElement.getText().equalsIgnoreCase("Active"));
			Thread.sleep(2000);
			ratingElement.click();
				
		driver.findElement(By.xpath("//input[@id='Crm_Leads_SKYPEIDENTITY_LInput']")).sendKeys("shahrukhrwwj@gmail.com");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_ADDN_EMAIL_LInput']")).sendKeys("shahrukhrwwj@gmail.com");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_TWITTER_LInput']")).sendKeys("shahrukhkhan");
		emailOptOutClickCheckbox.click();
		Thread.sleep(5000);	
		WebElement elementscroll = driver.findElement(By.xpath("//input[@id='Crm_Leads_LANE_LInput']"));
		js.executeScript("arguments[0].scrollIntoView();", elementscroll);
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//input[@id='Crm_Leads_LANE_LInput']")).sendKeys("Dankaur");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_CITY_LInput']")).sendKeys("Dankaur");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_STATE_LInput']")).sendKeys("Uttar Pradesh");
		driver.findElement(By.xpath("//input[@id='Crm_Leads_CODE_LInput']")).sendKeys("203201");
		driver.findElement(By.xpath("(//input[@id='inputId'])[3]")).sendKeys("India");
		driver.findElement(By.xpath("(//input[@id='inputId'])[3]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//textarea[@autocomplete='off']")).sendKeys("This is my Zoho account for testing");
		Thread.sleep(5000);
		saveLead.click();
		Thread.sleep(2000);		
		}
		}
		catch(Exception e) {
			
	}
}
	public void editLeadName() throws InterruptedException {
	Thread.sleep(3000);
	clickLeadEdit.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='Crm_Leads_LASTNAME_LInput']")).clear();
	driver.findElement(By.xpath("//input[@id='Crm_Leads_LASTNAME_LInput']")).sendKeys("Khan change to Saifi");
	Thread.sleep(2000);
	saveLead.click();
	driver.navigate().back();
	Thread.sleep(5000);
}
	public void scrollTheFilterByFields() throws InterruptedException {
		WebElement filterLead = driver.findElement(By.xpath("//lyte-accordion-header[text()='Filter By Fields']"));
		js.executeScript("arguments[0].scrollIntoView();", filterLead);
		Thread.sleep(5000);
		cityCheckbox.click();
		driver.findElement(By.xpath("//input[@class='cxBorderBottom ']")).sendKeys("Dankaur");
		clickAplyFilterLead.click();
		Thread.sleep(2000);
}	
	public void deleteLeadWhichIsCreated() throws InterruptedException {
		Actions act=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//crmutil-icon[@class='moreOptionSvg']"));
		act.moveToElement(move).click().perform();
		Thread.sleep(2000);
		for(WebElement leadDlete:deleteLead) {
			Thread.sleep(1000);
			if(leadDlete.getText().equalsIgnoreCase("Delete"));
			Thread.sleep(1000);
			leadDlete.click();
			Thread.sleep(1000);
			deleteComfirmationButton.click();				
	}			
  }
}
