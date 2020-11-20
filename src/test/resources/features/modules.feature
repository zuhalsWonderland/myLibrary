Feature: As a user, I should be able to  see several modules once login.


  @wip
  Scenario Outline: login with different roles
    When user login as a "<role>"
    Then user should see "<module>"

    Examples:
      | role        | module                |
      | student18   | Books Borrowing Books |
      | librarian22 | Dashboard Users Books |
