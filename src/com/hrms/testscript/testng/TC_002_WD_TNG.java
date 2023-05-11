package com.hrms.testscript.testng;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_002_WD_TNG {
	General obj = new General();

	// public static void main(String[] args) {

	@Test
	public void tc001() throws Exception {
		obj.openapplication();
		obj.login();
		obj.logout();
		obj.closeapplication();
	}
	
	
	  @Test(priority = 2)
	  public void tc002() throws Exception {
	  obj.openapplication(); obj.login(); obj.frame(); obj.addemp();
	  obj.existFrame(); obj.logout(); obj.closeapplication();
	  
	  }
	  
	  @Test(priority=3)
	  public void tc003() throws Exception {
	  obj.openapplication(); obj.login(); obj.frame(); obj.addemp();
	  obj.personaldetails(); obj.existFrame(); obj.logout();
	  obj.closeapplication();
	  
	  }
	  
	  @Test(priority = 4)
	  public void tc004() throws Exception {
	  obj.openapplication(); obj.login(); obj.frame(); obj.Select_drp();
	  obj.existFrame(); obj.logout(); obj.closeapplication();
	  
	  }
	 
	  
	  // }
	 
}
