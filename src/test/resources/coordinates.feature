Feature: Testing coordinates for weather
  Scenario: Coordinates test
    When we are getting coordinates from server
    Then lon is -0.13
    And lat is 51.51
