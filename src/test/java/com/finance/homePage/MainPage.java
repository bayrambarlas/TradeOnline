package com.finance.homePage;
import com.finance.utilities.BrowserUtils;
import com.finance.utilities.ConfigurationReader;
import com.finance.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {

        PageFactory.initElements(Driver.get(), this);
    }
    public void openUrl(){

        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(3);
        System.out.println(" WU Home Page is opening properly! ");

    }

}
