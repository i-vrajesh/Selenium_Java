Feature : Login feature

  @Test
  Scenario Outline: Login Amazon Application
    Given user will open browser
    And user will enter Amazon url
    Then user enters "<userID>" and "<password>" to login
    And user clicks continue button
    Then user lands in home page
    And terminate browser
    Examples:
      | userID     | password  |
      | 6302069187 | VRam@0051 |