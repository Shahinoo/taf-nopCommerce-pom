package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".change-password > a")
    WebElement changePasswordLink;

    @FindBy(id = "OldPassword")
    WebElement oldPasswordTxtBox;
    @FindBy(id = "NewPassword")
    WebElement newPasswordTxtBox;
    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmPasswordTxtBox;
    @FindBy(css = ".button-1.change-password-button")
    WebElement changePasswordBtn;
    @FindBy(css = ".content")
    public WebElement changePasswordMessage;

    public void openChangePasswordPage() {
        clickButton(changePasswordLink);
    }

    public void changePassword(String oldPassword, String newPassword) {
        setText(oldPasswordTxtBox, oldPassword);
        setText(newPasswordTxtBox, newPassword);
        setText(confirmPasswordTxtBox, newPassword);
        clickButton(changePasswordBtn);
    }

}
