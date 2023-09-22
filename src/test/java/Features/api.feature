Feature: API Testing

  Scenario: Get user by ID
    Given the API base URL is "https://reqres.in"
    When User sends a GET request to "/api/users/2"
    Then the response status code should be 200
    And the response body should contain "janet.weaver@reqres.in"

 