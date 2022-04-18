Feature: Finding Car price and brand names
  As a user i want to find new cars price and brand names
  Background:
    Given user navigate to the website

  Scenario Outline: User finding Car price and Brand names
    When user choose menu as new car
    Then user click on find new cars
    And user search for <brand> car
    And user validate car <title>
    And user find car name and price
    And user updates the name and price in a file for each <title>

    Examples:
      | brand                             | title            |
      | //div[normalize-space()='Kia']    | Kia Car Models   |
      | //div[normalize-space()='Honda']  | Honda Car Models |
      | //div[normalize-space()='Toyota'] |Toyota Car Models |