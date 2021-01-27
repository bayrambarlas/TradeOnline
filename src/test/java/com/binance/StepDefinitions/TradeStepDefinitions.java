package com.binance.StepDefinitions;

import com.binance.HomePage.BasePage;
import com.binance.HomePage.TopNavigationBar;
import com.binance.Utilities.BrowserUtils;
import com.binance.Utilities.ConfigurationReader;
import com.binance.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class TradeStepDefinitions {

    TopNavigationBar navigationBar = new TopNavigationBar();

    @Given("the Binance home page on Chrome web browser")
    public void the_Binance_home_page_on_Chrome_web_browser() {

        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(3);

    }

    @When("click the Trade option on the top menu tool bar to select Convert")
    public void click_the_Trade_option_on_the_top_menu_tool_bar_to_select_Convert() {

       navigationBar.goConvert();
    }

    @Then("trader able to see USD-BTC converting feature")
    public void trader_able_to_see_USD_BTC_converting_feature() {

        System.out.println(BrowserUtils.getElementsText(By.xpath("//h1[@class='main css-vurnku']")));

    }

    @When("click the Trade option on the top menu tool bar to select Classic")
    public void click_the_Trade_option_on_the_top_menu_tool_bar_to_select_Classic() {

        navigationBar.goClassic();

    }

    @When("enter the currency name")
    public void enter_the_currency_name() {

        navigationBar.ClosePopup.click();
        BrowserUtils.waitForVisibility(navigationBar.SearchBox, 3);
        navigationBar.SearchBox.sendKeys("alg");
       BrowserUtils.clickWithTimeOut(navigationBar.AlgoBusd, 5);

    }

    @Then("trader able to see ALG-BUSD trading feature")
    public void trader_able_to_see_ALG_BUSD_trading_feature() {

    }

}
