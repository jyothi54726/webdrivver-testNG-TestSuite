package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global{
	public void openApplication() {
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
	}
	
	public void closeApplication() {
		driver.quit();
		System.out.println("Application closed");
	}
	
	public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
	}
	
	public void addEmp() {
		System.out.println("Adding new emp");
	}
	
	public void delEmp() {
		System.out.println("Delete emp");
	}

}
