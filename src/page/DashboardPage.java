package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class DashboardPage 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"menuJson\"]/li[1]/a")
	private WebElement msh;
	@FindBy(xpath="//*[@id=\"menuJson\"]/li[1]/div/a[1]")
	private WebElement sla;
	@FindBy(xpath="//p[.='Delayed']")
	private WebElement delay;
	@FindBy(xpath="/html/body/div[2]/div[3]/ul/li[2]/a")
	private WebElement listview;
	@FindBy(tagName="a")
	private List<WebElement> links;
	
	
	
	public DashboardPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickmsh() 
	{
		msh.click();
		 
			Actions action=new Actions(BaseTest.driver);
			//action.moveToElement(msh).
			action.moveToElement(sla).
			click().perform();
		
	}
	public void getlist() 
	{
		listview.click();
		
	  
	}
	public void printlinks()
	{
		//System.out.println(links.size());
		for(WebElement link:links)
			
		System.out.println(link.getText());
	}
	public void getdelay() 
	{
		System.out.println(delay.getAttribute("value"));
	}
	
}
