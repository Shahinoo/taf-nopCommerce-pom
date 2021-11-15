package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Find elements of Registration page using FindBy interface
     */

    @FindBy(id = "gender")
    WebElement genderRadioBtn;
    @FindBy(id = "FirstName")
    WebElement fNameTxtBox;
    @FindBy(id = "LastName")
    WebElement lNameTxtBox;
    @FindBy(id = "Email")
    WebElement emailTxtBox;
    @FindBy(id = "Password")
    WebElement passwordTxtBox;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxtBox;
    @FindBy(id = "register-button")
    WebElement registerBtn;

    @FindBy(css = ".result")
    public WebElement successRegisterMessage;
    @FindBy(css = ".ico-logout")
    public WebElement logOutLink;
    @FindBy(linkText = "My account")
    public WebElement myAccountLink;

    public void userRegister(String firstName, String lastName, String email, String password) {
        clickButton(genderRadioBtn);
        setText(fNameTxtBox, firstName);
        setText(lNameTxtBox, lastName);
        setText(emailTxtBox, email);
        setText(passwordTxtBox, password);
        setText(confirmPasswordTxtBox, password);
        clickButton(registerBtn);
    }

    public void logout() {
        clickButton(logOutLink);
    }

    public void openMyAccountPage() {
        clickButton(myAccountLink);
    }
}
