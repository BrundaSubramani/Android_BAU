Feature: Order a SIM through business shop
  Scenario Outline: Customer orders a SIM through businessshop
    Given Customer is on Business shop homepage
    When Customer hovers on shop and clicks on SimOnly
    Then Customer is navigated to the simo page and selects the <SimoContractTerm>
    Then Customer clicks on the <Serialno> "<SimoTariff>" and clicks on continue button
    Then Customer clicks on FourG or FiveG Sim "<FourG_FiveGSIMO>"
    Then Customer is navigated to the Extras page and selects spendcap "<SIMOSpendCapSelect>" <SIMOSpendCapValue> and clicks on next button
    Then Customer is navigated to businessapps page and select the business app and clicks on next button
    Then Customer lands on Review basket page and clicks on proceed button
    Then Customer selects either new or existing customer
    Then Customer enter all the details "<email>"
    Then Customer clicks on order button and get the order number for sim

    Examples:
      |Scenario_Id         |Serialno      |SimoContractTerm|SimoTariff|FourG_FiveGSIMO|SIMOSpendCapSelect|SIMOSpendCapValue|email            |
      |BSBC-1152 BSBC-1125 |4             |24              |50GB      |4G             |NO                |30               |Test@yopmail.com |