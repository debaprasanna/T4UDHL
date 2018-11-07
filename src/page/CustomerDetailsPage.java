package page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerDetailsPage 
{
	WebDriver driver;
	@FindBy(xpath="//a[.='Customer Details']")
	private WebElement customerdetails;
	@FindBy(xpath="//select[@id='custNames']")
	private WebElement customername1;
	@FindBy(xpath="//button[.='Add']")
	private WebElement addcustomer1button;
	@FindBy(xpath="//input[@id='custNameId']")
	private WebElement custname1;
	@FindBy(xpath="//input[@id='contactPersonId']")
	private WebElement contactperson1;
	@FindBy(xpath="//input[@id='referenceId']")
	private WebElement custrefid;
	@FindBy(xpath="//input[@id='contactNoId']")
	private WebElement mobno1;
	@FindBy(xpath="//input[@id='contactAddressId']")
	private WebElement adress1;
	@FindBy(xpath="//select[@id='custtypeid']")
	private WebElement typ1;
	@FindBy(xpath="//input[@id='save1']")
	private WebElement savebtn1;
	@FindBy(xpath="//button[.='OK']")
	private WebElement alert1;
	@FindBy(xpath="//button[.='View']")
	private WebElement viewbtn1;
	@FindBy(xpath="//*[@id=\"example_wrapper\"]/div[1]/a[2]")
	private WebElement excel1btn;
	@FindBy(xpath="//*[@id=\"example_wrapper\"]/div[1]/a[1]/span")
	private WebElement norow;
	@FindBy(xpath="//table[@id='example']//tr[last()]//td")
	private WebElement lastno;
	
	
	
	
	

	public CustomerDetailsPage(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickcustomerDetails() 
	{
		customerdetails.click();
	 
	}
	public void selectcustomername() 
	{
		Select select=new Select(customername1);
		select.selectByIndex(1);
	 
	}
	public void clickaddcustomer1btn() 
	{
		addcustomer1button.click();
	}
	public void addcustomerdetails() 
	{
		Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("hhssddMMyyyy");
        String today = formatter.format(date);
        System.out.println(today);
        String refid = "12345"+today;
//		custname1.click();
//		custname1.sendKeys(custNAME);
		custname1.sendKeys("sky india");
		contactperson1.sendKeys("harish");
		custrefid.sendKeys(refid);
		mobno1.sendKeys("9438685645");
		adress1.sendKeys("Banglore");
		Select select=new Select(typ1);
		select.selectByIndex(1);
		savebtn1.click();
		alert1.click();
//		  Alert alert = driver.switchTo().alert();
//		  alert.accept();
		
		
	}
	public void viewdetails()
	{
		viewbtn1.click();
	}
	public void clickxl()
	{
		excel1btn.click();
	}
	public void rowcount()
	{
		String s=norow.getText();
	System.out.println(s);
	String s1=lastno.getText();
	System.out.println(s1);
	
		}
	
	

}
