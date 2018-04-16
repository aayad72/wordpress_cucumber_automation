package com.app.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class WordPressCustomizeThemesPage {
	
	private WebDriver driver;

	public WordPressCustomizeThemesPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='customize-panel-back']")
	public WebElement panelBack;
	
	@FindBy(id="wp-admin-bar-site-name")
	public WebElement site;
	
	@FindBy(xpath="//div[@class='theme-actions']")
	public List<WebElement> activate;
	
	@FindBy(xpath="//a[@class='customize-controls-close']")
	public WebElement back;
	
	public WebElement save;
	
	@FindBy(xpath="//h3[@class='accordion-section-title']")
	public WebElement themeName;
	
	@FindBy(xpath="//a[@class='hide-if-no-js page-title-action']")
	public WebElement newThemes;
	
	@FindBy(xpath="//a[@class='button button-primary theme-install']")
	public List<WebElement> activateNew;
	
	public void randomTheme() {
		Random ran=new Random();
		int i=ran.nextInt(activate.size()-1);
		activate.get(i+1).click();
	}
	
	public boolean searchForThemeChange(String s) {
		boolean b=true;
		try {
		driver.findElement(By.xpath("//*[.=contains(text(),'"+s+"')]")).isDisplayed();
		b=true;
		}catch(Exception e) {
			System.out.println("New Theme : "+s);
		}
		return b;
	}
	
	public void installNewTheme() {
		Random ran=new Random();
		int i=ran.nextInt(activateNew.size()-1);
		activateNew.get(i+1).click();
		
	}
	
	public boolean verifyPage() {
		if(driver.getCurrentUrl().equals("http://34.223.219.142:1022/wordpress/wp-admin/themes.php")&&driver.getTitle().contains("Manage Themes")) {
			return true;
		}
		return false;
	}

}
