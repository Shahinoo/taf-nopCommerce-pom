package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".ico-register")
    WebElement registerLink;
    @FindBy(css = ".ico-login")
    WebElement loginLink;

    public void openRegistrationPage() {
        clickButton(registerLink);
    }

    public void openLoginPage() {
        clickButton(loginLink);
    }


}
