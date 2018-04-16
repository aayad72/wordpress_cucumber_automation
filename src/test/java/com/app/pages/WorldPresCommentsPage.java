package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class WorldPresCommentsPage {

	private WebDriver driver;

	public WorldPresCommentsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@class='wp-heading-inline']")
	public WebElement textComment;

	@FindBy(xpath = "//span[@class='all-count']")
	public WebElement allComments;

	@FindBy(xpath = "//span[@class='pending-count']")
	public WebElement pendingComments;

	@FindBy(xpath = "//span[@class='approved-count']")
	public WebElement appreovedComments;

	@FindBy(xpath = "//span[@class='spam-count']")
	public WebElement spamComments;

	@FindBy(xpath = "//span[@class='trash-count']")
	public WebElement trashComments;

	@FindBy(xpath = "//tbody[@id='the-comment-list']/tr")
	public List<WebElement> allCommentsLists;

	@FindBy(xpath = "(//a[@class='comments-edit-item-link'])[1]")
	public WebElement hoveroverText;

	@FindBy(xpath = "(//a[@class='vim-r comment-inline'])[1]")
	public WebElement reply;

	@FindBy(id = "replycontent")
	public WebElement text;

	@FindBy(id = "replybtn")
	public WebElement textReply;

	@FindBy(xpath = "//tbody[@id='the-comment-list']//tr[1]//a[@class='comments-view-item-link']")
	public WebElement viewPost;

	@FindBy(xpath = "//div[@class='comment-content']//*[.='Hello every one']")
	public List<WebElement> verifyComment;

	@FindBy(xpath = "//textarea[@id='comment']")
	public WebElement textArea;

	@FindBy(id = "submit")
	public WebElement postComment;

	@FindBy(xpath = "//a[@href='javascript:history.back()']")
	public WebElement back;

	public WebElement verifyingText() {
		int num = verifyComment.size();
		return (WebElement) driver
				.findElements(By.xpath("(//div[@class='comment-content']//*[.='Hello every one'])[" + num + "]"));

	}

	public void commentSub(String name) {
		driver.findElement(By.xpath("//ul[@class='subsubsub']//*[contains(text(),'" + name + "')]")).click();
	}

}
