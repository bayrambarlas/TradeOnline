package com.binance.HomePage;

import com.binance.Utilities.BrowserUtils;
import com.binance.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigationBar extends BasePage {

	public TopNavigationBar() {
		PageFactory.initElements(Driver.get(), this);
	}



	@FindBy(xpath = "//*[@class='css-lwzdcg']")
	public WebElement BINANCE;

	@FindBy(xpath = "(//*[@class='css-1w2cmbz'])[1]")
	public WebElement OtherFeatures;

	@FindBy(xpath = "(//*[@class='css-1w2cmbz'])[2]")
	public WebElement Markets;

	@FindBy(xpath = "(//*[@class='css-1w2cmbz'])[3]")
	public WebElement Trade;

	@FindBy(xpath = "(//*[@class='css-1w2cmbz'])[4]")
	public WebElement Derivatives;

	@FindBy(xpath = "(//*[@class='css-1w2cmbz'])[5]")
	public WebElement Finance;


	@FindBy(xpath = "//a[@id='ba-BasicCONVERT']")
	public WebElement convert;

	@FindBy(xpath = "//a[@id='ba-Basic']")
	public WebElement classic;

	@FindBy(xpath = "//a[@id='ba-Advanced']")
	public WebElement advanced;

	@FindBy(xpath = "//h1[@class='main css-vurnku']")
	public WebElement textOfConvert;


	public void goConvert() {
		Actions actions = new Actions(Driver.get());
		actions.moveToElement(Trade).perform();
		BrowserUtils.clickWithWait(By.xpath("//a[@id='ba-BasicCONVERT']"), 3);
	}

	public void goClassic() {
		Actions actions = new Actions(Driver.get());
		actions.moveToElement(Trade).perform();
		BrowserUtils.waitForClickablility(classic,3);
	}

	public void goAdvanced() {
		Actions actions = new Actions(Driver.get());
		actions.moveToElement(Trade).perform();
		BrowserUtils.waitForClickablility(advanced,3);
	}
}
