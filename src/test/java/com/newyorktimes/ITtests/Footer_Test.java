package com.newyorktimes.ITtests;

import org.testng.annotations.Test;

import com.newyorktimes.base.Base;
import com.newyorktimes.pages.Home_Page;
import com.newyorktimes.utilities.Constants;

public class Footer_Test extends Base {
	
	Home_Page footer;
	
	public Footer_Test()
	{
		footer = new Home_Page();
	}
	
	@Test
	public void verifynewspaperSections() {
		footer.verifyFooterLinks();
	}
}



