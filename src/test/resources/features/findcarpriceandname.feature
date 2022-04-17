Feature: Finding Car price and brand names
  As a user i want to find new cars price and brand names
  Background:
    Given user navigate to the website

  Scenario Outline: User finding Car price and Brand names

    Given user navigate to the website
    When user choose menu as new car
    Then user click on find new cars
    And user search for <brand> car
    And user find car name and price

    Examples:
      | brand   |
      | Kia     |
      | Toyota  |
      | Huyndai |
      | Honda   |