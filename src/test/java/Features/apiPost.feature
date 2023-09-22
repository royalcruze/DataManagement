
Feature: API Testing

  Scenario: Create a user
    Given the API base URL is "https://reqres.in"
    And the request payload is:
      """
      {
        "name": "QA",
        "job": "Test"
      }
      """
    When User sends a POST request to "/api/users"
    Then the response status code should be 201
    And the response body should contain "QA"
