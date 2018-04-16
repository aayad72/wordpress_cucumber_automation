package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.app.pages.WordPressDashboardPage;
import com.app.pages.WordPressLoginPage;
import com.app.pages.WordPressWidgetsPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WidgetsTestStepDefiniton {

	private WebDriver driver = Driver.getDriver();
	WordPressLoginPage loginPage = new WordPressLoginPage();
	WordPressDashboardPage dashboard = new WordPressDashboardPage();
	WordPressWidgetsPage widgets = new WordPressWidgetsPage();

	@Given("^I create a new page$")
	public void i_create_a_new_page() {
		widgets.pages.click();
		BrowserUtils.waitFor(5);
		widgets.addNewPage.click();

	}

	@Then("^Set title as \"([^\"]*)\"$")
	public void set_title_as(String arg1) {
		widgets.titlePage.sendKeys("Tech 17 Calendar");
		BrowserUtils.waitFor(5);
	}

	@Then("^I click on Page Builder$")
	public void i_click_on_Page_Builder() {
		widgets.pageBuilder.click();
		BrowserUtils.waitFor(7);

	}

	@Then("^I add Calendar Widget$")
	public void i_add_Calendar_Widget() {
		widgets.addWidget.click();
		BrowserUtils.waitFor(5);
		widgets.calendar.click();
		BrowserUtils.waitFor(5);

	}

	@Then("^Publish Calendar Page$")
	public void publish_Calendar_Page() {
		widgets.publishButton.click();
		BrowserUtils.waitFor(5);

	}

	@Then("^the Calendar should be displayed in Page$")
	public void the_Calendar_should_be_displayed_in_Page() {
		widgets.viewPage.click();
		BrowserUtils.waitFor(5);
		assertTrue(widgets.pageCalendar.isDisplayed());

	}

	@Then("^Set page title as \"([^\"]*)\"$")
	public void set_page_title_as(String arg1) {
		widgets.titlePage.sendKeys("Tech 17 Team");
		BrowserUtils.waitFor(5);
	}

	@Then("^I add Gallery widgets$")
	public void i_add_Gallery_widgets() {
		widgets.addWidget.click();
		BrowserUtils.waitFor(5);

		widgets.gallery.click();
		BrowserUtils.waitFor(5);

		BrowserUtils.hover(widgets.galleryThumbnail);

		widgets.editGallery.click();
		BrowserUtils.waitFor(5);
	}

	@Then("^Set title \"([^\"]*)\"$")
	public void set_title(String arg1) {
		widgets.gallerytitle.sendKeys("Meet My Team");
		BrowserUtils.waitFor(5);
	}

	@Then("^Add on Images$")
	public void add_on_Images() {

		widgets.addImage.click();
		BrowserUtils.waitFor(5);

		widgets.searchButton.sendKeys("Amine");
		BrowserUtils.waitFor(1);
		widgets.selectImage.click();
		BrowserUtils.waitFor(1);

		widgets.searchButton.clear();
		widgets.searchButton.sendKeys("Ikbol");
		BrowserUtils.waitFor(1);
		widgets.selectImage.click();

		widgets.searchButton.clear();
		widgets.searchButton.sendKeys("Ken");
		BrowserUtils.waitFor(1);
		widgets.selectImage.click();

		widgets.searchButton.clear();
		widgets.searchButton.sendKeys("Ivan");
		BrowserUtils.waitFor(1);
		widgets.selectImage.click();

		widgets.searchButton.clear();
		widgets.searchButton.sendKeys("Ahmad");
		BrowserUtils.waitFor(1);
		widgets.selectImage.click();

		widgets.searchButton.clear();
		widgets.searchButton.sendKeys("Husna");
		BrowserUtils.waitFor(1);
		widgets.selectImage.click();

		widgets.createNewGallery.click();
		BrowserUtils.waitFor(5);
		widgets.insertButton.click();
		BrowserUtils.waitFor(5);
		widgets.done.click();
		BrowserUtils.waitFor(5);

	}

	@Then("^Publish images in gallery$")
	public void publish_images_in_gallery() {
		widgets.publishButton.click();
		BrowserUtils.waitFor(5);
	}

	@Then("^Gallery images should be displayed$")
	public void gallery_images_should_be_displayed() {
		widgets.viewPage.click();
		BrowserUtils.waitFor(5);
		assertTrue(widgets.pageGallery.isDisplayed());

	}

	@Given("^I click on Pages$")
	public void i_click_on_Pages() {
		widgets.pages.click();
		BrowserUtils.waitFor(5);
	}

	@Then("^Delete Page\"([^\"]*)\"$")
	public void delete_Page(String title) {
		BrowserUtils.scrollDown();
		widgets.deletePage(title,"Trash");
	}

	@Then("^Delete the other \"([^\"]*)\"$")
	public void delete_the_other(String title) {
		widgets.deletePage(title,"Trash");

	}
}
