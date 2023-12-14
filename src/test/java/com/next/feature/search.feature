Feature:  Search

  Scenario: validate search behaviour based on Jeans as a product type

    Given I am on the next home page
    When I enter "Jeans" as a product type in the search box
    And I click on search button
    Then I should be able to see "Jeans" as a result title

  Scenario: validate search behaviour based on Shirt as a product type

    Given I am on the next home page
    When I enter "Shirts" as a product type in the search box
    And I click on search button
    Then I should be able to see "Shirts" as a result title

  Scenario: validate search behaviour based on Shoe as a product type

    Given I am on the next home page
    When I enter "Shoe" as a product type in the search box
    And I click on search button
    Then I should be able to see "Shoe" as a result title