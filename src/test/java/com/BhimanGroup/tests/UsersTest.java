package com.BhimanGroup.tests;

import com.BhimanGroup.Pages.UsersPage;

import com.BhimanGroup.mainBase.MainBase;

public class UsersTest extends MainBase {
	
	UsersPage page;
	
	
public void SetUp() {
	openBrowser();
	launchUrl();
	windowMaximize();
	UsersTest test=new UsersTest();
}

}
