package com.esprow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {
    WebDriver driver;

    private final String exchangePageExceptedTitle = "ETP Markets";
    private final String exchangePageExceptedUrl = "https://spa-dev.etpmarkets.com:3000/app/exchanges";

    public String getExchangePageExceptedTitle() {
        return exchangePageExceptedTitle;
    }

    public String getExchangePageExceptedUrl() {
        return exchangePageExceptedUrl;
    }

    @FindBy(linkText = "Subscription")
    WebElement btnSubscription;
    
    @FindBy(linkText = "Logout")
    WebElement btnLogout;

    @FindBy(css = ".sc-fzXfPg")
    WebElement menuDrpDwn;

    public ExchangePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //	public void hoverMenuDrpDwn() {
//		Actions action= new Actions(driver);
//		action.moveToElement(menuDrpDwn).click().build().perform();
//	}
//
    public void clickSubscriptionBtn() {
        menuDrpDwn.click();
        btnSubscription.click();
    }
    public void logOut(){
        menuDrpDwn.click();
        btnLogout.click();
        
    }


}
