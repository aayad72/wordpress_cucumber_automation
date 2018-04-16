package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.beans.userBean;
import com.app.pages.WordPressDashboardPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addUsersBeansStepDefs {
	
	WordPressDashboardPage dashboard = new WordPressDashboardPage();
	
	@When("^I add a new user:$")
	public void i_add_a_new_user(List<userBean>users) {
		
		userBean user = users.get(0);
		dashboard.ClickOnDashboardMenu("Users");
		dashboard.addNewUser.click();
		dashboard.username.sendKeys(user.getUsername());
		dashboard.email.sendKeys(user.getEmail());
		dashboard.showPassword.click();
		BrowserUtils.waitFor(10);
		dashboard.passwordField.clear();
		BrowserUtils.waitFor(5);
		dashboard.passwordField.sendKeys(user.getPassword());
		BrowserUtils.waitFor(5);
		dashboard.confirmUseWeakPass.click();
		BrowserUtils.waitFor(5);
		dashboard.send_user_notification.click();
		BrowserUtils.waitFor(5);
		dashboard.createNewUser.click();
	
		
	
		
		
	    
	}

	@Then("^I should see contact information for \"([^\"]*)\"$")
	public void i_should_see_contact_information_for(String fullinfo) {
		
		assertEquals(dashboard.user(fullinfo.split(" ")[0]).getText(), fullinfo.split(" ")[0]);
		assertEquals(dashboard.email(fullinfo.split(" ")[1]).getText(), fullinfo.split(" ")[1]);
		
		
		
	}
	
	
	
	

}
