package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.app.pages.WordPressDashboardPage;
import com.app.pages.WorldPresCommentsPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommentsStepDefenition {

	private WebDriver driver = Driver.getDriver();
	WorldPresCommentsPage comment = new WorldPresCommentsPage();
	WordPressDashboardPage dashboard = new WordPressDashboardPage();

	@When("^I click on Comments$")
	public void i_click_on_Comments() {
		dashboard.ClickOnDashboardMenu("Comments");
		assertEquals(comment.textComment.getText(), "Comments", "Page text Comment is not matching");
		assertTrue(driver.getTitle().contains("Comments"), "Title is not matching");
	}

	@When("^i click on \"([^\"]*)\"$")
	public void i_click_on(String name) {
		comment.commentSub(name);

	}

	@Then("^Verifying how many comments posted$")
	public void verifying_how_many_comments_posted() {
		String result1 = comment.allComments.getText();
		int result2 = comment.allCommentsLists.size();
		assertEquals(Integer.parseInt(result1), result2, "Posted Comments is not matching");
	}

	@When("^I click on Tech(\\d+) reply and send text and reply$")
	public void i_click_on_Tech_reply_and_send_text_and_reply(int arg1) {
		BrowserUtils.hover(comment.hoveroverText);
		comment.reply.click();
		comment.text.sendKeys("Hello every one");
		comment.textReply.click();

	}

	@When("^I click on View Post and posting new comment$")
	public void i_click_on_View_Post_and_posting_new_comment() {
		comment.viewPost.click();

	}

	@Then("^In same page posting new comment$")
	public void in_same_page_posting_new_comment() {
		comment.textArea.click();
		comment.textArea.sendKeys("testing");
		comment.postComment.click();
		comment.back.click();
	}

}
