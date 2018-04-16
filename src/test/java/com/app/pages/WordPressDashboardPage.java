package com.app.pages;

import java.util.ArrayList;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;
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
	
	@FindBy(xpath = "(//a[@href='edit.php'])[2]")
	public WebElement allPosts;
	
	@FindBy(xpath = "//a[@href='post-new.php']")
	public WebElement addNewPost;
	
	@FindBy(id = "title")
	public WebElement postTitle;
	
	@FindBy(id = "content")
	public WebElement postContent;
	
	@FindBy(id = "insert-media-button")
	public WebElement addMediaOnPost;
	
	@FindBy(xpath = "//button[.='Insert into post']")
	public WebElement insertImage;
		
	@FindBy(xpath = "//a[.='View post']")
	public WebElement ViewPost;

	@FindBy(linkText= "Pages")
	public WebElement pages1;
	
	@FindBy(xpath = "//div[.='Pages']")
	public WebElement pages;
	
	@FindBy(xpath = "//div[.='Pages']")
	public WebElement allPages;
		
	@FindBy(xpath = "//a[@href='post-new.php?post_type=page']")
	public WebElement addNewPage;
	
	@FindBy(id = "title")
	public WebElement titlePage;

	@FindBy(id ="tinymce")
	public WebElement textField;
	
	@FindBy(xpath="//textarea[@class='wp-editor-area'][@id='content']")
	public WebElement textField2;
	
	@FindBy(id="content_ifr")
	public WebElement typeTextOnPage;
	
	@FindBy(id="insert-media-button")
	public WebElement mediaButtonOnPage;

	@FindBy(xpath = "//a[.='Media Library']")
	public WebElement mediaLib;
	
	@FindBy(xpath="//select[@id='media-attachment-filters']")
	public WebElement imagesButton;
	
	@FindBy(xpath="(//div[@class='thumbnail'])[8]")
	public WebElement imageSelected;
	
	@FindBy(xpath="//*[@id=\"__wp-uploader-id-0\"]/div[5]/div/div[2]/button")
	public WebElement insertItnoPage;
	

	@FindBy(partialLinkText = "View page")
	public WebElement viwePage;



	

	


 

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
	
	@FindBy(xpath="//input[@id='doaction']")
	public WebElement apply;
	
	@FindBy(xpath = "//a[.='Move to Trash']")
	public WebElement moveToTrash;	
	
	//@FindBy(xpath = "//select[@id='bulk-action-selector-top']")
	@FindBy(xpath = "//option[.='Move to Trash']")
	
	public WebElement bulkAction;
	
	
	
	@FindBy(xpath="//a[@href='user-new.php']")
	public WebElement addNewUser;
	
	@FindBy(id="user_login")
	public WebElement username;
	
	public WebElement email;
	
	@FindBy(xpath="//button[@class='button wp-generate-pw hide-if-no-js']")
	public WebElement showPassword;
	
	@FindBy(id="pass1-text")
	public WebElement passwordField;
	
	@FindBy(id="createusersub")
	public WebElement createNewUser;
	
	@FindBy(xpath="//input[@class='pw-checkbox']")
	public WebElement confirmUseWeakPass;
	
	public WebElement send_user_notification;
	
	@FindBy(id="content_ifr")
	public WebElement frame;
	
	public  WebElement user(String str) {
		
		return driver.findElement(By.xpath("//a[.='"+str+"']"));
	}
	
	public WebElement email(String str) {
		return driver.findElement(By.xpath("//a[.='"+str+"']"));
	}
	
	public void logout() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Howdy')]")));
		BrowserUtils.waitForVisibility(driver.findElement(By.xpath("//a[contains(text(),'Howdy')]")), 30);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"))).perform();

	}

	/*
	 * This method allows you to click on submenu on the left of the dashboard ,
	 * just choose which SubMenu you want Ex : Posts Pages Media Appearance....or
	 * Settings
	 */
	public void ClickOnDashboardMenu(String str) {
		driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'" + str + "')]")).click();

	}
			
		
	public WebElement pageNameToDelete(String str) {
		return driver.findElement(By.xpath("//a[.='"+str+"']//../../..//input"));
	}
	
	public WebElement postNameToDelete(String str) {
		return driver.findElement(By.xpath("//a[.='"+str+"']//../../..//input"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
