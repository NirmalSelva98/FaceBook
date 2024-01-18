package org.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass {
public static void main (String[] args) throws IOException {
	getDriver("chrome");
	url("https://www.facebook.com/");
	WebElement userName = locator("id","email");
	textSend(userName,"Test@gmail.com");
	Screenshot("userName");
	WebElement pwd = locator("id","pass");
	textSend(pwd,"12546321254");
	Screenshot("pwd");
	WebElement login = locator("xpath","//button[@name='login']");
	textClick(login);
	Screenshot("login");
	quitBrowser();
	
}

}
