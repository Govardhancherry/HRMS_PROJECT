package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//to provide Test data & objects of whole application
	 WebDriver driver;
	
	//test data
	      //datatype  variables  = variable values
	public String url ="http://183.82.103.245/nareshit/login.php";
	//public = modify/access the data
	public String un = "nareshit";
	public String pw = "nareshit";
	public String FrstNme = "Abbas";
	public String LstNme = "syed";
	public String pfrstnme = "Govardhan";
	public String pLastnme = "addanki";
	public String Searchtxt_empid = "";
	public String photo_id ="D:\\testing projects\\images'\\volk pic.jpg";
	
	
			
	
	
	//*********objects/elements*******
	public String text_loginname = "txtUserName";
	public String text_Password = "txtPassword";
	public String btn_login = "Submit";
	public String link_Logout = "Logout";
	public String btn_Add = "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
	public String frameID = "rightMenu";
	public String frstname = "txtEmpFirstName";
	public String lstname = "txtEmpLastName";
	public String btn_Save = "//*[@id=\"btnEdit\"]";
	public String btn_edit = "//*[@id=\"btnEditPers\"]";
	public String pfrstname = "txtEmpFirstName";
	public String plastname = "txtEmpLastName";
	public String btn_psave = "btnEditPers";
	public String btn_back =  "/html/body/div[5]/input";
	public String dropdown_select = "loc_code";
	public String drpdwn_id = "Emp. ID";
	public String EI_Search = "loc_name";
	public String btn_searchEI = "//*[@id=\"standardView\"]/div[2]/input[2]";
	public String drpdwn_clickEIP = "chkLocID[]";
	public String btn_delete = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
	public String insert_phto = "//*[@id=\"photofile\"][@name='photofile']";
	

	
	

	
	

}
