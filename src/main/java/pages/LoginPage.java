package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    WebElement loginEmailTxtBox;
    @FindBy(id = "Password")
    WebElement loginPasswordTxtBox;
    @FindBy(css = ".button-1.login-button")
    WebElement loginBtn;

    public void userLogin(String email, String password) {
        setText(loginEmailTxtBox, email);
        setText(loginPasswordTxtBox, password);
        clickButton(loginBtn);
    }
}


