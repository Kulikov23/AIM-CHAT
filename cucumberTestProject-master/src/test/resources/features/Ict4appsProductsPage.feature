Feature: Products Page

  Background:
    Given the user is on products page


  Scenario Outline: test18
    When the user click on title of the "<number of product>"
    Then Product should have title, description and image
    When the user click on ReadMore link of the "<number of product>"
    Then Product should have title, description and image
    When the user click on image of the "<number of product>"
    Then Product should have title, description and image
    Examples:
      |number of product|
      |1                |
      |6                |
      |12               |

  Scenario Outline: 10
    When the user click on "VKontakte" icon  in "<Number of product>" product
    Then page should contain "http://oauth.vk.com" part in URL
#    When the user click on "Facebook" icon  in "1" product
#    Then page should contain "facebook.com" part in URL
    When the user click on "Twitter" icon  in "<Number of product>" product
    Then page should contain "https://twitter.com" part in URL
    When the user click on "LinkedIn" icon  in "<Number of product>" product
    Then page should contain "https://www.linkedin.com" part in URL
    When the user click on "Pinterest" icon  in "<Number of product>" product
    Then page should contain "https://www.pinterest.com" part in URL
    When the user click on "Google Plus" icon  in "<Number of product>" product
    Then page should contain "https://plus.google.com" part in URL
    Examples:
    |Number of product|
    |1                |
    |6                |
    |12               |

  Scenario Outline: 11
    When the user click on pages dropdown menu
    When the user select "<Number of item>" item in pages dropdown menu
    Then label that showing number of results should change to "<Expected state>"
    Examples:
    |Number of item|Expected state                |
    |1             |Showing 1 - 12 Of 98 Results  |
    |4             |Showing 37 - 48 Of 98 Results |
    |9             |Showing 97 - 98 Of 98 Results |

   Scenario Outline: 12
     When the user click on items per page dropdown menu
     When the user select "<Number of showing items>" item in items per page dropdown menu
     Then label that showing number of results should change to "<Expected state>"
#     Then product list should contain '<Number of showing items>' items
     Examples:
     |Number of showing items|Expected state               |
     |12                     |Showing 1 - 12 Of 98 Results |
     |36                     |Showing 1 - 36 Of 98 Results |
     |96                     |Showing 1 - 96 Of 98 Results |




    Scenario: testooo
      When the user open  product that have three images, "5" product in "Appetizers" category
      When the user click on main image in product description page
      Then Close button and right arrow should be at image gallery
      Then image gallery should be close after click on close button



    Scenario Outline: test8 PAGINATION NEXT
      When the user click on "<PAGINATOR>" pagination button
      Then label that showing number of results should change to "<Expected state>"
#      Then
      Examples:
      |PAGINATOR|Expected state                |
      |Next     |Showing 13 - 24 Of 98 Results |
      |Previous |Showing 1 - 12 Of 98 Results  |
      |Last →   |Showing 97 - 98 Of 98 Results |
      |← First  |Showing 1 - 12 Of 98 Results  |

  Scenario: 15
    When the user click on "th-large" view icon
    Then products list should change it's view on grid
   When the user click on "list" view icon
    Then products list should change it's view on list

    Scenario: test16
      When the user click on search button
      Then search page should have search field
      Then search page should have scope dropdown menu
      Then search page should have search button

  Scenario: test17
  Then Page should contain "ict4apps" in first part of breadcrumb
    Then Page should contain "Products" in second part of breadcrumb

  Scenario: test188
    When the user click on "Special Offer"th category in category list
    Then Page should have "Special Offer" in third part of breadcrumb

#  Scenario: test199
#    When the user open list with subcategories of "Desserts" category
#    When the user click on "Cakes" subcategory
#    Then Page should have "Cakes" in fourth part of breadcrumb


