package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase {
    UserRegistrationPage userRegistrationPage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    HomePage homePage;

    String email = "testemail018@gmail.com";
    String password = "FnopC@000";
    String newPassword = "Fcoral@00000";


    @Test(priority = 0)
    public void userRegisterSuccessfully() {
        homePage = new HomePage(driver);
        homePage.openRegistrationPage();

        userRegistrationPage = new UserRegistrationPage(driver);
        userRegistrationPage.userRegister("Moo", "shaheen", email, password);
        //Verify
        System.out.println(userRegistrationPage.successRegisterMessage.getText());
        //Assert
        Assert.assertEquals("Your registration completed", userRegistrationPage.successRegisterMessage.getText());
    }

    @Test(priority = 1, dependsOnMethods = {"userRegisterSuccessfully"})
    public void userLogoutSuccessfully() {
        userRegistrationPage.logout();
    }


    @Test(priority = 2, dependsOnMethods = {"userLogoutSuccessfully"})
    public void userLoginSuccessfully() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        userRegistrationPage = new UserRegistrationPage(driver);

        homePage.openLoginPage();
        loginPage.userLogin(email, password);
        // Verify
        System.out.println(userRegistrationPage.logOutLink.getText());
        // Assert
        Assert.assertEquals("Log out", userRegistrationPage.logOutLink.getText());
    }

    @Test(priority = 3, dependsOnMethods = {"userLoginSuccessfully"})
    public void userChangePasswordSuccessfully() {
        myAccountPage = new MyAccountPage(driver);
        userRegistrationPage.openMyAccountPage();
        myAccountPage.openChangePasswordPage();
        myAccountPage.changePassword(password, newPassword);
        // Verify
        System.out.println(myAccountPage.changePasswordMessage.getText());
        // Assert
        Assert.assertEquals("Password was changed", myAccountPage.changePasswordMessage.getText());
    }
}
