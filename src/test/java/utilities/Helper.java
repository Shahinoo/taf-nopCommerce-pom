package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper {
    /**
     * method to take screenshot when TC failed
     * @param driver
     * @param screenshotName
     */
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        // path for screenshot
        Path destination = Paths.get("./screenshots", screenshotName + ".png");
        try {
            // create directory from Files
            Files.createDirectories(destination.getParent());
            // stream
            FileOutputStream out = new FileOutputStream(destination.toString());
            // take screenshot
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            // close stream
            out.close();

        } catch (IOException e) {
            System.out.println("Exception while taking screenshot" + e.getMessage());
        }
    }
}
