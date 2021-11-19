package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HoverMenuTest extends TestBase {
    HomePage homePage;


    @Test
    public void userSelectSubcategoryFromMenu() {
        homePage = new HomePage(driver);
        homePage.selectNotebooksMenu();
        //Verify
        System.out.println(driver.getCurrentUrl());
        //Assert
        Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
    }
}
