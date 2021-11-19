package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {

    HomePage homePage;
    ContactUsPage contactUsPage;
    String fullName = "MOO shaheen";
    String email = "testemailC01@gmail.com";
    String enquiryMessage = "I liked ur website";

    @Test
    public void UserContactUsSuccessfully() {
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        homePage.openContactUsPage();
        contactUsPage.contactUs(fullName, email, enquiryMessage);
        // Verify
        System.out.println(contactUsPage.enquirySuccessMessage.getText());
        // Assert
        Assert.assertEquals("Your enquiry has been successfully sent to the store owner.", contactUsPage.enquirySuccessMessage.getText());
    }
}
