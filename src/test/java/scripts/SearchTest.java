package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchDetailsPage;
import pages.SearchPage;

public class SearchTest extends TestBase {
    SearchPage searchPage;
    SearchDetailsPage searchDetailsPage;
    String productName = "apple";

    @Test
    public void userSearchForProductSuccessfully() {
        searchPage = new SearchPage(driver);
        searchDetailsPage = new SearchDetailsPage(driver);

        searchPage.searchForProduct(productName);
        // Verify
        System.out.println(searchDetailsPage.prodResultAppleCam.getText());
        System.out.println(searchDetailsPage.prodResultAppleMac.getText());
        // Assert
        Assert.assertEquals("Apple iCam", searchDetailsPage.prodResultAppleCam.getText());
        Assert.assertEquals("Apple MacBook Pro 13-inch", searchDetailsPage.prodResultAppleMac.getText());
    }

    @Test
    public void userSearchForProductAutoComplete() throws InterruptedException {
        searchPage = new SearchPage(driver);
        searchDetailsPage = new SearchDetailsPage(driver);

        searchPage.searchAutoComplete(productName);
        // Verify
        System.out.println(searchDetailsPage.prodAppleMacDetails.getText());
        // Assert
        Assert.assertEquals("Apple MacBook Pro 13-inch", searchDetailsPage.prodAppleMacDetails.getText());

    }
}
