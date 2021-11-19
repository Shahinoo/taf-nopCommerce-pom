package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchDetailsPage extends PageBase {

    public SearchDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    public WebElement prodResultAppleMacLink;
    @FindBy(linkText = "Apple iCam")
    public WebElement prodResultAppleCamLink;

    @FindBy(css = "h1")
    public WebElement prodAppleMacTitles;
    @FindBy (css = "span#price-value-17")
    public  WebElement productPriceSign;


}
