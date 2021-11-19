package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase {

    public SearchPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "small-searchterms")
    WebElement searchTxtBx;
    @FindBy(id = "ui-id-1")
    List<WebElement> autoCompleteResults;

    @FindBy(css = "form#small-search-box-form > .button-1.search-box-button")
    WebElement searchBtn;

    public void searchForProduct(String keyword) {
        setText(searchTxtBx, keyword);
        clickButton(searchBtn);
    }

    public void searchAutoComplete(String keyword) throws InterruptedException {

        setText(searchTxtBx, keyword);
            Thread.sleep(3000);

        autoCompleteResults.get(0).click();
    }
}
