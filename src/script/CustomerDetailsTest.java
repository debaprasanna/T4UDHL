package script;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.BaseTest;
import junit.framework.Assert;
import page.ActionPage;
import page.CustomerDetailsPage;

public class CustomerDetailsTest extends BaseTest
{
	@Test(priority=1)
	public void actiontest()
	{
		logger = extent.startTest("click action");
		ValidLogin v=new ValidLogin();
		v.testValidLogin();
		v.testlunch();
	ActionPage a=new ActionPage(BaseTest.driver);
		a.clickaction();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
	
	@Test(priority=2)
	public void customerdetailstest()
	{
	  logger = extent.startTest("createtrip");
		CustomerDetailsPage   c1=new CustomerDetailsPage(BaseTest.driver);
		c1.clickcustomerDetails();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
	}
	@Test(priority=3)
	public void validatecustomerdetailspage()
	{
		String etitle="Home Screen";
		
		String atitel=driver.getTitle();
		System.out.println(atitel);
		Assert.assertEquals(etitle, atitel);
	}
	
	
	@Test(priority=4)
	public void selectcustnametest()
	{
	  logger = extent.startTest("createtrip");
		CustomerDetailsPage   c2=new CustomerDetailsPage(BaseTest.driver);
		c2.selectcustomername();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
	}
	@Test(priority=5)
	public void addcustnamebtntest()
	{
	  logger = extent.startTest("createtrip");
		CustomerDetailsPage   c3=new CustomerDetailsPage(BaseTest.driver);
		c3.clickaddcustomer1btn();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
	}
	@Test(priority=6)
	public void setcustnameest()
	{
	  logger = extent.startTest("createtrip");
		CustomerDetailsPage   c4=new CustomerDetailsPage(BaseTest.driver);
		c4.addcustomerdetails();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
		
		}
	@Test(priority=7)
	public void viewdetailstest() throws InterruptedException
	{
		logger = extent.startTest("createtrip");
		CustomerDetailsPage   c5=new CustomerDetailsPage(BaseTest.driver);
		Thread.sleep(5000);
		c5.viewdetails();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
	}
	@Test(priority=8)
	public void xlbtntest() 
	{
		logger = extent.startTest("createtrip");
		CustomerDetailsPage   c6=new CustomerDetailsPage(BaseTest.driver);
		c6.clickxl();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
	}
	@Test(priority=9)
	public void rowtest() 
	{
		logger = extent.startTest("createtrip");
		CustomerDetailsPage   c7=new CustomerDetailsPage(BaseTest.driver);
		c7.rowcount();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
	}

}
