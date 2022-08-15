package com.RCRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends basetest {
	
	public homePage() {
		
		
		PageFactory.initElements(driver, this);
		pageName = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath = "//*[@id=\"navbar-main-collapse\"]/ul[2]/li[1]/a")
	public static WebElement Signin_btn;
	
	@FindBy(id = "sTestEmail")
	public static WebElement Email_inbox;
	
	@FindBy(id = "sTestPassword")
	public static WebElement Password_inbox;
	
	@FindBy(id = "sTestLoginBtn")
	public static WebElement Login_btn;
	
	@FindBy(id = "sTest-dpLinkInAppBtn")
	public static WebElement profile;
	
	@FindBy(id = "sTest-signOutInAppBtn")
	public static WebElement signOut;
	
	public void login(String Email, String Pass) {
		
		

		String Pw = driver.getWindowHandle();
		System.out.println(Pw);
		Signin_btn.click();
		
		//wait.until(numberOfWindowsToBe(2));
		
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!Pw.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		Email_inbox.sendKeys(Email);
		Password_inbox.sendKeys(Pass);
		Login_btn.click();
		
		//String msg=driver.switchTo().frame("intercom-frame").getTitle();
		//String msg = driver.switchTo().alert().getText();
		
		
		//String msg=driver.findElement(By.linkText("Login Successful")).getText();
		//System.out.println(msg);
		
		}
	
	public void logout() {
		profile.click();
		signOut.click();
	}
	

}
