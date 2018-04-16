@tags
Feature: editing a tag

Background: 
    Given I logged into WordPress

    
 
Scenario: Adding tag in new post
		When I create new a post 
    And  I add new Tags 
    And Publish the post should displayed "" tag
    Then I logout from application 


Scenario: Creating a tag 
  When I click on Tags
  Then I add new tag "Tech17CyberTek" 
  Then the tag should be displayed in List
  Then Delete "Tech17CyberTek"
  Then I logout from application
  
Scenario: Delete Posttags
  And I click on Post 
  Then I will delete "Add A Tag To Tech 17 Post"
  Then I logout from application  
  
 
  



