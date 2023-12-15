Feature:  Search

Scenario Outline: validate search behaviour based on product type

  Given I am on the next home page
  When I enter "<productType>" as a product type in the search box
  And I click on search button
  Then I should be able to see "<resultTitle>" as a result title

  Examples:
    | productType | resultTitle |
    |Jeans        |Jeans        |

