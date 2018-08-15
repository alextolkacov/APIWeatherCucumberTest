Feature: Testing weather for weather
  Scenario: Weather test
    When we are getting weather from server
    Then id is 300
    And main is Drizzle
    And description is light intensity drizzle
    And icon is 09d