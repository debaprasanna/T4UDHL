package page;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.BaseTest;

public class ActionPage 
{
	WebDriver driver;
	@FindBy(xpath="//a[  text()='Actions'] ")
	private WebElement act;
	
	@FindBy(linkText="Quick Trip Planner")
	private WebElement quicktp;
	
	@FindBy(xpath="//*[@id=\"addcustNameType\"]")
	private WebElement customertype;
	
	@FindBy(xpath="//span[@id='select2-addcustNameDownID-container']")
	private WebElement  customename;
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	private WebElement  inputbox;
	
	@FindBy(xpath="//input[@id='existingRoute']")
	private WebElement  existing;
	
    @FindBy(xpath="//input[@id='newRoute']")
    private WebElement  neww;
    @FindBy(xpath="//select[@id='addSourceCombo']")
    private WebElement  addsource;
    @FindBy(xpath="//select[@id='sourceSelect']")
    private WebElement  source;
    @FindBy(xpath="//select[@id='addDestCombo']")
    private WebElement adddest;
    @FindBy(xpath="//select[@id='destSelect']")
    private WebElement dest;
    @FindBy(xpath="//select[@id='addWaypointsCombo']")
    private WebElement addwaypoint;
    @FindBy(xpath="//input[@id='waypointInput']")
    private WebElement waypoint;
    @FindBy(xpath="//input[@id='waypointDetention']")
    private WebElement detention;
    @FindBy(xpath="//input[@id='waypointRadius']")
    private WebElement radious;
    @FindBy(xpath="//button[@id='btnAddWaypoint']")
    private WebElement addbutton;
    @FindBy(xpath="//input[@id='tatInput']")
    private WebElement tat;
    @FindBy(xpath="//input[@id='routeKeyInput']")
    private WebElement routkey;
    @FindBy(xpath="//input[@id='routeNameInput']")
    private WebElement routid;
    @FindBy(xpath="//button[@id='btnFreeze']")
    private WebElement saveroutebtn;
    @FindBy(xpath="//select[@id='addvehicleDropDownID']")
    private WebElement veichleno;
    @FindBy(xpath="//input[@id='custReferenceId']")
    private WebElement customnerid;
    @FindBy(xpath="//select[@id='categoryComboId']")
    private WebElement catagery;
    @FindBy(xpath="//input[@id='save1']")
    private WebElement savebtn;
 


	
	
	
	
	public ActionPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void clickaction() 
	{
		Actions action=new Actions(BaseTest.driver);
		//action.moveToElement(msh).
		action.moveToElement(act).
		click().perform();
	}
	public void clickquicktp() 
	{
		quicktp.click();
	}
	public void selectcustomertype() 
	{
		Select select=new Select(customertype);
		select.selectByIndex(1);

	}
	public void selectcustomername() 
	{
		//Thread.sleep(1000);
		customename.click();
		inputbox.sendKeys("CUSTOMER_19");
		inputbox.sendKeys(Keys.ENTER);
		
	}
	public void existinguser() 
	{
		if(existing.isSelected())
		{
			neww.click();
		}
	
	}
	public void selectsource() 
	{
		Select select=new Select(addsource);
		select.selectByIndex(1);;
		
	}
	public void selectmainsource() 
	{
		Select select=new Select(source);
		select.selectByIndex(2);
		
	}
	public void selectdest() 
	{
		Select select=new Select(adddest);
		select.selectByIndex(1);;
		
	}
	public void selectmaindest() 
	{
		Select select=new Select(dest);
		select.selectByIndex(3);
		
	}
	public void selectwaypoint() 
	{
		Select select=new Select(addwaypoint);
		select.selectByIndex(0);
		
	}
	public void mainwaypoint() 
	{
	waypoint.sendKeys("Bhubaneswar");
	detention.sendKeys("10:45");
	radious.sendKeys("3");
	addbutton.click();
	//tat.sendKeys("10:20");
	
	
	}
	public void timearound() 
	{
		tat.sendKeys("10:20");
		//routkey.sendKeys("maa_bvk");
	}
	public void setroutekeys() 
	{
	
		routkey.sendKeys("VKK_GUD");
	}
	public void setrouteid() 
	{
		routid.click();
		routid.sendKeys("chenai_kerala_INDIANJ");
	}
	public void clicksavebutton() 
	{
		saveroutebtn.click();
		
	}
	public void clickvechileno() 
	{
		
		try
		{
			Select select=new Select(veichleno);
			select.selectByIndex(30);
	        customnerid.sendKeys("NA");
	    	Select select1=new Select(catagery);
			select1.selectByIndex(1);
			savebtn.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			
		}
		
	}
	
	
	
	
}