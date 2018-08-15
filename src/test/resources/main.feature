Feature: Testing main for weather
  Scenario: Main test
    When we are getting main from server
    Then temp is 280.32
    And pressure is 1021
    And humidity is 81
    And temp_min is 279.15
    And temp_max is 281.15