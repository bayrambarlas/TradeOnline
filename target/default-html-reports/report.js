$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/finance.feature");
formatter.feature({
  "name": "Load WU a country home page and find a local agent",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Gainers"
    }
  ]
});
formatter.scenario({
  "name": "Change the country on WU main page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Gainers"
    },
    {
      "name": "@Country"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user at WU main page and accept the cookies",
  "keyword": "Given "
});
formatter.match({
  "location": "FinanceStepDefinitions.userAtWUMainPageAndAcceptTheCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user expands Burger menu select Settings page",
  "keyword": "When "
});
formatter.match({
  "location": "FinanceStepDefinitions.userExpandsBurgerMenuSelectSettingsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "change WU.com page to United States as selected country",
  "keyword": "And "
});
formatter.match({
  "location": "FinanceStepDefinitions.changeWUComPageToUnitedStatesAsSelectedCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the selected country page must be loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "FinanceStepDefinitions.the_selected_country_page_must_be_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search for open agent locations near my Zip code",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ZipCode"
    }
  ]
});
formatter.step({
  "name": "user at WU main page and accept the cookies",
  "keyword": "Given "
});
formatter.step({
  "name": "user click the FIND LOCATION option from the top menu",
  "keyword": "When "
});
formatter.step({
  "name": "enter a \"\u003cZipCode\u003e\" to find the open agent",
  "keyword": "When "
});
formatter.step({
  "name": "click the CONTINUE button to search",
  "keyword": "And "
});
formatter.step({
  "name": "user must see the address details of the first location",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ZipCode"
      ]
    },
    {
      "cells": [
        "08247"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for open agent locations near my Zip code",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Gainers"
    },
    {
      "name": "@ZipCode"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user at WU main page and accept the cookies",
  "keyword": "Given "
});
formatter.match({
  "location": "FinanceStepDefinitions.userAtWUMainPageAndAcceptTheCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the FIND LOCATION option from the top menu",
  "keyword": "When "
});
formatter.match({
  "location": "FinanceStepDefinitions.user_click_the_FIND_LOCATION_option_from_the_top_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter a \"08247\" to find the open agent",
  "keyword": "When "
});
formatter.match({
  "location": "FinanceStepDefinitions.enter_a_to_find_the_open_agent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the CONTINUE button to search",
  "keyword": "And "
});
formatter.match({
  "location": "FinanceStepDefinitions.click_the_CONTINUE_button_to_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user must see the address details of the first location",
  "keyword": "Then "
});
formatter.match({
  "location": "FinanceStepDefinitions.user_must_see_the_address_details_of_the_first_location()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});