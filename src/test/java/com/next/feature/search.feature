Feature:  Search

  Scenario: validate search behaviour based on jeans as a product type

    Given I am on the next home page
    When I enter "Jeans" as a product type in the search box
    And I click on search button
    Then I should be able to see "Jeans" as a result title