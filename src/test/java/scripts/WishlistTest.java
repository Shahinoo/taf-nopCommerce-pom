package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class WishlistTest extends TestBase {
    HomePage homePage;
    WishlistPage wishlistPage;
    SearchDetailsPage searchDetailsPage;
    SearchPage searchPage;
    ProductDetailsPage productDetailsPage;

    String productName = "apple";

    @Test(priority = 0)
    public void userSearchForProductSuccessfully() {
        searchPage = new SearchPage(driver);
        searchDetailsPage = new SearchDetailsPage(driver);

        searchPage.searchForProduct(productName);
        // Verify
        System.out.println(searchDetailsPage.prodResultAppleCamLink.getText());
        System.out.println(searchDetailsPage.prodResultAppleMacLink.getText());
        // Assert
        Assert.assertEquals("Apple iCam", searchDetailsPage.prodResultAppleCamLink.getText());
        Assert.assertEquals("Apple MacBook Pro 13-inch", searchDetailsPage.prodResultAppleMacLink.getText());
    }

    @Test(priority = 1)
    public void userAddProductToWishList() {
        homePage = new HomePage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        wishlistPage = new WishlistPage(driver);
        searchDetailsPage.prodResultAppleMacLink.click();
        productDetailsPage.AddToWishlist();
        //Assert
        Assert.assertTrue(productDetailsPage.notificationBarSuccessMessage.getText().contains("The product has been added to your"));
        homePage.openWishlistPage();
        Assert.assertTrue(wishlistPage.appleMacBookLink.getText().contains("Apple"));
    }
}
