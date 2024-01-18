package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PomFindAll extends BaseClass{
	@FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	private WebElement userName;
	@FindAll({@FindBy(name="pass"),@FindBy(xpath="//input[@id='pass']")})
		private WebElement pwd;
	@FindAll({@FindBy(name="login"),@FindBy(xpath="//button[@name='login']")})
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
	public PomFindAll() {
				PageFactory.initElements(driver, this);
	}
}