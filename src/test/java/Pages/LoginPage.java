package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By emailField = By.id("email");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//button[text()='Login']");
    By logoutButton = By.xpath("//a[text()='Logout']");

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isLogoutDisplayed() {
        return driver.findElement(logoutButton).isDisplayed();
    }
}
