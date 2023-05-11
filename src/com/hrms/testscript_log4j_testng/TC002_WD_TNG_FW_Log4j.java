package com.hrms.testscript_log4j_testng;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002_WD_TNG_FW_Log4j {
	General obj = new General();
	@Test
	public void tc002() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		obj.openapplication();
		obj.login();
		obj.frame();
		obj.addemp();
		obj.existFrame();
		obj.logout();
		obj.closeapplication();
		
	}

}
