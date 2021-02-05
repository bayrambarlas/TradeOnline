package com.finance.stepDefinitions;

import com.finance.homePage.NavigationBar;
import com.finance.homePage.MainPage;
import com.finance.utilities.BrowserUtils;
import com.finance.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FinanceStepDefinitions {

    MainPage mainPage = new MainPage();

    NavigationBar navigationBar = new NavigationBar();

    @Given("user at WU main page and accept the cookies")
    public void userAtWUMainPageAndAcceptTheCookies() {

        mainPage.openUrl();

        BrowserUtils.waitForClickablility(navigationBar.acceptCookies, 3);
        navigationBar.acceptCookies.click();

    }

    @When("user expands Burger menu select Settings page")
    public void userExpandsBurgerMenuSelectSettingsPage() {

        BrowserUtils.waitForClickablility(navigationBar.burgerButton, 2);
        navigationBar.burgerButton.click();

        BrowserUtils.hover(navigationBar.settings);
        BrowserUtils.waitFor(2);

    }

    @And("change WU.com page to United States as selected country")
    public void changeWUComPageToUnitedStatesAsSelectedCountry() {

        BrowserUtils.hover(navigationBar.countryOptions);
        BrowserUtils.waitFor(3);

        navigationBar.selectCountry();
        navigationBar.yesOptionButton.click();

    }

    @Then("the selected country page must be loaded")
    public void the_selected_country_page_must_be_loaded() {

        String String1 = navigationBar.verifyCountry.getText();
        Assert.assertEquals("United States",String1);

    }

    @When("user click the FIND LOCATION option from the top menu")
    public void user_click_the_FIND_LOCATION_option_from_the_top_menu() {

       BrowserUtils.hover(navigationBar.findLocation);
       BrowserUtils.waitFor(3);

    }

    @When("enter a {string} to find the open agent")
    public void enter_a_to_find_the_open_agent(String ZipCode) {

        Driver.get().switchTo().frame(navigationBar.switchIframe);
        navigationBar.enterZipCode.sendKeys(ZipCode);
        BrowserUtils.waitFor(3);

    }

    @And("click the CONTINUE button to search")
    public void click_the_CONTINUE_button_to_search() {

        BrowserUtils.hover(navigationBar.clickContinueButton);

    }

    @Then("user must see the address details of the first location")
    public void user_must_see_the_address_details_of_the_first_location() {

        System.out.println("WU Address Details: " + navigationBar.getAddressDetails1.getText());
        System.out.println("WU Address Details: " + navigationBar.getAddressDetails2.getText());

    }
}
