package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class WordPressCreateCategoryPage {
	
	private WebDriver driver;

	public WordPressCreateCategoryPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='Categories']")
	public WebElement categories;
	
	@FindBy(id="tag-name")
	public WebElement name;
	
	@FindBy(id="tag-slug")
	public WebElement slug;
	
	@FindBy(id="tag-description")
	public WebElement description;
	
	public WebElement submit;
	
	@FindBy(xpath="//a[@class='row-title']")
	public List<WebElement> nameColumn;
	
	@FindBy(xpath="//td[@class='description column-description']")
	public List<WebElement> desColumn;
	
	@FindBy(xpath="//td[@class='slug column-slug']")
	public List<WebElement> slugColumn;
	
	@FindBy(id="doaction2")
	public WebElement apply;
	
	@FindBy(xpath="//input[@class='button button-primary']")
	public WebElement update;

	public boolean verifyPage() {
		if(driver.getCurrentUrl().equals("http://34.223.219.142:1022/wordpress/wp-admin/edit-tags.php?taxonomy=category")&&driver.getTitle().contains("Categories")) {
			return true;
		}
		return false;
	}
	

}
