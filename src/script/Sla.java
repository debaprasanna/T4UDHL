package script;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.DashboardPage;

public class Sla extends BaseTest
{
	
	
	
	@Test(priority=7)
	public void dashboardtest()
	{
		ValidLogin v=new ValidLogin();
		v.testValidLogin();
		v.testlunch();
		DashboardPage d2=new DashboardPage(BaseTest.driver);
		
		d2.clickmsh();
	}
	@Test(priority=8,dependsOnMethods= {"dashboardtest"})
	public void list()
	{
		DashboardPage d1=new DashboardPage(BaseTest.driver);
		d1.getlist();

	}
	@Test(priority=9,dependsOnMethods= {"dashboardtest"})
	public void prntlist()
	{
		
		DashboardPage d3=new DashboardPage(BaseTest.driver);
		d3.printlinks();
	}
	
	
	
	@Test(priority=10,dependsOnMethods= {"dashboardtest"})
	public void delayvalue()
	{
		DashboardPage d=new DashboardPage(BaseTest.driver);
		d.getdelay();
	}
	
	

}
