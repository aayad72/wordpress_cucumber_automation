package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import com.app.pages.WordPressCustomizeThemesPage;
import com.app.pages.WordPressDashboardPage;
import com.app.pages.WordPressLoginPage;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangingAppearanceThemeStepDefinitions {
	
	WordPressLoginPage loginpage=new WordPressLoginPage();
	WordPressDashboardPage dashpage=new WordPressDashboardPage();
	WordPressCustomizeThemesPage themespage= new WordPressCustomizeThemesPage();

	String name="";
	
	@When("^I click on Appearance/themes$")
	public void i_click_on_Appearance_themes() {
		dashpage.ClickOnDashboardMenu("Appearance");
		dashpage.ClickOnDashboardMenu("Appearance");
		BrowserUtils.waitFor(3);
	}

	@Then("^activate new theme$")
	public void activate_new_theme() {
		themespage.randomTheme();
		BrowserUtils.waitFor(2);
		name=themespage.themeName.getText();
		themespage.save.click();
		BrowserUtils.waitFor(2);
		themespage.back.click();
		
		String[] names=name.split("theme");
		name=names[1];
		String[] names2=name.split("Change");
		name=names2[0].trim();
		System.out.println("New Theme : "+name);
	}

	@Then("^the new theme should displayed$")
	public void the_new_theme_should_displayed() {		
		themespage.site.click();
		BrowserUtils.waitFor(2);
		assertTrue(themespage.searchForThemeChange(name));
	}

	@Then("^I put back the default theme$")
	public void i_put_back_the_default_theme() {
		themespage.randomTheme();
		BrowserUtils.waitFor(3);
		themespage.back.click();
	}

	@Then("^the default theme should displayed$")
	public void the_default_theme_should_displayed() {
		themespage.site.click();
		BrowserUtils.waitFor(2);
		assertTrue(themespage.searchForThemeChange(name));
	}

	@Then("^add new theme$")
	public void add_new_theme() {
		themespage.newThemes.click();
		BrowserUtils.waitFor(1);
		themespage.installNewTheme();
		BrowserUtils.waitFor(7);
	}
	
	@Given("^I am on themes page$")
	public void i_am_on_themes_page() {
		BrowserUtils.waitFor(2);
		assertTrue(themespage.verifyPage());
	}
	

}
