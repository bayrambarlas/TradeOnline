package com.binance.StepDefinitions;

import com.binance.HomePage.BasePage;
import com.binance.Utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TradeStepDefinitions {

    BasePage basePage = new BasePage();

    @Given("open the Binance home page on Chrome web browser")
    public void open_the_Binance_home_page_on_Chrome_web_browser() {
// new method
    }

    @When("click The TRADE option on the top menu tool bar to select ADVANCED in the options")
    public void click_The_TRADE_option_on_the_top_menu_tool_bar_to_select_ADVANCED_in_the_options() {

        basePage.print();


    }

    @When("the pop-box should open with a display message to LOGIN")
    public void the_pop_box_should_open_with_a_display_message_to_LOGIN() {

    }

    @Then("enter the valid credentials to login to see the CHART")
    public void enter_the_valid_credentials_to_login_to_see_the_CHART() {

    }

}
