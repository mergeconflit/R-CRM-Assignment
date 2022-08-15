package com.RCRM.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jobsPage extends basetest{
	
public jobsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(id = "sTest-jobsIcon")
public static WebElement jobs_tab;

@FindBy(id = "sTest-addJobListBtn")
public static WebElement addjob_btn;

@FindBy(id = "sTest-jobNameTxt")
public static WebElement jobTitle;

@FindBy(id = "sTest-jobNoOfopeningsTxt")
public static WebElement openings;

@FindBy(id = "sTest-companysearchControl")
public static WebElement company;

@FindBy(xpath = "//i[@class='mdi mdi-upload mdi-18px m-r-10']")
public static WebElement uploadJD;

@FindBy(id = "sTest-jobShowCompanyBtn")
public static WebElement companyLogo_radio;

@FindBy(id = "sTest-companyAddBtn")
public static WebElement savejob;

@FindBy(xpath="//*[@id=\"main\"]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[1]/label/span[1]")
public static WebElement selectjob;

@FindBy(id="sTest-deleteJobListBtn")
public static WebElement DeleteJob;

@FindBy(xpath="/html/body/div[53]/div[2]/form/div/section/div/div/p/div/div/input")
public static WebElement noOfJobs;

@FindBy(xpath="//*[@id=\"sTest-deleteNote\"]/span[1]")
public static WebElement checkbox;

@FindBy(id="sTest-deleteForeverBtn")
public static WebElement Delete;

public void openJobsTab() {
	jobs_tab.click();
}

public void addJob() {
	
	addjob_btn.click();
	jobTitle.sendKeys("Test QA");
	company.sendKeys("Test");
	openings.click();
	String opening = "2";
	List<WebElement> position = driver.findElements(By.xpath("//*[@id=\"sTest-jobNoOfopeningsddValues\"]"));
	
	for(int i=0; i<position.size(); i++) {
		String temp = position.get(i).getText();
		System.out.println(temp);
		if(temp.equals(opening)) {
			position.get(i).click();
			break;
		}
	}
	
	
	
//	uploadJD.click();
//	
//	File file = new File("//Users//saurabhchaudhary//Downloads//Resume.pdf");
//    StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
//    //Copy to clipboard
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//    
//    Robot robot = null;
//    try {
//		 robot = new Robot();
//	} catch (AWTException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//    
// // Cmd + Tab is needed since it launches a Java app and the browser looses focus
//    robot.keyPress(KeyEvent.VK_META);
//    robot.keyPress(KeyEvent.VK_TAB);
//    robot.keyRelease(KeyEvent.VK_META);
//    robot.keyRelease(KeyEvent.VK_TAB);
//    robot.delay(500);
//
//    //Open Goto window
//    robot.keyPress(KeyEvent.VK_META);
//    robot.keyPress(KeyEvent.VK_SHIFT);
//    robot.keyPress(KeyEvent.VK_G);
//    robot.keyRelease(KeyEvent.VK_META);
//    robot.keyRelease(KeyEvent.VK_SHIFT);
//    robot.keyRelease(KeyEvent.VK_G);
//
//    //Paste the clipboard value
//    robot.keyPress(KeyEvent.VK_META);
//    robot.keyPress(KeyEvent.VK_V);
//    robot.keyRelease(KeyEvent.VK_META);
//    robot.keyRelease(KeyEvent.VK_V);
//
//    //Press Enter key to close the Goto window and Upload window
//    robot.keyPress(KeyEvent.VK_ENTER);
//    robot.keyRelease(KeyEvent.VK_ENTER);
//    robot.delay(500);
//    robot.keyPress(KeyEvent.VK_ENTER);
//    robot.keyRelease(KeyEvent.VK_ENTER);

  companyLogo_radio.click();
	savejob.click();
	
}

public void deleteJob() {
	
	selectjob.click();
	DeleteJob.click();
	noOfJobs.sendKeys("1");
	checkbox.click();
	Delete.click();
	
	
}



}
