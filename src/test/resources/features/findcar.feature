Feature: Finding New Cars
  As a user i want to find new cars
Background:
  Given user navigate to the website

  Scenario Outline: User finding a new car

    Given user navigate to the website
    When user choose menu as new car
    Then user click on find new cars
    And user search for <brand> car
    And user validate car title

    Examples:
    | brand   |
    | Kia     |
    | Toyota  |
    | Huyndai |
    | Honda   |