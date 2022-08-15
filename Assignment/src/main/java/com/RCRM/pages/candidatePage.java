package com.RCRM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class candidatePage extends basetest {
	
public candidatePage() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(id="sTest-candidateIcon")
public static WebElement candidate_tab;

@FindBy(id="sTest-addCandidateBtn")
public static WebElement addCandidate_btn;

@FindBy(id="/html/body/div[38]/div[2]/form/div/section/div[1]/div[2]/div/div/div[1]/div/div/div/div/label/div/section/div")
public static WebElement uploaddoc;

@FindBy(id="sTest-candidateFirstName")
public static WebElement firstName;

@FindBy(id="sTest-candidateEmail")
public static WebElement Email;

@FindBy(id="sTest-candidateTotalExp")
public static WebElement Experience;

@FindBy(id="sTest-candidateMobile")
public static WebElement Phone;

@FindBy(id="sTest-candidateAddress")
public static WebElement fullAddress;

@FindBy(id="sTest-candidateCity")
public static WebElement city_inbox;

@FindBy(id="sTest-datePicker-day-availablefrom")
public static WebElement calender;

@FindBy(xpath="//select")
public static WebElement selectMonth;

@FindBy(xpath="//select")
public static WebElement selectYear;

@FindBy(xpath="/html/body/div[38]/div[2]/form/div/section/div[3]/div[2]/div/div/div[6]/div/div/div/div/div/div[3]/div/div/footer/button")
public static WebElement clearDate;

@FindBy(id="sTest-candidateAddBtn")
public static WebElement submit;

@FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[1]/label/span[1]")
public static WebElement SelectCandi;

@FindBy(id = "sTest-expandMoreCandidateDetailsPage")
public static WebElement options;

@FindBy(id = "sTest-deleteBulkBtn")
public static WebElement Delete;

public void openCandidatetab(){
	
	candidate_tab.click();
}

public void addCandidate() {
	
	
	addCandidate_btn.click();
	firstName.sendKeys("Test");
	Email.sendKeys("a@b.com");
	Phone.sendKeys("9087654321");
	fullAddress.sendKeys("DLF Phase 3");
	city_inbox.sendKeys("Noida");
	Experience.click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	String DD = driver.findElement(By.xpath("/html/body/div[37]/div[2]/form/div/section/div[3]/div[2]/div/div/div[3]/div[1]/div/div/div[2]/div/a")).getText();
//	System.out.println(DD);
	
	
	String value = "6 Years";
	List <WebElement> Eduq = driver.findElements(By.xpath("//*[@id=\"sTest-candidateTotalExp\"]/div[3]/div/a"));
	
	for(int i=0; i<Eduq.size(); i++) {
		String temp = Eduq.get(i).getText();
		System.out.println(temp);
		if(temp.equals(value)) {
			Eduq.get(i).click();
			break;
		}
	}
	
	
	
	calender.click();	
	
	Select s1 = new Select(selectMonth);
	s1.selectByVisibleText("July");
	
//	Select s2 = new Select(selectYear);
//	s2.selectByIndex(1);
	

	String Date = "5";
	List<WebElement> Dates = driver.findElements(By.xpath("//div[@class='datepicker-body']/div/a"));
	
	for(int i=0; i<Dates.size();i++) {
		String Temp = Dates.get(i).getText();
		System.out.println(Temp);
		if(Temp.equals(Date)) {
			Dates.get(i).click();
			break;
		}
		}
	
	submit.click();
}

public void deletecandidate() {
	
	SelectCandi.click();
	Delete.click();
	driver.findElement(By.xpath("/html/body/div[45]/div[2]/form/div/section/div/div/p/div/div/input")).sendKeys("1");
	driver.findElement(By.id("sTest-deleteForeverBtn")).click();
	//driver.switchTo().alert().sendKeys("1");
	//driver.switchTo().alert().accept();
	
	
	
}
}
