package com.app.step_definitions;

import java.util.List;

import com.app.beans.userBean;
import com.app.pages.WordPressDashboardPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addUsersBeansStepDefs {
	
	WordPressDashboardPage dashboard = new WordPressDashboardPage();
	
	@When("^I add a new user:$")
	public void i_add_a_new_user(List<userBean>users) {
		
		userBean user = users.get(0);
		dashboard.ClickOnDashboardMenu("Users");
		dashboard.addNewUser.click();
		dashboard.username.sendKeys(user.getEmail());
		
		
	    
	}

	@Then("^I should see contact information for \"([^\"]*)\"$")
	public void i_should_see_contact_information_for(String arg1) {
	  
	}
	
	
	
	

}
