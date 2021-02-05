package com.finance.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"}, // the path to get report in html format

        features = "src/test/resources/features/",   // the path of connection with feature file

        glue = "com/finance/stepDefinitions/",       // the path of step definition in Gherkin language

        dryRun = false,                              // true option is for step definition recommended to implement

        tags = "@Gainers"                            // chosen tags determines which scenario will be executed

        // ** Also use here the other tag annotations like @ZipCode and @Country for each scenario separately!
)
public class CukesRunner {

    // Use this method to run selected test scenario

}
