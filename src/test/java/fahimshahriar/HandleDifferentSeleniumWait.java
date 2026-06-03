package fahimshahriar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleDifferentSeleniumWait extends DriverSetup{

    @Test
    public void testImplicitAndExplicitWaits() {

        // Open delay demo page
        driver.get("https://qavbox.github.io/demo/delay/");
        driver.manage().window().maximize();

        /*
         * Implicit Wait
         * Applies globally throughout the WebDriver session.
         * WebDriver waits up to the specified time before throwing
         * NoSuchElementException.
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Example 1: Delayed element
        driver.findElement(By.cssSelector("input[value='Try me!']")).click();

        WebElement delayedElement = driver.findElement(By.id("delay"));

        System.out.println("Delayed Element Text: " + delayedElement.getText());


        // Example 2: Loader-based delay
        driver.findElement(By.id("loaderStart")).click();

        WebElement loaderElement = driver.findElement(By.id("loaderdelay"));

        System.out.println("Loader Element Text: " + loaderElement.getText());


        // Example 3: Explicit Wait
        driver.findElement(By.name("commit")).click();

        WebElement dynamicTextElement = driver.findElement(By.id("two"));

        /*
         * Explicit Wait
         * Waits for a specific condition before continuing.
         */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.textToBePresentInElement(dynamicTextElement, "I am here!"
        ));

        System.out.println("Dynamic Text: " + dynamicTextElement.getText());
    }
}
