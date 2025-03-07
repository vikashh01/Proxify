package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNowPage {
    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Buy Now')]")
    WebElement buyNowButton;

    @FindBy(id = "cardNumber") 
    WebElement cardNumberField;

    @FindBy(id = "expiryDate") 
    WebElement expiryDateField;

    @FindBy(id = "cvv") 
    WebElement cvvField;

    @FindBy(xpath = "//button[text()='Complete Purchase']")
    WebElement completePurchaseButton;

    public BuyNowPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void buyNow(String cardNumber, String expiryDate, String cvv) {
        buyNowButton.click();
        cardNumberField.sendKeys(cardNumber);
        expiryDateField.sendKeys(expiryDate);
        cvvField.sendKeys(cvv);
        completePurchaseButton.click();
    }
}
