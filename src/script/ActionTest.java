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
		logger = extent.startTest("passTest");
		ValidLogin v=new ValidLogin();
		v.testValidLogin();
		v.testlunch();
	ActionPage a=new ActionPage(BaseTest.driver);
		a.clickaction();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
		
	@Test(priority=2)
		public void qtplanningtest()
		{
		  logger = extent.startTest("passTest");
			ActionPage a1=new ActionPage(BaseTest.driver);
			a1.clickquicktp();
			logger.log(LogStatus.PASS, "Test Case Passed is passTest");
			
		}
	
   @Test(priority=3)
	public void customertypetest()
	{
	   logger = extent.startTest("passTest");
		ActionPage a2=new ActionPage(BaseTest.driver);
		a2.selectcustomertype();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		
	}
   @Test(priority=4)
  	public void customernametest()
  	{
  		ActionPage a3=new ActionPage(BaseTest.driver);
  		a3.selectcustomername();
  	
  	}
   @Test(priority=5)
 	public void existingusernametest()
 	{
 		ActionPage a4=new ActionPage(BaseTest.driver);
 		a4.existinguser();
 	}
   @Test(priority=6)
	public void addsourcetest()
	{
		ActionPage a5=new ActionPage(BaseTest.driver);
		a5.selectsource();
	}
   @Test(priority=7)
	public void sourcetest()
	{
		ActionPage a6=new ActionPage(BaseTest.driver);
		a6.selectmainsource();
	}
   @Test(priority=8)
	public void adddesttest()
	{
		ActionPage a7=new ActionPage(BaseTest.driver);
		a7.selectdest();;
	}
   @Test(priority=9)
	public void desttest()
	{
		ActionPage a8=new ActionPage(BaseTest.driver);
		a8.selectmaindest();
	}
   @Test(priority=10)
	public void addwaypointtest()
	{
		ActionPage a9=new ActionPage(BaseTest.driver);
		a9.selectwaypoint();
	}
   @Test(priority=11)
   public void waypointtest()
	{
		ActionPage a10=new ActionPage(BaseTest.driver);
		a10.mainwaypoint();
	}
   @Test(priority=12)
   public void timearoundtest()
	{
		ActionPage a11=new ActionPage(BaseTest.driver);
		a11.timearound();
	}
   @Test(priority=13)
   public void routekeytest()
	{
		ActionPage a12=new ActionPage(BaseTest.driver);
		a12.setroutekeys();
		
	}
   @Test(priority=14)
   public void routeidtest()
	{
		ActionPage a13=new ActionPage(BaseTest.driver);
		a13.setrouteid();
	}
   @Test(priority=15)
   public void savebuttontest()
	{
		ActionPage a14=new ActionPage(BaseTest.driver);
		a14.clicksavebutton();
	}
   @Test(priority=16)
   public void vechilenotest()
	{
		ActionPage a15=new ActionPage(BaseTest.driver);
		a15.clickvechileno();
	}
   
   
 	
 	
 	}
		
		


