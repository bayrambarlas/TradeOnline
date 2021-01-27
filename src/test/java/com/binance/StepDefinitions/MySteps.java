package com.binance.StepDefinitions;

import com.binance.HomePage.BasePage;
import com.binance.Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MySteps {

    BasePage basePage = new BasePage();

    @Given("the Binance home page on CHROME web browser")
    public void theBinanceHomePageOnCHROMEWebBrowser() {

        basePage.openUrl();
        BrowserUtils.waitFor(5);

    }

    @When("click the TRADE option on the top menu tool bar to select CLASSIC")
    public void clickTheTRADEOptionOnTheTopMenuToolBarToSelectCLASSIC() {

        BrowserUtils.waitFor(5);
        basePage.tradeOptions.click();

    }

    @And("trader able to see ETH USD trade chart feature")
    public void traderAbleToSeeETHUSDTradeChartFeature() {


    }
}
