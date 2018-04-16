package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

public class WordPressWidgetsPage {
	
	private WebDriver driver;

	public WordPressWidgetsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[.='Pages']")
	public WebElement pages;
	
	@FindBy(xpath = "//a[@href='post-new.php?post_type=page']")
	public WebElement addNewPage;
	
	@FindBy(id = "title")
	public WebElement titlePage;
	
	@FindBy(id = "content-panels")
	public WebElement pageBuilder;
	
	@FindBy(xpath ="//*[@title='Add Widget']")
	public WebElement addWidget;
	
	@FindBy(xpath ="(//div[@class='widget-type-wrapper'])[6]")
	public WebElement gallery;
	
	@FindBy(xpath = "//div[@class='so-widget-wrapper']")
	public WebElement galleryThumbnail;
	
	@FindBy(xpath = "//a[@class='widget-edit']")
	public WebElement editGallery;
	
	@FindBy(xpath = "//*[@class='button select-media not-selected']")
	public WebElement addImage;

	@FindBy(id = "media-search-input")
	public WebElement searchButton;
	
	//@FindBy(xpath = "(//span[@class='media-modal-icon'])[2]")
	@FindBy (xpath="//li[@class='attachment save-ready']")
	public WebElement selectImage;
	
	@FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-gallery']")
	public WebElement createNewGallery;
	
	@FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-insert']")
	public WebElement insertButton;
	
	@FindBy(xpath = "//input[@class='widefat title']")
	public WebElement gallerytitle;
	
	@FindBy(xpath = "(//*[@class='button-primary so-close'])[2]")
	public WebElement done;
	
	@FindBy(xpath = "//*[@class='preview button']")
	public WebElement previewbutton;
	
	@FindBy(id = "publish")
	public WebElement publishButton;
	
	@FindBy(xpath ="(//*[@class='widget-type-wrapper'])[3]")
	public WebElement calendar;
	
	@FindBy(xpath = "//a[.='View page']")
	public WebElement viewPage;
	
	@FindBy(id = "wp-calendar")
	public WebElement pageCalendar;
	//input[@class='describe']
	@FindBy(xpath = "//input[@class='describe']")
	public WebElement imageCaptun;
	
	@FindBy(id= "gallery-1")
	public WebElement pageGallery;
	
	public void deletePage(String listName, String action ){
		BrowserUtils.hover(driver.findElement(By.xpath("//tbody[@id='the-list']//*[contains(text(),'"+listName+"')]")));
		BrowserUtils.waitFor(5);
		driver.findElement(By.xpath("//tbody[@id='the-list']//a[.'"+action+"']")).click();
		
		
	}
	
	
}


