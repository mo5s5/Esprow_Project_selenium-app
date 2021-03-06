package com.esprow.tests;

import com.esprow.pages.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PaymentTest {
    WebDriver driver;
    PaymentPage objPaymentPage;
    HomePage objHomePage;
    LoginPage objLoginPage;
    ExchangePage objExchangePage;
    SubscriptionPage objSubscriptionPage;

    String url = "https://";


    @Before
    public void setUp() {
        //Set the key/value property according to the browser you are using.
        System.setProperty("webdriver.chrome.driver", "/home/mko/Загрузки/Selenium/WebDrivers/ChromeDriverSelenium/chromedriver");
        //Open browser instance
        driver = new ChromeDriver();


        //Open the AUT
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {
        objHomePage = new HomePage(driver);
        objLoginPage = new LoginPage(driver);
        objExchangePage = new ExchangePage(driver);
        objSubscriptionPage = new SubscriptionPage(driver);
        objPaymentPage = new PaymentPage(driver);

        objHomePage.clickSignInBtn();

        Thread.sleep(3000);
        // validate if correct page is open by title & url
        assertEquals(objLoginPage.getLoginPageExceptedTitle(), driver.getTitle());
        assertEquals(objLoginPage.getLoginPageExceptedUrl(), driver.getCurrentUrl());

        objLoginPage.setEmail("test.qa.1@esprow.com");
        objLoginPage.setPassword("temporaryAccount");
        objLoginPage.clickSubmitBtn();

        // validate if correct page is open by title & url
        /*     ****************
        I dont find the reason why after sign in application sometimes opens "Exchange" page, sometimes "Subscription" page
        thaths why I used "if" condition for page validation
* */
        if (driver.getTitle().equals(objSubscriptionPage.getSubscriptionPageTitle()) && driver.getCurrentUrl().equals(objSubscriptionPage.getSubscriptionPageExceptedUrl())
                || driver.getTitle().equals(objExchangePage.getExchangePageExceptedTitle()) && objExchangePage.getExchangePageExceptedUrl().equals(driver.getCurrentUrl())) {
            System.out.println("Login Passed");
        }
        objExchangePage.clickSubscriptionBtn();

        Thread.sleep(3000);
        // validate if correct page is open by title & url
        assertEquals(objSubscriptionPage.getSubscriptionPageExceptedUrl(), driver.getCurrentUrl());
        assertEquals("ETP Markets", driver.getTitle());
        objSubscriptionPage.mouseMove();
        objSubscriptionPage.addExchangeFix_42();
        // Validate if correct exchange is added
        assertEquals("FIX 4.2", driver.findElement(By.cssSelector(".sc-AykKC:nth-child(1) > p")).getText());
        assertEquals(objSubscriptionPage.getCount().toString(), driver.findElement(By.cssSelector(".sc-LzLws")).getText());

        //validate exchange coast
        Thread.sleep(5000);
        assertEquals(objSubscriptionPage.getStrTotalCoastAddExchangePopup(), driver.findElement(By.xpath("//div[@id='ETPGems']/div[3]/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/div/span[2]")).getText());

        //Payment
        try {
            objSubscriptionPage.clickBtnPay();
        } catch (ElementNotInteractableException e) {
            System.out.println(e.getMessage());
        }
        ;
//Validate order details
        assertEquals(objSubscriptionPage.getStrSessionPriceAddExchangePopup(),driver.findElement(By.xpath("//div[@id='cb-body']/div/div/div/span/div[2]/div/div/h2/span")).getText());
        assertEquals(objSubscriptionPage.getStrSessionPriceAddExchangePopup(),driver.findElement(By.xpath("//div[@id='cb-body']/div/div/div/span/div[3]/div/div/h2/span")).getText());
        objPaymentPage.clickBtnOrderInfo();
        objPaymentPage.clickBtnBackToOrderSummary();
        objPaymentPage.clickBtnProceedToCheckout();
        objPaymentPage.clickCheckBoxAgree();
        objPaymentPage.clickBtnFinalPay();
        Thread.sleep(2000);
        objPaymentPage.clickBtnGoToExchanges();
        objExchangePage.clickSubscriptionBtn();
    }

}
