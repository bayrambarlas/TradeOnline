@Gainers
Feature:

  @BTC
  Scenario: Trader able to see the COVERT option under the TRADE

    Given the Binance home page on Chrome web browser
    When click the Trade option on the top menu tool bar to select Convert
    Then trader able to see USD-BTC converting feature

  @ALG
  Scenario: Trader able to see ALG BUSD option

    Given the Binance home page on Chrome web browser
    When click the Trade option on the top menu tool bar to select Classic
    And enter the currency name
    Then trader able to see ALG-BUSD trading feature

