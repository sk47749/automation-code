package zohoTest;
import org.testng.annotations.Test;
import Zoho.LeadCreatePage;
import Zoho.ZohoWebtesting;

public class LeadCreateTest extends ZohoWebtesting {
	LeadCreatePage ob;
	
	@Test (priority = 1)

	public void createNewLead()
	{
	ob.createNewLead();
}
}
