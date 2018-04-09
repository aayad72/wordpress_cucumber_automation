package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.app.pages.WordPressDashboardPage;
import com.app.pages.WordPressLoginPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestStepsDefinition {

	private WebDriver driver = Driver.getDriver();
	WordPressLoginPage loginPage = new WordPressLoginPage();
	WordPressDashboardPage dashboard = new WordPressDashboardPage();

	@Given("^I logged into WordPress$")
	public void i_logged_into_WordPress() {

		driver.get(ConfigurationReader.getProperty("url"));
		loginPage.user_login.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.user_pass.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.loginButton.click();

	}

	@Then("^the title of the landing page should be \"([^\"]*)\"$")
	public void the_title_of_the_landing_page_should_be(String title) {

		String actualTitle = driver.getTitle().replace("‹", "").replace("—", "");
		assertEquals(actualTitle, title);

	}

	@Then("^the expected url should be \"([^\"]*)\"$")
	public void the_expected_url_should_be(String url) {
		assertEquals(driver.getCurrentUrl(), url);
	}

	@When("^I create a page$")
	public void i_create_a_page() {
		// dashboard.ClickOnDashboardMenu("Pages");

		dashboard.pages.click();
		BrowserUtils.waitFor(5);
		dashboard.addNewPage.click();
		dashboard.titlePage.sendKeys("SmokeTestPage");
		Driver.getDriver().switchTo().frame(dashboard.frame);
		dashboard.textField
				.sendKeys("this testing is used to decide if a build is stable enough to proceed with further testing");
		Driver.getDriver().switchTo().parentFrame();
	}

	@When("^I publish the page$")
	public void i_publish_the_page() {
		BrowserUtils.waitFor(15);
		dashboard.publish.click();
		BrowserUtils.waitFor(10);
	}

	@Then("^the page should be displayed$")
	public void the_page_should_be_displayed() {
		BrowserUtils.waitFor(10);
		dashboard.ViewPage.click();
		assertTrue(driver.getTitle().contains("SmokeTestPage"));
		assertEquals(dashboard.textBodyInCreatedPage.getText(),
				"this testing is used to decide if a build is stable enough to proceed with further testing");
	}

	@Then("^I logout from application$")
	public void i_logout_from_application() {
		BrowserUtils.waitFor(15);
		dashboard.logout();

	}

	@When("^I create a post$")
	public void i_create_a_post() {
		dashboard.ClickOnDashboardMenu("Posts");
		dashboard.addNewPost.click();
		dashboard.postTitle.sendKeys("SmokeTestPost");
		Driver.getDriver().switchTo().frame(dashboard.frame);
		dashboard.textField.sendKeys("this testing is used to decide if a build is stable enough to proceed with further testing");
		Driver.getDriver().switchTo().parentFrame();
	}

	@Then("^the post should be displayed$")
	public void the_post_should_be_displayed() {
		dashboard.ViewPost.click();
		assertTrue(driver.getTitle().contains("SmokeTestPost"));
		assertEquals(dashboard.textBodyInCreatedPage.getText(),
				"this testing is used to decide if a build is stable enough to proceed with further testing");

	}

}
