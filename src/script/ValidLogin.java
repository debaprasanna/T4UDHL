package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



import generic.BaseTest;
import generic.XL;
import page.LoginPage;
import page.LogoutPage;
import page.LunchDhlPage;

public class ValidLogin extends BaseTest
{
	@Test(priority=0)
	 public void testValidpage()
	 {
		

		String etitel=  "DHL SmarTrucking Tracking";
		String atitel=driver.getTitle();
		System.out.println(atitel);
		Assert.assertEquals(etitel,atitel );
		
				      
	 }

	@Test(priority=1)
	 public void testValidurl()
	 {
		String eurl="http://104.211.178.63/jsps/login_jsps/Default_Login/login.jsp?channel=true&urlContent=start";
		String aurl=driver.getCurrentUrl();
		Assert.assertEquals(eurl,aurl );
	 }
	
	
	
	@Test(priority=2)
    public void testValidLogin() {
	String un=XL.getCellValue(XL_PATH,"Sheet1",1,0);
	String pw=XL.getCellValue(XL_PATH,"Sheet1",1,1);
	//String eTitle=XL.getCellValue(XL_PATH,"ValidLogin",1,2);
	//Enter Valid User Name
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//Enter Valid Password
	l.setPassword(pw);
	//Click Login
	l.clickLogin();
	//Verify Home Page is Displayed
	l.verifyErrMsgIsDisplayed(driver);
	}
	
	@Test(priority=4,dependsOnMethods= {"testValidLogin"})
	public void testlunch()
	{
		LunchDhlPage l=new LunchDhlPage(driver);
		l.clicklunch();
	}
	@Test(priority=5,dependsOnMethods= {"testValidLogin","testlunch"})
	public void logout()
	{
		LogoutPage l=new LogoutPage(driver);
		l.clicklogout();
		
	}
	
	
	
	
	


}




