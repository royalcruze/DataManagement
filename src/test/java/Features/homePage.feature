

Feature: HomePage - Request types and Endpoints
  

  
  Scenario: Verify the request types and endpoints
    Given User on the homepage
    
    When User verify the Homepage displays request types and endpoints
    Then User clicks on specific request type
    And User verify the selected request type details status code and response
    And User verify the presence of a button to navigate to support page

  