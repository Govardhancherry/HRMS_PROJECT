package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC003_EditEmp {
	public static void main(String[] args)throws Exception {
		General obj = new General();
		obj.openapplication();
		obj.login();
		obj.frame();
		obj.addemp();
		obj.personaldetails();
		obj.existFrame();
		obj.logout();
		obj.closeapplication();
		
		
		
	}

}
