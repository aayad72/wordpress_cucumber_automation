package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

public class WordPressDashboardPage {

	private WebDriver driver;

	public WordPressDashboardPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[.='Posts']")
	public WebElement posts;
	@FindBy(xpath = "//a[@href='post-new.php']")
	public WebElement addNewPost;
	@FindBy(id = "title")
	public WebElement postTitle;
	@FindBy(xpath = "//a[.='View post']")
	public WebElement ViewPost;

	@FindBy(xpath = "//div[.='Pages']")
	public WebElement pages;
	@FindBy(xpath = "//a[@href='post-new.php?post_type=page']")
	public WebElement addNewPage;
	@FindBy(id = "title")
	public WebElement titlePage;

	@FindBy(xpath = "//textarea[@class='wp-editor-area'][@id='content']")
	public WebElement textField;

	public WebElement publish;

	@FindBy(xpath = "//div[.='Media']")
	public WebElement media;
	@FindBy(xpath = "//a[@href='media-new.php']")
	public WebElement addNewMedia;

	@FindBy(xpath = "//div[contains(text(),'Comments')]")
	public WebElement comments;

	@FindBy(xpath = "//div[.='Appearance']")
	public WebElement Appearance;

	@FindBy(xpath = "//a[.='View page']")
	public WebElement ViewPage;

	@FindBy(xpath = "//div[@class='post-content']//p")
	public WebElement textBodyInCreatedPage;

	public void logout() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Howdy')]")));
		BrowserUtils.waitForVisibility(driver.findElement(By.xpath("//a[contains(text(),'Howdy')]")), 50);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"))).perform();

	}

	/*
	 * This method allows you to click on submenu of the left of the dashboard ,
	 * just choose which SubMenu you want Ex : Posts Pages Media Appearance....or
	 * Settings
	 */
	public void ClickOnDashboardMenu(String str) {
		driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'" + str + "')]")).click();

	}

}
