package org.base;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit1 extends BaseClass{
	@BeforeClass
	public static void tc01()
	{
		getDriver("chrome");
		url("https://www.facebook.com/");
	}
	@Before
	public void tc02()
	{
		Date d = new Date();
		System.out.println("Start time is"+d);
	}
	@Test
	public void tc03()
	{
		Pom p = new Pom();
	WebElement userName=p.getUserName();
		textSend(userName,"Test");
		WebElement pwd=p.getPwd();
		textSend(pwd,"787878");
		WebElement login=p.getLogin();
		textClick(login);
	}
	@After
	public void tc04()
	{
		Date d = new Date();
		System.out.println("Start time is"+d);
	}
	@AfterClass
	public static void tc05()
	{
			quitBrowser();
	}

}
