package com.binance.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features = "src/test/resources/features/",
        glue = "src/test/java/com/binance/StepDefinitions/",
        dryRun = false,
        tags = "@BTC"
)
public class CukesRunner {
}
