package com.RCRM.tests;

import org.testng.annotations.Test;

import com.RCRM.pages.basetest;
import com.RCRM.pages.undrosBase;

public class undrosTest extends basetest{

	@Test
	public void Recharge() {
		
		undrosBase UB = new undrosBase();
		UB.rechargeDetails();
		try {
			UB.cardDetails();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			UB.login();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
