package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 extends Pom {
	@DataProvider(name="login")
	public Object[][]getData(){
		return new Object[][] {{"nirmal@gamil.com","789546"},{"mano@gamil.com","412563"},{"ram@gamil.com","1425859"}};
				}
@Test(dataProvider="login")
private void tc01(String userName,String Pwd) {
	getDriver("chrome");
	url("https://www.facebook.com/");
	Pom p = new Pom();
	WebElement username2 = p.getUserName();
	textSend(username2,userName);
	WebElement pwd2= p.getPwd();
	textSend(pwd2,Pwd);
	WebElement login = p.getLogin();
	textClick(login);
	quitBrowser();
}
}
