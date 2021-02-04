package com.finance.StepDefinitions;

import com.finance.Utilities.Driver;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        // we put a logic that should apply to every scenario
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

//    @After
//    public void tearDown(Scenario scenario) {
//        // only takes a screenshot if the scenario fails
//        if (scenario.isFailed()) {
//            // taking a screenshot
//            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot, "image/png");
//        }
//        Driver.closeDriver();
//    }

}