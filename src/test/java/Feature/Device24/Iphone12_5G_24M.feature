Feature: Order a device through business shop

  Scenario Outline: Customer is able to add a device to basket through businessshop
    Given Customer did launch the businessshop
    Then navigates to phone section and selects device with name "<DevName>"
    Then Customer selects the "<memory>" variant and clicks on view tariff button
    Then Customer selects the "<term>" and Tariff
    Then Customer navigates to review basket page and clicks on proceed button
    Then Customer clicks on existing cutomer
    Then Customer navigated to order page and enter the details
    Then Customer selects upgrading or adding and clicks on the checkbox
    Then Customer clicks the order button and get the order number

    Examples:
      |Scenario_Id| DevName                |memory|term     |
      |BSBC-1496  |iPhone 12 5G            |256GB |24 months|