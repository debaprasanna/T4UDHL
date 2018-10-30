package generic;

import java.io.File;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class BaseTest  implements IAutoConst
{
	public static WebDriver driver;

	  public  ExtentReports extent;
	   public ExtentTest logger;
	
	

	
	 static {

		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECK_VALUE);
		
	 }
	

	 @Parameters({"browser"})
	 @BeforeTest(alwaysRun=true)
	 public void openApp(@Optional("chrome")String browser)
	 {
		 extent = new ExtentReports (System.getProperty("user.dir") +"/extend-output/extent.html", true);
		 extent
         .addSystemInfo("Host Name", "SoftwareTestingMaterial")
         .addSystemInfo("Environment", "Automation Testing")
         .addSystemInfo("User Name", "Rajkumar SM");
         //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
         //You could find the xml file below. Create xml file in your project and copy past the code mentioned below

		 extent.loadConfig(new File(System.getProperty("user.dir")+".\\report\\extent-config.xml"));
		 //System.setProperty(CHROME_KEY,CHROME_VALUE);


		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		String url=AL.getProperty(SETTINGS_PATH,"URL");
		driver.get(url);
		String strITO=AL.getProperty(SETTINGS_PATH,"ITO");
		long ITO=Long.parseLong(strITO);
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		
		
		}
//	 @AfterMethod
//		public void getResult(ITestResult result){
//			if(result.getStatus() == ITestResult.FAILURE){
//				logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
//				logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
//			}else if(result.getStatus() == ITestResult.SKIP){
//				logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
//			}
//			// ending test
//			//endTest(logger) : It ends the current test and prepares to create HTML report
//			extent.endTest(logger);
//		}
		
	 
	 @AfterMethod(alwaysRun=true)
	 public void closeApp(ITestResult res) {
		 String name=res.getName();
		 int status=res.getStatus();
		 if(status==2) {
			 String imgPath=AL.getPhoto(driver,PHOTO_PATH,name);
			 Reporter.log("ImagePath:"+imgPath,true);
//			 extent.flush();
//			 extent.close();
			// driver.quit();
		 }
		 
		 
		//driver.quit();
		
	 }
}

	 
	


	


