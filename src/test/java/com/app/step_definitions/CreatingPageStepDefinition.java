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

public class CreatingPageStepDefinition {

	private WebDriver driver = Driver.getDriver();
	WordPressLoginPage loginPage = new WordPressLoginPage();
	WordPressDashboardPage dashboard = new WordPressDashboardPage();

	@When("^I click on Pages$")
	public void i_click_on_Pages() {
	   dashboard.pages.click();
	  
	}

	@Then("^I click to Add New$")
	public void i_click_to_Add_New() {
		 dashboard.addNewPage.click();
	}

	@Then("^I enter title \"([^\"]*)\"$")
	public void i_enter_title(String page) {
		page="Lalafo Page";
		dashboard.titlePage.sendKeys(page);
	   
	}

	@Then("^I type on text field$")
	public void i_type_on_text_field() {
	   dashboard.typeTextOnPage.sendKeys("Welcome to www.besmart.kg");
	}

	@Then("^I publish$")
	public void i_publish() {
	    dashboard.publish.click();
	}

	@Then("^Then I logout from application$")
	public void then_I_logout_from_application() {
		dashboard.logout();
	}
	
	
	
	@Then("^I click to Add Media$")
	public void i_click_to_Add_Media() {
	    dashboard.mediaButtonOnPage.click();
	}

	@Then("^I click to Media Library$")
	public void i_click_to_Media_Library() {
		 dashboard.mediaLib.click();
	}

	@Then("^I select image$")
	public void i_select_image() throws InterruptedException {
		dashboard.imageSelected.click();
		Thread.sleep(3);
		dashboard.insertItnoPage.click();
	}
	

@When("^I click to All Pages$")
public void i_click_to_All_Pages() {
    dashboard.allPages.click();
}

@Then("^I look for given page name \"([^\"]*)\"$")
public void i_look_for_given_page_name(String page) throws InterruptedException {
	page="Lalafo Page";
	try {
    dashboard.pageNameToDelete(page).click();
    Thread.sleep(3);
    dashboard.bulkAction.click();
    Thread.sleep(3);
    dashboard.apply.click();
	}catch (Exception e) {
		System.out.println("Page not found");
	}
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}