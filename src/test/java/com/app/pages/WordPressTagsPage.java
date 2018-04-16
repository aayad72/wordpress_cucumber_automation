package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

public class WordPressTagsPage {

	private WebDriver driver;

	public WordPressTagsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[.='Posts']")
	public WebElement posts;
	
	@FindBy(xpath = "//a[@href='post-new.php']")
	public WebElement addNewPost;
	
	@FindBy(id = "title")
	public WebElement postTitle;
	
	@FindBy(id = "new-tag-post_tag")
	public WebElement setTagName;
	
	@FindBy(xpath = "//input[@class ='button tagadd']")
	public WebElement AddTagpost;
	
	@FindBy(id ="tinymce")
	public WebElement textField;
	@FindBy(id="content")
	public WebElement textField2;
	
	@FindBy(xpath="//span[@class='spinner']")
	public WebElement publish1;
	
	@FindBy(id = "publishing-action")
	public WebElement publish4; 
	
	@FindBy(xpath= "(//input[@type='submit'])[3]")
	public WebElement publish2;
	
	@FindBy(xpath= "//input[@name='publish']")
	public WebElement publish3;
	
	public WebElement publish;
	
	@FindBy(id= "content-tmce")
	public WebElement visual;
	
	@FindBy(xpath = "//a[.='View post']")
	public WebElement viewPost;
	
	@FindBy(xpath = "//a[@href='edit-tags.php?taxonomy=post_tag']")
	public WebElement tag;
	
	@FindBy(id = "tag-name")
	public WebElement tagName;
	
	@FindBy(id ="tag-slug")
	public WebElement tagSlug;
	
	@FindBy(id = "submit")
	public WebElement addNewTag;
	
	@FindBy(id = "the-list")
	public WebElement tagTable;
	
	@FindBy(xpath = "//p[@class='tags']")
	public WebElement tagsInPost;
	
	
	
	public void deletePost(String listName, String action ){
		BrowserUtils.hover(driver.findElement(By.xpath("//tbody[@id='the-list']//a[contains(text(),'"+listName+"')]")));
		BrowserUtils.waitFor(10);
		driver.findElement(By.xpath("//tbody[@id='the-list']//a[contains(text(),'"+action+"')]")).click();
		
		
	}
}
