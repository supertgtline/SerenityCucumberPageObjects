Feature: Finding New Cars
  As a user i want to find new cars
Background:
  Given user navigate to the website

  Scenario Outline: User finding a new car

    When user choose menu as new car
    Then user click on find new cars
    And user search for <brand> car
    And user validate car <title>

    Examples:
      | brand                             | title            |
      | //div[normalize-space()='Kia']    | Kia Car Models   |
      | //div[normalize-space()='Honda']  | Honda Car Models |
      | //div[normalize-space()='Toyota'] |Toyota Car Models |
