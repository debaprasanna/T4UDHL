package script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.BaseTest;
import page.ActionPage;
import page.DashboardPage;
 
@Listeners(utility.Listener.class)	
public class ActionTest  extends BaseTest
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
		public void clickcustdetailstest()
		{
		  logger = extent.startTest("createtrip");
			ActionPage a1=new ActionPage(BaseTest.driver);
			a1.clickquicktp();
			logger.log(LogStatus.PASS, "Test Case Passed is passTest");
			
		}
	
   @Test(priority=3)
	public void customertypetest()
	{
	   logger = extent.startTest("typeofcustomer");
		ActionPage a2=new ActionPage(BaseTest.driver);
		a2.selectcustomertype();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
	}
   @Test(priority=4)
  	public void customernametest()
  	{
	   logger = extent.startTest("nameofcustomer");
  		ActionPage a3=new ActionPage(BaseTest.driver);
  		a3.selectcustomername();
  		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
  	
  	}
   @Test(priority=5)
 	public void existingusernametest()
 	{
	   logger = extent.startTest("username");
 		ActionPage a4=new ActionPage(BaseTest.driver);
 		a4.existinguser();
 		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
 	}
   @Test(priority=6)
	public void addsourcetest()
	{
	   logger = extent.startTest("addsource");
		ActionPage a5=new ActionPage(BaseTest.driver);
		a5.selectsource();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=7)
	public void sourcetest()
	{
	   logger = extent.startTest("source");
		ActionPage a6=new ActionPage(BaseTest.driver);
		a6.selectmainsource();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=8)
	public void adddesttest()
	{
	   logger = extent.startTest("add dest");
		ActionPage a7=new ActionPage(BaseTest.driver);
		a7.selectdest();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=9)
	public void desttest()
	{
	   logger = extent.startTest("dest");
		ActionPage a8=new ActionPage(BaseTest.driver);
		a8.selectmaindest();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=10)
	public void addwaypointtest()
	{
	   logger = extent.startTest("addwaypoint");
		ActionPage a9=new ActionPage(BaseTest.driver);
		a9.selectwaypoint();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=11)
   public void waypointtest()
	{
	   logger = extent.startTest("waypoint");
		ActionPage a10=new ActionPage(BaseTest.driver);
		a10.mainwaypoint();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=12)
   public void timearoundtest()
	{
	   logger = extent.startTest("timearound");
		ActionPage a11=new ActionPage(BaseTest.driver);
		a11.timearound();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=13)
   public void routekeytest()
	{
	   logger = extent.startTest("routekey");
		ActionPage a12=new ActionPage(BaseTest.driver);
		a12.setroutekeys();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=14)
   public void routeidtest()
	{
	   logger = extent.startTest("routedest");
		ActionPage a13=new ActionPage(BaseTest.driver);
		a13.setrouteid();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=15)
   public void savebuttontest()
	{
	   logger = extent.startTest("savebutton");
		ActionPage a14=new ActionPage(BaseTest.driver);
		a14.clicksavebutton();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   @Test(priority=16)
   public void vechilenotest()
	{
	   logger = extent.startTest("vechileno");
		ActionPage a15=new ActionPage(BaseTest.driver);
		a15.clickvechileno();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
   
   
 	
 	
 	}
		
		


