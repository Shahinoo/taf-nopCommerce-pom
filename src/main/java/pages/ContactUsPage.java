package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FullName")
    WebElement urNameTxtBox;

    @FindBy(id = "Email")
    WebElement urEmailTxtBox;

    @FindBy(id = "Enquiry")
    WebElement enquiryTxtBox;

    @FindBy(name = "send-email")
    WebElement submitBtn;

    @FindBy(css = "div.result")
    WebElement enquirySuccessMessage;

    public void contactUs(String name, String email, String message) {
        setText(urNameTxtBox,name);
        setText(urEmailTxtBox,email);
        setText(enquiryTxtBox,message);
        clickButton(submitBtn);
    }
}
