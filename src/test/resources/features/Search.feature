Feature: Visit Qual IT website so that can perform action

  Scenario: search feature
    Given I am in the qualit home page
    And I input search content
    Then I should see search result
    
  Scenario: go to contect us page
  	Given I am in the qualit home page
  	And I click contact us link 
  	Then I should see contact us page
  	