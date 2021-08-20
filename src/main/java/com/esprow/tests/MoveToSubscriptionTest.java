package com.esprow.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.esprow.pages.HomePage;
import com.esprow.pages.LoginPage;
import com.esprow.pages.ExchangePage;

public class MoveToSubscriptionTest {
    WebDriver driver;
    String url = "https://spa-dev.etpmarkets.com:3000/";
    HomePage objHomePage;
    LoginPage objLogin;
    ExchangePage objProfilePage;

    @Before
    public void setUp() {
        //Set the key/value property according to the browser you are using.
        System.setProperty("webdriver.chrome.driver", "/home/mko/Загрузки/Selenium/chromedriver");

        //Open browser instance
        driver = new ChromeDriver();
        //Open the AUT
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void test() throws InterruptedException {

        objHomePage = new HomePage(driver);
        objLogin = new LoginPage(driver);
        objProfilePage = new ExchangePage(driver);
//		Fetch the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        objHomePage.clickSignInBtn();
        objLogin.setEmail("test.qa.1@esprow.com");
        objLogin.setPassword("temporaryAccount");
        objLogin.clickSubmitBtn();

        pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        objProfilePage.clickSubscriptionBtn();

        pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);


    }


    @After
    public void tearDown() {
        //Close the browser
        driver.close();
    }

}
