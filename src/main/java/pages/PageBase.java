package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.ProtectionDomain;

public class PageBase {

    //protected WebDriver driver;
    public JavascriptExecutor javascriptExecutor;
    public Select select;
    public Actions actions;

    /**
     * create a constructor using PageFactory Class to Processes all the annotated WebElements
     * and Locates the element on the page using the annotated selector
     *
     * @param driver
     */
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button) {
        button.click();
    }

    protected static void setText(WebElement textElement, String value) {
        textElement.sendKeys(value);
    }

    public void scrollToBottom() {
        javascriptExecutor.executeScript("scrollBy(0,2500)");
    }

}
