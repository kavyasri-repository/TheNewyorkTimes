package com.newyorktimes.ITtests;

import org.testng.annotations.Test;
import com.newyorktimes.base.Base;
import com.newyorktimes.pages.Home_Page;

public class NavigationMenu_Test extends Base {

	Home_Page navigationmenu;

	public NavigationMenu_Test()
	{
		navigationmenu = new Home_Page();
	}

	@Test
	public void verifynewspaperNavigationMenu(){
		navigationmenu.verifyNavigationMenu();
	}
}