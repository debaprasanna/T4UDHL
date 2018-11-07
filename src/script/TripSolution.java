package script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.ActionPage;
import page.TripSolutionPage;
@Listeners(utility.Listener.class)	

public class TripSolution extends BaseTest
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
		
	}
	@Test(priority=2)
	public void tripsolutiontest()
	{
		TripSolutionPage t2=new TripSolutionPage(BaseTest.driver);
		t2.clicktrpsolution();
		
	}
	@Test(priority=3)
	public void setstrtdatetest()
	{
		TripSolutionPage t2=new TripSolutionPage(BaseTest.driver);
		t2.setstartdate();
		//t2.settenddate();
	}
	@Test(priority=4)
	public void viewbtntest()
	{
		TripSolutionPage t4=new TripSolutionPage(BaseTest.driver);
		t4.clickview();
		
	}
	@Test(priority=5)
	public void exclbtntest()
	{
		TripSolutionPage t5=new TripSolutionPage(BaseTest.driver);
		t5.exporttoexcel();
		
	}
}
