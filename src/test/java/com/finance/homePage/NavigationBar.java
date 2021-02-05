package com.finance.homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NavigationBar extends MainPage {

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	public WebElement acceptCookies;

	@FindBy(xpath = "//a[@id='menuicon']")
	public WebElement burgerButton;

	@FindBy(xpath = "//*[@id='site-menu']/li[6]/a/b/div")
	public WebElement settings;

	@FindBy(xpath = "//select[@id='Question']")
	public WebElement countryOptions;

	@FindBy(xpath = "//*[@id='settingsPage']/maincontents/div[3]/div[2]/div[2]/button")
	public WebElement yesOptionButton;

	@FindBy(xpath = "(//span[@class='text'])[1]")
	public WebElement verifyCountry;

	@FindBy(xpath = "(//span[@class='menu-icons header-icon-find-location'])[1]")
	public WebElement findLocation;

	@FindBy(xpath = "//*[@id='__next']/div/main/form/div[2]/div/div[2]/div/div/input")
	public WebElement enterZipCode;

	@FindBy(xpath = "//iframe[@allow='geolocation *;']")
	public WebElement switchIframe;

	@FindBy(xpath = "(//span[@class='MuiButton-label'])[9]")
	public WebElement clickContinueButton;

	@FindBy(xpath = "//*[@id='__next']/div/main/div[1]/div[1]/ol/li[1]/div/div[3]/div[1]/div[1]/a")
	public WebElement getAddressDetails1;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[1]/ol/li[1]/div/div[3]/div[1]/div[2]")
	public WebElement getAddressDetails2;


	public void selectCountry(){

		Select select = new Select(countryOptions);
		select.selectByVisibleText("United States");

	}

}
