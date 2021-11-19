package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends PageBase {
    Javascript javascript;

    public HomePage(WebDriver driver) {
        super(driver);
        javascriptExecutor = (JavascriptExecutor) driver;
        actions = new Actions(driver);
    }

    @FindBy(id = "customerCurrency")
    public WebElement currencyDDL;

    @FindBy(linkText = "Computers")
    WebElement computerMenuLink;
    @FindBy(linkText = "Notebooks")
    WebElement NotebooksMenuLink;

    @FindBy(css = ".ico-register")
    WebElement registerLink;
    @FindBy(css = ".ico-login")
    WebElement loginLink;
    @FindBy(linkText = "Contact us")
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

    public void changeCurrency() {
        select = new Select(currencyDDL);
        select.selectByVisibleText("Euro");
    }

    public void selectNotebooksMenu() {
        actions.moveToElement(computerMenuLink).moveToElement(NotebooksMenuLink).click().build().perform();
    }


}
