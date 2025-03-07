package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    WebDriver driver;
    Pages.LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://proxify.gg/login");
        loginPage = new Pages.LoginPage(driver);
        
    }

    @Test
    public void testLogin() {
        loginPage.login("admin@gmail.com", "7ERssaf51Z39n");
        Assert.assertTrue(loginPage.isLogoutDisplayed(), "Login Failed!");
    }

    
}

