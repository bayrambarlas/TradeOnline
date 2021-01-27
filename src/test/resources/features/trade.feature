@Gainers
Feature:

  @BTC
  Scenario: Trader able to see the BTC/USD chart as an advanced USER

    Given open the Binance home page on new Chrome web browser
    When click The TRADE option on the top menu tool bar to select ADVANCED in the options
    And the pop-box should open with a display message to LOGIN
    Then enter the valid credentials to login to see the CHART

