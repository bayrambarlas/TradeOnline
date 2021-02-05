package com.finance.stepDefinitions;

import com.finance.utilities.BrowserUtils;
import com.finance.utilities.ConfigurationReader;
import com.finance.utilities.Driver;
import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;

  /*
     Here I put a logic that should apply to every scenario of my test cases
  */


public class Hooks {

    @Before

    public void openProper() {

        // it wait the browser open up to a certain time written as a parameter

        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // maximize the opened browser window

        Driver.get().manage().window().maximize();

    }


    @After
    public void breakPoint(Scenario scenario) {
            // it takes a screenshot if the scenario fails

        if (scenario.isFailed()) {

            // it takes a screenshot if the scenario passed

        final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);

            scenario.embed(screenshot, "image/png");
        }

        Driver.closeDriver();
    }

}
