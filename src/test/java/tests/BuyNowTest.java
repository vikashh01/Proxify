package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BuyNowPage;
import Pages.LoginPage;

public class BuyNowTest {
    WebDriver driver;
    LoginPage loginPage;
    BuyNowPage buyNowPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://proxify.gg/login");

        loginPage = new LoginPage(driver);
        buyNowPage = new BuyNowPage(driver);
    }

    @Test
    public void testBuyNowFunctionality() {
        loginPage.login("admin@gmail.com", "7ERssaf51Z39n");

        driver.get("https://proxify.gg/plans");

        buyNowPage.buyNow("4111111111111111", "12/26", "123");

        String expectedURL = "https://proxify.gg/confirmation";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL, "Purchase not completed successfully!");
    }

   
}
