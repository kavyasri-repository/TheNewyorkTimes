package com.newyorktimes.ITtests;

//need to implement extent report 
//need to add assertions 

import org.testng.annotations.Test;
import com.newyorktimes.base.Base;
import com.newyorktimes.pages.Login_Page;

public class Login_Test extends Base {
	
	Login_Page login;
	
	public Login_Test()
	{
		 login = new Login_Page();
	}
	
	@Test
	public void loginTest(){
		login.verifylogin();
	}
}