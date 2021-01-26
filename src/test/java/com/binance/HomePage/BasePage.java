package com.binance.HomePage;
import com.binance.Utilities.BrowserUtils;
import com.binance.Utilities.ConfigurationReader;
import com.binance.Utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void openURL(){

        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);

    }
    @FindBy(xpath = "(//span[@class='hoverstatus css-1qqh4qo'])[3]")
    public WebElement trade;


}
