package com.RCRM.tests;

import org.testng.annotations.Test;

import com.RCRM.pages.basetest;
import com.RCRM.pages.candidatePage;
import com.RCRM.pages.companiesPage;
import com.RCRM.pages.contactsPage;
import com.RCRM.pages.homePage;
import com.RCRM.pages.jobsPage;

public class rcrmtests extends basetest {
	
	
	
	@Test(priority=1)
	public void signIn() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
	}
	
	@Test(priority=2)
	public void addCandi() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		candidatePage cp = new candidatePage();
		cp.openCandidatetab();
		cp.addCandidate();
		
	}
	
	@Test(priority=6)
	public void deleteCandidate() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		candidatePage cp = new candidatePage();
		cp.openCandidatetab();
		
		cp.deletecandidate();
		
	}
	
	@Test(priority = 3)
	public void addCompany() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		companiesPage cp = new companiesPage();
		cp.openCompaniesTab();
		cp.addCompany();
	}
	
	@Test(priority = 7)
	public void deleteCompany() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		companiesPage cp = new companiesPage();
		cp.openCompaniesTab();
		cp.deleteCompany();
		
	}
	@Test(priority=4)
	public void addContact() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		contactsPage cp = new contactsPage();
		cp.openContactsTab();
		cp.addContact();
	}
	
	@Test(priority = 8)
	public void deleteContact() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		contactsPage cp = new contactsPage();
		cp.openContactsTab();
		cp.deleteContact();
	}
	
	@Test(priority = 5)
	public void addjob() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		jobsPage jp = new jobsPage();
		jp.openJobsTab();
		jp.addJob();
		
	}
	
	@Test(priority = 9)
	public void deleteJob() {
		
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		jobsPage jp = new jobsPage();
		jp.openJobsTab();
		jp.deleteJob();
		
	}
	
	@Test(priority=10)
	public void signOut() {
		homePage hp = new homePage();
		hp.login("fyrar@dropjar.com", "Ashu@02");
		hp.logout();
	}

}
