package com.app.step_definitions;

import org.openqa.selenium.WebDriver;

import com.app.pages.WordPressDashboardPage;
import com.app.pages.WordPressLoginPage;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingPostStepDefinitions {

	private WebDriver driver = Driver.getDriver();
	WordPressLoginPage loginPage = new WordPressLoginPage();
	WordPressDashboardPage dashboard = new WordPressDashboardPage();

	@When("^I click on Post/Add New$")
	public void i_click_on_Post_Add_New() throws InterruptedException {
		Thread.sleep(3);
		dashboard.posts.click();
		Thread.sleep(3);
		dashboard.addNewPost.click();
	}

	@Then("^I enter post title on title field$")
	public void i_enter_post_title_on_title_field() {
		dashboard.postTitle.sendKeys("Ahmads baby");

	}

	@Then("^type post on text area$")
	public void type_post_on_text_area() {
		//ghdashboard.typeTextOnPage.sendKeys("Today's content is....");
		
		try {
			Driver.getDriver().switchTo().frame(dashboard.frame);
			dashboard.textField.sendKeys("Today's content is....");
			Driver.getDriver().switchTo().parentFrame();}
			catch (Exception e) {
				dashboard.textField2.sendKeys("Today's content is....");
			}

	}

	@Then("^I click publish$")
	public void i_click_publish() throws InterruptedException {
		dashboard.publish.click();
		Thread.sleep(3);

	}

	@Then("^I click Add Media button$")
	public void i_click_Add_Media_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		dashboard.addMediaOnPost.click();
		Thread.sleep(3);
		dashboard.mediaLib.click();
		dashboard.imageSelected.click();
		Thread.sleep(5);
		dashboard.insertImage.click();
	}

	@When("^I click on Posts$")
	public void i_click_on_Posts() {
		dashboard.posts.click();

	}

	@When("^I click to All Posts$")
	public void i_click_to_All_Posts() {
		dashboard.allPosts.click();
	}

	@Then("^I look for given post name \"([^\"]*)\"$")
	public void i_look_for_given_post_name(String name) {
		name = "Ahmads baby";
		try {
		dashboard.postNameToDelete(name).click();
		dashboard.bulkAction.click();
		dashboard.apply.click();
		} catch(Exception e) {
			System.out.println("Post not found");
		}
	}

}
