package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageBase {
    Javascript javascript;

    public HomePage(WebDriver driver) {
        super(driver);
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    @FindBy(css = ".ico-register")
    WebElement registerLink;
    @FindBy(css = ".ico-login")
    WebElement loginLink;
    @FindBy (linkText = "Contact us")
    WebElement contactUsLink;

    public void openRegistrationPage() {
        clickButton(registerLink);
    }

    public void openLoginPage() {
        clickButton(loginLink);
    }

    public void openContactUsPage() {
        scrollToBottom();
        clickButton(contactUsLink);
    }

}
