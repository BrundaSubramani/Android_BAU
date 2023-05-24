Feature: Feature003
  Scenario Outline: To verify sales rep is able to perform E2E
    Given User logins as sales rep for RU portal to perform on sim
    Then User enters the "<account pin>" and click on check
    Then User can verify page and click on proceed
    Then User can add the Upgrade for all RU products by clicking on sim "<select handset>" "<IMEI Number>" and "<Select Tariff>"
    Then Then user click on proceed to insurance
    Then User click on proceed to upgrade link
    Then User can verify the order summary page and click on place order
    Then User can see and verify the total approved page
    Examples:
      |Scenario_Id|account pin|select handset                     |IMEI Number    |Select Tariff                           |
      |BSBC-1175  |1010       |Other smartphones SIM - Smartphone |100000000000000|MBB SIM Only 300GB 12M                  |