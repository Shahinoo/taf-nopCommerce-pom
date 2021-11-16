package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchDetails;
import pages.SearchPage;

public class SearchTest extends TestBase {
    SearchPage searchPage;
    SearchDetails searchDetails;
    String productName = "apple";

    @Test
    public void userSearchForProductSuccessfully() {
        searchPage = new SearchPage(driver);
        searchDetails = new SearchDetails(driver);

        searchPage.searchForProduct(productName);
        // Verify
        System.out.println(searchDetails.prodResultAppleCam.getText());
        System.out.println(searchDetails.prodResultAppleMac.getText());
        // Assert
        Assert.assertEquals("Apple iCam", searchDetails.prodResultAppleCam.getText());
        Assert.assertEquals("Apple MacBook Pro 13-inch", searchDetails.prodResultAppleMac.getText());
    }

    @Test
    public void userSearchForProductAutoComplete() throws InterruptedException {
        searchPage = new SearchPage(driver);
        searchDetails = new SearchDetails(driver);

        searchPage.searchAutoComplete(productName);
        // Verify
        System.out.println(searchDetails.prodAppleMacDetails.getText());
        // Assert
        Assert.assertEquals("Apple MacBook Pro 13-inch", searchDetails.prodAppleMacDetails.getText());

    }
}
