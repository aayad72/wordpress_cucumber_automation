package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class WordPressAppearanceMenuPage {

	private WebDriver driver;

	public WordPressAppearanceMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='wp-menu-name'])[6]")
	public WebElement appearance;

	@FindBy(xpath = "//a[@href='nav-menus.php']")
	public WebElement Menus;

	@FindBy(id = "custom-menu-item-url")
	public WebElement url;

	@FindBy(id = "custom-menu-item-name")
	public WebElement linkText;

	@FindBy(id = "submit-customlinkdiv")
	public WebElement linkAddToMenu;

	@FindBy(xpath = "//span[@class='menu-item-title']")
	public WebElement customLinkText;

	@FindBy(xpath = "//ul[@id='postchecklist-most-recent']//input")
	public WebElement postCheckBox;

	@FindBy(id = "submit-posttype-post")
	public WebElement postAddToMenu;

	@FindBy(xpath = "//label[contains(text(),'SmokeTestPage')]")
	public WebElement pagesSmokeTestCheckBox;

	@FindBy(id = "submit-posttype-page")
	public WebElement pagesAddToMenu;

	public void chooseMenus(String name) {
		driver.findElement(By.xpath("//h3[@class='accordion-section-title hndle'][contains(text(),'" + name + "')]"))
				.click();
	}
}
