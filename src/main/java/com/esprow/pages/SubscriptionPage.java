package com.esprow.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {


    private final String subscriptionPageExceptedUrl = "https://";
    private final String subscriptionPageTitle = "Subscription";

    private String strTotalCoastAddExchangePopup;
    private String strProtocolPriceAddExchangePopup;
    private String strSessionPriceAddExchangePopup;
    private Integer count = 0;

    public Integer getCount() {
        return count;
    }

    public String getStrProtocolPriceAddExchangePopup() {
        return strProtocolPriceAddExchangePopup;
    }

    public String getStrSessionPriceAddExchangePopup() {
        return strSessionPriceAddExchangePopup;
    }

    public String getSubscriptionPageExceptedUrl() {
        return subscriptionPageExceptedUrl;
    }

    public String getSubscriptionPageTitle() {
        return subscriptionPageTitle;
    }

    public String getStrTotalCoastAddExchangePopup() {
        return strTotalCoastAddExchangePopup;
    }


    WebDriver driver;
    @FindBy(css = ".subscription-add-exchange-button")
    WebElement btnAddExchange;

    @FindBy(css = ".sc-LzLtL")
    WebElement drpDwnProtocolType;

    @FindBy(css = ".sc-LzLtM:nth-child(1)")
    WebElement protocolTypeFix_42;

    @FindBy(css = ".sc-LzLtM:nth-child(2)")
    WebElement protocolTypeFix_43;

    @FindBy(css = ".sc-LzLtM:nth-child(3)")
    WebElement protocolTypeFix_44;

    @FindBy(css = ".sc-LzLtM:nth-child(4)")
    WebElement protocolTypeFix_50;

    @FindBy(css = ".sc-LzLtM:nth-child(5)")
    WebElement protocolTypeFix_50_Sp1;

    @FindBy(css = ".sc-LzLtM:nth-child(6)")
    WebElement protocolTypeFix_50_Sp2;


//	@FindBy (css=".sc-fzXfQT")
//	WebElement sessionNumberPlus;

    @FindBy(css = ".sc-AykKC:nth-child(2) > .sc-LzLwq:nth-child(3)")
    WebElement btnSessionNumberPlus;

    //btnSessionNumberMinus click demonstrated only in addExchangeFix_42 method

    @FindBy(css = ".sc-LzLwq:nth-child(1)")
    WebElement btnSessionNumberMinus;

    @FindBy(css = ".sc-AykKC:nth-child(7) > span:nth-child(2)")
    WebElement protocolPriceAddExchangePopup;

    @FindBy(css = ".sc-AykKC:nth-child(9) > span:nth-child(2)")
    WebElement sessionPriceAddExchangePopup;

    @FindBy(css = ".sc-fzXfRa:nth-child(2)")
    WebElement totalCoastAddExchangePopup;

    @FindBy(css = ".sc-LzLws")
    WebElement sessionNumberCount;

    @FindBy(css = ".dxdSCX")
    WebElement btnAdd1;

    @FindBy(css = ".sc-LzLvb:nth-child(1) .sc-LzLwq:nth-child(3)")
    WebElement subscriptionDetailsBtnPlus;

    @FindBy(css = ".sc-LzLvb:nth-child(1) .sc-LzLwq:nth-child(1)")
    WebElement subscriptionDetailsBtnMinus;

    @FindBy(css = ".sc-LzLqI")
    WebElement randomClick;

    @FindBy(css = ".subscription-confirm-button")
    WebElement subscriptionConfirmBtn;

    @FindBy(tagName = "span")
    WebElement monthlySubscriptionHideDetailsBtn;

    @FindBy(css = ".sc-LzLwu .sc-LzLvL")
    WebElement currentPaymentHideDetailsBtn;

    @FindBy(css = ".subscription-confirm-button")
    WebElement btnPay;

    @FindBy(css = ".sc-LzLrj:nth-child(3) .svg-inline--fa")
    WebElement checkBoxMarkAllSubscriptions;

    @FindBy(css = ".sc-LzLsz:nth-child(1)")
    WebElement btnDeleteMarkedSubscriptions;

    @FindBy(css = ".subscription-confirm-button")
    WebElement btnConfirm;

    @FindBy(css = ".sc-AykKC > .sc-AykKE")
    WebElement btnPopupConfirm;

    @FindBy(css = ".sc-fzXfQq")
    WebElement msgNoExchange;

    public SubscriptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addExchangeFix_42() throws InterruptedException {
        randomClick.click();
        btnAddExchange.click();
        drpDwnProtocolType.click();
        protocolTypeFix_42.click();
        btnSessionNumberPlus.click();
        btnSessionNumberPlus.click();
        btnSessionNumberMinus.click();
        count++;
        strTotalCoastAddExchangePopup = totalCoastAddExchangePopup.getText();
        strProtocolPriceAddExchangePopup = protocolPriceAddExchangePopup.getText();
        strSessionPriceAddExchangePopup = sessionPriceAddExchangePopup.getText();
        btnAdd1.click();

    }

    public void addExchangeFix_43() {
        randomClick.click();
        btnAddExchange.click();
        drpDwnProtocolType.click();
        protocolTypeFix_43.click();
        btnSessionNumberPlus.click();
        count++;
        strTotalCoastAddExchangePopup = totalCoastAddExchangePopup.getText();
        strProtocolPriceAddExchangePopup = protocolPriceAddExchangePopup.getText();
        strSessionPriceAddExchangePopup = sessionPriceAddExchangePopup.getText();
        btnAdd1.click();

    }

    public void addExchangeFix_44() {
        randomClick.click();
        btnAddExchange.click();
        drpDwnProtocolType.click();
        protocolTypeFix_44.click();
        btnSessionNumberPlus.click();
        count++;
        strTotalCoastAddExchangePopup = totalCoastAddExchangePopup.getText();
        strProtocolPriceAddExchangePopup = protocolPriceAddExchangePopup.getText();
        strSessionPriceAddExchangePopup = sessionPriceAddExchangePopup.getText();
        btnAdd1.click();
    }

    public void addExchangeFix_50() {
        randomClick.click();
        btnAddExchange.click();
        drpDwnProtocolType.click();
        protocolTypeFix_50.click();
        btnSessionNumberPlus.click();
        count++;
        strTotalCoastAddExchangePopup = totalCoastAddExchangePopup.getText();
        strProtocolPriceAddExchangePopup = protocolPriceAddExchangePopup.getText();
        strSessionPriceAddExchangePopup = sessionPriceAddExchangePopup.getText();
        btnAdd1.click();
    }

    public void addExchangeFix_50_Sp1() {
        randomClick.click();
        btnAddExchange.click();
        drpDwnProtocolType.click();
        protocolTypeFix_50_Sp1.click();
        btnSessionNumberPlus.click();
        count++;
        strTotalCoastAddExchangePopup = totalCoastAddExchangePopup.getText();
        strProtocolPriceAddExchangePopup = protocolPriceAddExchangePopup.getText();
        strSessionPriceAddExchangePopup = sessionPriceAddExchangePopup.getText();
        btnAdd1.click();
    }

    public void addExchangeFix_50_Sp2() {
        randomClick.click();
        btnAddExchange.click();
        drpDwnProtocolType.click();
        protocolTypeFix_50_Sp2.click();
        btnSessionNumberPlus.click();
        count++;
        strTotalCoastAddExchangePopup = totalCoastAddExchangePopup.getText();
        strProtocolPriceAddExchangePopup = protocolPriceAddExchangePopup.getText();
        strSessionPriceAddExchangePopup = sessionPriceAddExchangePopup.getText();
        btnAdd1.click();
    }

    public void chekExchangeExisting() {
        Assert.assertEquals("You don't have any active subscriptions", msgNoExchange.getText());
    }

    public void clickSubscriptionConfirmBtn() {
        subscriptionConfirmBtn.click();
    }

    public void clickMounthlySubscriptionHideDetailsBtn() {
        subscriptionConfirmBtn.click();
    }

    public void clickCurrentPaymentHideDetailsBtn() {
        subscriptionConfirmBtn.click();
    }

    public void clickSubscriptionDetailsBtnPlus() {
        subscriptionDetailsBtnPlus.click();
    }

    public void clickSubscriptionDetailsBtnMinus() {
        subscriptionDetailsBtnMinus.click();
    }




    public void clickBtnPay() {
        btnPay.click();
    }

    public void clickCheckBoxMarkAllSubscriptions() {
        checkBoxMarkAllSubscriptions.click();
    }

    public void mouseMove() {
        Actions actionProvider = new Actions(driver);
        // Performs mouse move action onto the offset position
        actionProvider.moveByOffset(100, 100).build().perform();
    }


    public void deleteAllSubscriptions() throws InterruptedException {

        btnDeleteMarkedSubscriptions.click();
        btnConfirm.click();
    }
}
