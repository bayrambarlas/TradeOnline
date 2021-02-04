package com.finance.HomePage;
import com.finance.Utilities.ConfigurationReader;
import com.finance.Utilities.Driver;
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

    @FindBy(xpath = "(//*[@class=\"hoverstatus css-1qqh4qo\"])[3]")
    public WebElement tradeOptions;

    @FindBy(xpath = "//*[@id=\"__APP\"]/div[2]/header/div[3]/span/text()")
    public WebElement tradeOptions2;

}
