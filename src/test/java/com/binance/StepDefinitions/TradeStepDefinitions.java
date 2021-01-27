package com.binance.StepDefinitions;

import com.binance.HomePage.BasePage;
import com.binance.Utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TradeStepDefinitions {

    BasePage basePage = new BasePage();

    @Given("the Binance home page on {string} web browser")
    public void the_Binance_home_page_on_web_browser(String string) {

        basePage.openUrl();

    }

    @When("click the {string} option on the top menu tool bar to select {string}")
    public void click_the_option_on_the_top_menu_tool_bar_to_select(String string, String string2) {

        BrowserUtils.waitFor(3);
        basePage.tradeOptions.click();

    }

    @When("trader able to see {string} trade chart feature")
    public void trader_able_to_see_trade_chart_feature(String string) {

    }


}
