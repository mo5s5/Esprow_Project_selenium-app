package com.esprow.tests;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.ElementNotInteractableException;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.esprow.pages.HomePage;
import com.esprow.pages.LoginPage;
import com.esprow.pages.PaymentPage;
import com.esprow.pages.ExchangePage;
import com.esprow.pages.SubscriptionPage;


public class AddExchangeTest {
    WebDriver driver;
    String url = "https://spa-dev.etpmarkets.com:3000/";
    HomePage objHomePage;
    LoginPage objLoginPage;
    ExchangePage objProfilePage;
    SubscriptionPage objSubscriptionPage;
    PaymentPage objPaymentPage;


    @Before
    public void setUp() {
//        System.out.println("choose Your browser (chrome) or (firefox)");
//        Scanner sc = new Scanner(System.in);
//
        //Set the key/value property according to the browser you are using.
        System.setProperty("webdriver.chrome.driver","/home/mko/Загрузки/Selenium/WebDrivers/ChromeDriverSelenium/chromedriver");
//        System.setProperty("webdriver.gecko.driver", "/home/mko/Загрузки/Selenium/WebDrivers/firefoxDriverSelenium/geckodriver");
        //Open browser instance
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
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
        objProfilePage = new ExchangePage(driver);
        objSubscriptionPage = new SubscriptionPage(driver);
        objPaymentPage = new PaymentPage(driver);


//	Fetch the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        objHomePage.clickSignInBtn();
        objLoginPage.setEmail("test.qa.1@esprow.com");
        objLoginPage.setPassword("temporaryAccount");
        objLoginPage.clickSubmitBtn();

        pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        objProfilePage.clickSubscriptionBtn();

        objSubscriptionPage.mouseMove();
        System.out.println("mouse Move ");

        // Adding Exchange
        objSubscriptionPage.addExchangeFix_42();

        ///12.08
//	objSubscriptionPage.clickSubscriptionDetailsBtnPlus();
//	objSubscriptionPage.clickSubscriptionDetailsBtnPlus();
//	objSubscriptionPage.clickSubscriptionDetailsBtnMinus();

        //////

//Zoom Out
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("document.body.style.zoom = '0.3'");


        try {objSubscriptionPage.clickBtnPay();}
        catch (ElementNotInteractableException e) {
            System.out.println(e.getMessage());};

        objPaymentPage.clickBtnOrderInfo();
        objPaymentPage.clickBtnBackToOrderSummary();
        objPaymentPage.clickBtnProceedToCheckout();
        objPaymentPage.clickCheckBoxAgree();
        objPaymentPage.clickBtnFinalPay();
        Thread.sleep(2000);
        objPaymentPage.clickBtnGoToExchanges();
        objProfilePage.clickSubscriptionBtn();
        objSubscriptionPage.clickCheckBoxMarkAllSubscriptions();
        objSubscriptionPage.deleteAllSubscriptions();

    }


    @After
    public void tearDown() {
        //Close the browser

    }

}
