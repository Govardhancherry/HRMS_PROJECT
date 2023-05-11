package com.hrms.testscript_log4j_testng;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001_Testng_WB_Log4j_FW {
	General obj = new General();
	
	@Test
	public void tc001() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		obj.openapplication();
		obj.login();
		obj.logout();
		obj.closeapplication();
		
	}
	

}
