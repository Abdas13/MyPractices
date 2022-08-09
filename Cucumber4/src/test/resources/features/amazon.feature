Feature: US002_user search Macbook Pro on Amazon

  Scenario: user search writes Macbook Pro in search box
    Given user enters "https://www.amazon.ca/" on browser
    Then user writes "Macbook Pro" at search box
