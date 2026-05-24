package fahimshahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends DriverSetup{
    @Test
    public void testLocators() throws InterruptedException {

        // Open Google
        driver.get("https://www.google.com/");

        WebElement searchArea;

        // Locate by ID
        searchArea = driver.findElement(By.id("APjFqb"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();

        // Locate by Name
        searchArea = driver.findElement(By.name("q"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();

        // Locate by Tag Name
        searchArea = driver.findElement(By.tagName("textarea"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();

        // Locate by Class Name
        searchArea = driver.findElement(By.className("gLFyf"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();



        driver.navigate().refresh();

        // Locate by Link Text
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);

        driver.navigate().back();

        // Locate by Partial Link Text
        driver.findElement(By.partialLinkText("Imag")).click();
        Thread.sleep(3000);
    }
}
