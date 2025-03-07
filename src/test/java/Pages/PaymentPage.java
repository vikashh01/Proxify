package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;

    @FindBy(xpath = "//div[contains(text(),'Continue to Payment')]")
    WebElement continueToPaymentButton;

    @FindBy(id = "cardNumber")
    WebElement cardNumberField;

    @FindBy(id = "expiryDate")
    WebElement expiryDateField;

    @FindBy(id = "cvv")
    WebElement cvvField;

    @FindBy(xpath = "//button[text()='Complete Payment']")
    WebElement completePaymentButton;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void continueToPayment() {
        continueToPaymentButton.click();
    }

    public void enterPaymentDetails(String cardNumber, String expiryDate, String cvv) {
        cardNumberField.sendKeys(cardNumber);
        expiryDateField.sendKeys(expiryDate);
        cvvField.sendKeys(cvv);
        completePaymentButton.click();
    }
}

