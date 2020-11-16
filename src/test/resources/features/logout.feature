Feature: As a user, I should be able to logout from the library app.


  Scenario Outline: logout
    When user login as a "<role>"
    And the user clicks userDropdown and clicks the logout button
    Then the user is on the login page

    Examples:
      | role        |
      | student18   |
      | librarian22 |
