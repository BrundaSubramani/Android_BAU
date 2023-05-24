Feature: Order a SIM through business shop
  Scenario Outline: Customer orders a SIM through businessshop
    Given Customer is on business shop home page
    When customer hovers on shop and clicks on Sim Only
    Then customer is navigated to the Simo page and selects the <SimoContractTerm>
    Then customer clicks on the <Serialno> "<SimoTariff>" and clicks on continue
    Then customer clicks on FourG or FiveG Simo "<FourG_FiveGSIMO>"
    Then customer is navigated to the extras page and selects spend cap "<SIMOSpendCapSelect>" <SIMOSpendCapValue> and clicks on next button
    Then customer is navigated to business apps page and select the business app and clicks on next button
    Then customer lands on review basket page and clicks on proceed button
    Then customer selects either new or existing customer button
    Then customer enter all details "<email>"
    Then customer click on order button and get the order number for sim

    Examples:
      |Scenario_Id         |Serialno      |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|email            |
      |BSBC-1343 BSBC-1338 |1             |12              |6GB       |4G             |NO                |5                |Test@yopmail.com |
