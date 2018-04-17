package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.app.pages.WordPressAppearanceMenuPage;
import com.app.pages.WordPressDashboardPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppearanceMenusStepDefenition {

	private WebDriver driver = Driver.getDriver();
	WordPressDashboardPage dashboard = new WordPressDashboardPage();
	WordPressAppearanceMenuPage menuPage = new WordPressAppearanceMenuPage();

	@When("^I click on Appearance/Menus$")
	public void i_click_on_Appearance_Menus() {
		BrowserUtils.waitFor(5);
		dashboard.ClickOnDashboardMenu("Appearance");
		BrowserUtils.waitFor(5);
		menuPage.Menus.click();
	}

	@Then("^I click on \"([^\"]*)\"$")
	public void i_click_on(String name) {
		menuPage.chooseMenus(name);
		menuPage.url.sendKeys("www.google.com");
		menuPage.linkText.sendKeys("GOOGLE HELPER");
		menuPage.linkAddToMenu.click();
		
	}

	@Then("^the new menu item should be displayed in Menu Structure$")
	public void the_new_menu_item_should_be_displayed_in_Menu_Structure() {
		assertTrue(menuPage.customLinkText.isDisplayed(), "Custom Link is not displayed");

	}

	@Then("^I create \"([^\"]*)\" click on check box$")
	public void i_create_click_on_check_box(String name) {
		menuPage.chooseMenus(name);
		BrowserUtils.waitFor(5);
		menuPage.postCheckBox.click();
		menuPage.postAddToMenu.click();

	}

	@Then("^I am creating \"([^\"]*)\" click on Smoke Test check box$")
	public void i_am_creating_click_on_Smoke_Test_check_box(String name) {
		menuPage.chooseMenus(name);
		menuPage.chooseMenus(name);
		BrowserUtils.waitFor(5);
		menuPage.pagesSmokeTestCheckBox.click();
		menuPage.pagesAddToMenu.click();
	}
}
