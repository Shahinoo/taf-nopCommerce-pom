package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-wishlist-button-4")
    WebElement addToWishlistBtn;
    @FindBy(xpath = "//div[@class='compare-products']")
    WebElement addToCompareListBtn;
    @FindBy(xpath = "//div[@class='email-a-friend']")
    WebElement emailAFriendBtn;

    @FindBy(css = "..content")
    WebElement notificationBarSuccessMessage;
}
