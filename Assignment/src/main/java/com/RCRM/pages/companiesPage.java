package com.RCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class companiesPage extends basetest{
	
public companiesPage() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(id = "sTest-companiesIcon")
public static WebElement companies_tab;

@FindBy(id = "sTest-addCompanyBtn")
public static WebElement addcompanies_btn;

@FindBy(id = "sTest-companyNameTxt")
public static WebElement companyname_inbox;

@FindBy(id = "sTest-industryTxt")
public static WebElement industry;

@FindBy(id = "sTest-companyWebsiteTxt")
public static WebElement website;

@FindBy(id = "sTest-companyCityTxt")
public static WebElement city;

@FindBy(id = "sTest-companySubmitBtn")
public static WebElement submit;

@FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[1]/label/span[1]")
public static WebElement selectCompany;

@FindBy(id = "sTest-deleteCompanyBtn")
public static WebElement DeleteCompany;

@FindBy(xpath = "//input[@name='Records Count']")
public static WebElement noOfCompany;

@FindBy(id = "sTest-deleteForeverBtn")
public static WebElement Delete;



public void openCompaniesTab() {
	
	companies_tab.click();
	
}

public void addCompany() {
	addcompanies_btn.click();
	companyname_inbox.sendKeys("Test");
	website.sendKeys("WWW.Test.com");
	city.sendKeys("Noida");
	submit.click();	
	
}

public void deleteCompany() {
	selectCompany.click();
	DeleteCompany.click();
	noOfCompany.sendKeys("1");
	Delete.click();
	
}


}
