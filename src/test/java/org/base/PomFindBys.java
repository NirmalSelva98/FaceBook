package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class PomFindBys {
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	private WebElement userName;
	@FindBys({@FindBy(name="pwd"),@FindBy(xpath="//input[@id='pass']")})
		private WebElement pwd;
	@FindBys({@FindBy(name="login"),@FindBy(xpath="//button[@type='Submit']")})
		private WebElement login;
	private WebElement getUserName() {
		return userName;
			}
	public WebElement getPwd() {
		return pwd;
	}
		public WebElement getLogin() {
		return login;
	}
}
