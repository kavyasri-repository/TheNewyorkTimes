package com.newyorktimes.ITtests;

import org.testng.annotations.Test;
import com.newyorktimes.base.Base;
import com.newyorktimes.pages.Home_Page;

public class NewsDate_Test extends Base {

Home_Page newsdate;
	
	public  NewsDate_Test()
	{
		newsdate = new Home_Page();
	}
	
	@Test
	public void verifynewsDate(){
		newsdate.verifyDateField();
	}
}