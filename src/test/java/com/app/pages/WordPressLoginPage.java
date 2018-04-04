package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class WordPressLoginPage {
	
private WebDriver driver;
	
	public WordPressLoginPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement user_login;
	public WebElement user_pass;
	
	@FindBy(id="wp-submit")
	public WebElement loginButton;

}
