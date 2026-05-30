package fahimshahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameHandling extends DriverSetup{

    @Test
    public void handleIFrameExample() {

        // Open Practice Website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //1. Switch to iframe by NAME or ID
        driver.switchTo().frame("iframe-name");

        WebElement registerByName = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        System.out.println("By Name/ID: " + registerByName.getText());

        // Switch back to main page before next approach
        driver.switchTo().defaultContent();


        //2. Switch to iframe by INDEX
        driver.switchTo().frame(0);

        WebElement registerByIndex = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        System.out.println("By Index: " + registerByIndex.getText());

        driver.switchTo().defaultContent();


        // 3. Switch to iframe by WebElement

        WebElement iframeElement = driver.findElement(By.id("courses-iframe"));
        driver.switchTo().frame(iframeElement);

        WebElement registerByElement = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        System.out.println("By WebElement: " + registerByElement.getText());

        driver.switchTo().defaultContent();

        // 4. Verify element outside iframe
        WebElement frameHeading = driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));

        System.out.println("Outside iframe: " + frameHeading.getText());
    }
}
