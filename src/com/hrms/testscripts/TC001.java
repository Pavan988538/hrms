package com.hrms.testscripts;

import com.hrms.lib.Sunitha;

public class TC001 {
public static void main(String args[]) throws Exception {
	Sunitha obj = new Sunitha();
	obj.openapplication();
	obj.login();
	obj.logout();
	obj.wait();
	obj.closeapplication();
}
}
