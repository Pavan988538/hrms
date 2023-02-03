package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.Sunitha;

public class TC002 {
@Test	
	public void tc002() {
	    //Test Steps
 Sunitha obj = new Sunitha();
	   obj.openapplication();
	   obj.login();
	   obj.enterFrame();
	   obj.addNewEmp();
	   obj.exitFrame();
	   obj.logout();
	   obj.closeapplication();
	}
}
