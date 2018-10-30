package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage
{
	WebDriver driver;
	@FindBy(xpath="//img[@src='/ApplicationImages/user.png']")
	private WebElement mhover;
	@FindBy(xpath="//ul[@id='rightNav']/li/div/a[5]")
	private WebElement lgout;
	

	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clicklogout() 
	{
	     mhover.click();
		Actions action=new Actions(driver);
		action.moveToElement(mhover).
		moveToElement(lgout).
		click().perform();
	}
	
		
	

}
