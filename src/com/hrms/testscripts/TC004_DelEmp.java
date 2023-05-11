package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC004_DelEmp {
	public static void main(String[] args)throws Exception {
		General obj = new General();
		obj.openapplication();
		obj.login();
		obj.frame();
		obj.Select_drp();
		obj.existFrame();
		obj.logout();
		obj.closeapplication();
		
		
	}

}
