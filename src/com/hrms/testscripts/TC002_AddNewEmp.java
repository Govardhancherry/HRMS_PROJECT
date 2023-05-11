package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC002_AddNewEmp {
	public static void main(String[] args) throws Exception {
		General obj = new General();
		obj.openapplication();
		obj.login();
		obj.frame();
		obj.addemp();
		obj.existFrame();	
		obj.logout();
		obj.closeapplication();
		
		
	}

}
