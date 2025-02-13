package Zoho;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ZohoWebtesting {

	public static WebDriver driver;
	
	
	public void urllaunch(String url) {

		
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Eclipse\\zohoAutomation\\webdriver 111\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
	    driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(url);
	
	}

}