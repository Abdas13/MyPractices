Feature: User be able to fill in the Student Registration Form with valid credentials

  Scenario Outline:
    Given user navigates to "https://demoqa.com/automation-practice-form/"
    When user enters with valid credentials into related boxes  "<name>" , "<lastName>" , "<email>" , "<gender>" , "<mobileNumber>" , "<dateOfBirth>" , "<subjects>" , "<hobbies>" , "<picture>", "<currentAddress>" , "<state>" , "<city>"
    And user clicks the submit button
    Then user asserts the success message

    Examples:
      | name  | lastName | email     | gender | mobileNumber | dateOfBirth | subjects | hobbies | picture    | currentAddress | state   | city   |
      | Johny | Walker   | jw@qa.com | male   | 4567345654   | 21 Apr 1974 | Math     | Music   | uploadPath | 15 Oakville    | Haryana | Karnal |