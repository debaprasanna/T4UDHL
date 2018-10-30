package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BaseTest;

public class TripSolutionPage 
{
	WebDriver driver;
	@FindBy(xpath="//a[  text()='Actions'] ")
	private WebElement act;
	@FindBy(linkText="Trip Solution")
	private WebElement tripsolution;
	@FindBy(xpath="//input[@id='inputdateInput1']")
	private WebElement strtdate;
	@FindBy(xpath="//input[@id='inputdateInput2']")
	private WebElement enddate;
	@FindBy(xpath="//button[@id='viewId']")
	private WebElement viewbtttn;
	
	public TripSolutionPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clicktrpsolution() 
	{
		tripsolution.click();
		
	
	}
	
	public void setstartdate()
	{ 
		//driver.navigate().refresh();
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(strtdate));
		
		strtdate.sendKeys(Keys.HOME);	

		strtdate.sendKeys("2102018");
		strtdate.sendKeys(Keys.TAB);
		
		
	}

	public void settenddate() 
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(enddate));
		enddate.sendKeys(Keys.HOME);
		enddate.sendKeys("24102018");
		
	}
	public void clickview() 
	{
		viewbtttn.click();
	}
	}
	
	


