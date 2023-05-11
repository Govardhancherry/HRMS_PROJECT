package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;



public class General  extends Global {
	//to provide all reusable functions/methods of whole application
	public void openapplication() throws Exception {
		//to launch browser
		driver= new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
		Thread.sleep(3000);	
	}

	public void login()throws Exception {
		driver.findElement(By.name(text_loginname)).sendKeys(un);
		driver.findElement(By.name(text_Password)).sendKeys(pw);
		Thread.sleep(3000);	
		
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);	
		System.out.println("login completed");
		Reporter.log("login completed");
		Log.info("login completed");
		
	}
	public void logout() throws Exception {
		driver.findElement(By.linkText(link_Logout)).click();
		Reporter.log("logout completed");
		Log.info("logout completed");
		Thread.sleep(3000);
	}
	
	
	
	public void addemp() throws Exception {
		
		driver.findElement(By.xpath(btn_Add)).click();
		Thread.sleep(3000);
		driver.findElement(By.name(frstname)).sendKeys(FrstNme);
		driver.findElement(By.name(lstname)).sendKeys(LstNme);
		Thread.sleep(3000);
		driver.findElement(By.xpath(insert_phto)).sendKeys(photo_id);
		System.out.println("photo inserted");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(btn_Save)).click();
		System.out.println("save emp details");
		Reporter.log("save emp details");
		Log.info("save emp details");
		
		
	}
	public void frame() {
		driver.switchTo().frame(frameID);
	}

		public void existFrame() {
			driver.switchTo().defaultContent();
		}
	
	public void personaldetails() throws Exception {
		
		driver.findElement(By.xpath(btn_edit)).click();
		System.out.println("edit btn excuted");
		Thread.sleep(4000);	
		//to clear previous data 	
		driver.findElement(By.name(frstname)).clear();
		driver.findElement(By.name(lstname)).clear();
		System.out.println("cleared previous data");
		Thread.sleep(3000);
		
		//to enter new data in personal details
		driver.findElement(By.name(pfrstname)).sendKeys(pfrstnme);
		Thread.sleep(3000);
		
		driver.findElement(By.name(plastname)).sendKeys(pLastnme);
		System.out.println("entered newe data");
		Thread.sleep(3000);
		
		//to save the data in personal details
		driver.findElement(By.id(btn_psave)).click();
		System.out.println("save btn excuted");
		
		driver.findElement(By.xpath(btn_back)).click();
		System.out.println("Back btn excuted");
		Reporter.log("Back btn excuted");
		Log.info("Back btn excuted");
		Thread.sleep(3000);
		
		
	}
	public void Select_drp() throws Exception{
		Select s = new Select(driver.findElement(By.name(dropdown_select)));
		s.selectByVisibleText(drpdwn_id);
		
		System.out.println("dropdown excuted");
		Thread.sleep(3000);
		
		driver.findElement(By.name(EI_Search)).sendKeys(Searchtxt_empid);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(btn_searchEI)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name(drpdwn_clickEIP)).click();
		System.out.println("click btn excuted");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(btn_delete)).click();
		System.out.println("delete btn excuted");
		Reporter.log("delete btn excuted");
		Log.info("delete btn excuted");
		Thread.sleep(3000);
		
		
	}	
	public void closeapplication() {
		driver.close();
		System.out.println("application closed");
		Reporter.log("application closed");
		Log.info("application closed");
	}
	
}
