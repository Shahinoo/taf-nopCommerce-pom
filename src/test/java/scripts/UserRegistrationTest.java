package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {
    HomePage homePage;
    UserRegistrationPage registerObject;
    LoginPage loginPage;


    @Test(priority = 0)
    public void userRegisterSuccessfully() {
        homePage = new HomePage(driver);
        homePage.openRegistrationPage();

        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegister("Moo", "shaheen", "testemail016@gmail.com", "FnopC@000");
        //Verify
        System.out.println(registerObject.successRegisterMessage.getText());
        //Assert
        Assert.assertEquals("Your registration completed", registerObject.successRegisterMessage.getText());
    }

    @Test(priority = 1, dependsOnMethods = {"userRegisterSuccessfully"})
    public void userLogoutSuccessfully() {
        registerObject.logout();
    }

    @Test(priority = 2, dependsOnMethods = {"userLogoutSuccessfully"})
    public void userLoginSuccessfully() {
        homePage.openLoginPage();

        loginPage = new LoginPage(driver);
        loginPage.userLogin("testemail016@gmail.com", "FnopC@000");
        // Verify
        System.out.println(registerObject.logOutLink.getText());
        // Assert
        Assert.assertEquals("Log out", registerObject.logOutLink.getText());
    }
}
