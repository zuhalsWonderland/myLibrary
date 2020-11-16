Feature: Verify both Students and librarians  login


  Scenario Outline: login with different roles
    When user login as a "<role>"
    Then user on  "<page>"

    Examples:
      | role        | page      |
      | student18   | Books     |
      | librarian22 | Dashboard |
