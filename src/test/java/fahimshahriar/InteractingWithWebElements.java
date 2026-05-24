package fahimshahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends DriverSetup{
    @Test
    public void interactWithElements() throws InterruptedException {

        // Open Practice Website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Maximize Browser Window
        driver.manage().window().fullscreen();

        //GET TEXT
        WebElement heading = driver.findElement(By.cssSelector("body h1"));

        String headingText = heading.getText();

        System.out.println("Heading Text: " + headingText);

        //CLICK RADIO BUTTON
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        radioButton2.click();

        //SEND TEXT TO INPUT FIELD
        WebElement nameInput = driver.findElement(By.cssSelector("#name"));
        nameInput.sendKeys("Batch 31");

        //CLEAR INPUT FIELD
        nameInput.clear();

        //GET ATTRIBUTE VALUE
        String placeholderText = nameInput.getAttribute("placeholder");

        System.out.println("Placeholder Text: " + placeholderText);

        // GET CSS PROPERTY VALUE

        WebElement openTabButton = driver.findElement(By.cssSelector("#opentab"));

        String backgroundColor = openTabButton.getCssValue("background-color");

        System.out.println("Button Background Color: " + backgroundColor);

        // CHECK RADIO BUTTON SELECTION STATE
        WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1']"));

        System.out.println("Radio Button 1 Selected: " + radioButton1.isSelected());

        System.out.println("Radio Button 2 Selected: " + radioButton2.isSelected());

        // CHECK ELEMENT VISIBILITY

        WebElement showHideTextBox = driver.findElement(By.cssSelector("#displayed-text"));

        System.out.println("Textbox Visible Before Hide: " + showHideTextBox.isDisplayed());

        // Hide Textbox
        driver.findElement(By.cssSelector("#hide-textbox")).click();

        System.out.println("Textbox Visible After Hide: " + showHideTextBox.isDisplayed());

        //CHECK ELEMENT ENABLED STATE

        WebElement checkbox = driver.findElement(By.cssSelector("#checkBoxOption1"));

        System.out.println("Checkbox Enabled: " + checkbox.isEnabled());
    }
}
