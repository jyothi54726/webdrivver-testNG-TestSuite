package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC101 {

	@Test
	public void tc101() throws Exception{
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}
}
