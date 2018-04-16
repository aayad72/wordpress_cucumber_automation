package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.app.pages.WordPressDashboardPage;
import com.app.pages.WordPressLoginPage;
import com.app.pages.WordPressTagsPage;
import com.app.pages.WordPressWidgetsPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsTestStepsDefinition {

	private WebDriver driver = Driver.getDriver();
	WordPressLoginPage loginPage = new WordPressLoginPage();
	WordPressDashboardPage dashboard = new WordPressDashboardPage();
	WordPressWidgetsPage widgets = new WordPressWidgetsPage();
	WordPressTagsPage tags = new WordPressTagsPage();
	
	@When("^I create new a post$")
	public void i_create_new_a_post() {
		BrowserUtils.waitFor(5);
		tags.posts.click();
		BrowserUtils.waitFor(2);
		tags.addNewPost.click();
		BrowserUtils.waitFor(3);
		tags.postTitle.sendKeys("Add A Tag To Tech 17 Post");
		BrowserUtils.waitFor(2);
		//tags.visual.click();
		//Driver.getDriver().switchTo().frame(dashboard.frame);
		
		tags.textField2.sendKeys("This post will be showing you how to add tags and verify it ");
		
		//Driver.getDriver().switchTo().parentFrame();
	    
	}

	@When("^I add new Tags$")
	public void i_add_new_Tags() {
		BrowserUtils.waitFor(2);
		tags.setTagName.sendKeys("Tech 17");
		BrowserUtils.waitFor(5);
		tags.AddTagpost.click();
		BrowserUtils.waitFor(2);
	
	}

	@When("^Publish the post should displayed \"([^\"]*)\" tag$")
	public void publish_the_post_should_displayed_tag(String arg1) {
		BrowserUtils.scrollUp();
		BrowserUtils.waitFor(25);
		tags.publish.click();
		BrowserUtils.waitFor(20);
	
		tags.viewPost.click();
		BrowserUtils.waitFor(10);
		assertEquals(tags.tagsInPost.getText(),
				"Tech 17");
		BrowserUtils.waitFor(10);
	}

	@When("^I click on Tags$")
	public void i_click_on_Tags() {
		BrowserUtils.hover(tags.posts);
		BrowserUtils.waitFor(5);
		tags.tag.click();
	}

	@Then("^I add new tag \"([^\"]*)\"$")
	public void i_add_new_tag(String name) {
		tags.tagName.sendKeys(name);
		BrowserUtils.waitFor(2);
		tags.tagSlug.sendKeys(name);
		BrowserUtils.waitFor(1);
		tags.addNewTag.click();
	}

	@Then("^the tag should be displayed in List$")
	public void the_tag_should_be_displayed_in_List() {
		BrowserUtils.waitFor(5);
		tags.tagTable.isDisplayed();
		
	}
	
	@Then("^Delete \"([^\"]*)\"$")
	public void delete(String name) {
	    tags.deletePost(name, "Delete");
	    driver.switchTo().alert().accept();
	}
	
	@Given("^I click on Post$")
	public void i_click_on_Post() {
		BrowserUtils.waitFor(5);
		tags.posts.click();
		
	   
	}

	@Then("^I will delete \"([^\"]*)\"$")
	public void i_will_delete(String name) {
		tags.deletePost(name, "Trash");
		
		
	}

}