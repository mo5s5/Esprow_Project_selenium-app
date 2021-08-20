package com.esprow.pages;

import static org.junit.Assert.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".cb-bar__item:nth-child(1) > .cb-bar__main")
    WebElement btnOrderInfo;

    @FindBy(css = ".cb-header__text")
    WebElement btnBackToOrderSummary;

    @FindBy(css = ".cb-button__text")
    WebElement btnProceedToCheckout;

    @FindBy(id = "tos_agreed")
    WebElement checkBoxAgree;

    @FindBy(css = ".cb-button__text")
    WebElement btnFinalPay;

    @FindBy(linkText = "Go to exchanges")
    WebElement btnGoToExchanges;


    public void clickBtnOrderInfo() {
        btnOrderInfo.click();
    }

    public void clickBtnBackToOrderSummary() {
        btnBackToOrderSummary.click();
    }

    public void clickBtnProceedToCheckout() {
        btnProceedToCheckout.click();
    }

    public void clickCheckBoxAgree() {
        checkBoxAgree.click();
    }

    public void clickBtnFinalPay() {
        btnFinalPay.click();
    }

    public void clickBtnGoToExchanges() {
        btnGoToExchanges.click();
    }

}
