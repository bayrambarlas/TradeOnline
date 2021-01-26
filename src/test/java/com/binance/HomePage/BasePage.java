package com.binance.HomePage;
import com.binance.Utilities.BrowserUtils;
import com.binance.Utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public void TopNavigationBar() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "map")
    public WebElement map;

    @FindBy(linkText = "schedule")
    public WebElement schedule;

    @FindBy(linkText = "hunt")
    public WebElement hunt;

    @FindBy(linkText = "my")
    public WebElement my;

    @FindBy(linkText = "self")
    public WebElement self;

    @FindBy(linkText = "team")
    public WebElement team;

    @FindBy(linkText = "sign out")
    public WebElement signOut;

}
