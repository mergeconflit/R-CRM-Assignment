package com.RCRM.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class basetest {
	
	static WebDriver driver;
	String pageName = "testPage";
	static ExtentTest test;
	static ExtentReports report;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public static void launch() {
		
		System.setProperty("webdriver.chrome.driver","//Users//saurabhchaudhary//Downloads//chromedriver 3");
		driver = new ChromeDriver();
		
		driver.get("http://sanbox.undostres.com.mx");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
	@AfterMethod
	public static void tearDown() {
		//driver.quit();
	}
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
	test = report.startTest("RCRM");
	}
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}

	

}
