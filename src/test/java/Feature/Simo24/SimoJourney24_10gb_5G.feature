Feature: Order a SIM through business shop
  Scenario Outline: Customer orders a SIM through businessshop
    Given customer is on Business shop homepage
    When customer hovers on shop and clicks on SimOnly
    Then customer is navigated to the simo page and selects the <SimoContractTerm>
    Then customer clicks on the <Serialno> "<SimoTariff>" and clicks on continue button
    Then customer clicks on FourG or FiveG Sim "<FourG_FiveGSIMO>"
    Then customer is navigated to the Extras page and selects spendcap "<SIMOSpendCapSelect>" <SIMOSpendCapValue> and clicks on next button
    Then customer is navigated to businessapps page and select the business app and clicks on next button
    Then customer lands on Review basket page and clicks on proceed button
    Then customer selects either new or existing customer
    Then customer enter all the details "<email>"
    Then customer clicks on order button and get the order number for sim

    Examples:
      |Scenario_Id        |Serialno      |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|email            |
      |BSBC-1131 BSBC-1481|7             |24              |10GB      |5G             |NO                |75               |Test@yopmail.com |