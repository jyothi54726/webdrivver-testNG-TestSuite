package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC102 {

	@Test
	public void tc102() throws Exception{
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();
	}
}
