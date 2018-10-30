package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test(priority=6)
    public void testValidLogin() {
	String un=XL.getCellValue(XL_PATH,"Sheet1",2,0);
	String pw=XL.getCellValue(XL_PATH,"Sheet1",2,1);
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
	

}
