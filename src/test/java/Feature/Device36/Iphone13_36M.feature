Feature: Order a device through business shop

  Scenario Outline: User is able to add a device to basket through businessshop
    Given User did launch the businessshop
    Then User navigates to phone section and selects device with name "<DevName>"
    Then User selects the "<memory>" variant and clicks on view tariff button
    Then User selects the "<term>" and Tariff
    Then User navigates to review basket page and clicks on proceed button
    Then user clicks on existing cutomer
    Then user navigated to order page and enter the details
    Then user selects upgrading or adding and clicks on the checkbox
    Then clicks the order button and get the order number

    Examples:
      |Scenario_Id| DevName                |memory|term     |
      |BSBC-1169  |iPhone 13               |256GB |36 months|