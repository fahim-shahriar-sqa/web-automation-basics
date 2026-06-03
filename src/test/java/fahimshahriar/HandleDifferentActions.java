package fahimshahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleDifferentActions extends DriverSetup{

    @Test
    public void performMouseAndKeyboardActions() throws InterruptedException {

        // Open practice website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        // Scroll to iframe section
        WebElement iframeSection = driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));

        actions.scrollToElement(iframeSection).perform();

        // Hover over mouse hover button
        WebElement mouseHoverButton = driver.findElement(By.id("mousehover"));

        actions.moveToElement(mouseHoverButton).perform();

        Thread.sleep(2000);

        // Move to autocomplete section
        WebElement suggestionSection = driver.findElement(By.xpath("//legend[normalize-space()='Suggession Class Example']"));

        actions.moveToElement(suggestionSection).perform();

        // Enter text in autocomplete field
        WebElement autoCompleteInput = driver.findElement(By.id("autocomplete"));

        autoCompleteInput.sendKeys("Bangladesh");

        Thread.sleep(2000);

        // Select all text
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);

        // Cut selected text
        actions.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);

        // Paste text into Name field
        WebElement nameInput = driver.findElement(By.id("name"));

        actions.click(nameInput).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);
    }

}
