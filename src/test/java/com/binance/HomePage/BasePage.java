package com.binance.HomePage;
import com.binance.Utilities.BrowserUtils;
import com.binance.Utilities.ConfigurationReader;
import com.binance.Utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BasePage {

    public void BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void openUrl(){

        Driver.get().get(ConfigurationReader.get("url"));

        System.out.println("Open URL to create new order!");
    }

    @FindBy(linkText = "map")
    public WebElement map;



}
