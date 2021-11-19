package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchDetailsPage;
import pages.SearchPage;

public class ChangeCurrencyTest extends TestBase {
    HomePage homePage;
    SearchDetailsPage searchDetailsPage;
    SearchPage searchPage;

    String productName = "apple";

    @Test
    public void userChangeCurrency() {
    homePage = new HomePage(driver);
    homePage.changeCurrency();
    }
    @Test
    public void userSearchForProductAutoComplete() throws InterruptedException {
        searchPage = new SearchPage(driver);
        searchDetailsPage = new SearchDetailsPage(driver);

        searchPage.searchAutoComplete(productName);
        // Verify
        System.out.println(searchDetailsPage.prodAppleMacTitles.getText());
        System.out.println(searchDetailsPage.productPriceSign.getText());
        // Assert
        Assert.assertTrue(searchDetailsPage.prodAppleMacTitles.getText().contains("Apple"));
        // Assert that Currency is changed to Euro
        Assert.assertTrue(searchDetailsPage.productPriceSign.getText().contains("€"));
    }
}
