package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.openqa.selenium.WebElement;

import com.app.pages.WordPressCreateCategoryPage;
import com.app.pages.WordPressDashboardPage;
import com.app.pages.WordPressLoginPage;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCategoryStepDefinitions {
	
	WordPressLoginPage loginpage = new WordPressLoginPage();
	WordPressDashboardPage dashpage = new WordPressDashboardPage();
	WordPressCreateCategoryPage categorypage = new WordPressCreateCategoryPage();

	@When("^I click on Categories$")
	public void i_click_on_Categories() {
		dashpage.posts.click();
		BrowserUtils.waitFor(3);
		categorypage.categories.click();
	}

	@When("^Categories page is displayed$")
	public void categories_page_is_displayed() {
		BrowserUtils.waitFor(1);
		assertTrue(categorypage.verifyPage());
	}
	
	@When("^I create a new category$")
	public void i_create_a_new_category(Map<String, String> cat) {
		if (cat.get("name") != null) {
			categorypage.name.sendKeys(cat.get("name"));
		}
		if (cat.get("slug") != null) {
			categorypage.slug.sendKeys(cat.get("slug"));
		}
		if (cat.get("description") != null) {
			categorypage.description.sendKeys(cat.get("description"));
		}
		categorypage.submit.click();
	}

	@Then("^I should see new category \"([^\"]*)\"$")
	public void i_should_see_new_category(String name) {
		BrowserUtils.waitFor(3);
		for(WebElement we:categorypage.nameColumn) {
			if(we.getText().equals(name)) {
				System.out.println("Name = "+name);
				assertTrue(true);
				break;
			}
		}
	}

	 @Then("^I create multiple new categories$")
	 public void i_create_multiple_new_categories(Map<String,String> cat) {
			if (cat.get("name") != null) {
				categorypage.name.sendKeys(cat.get("name"));
			}
			if (cat.get("slug") != null) {
				categorypage.slug.sendKeys(cat.get("slug"));
			}
			if (cat.get("description") != null) {
				categorypage.description.sendKeys(cat.get("description"));
			}
			categorypage.submit.click();
	 }
	 
	 @Then("^With slug \"([^\"]*)\"$")
	 public void with_slug(String slug) {
			BrowserUtils.waitFor(3);
			for(WebElement we:categorypage.slugColumn) {
				if(we.getText().equals(slug)) {
					System.out.println("Slug = "+slug);
					assertTrue(true);
					break;
				}
			}
	 }

	 @Then("^With description \"([^\"]*)\"$")
	 public void with_description(String des) {
			BrowserUtils.waitFor(3);
			for(WebElement we:categorypage.desColumn) {
				if(we.getText().equals(des)) {
					System.out.println("Description = "+des);
					assertTrue(true);
					break;
				}
			}
	 }

}
