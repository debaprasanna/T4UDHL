package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class LunchDhlPage 
{
	WebDriver driver;
	
	
	@FindBy(xpath="\r\n" + 
			"html[@class='no-js']/body/div/div[4]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td[5]/div")
	private WebElement lunch;

	public LunchDhlPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clicklunch()
	{
		driver.switchTo().frame(0);
		lunch.click();
	}

}
