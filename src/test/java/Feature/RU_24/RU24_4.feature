Feature: Feature001
  Scenario Outline: To verify sales rep is able to perform E2E
    Given User logins as sales rep for RU portal
    Then User enters the "<account pin>" and click on check button
    Then User can see the page and click on proceed
    Then User can add the Upgrade for all RU products "<select handset>" "<IMEI Number>" and "<Select Tariff>"
    Then User can click on proceed to insurance
    Then User click on proceed to upgrade
    Then User can see the order summary page and click on place order
    Then User can see the total approved page


    Examples:
      |Scenario_Id| account pin|select handset                             |IMEI Number    |Select Tariff                           |
      |BSBC-1344  |1010        |iPhone 13 Pro 128GB Gold                   |100000000000000| Small Biz 20GB 24M RU Opt 19           |