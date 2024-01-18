package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass{
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(name="pwd")
	private WebElement pwd;
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;
	public WebElement getUserName() {
		return userName;
			}
	public WebElement getPwd() {
		return pwd;
	}
		public WebElement getLogin() {
		return login;
	}
		public Pom() {
			PageFactory.initElements(driver, this);
		}
		}
