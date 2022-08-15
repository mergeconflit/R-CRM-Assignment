package com.RCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactsPage extends basetest{
	
public contactsPage() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(id = "sTest-contactsIcon")
public static WebElement contacts_tab ;

@FindBy(id = "sTest-addContactBtn")
public static WebElement addContact_btn ;

@FindBy(id = "sTest-contactFirstnameTxt")
public static WebElement firstName;

@FindBy(id = "sTest-contactLastnameTxt")
public static WebElement lastName;

@FindBy(id = "sTest-companynamesearchControl")
public static WebElement companyName;

@FindBy(id = "sTest-contactDesignationTxt")
public static WebElement title;

@FindBy(id = "sTest-contactEmailTxt")
public static WebElement email;

@FindBy(id = "sTest-contactContactnumberTxt")
public static WebElement phone;

@FindBy(id = "sTest-contactAddBtn")
public static WebElement submit;

@FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[1]/label/span[1]")
public static WebElement selectContact;

@FindBy(id = "sTest-deleteBulkContactBtn")
public static WebElement Deletecontact;

@FindBy(xpath = "//input[@name='Records Count']")
public static WebElement noOfContact;

@FindBy(id = "sTest-deleteForeverBtn")
public static WebElement Delete;


public void openContactsTab() {
	contacts_tab.click();
}

public void addContact() {
	addContact_btn.click();
	firstName.sendKeys("Test");
	lastName.sendKeys("CRM");
	companyName.sendKeys("Test");
	title.sendKeys("Test Engineer");
	email.sendKeys("Test@test.com");
	phone.sendKeys("909098765");
	submit.click();	
	
}

public void deleteContact() {
	selectContact.click();
	Deletecontact.click();
	noOfContact.sendKeys("1");
	Delete.click();
	
	
}

}
