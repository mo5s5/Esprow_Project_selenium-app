package com.esprow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    private final String loginPageExceptedTitle = "ETP Markets";
    private final String loginPageExceptedUrl = "https://spa-dev.etpmarkets.com:3000/auth/sign-in";

    public String getLoginPageExceptedTitle() {
        return loginPageExceptedTitle;
    }

    public String getLoginPageExceptedUrl() {
        return loginPageExceptedUrl;
    }

    @FindBy(linkText = "Sign In")
    WebElement signInBtn;

    @FindBy(name = "email")
    WebElement tbEmail;

    @FindBy(name = "password")
    WebElement tbPassword;

    @FindBy(css = ".sc-AykKE")
    WebElement submitBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Set email in textBox
    public void setEmail(String strEmail) {
        tbEmail.sendKeys(strEmail);
    }

    // Set password in textBox
    public void setPassword(String strPassword) {
        tbPassword.sendKeys(strPassword);
    }

    //Click SubmitBtn
    public void clickSubmitBtn() {
        submitBtn.click();
    }
}
;



