Feature: Feature001
  Scenario Outline: To verify sales rep is able to perform the E2E
    Given User login as sales rep for RU portal
    Then User enters the "<account pin>" then on check button
    Then User can verify the page and click on proceed
    Then User can add the Upgrade details for all RU products "<select handset>" "<IMEI Number>" and "<Select Tariff>"
    Then User can click on proceed to insurance button
    Then User click on proceed to upgrade button
    Then User can see the order summary page then click on place order
    Then User can see the total approved page of ru

    Examples:
      |Scenario_Id| account pin|select handset                             |IMEI Number    |Select Tariff                           |
      |BSBC-1340  |1010        |Samsung Galaxy S22 128GB Bora Purple       |100000000000000| Small Biz 6GB 36M RU Opt 12            |