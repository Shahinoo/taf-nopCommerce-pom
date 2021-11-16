package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchDetails extends PageBase {

    public SearchDetails(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    public WebElement prodResultAppleMac;
    @FindBy(linkText = "Apple iCam")
    public WebElement prodResultAppleCam;

    @FindBy(css = "h1")
    public WebElement prodAppleMacDetails;
}
