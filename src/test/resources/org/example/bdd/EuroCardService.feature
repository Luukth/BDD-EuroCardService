Feature: EuroCard Service

  Scenario Outline: Validating a creditcard number
    Given I have a EuroCard Service
    When I validate a card with number <number>
    Then the card should be <validity>

    Examples:
      | number | validity |
      | 1      | valid    |
      | 2      | invalid  |
      | 1023   | valid    |
      | 208724 | invalid  |