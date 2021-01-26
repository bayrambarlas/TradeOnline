package com.binance.StepDefinitions;

import com.binance.Utilities.BrowserUtils;
import com.binance.Utilities.ConfigurationReader;
import com.binance.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TradeStepDefinitions {

    @Given("open the Binance home page on Chrome web browser")
    public void open_the_Binance_home_page_on_Chrome_web_browser() {

        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
    }

    @When("click The TRADE option on the top menu tool bar to select ADVANCED in the options")
    public void click_The_TRADE_option_on_the_top_menu_tool_bar_to_select_ADVANCED_in_the_options() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the pop-box should open with a display message to LOGIN")
    public void the_pop_box_should_open_with_a_display_message_to_LOGIN() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("enter the valid credentials to login to see the CHART")
    public void enter_the_valid_credentials_to_login_to_see_the_CHART() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
