package fahimshahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class cssandxpathselector extends DriverSetup{

    @Test
    public void selectorExample() throws InterruptedException {

        // Open Google
        driver.get("https://www.google.com/");

        WebElement searchArea;

        //CSS SELECTOR EXAMPLES
        //Locate using CSS Selector
        searchArea = driver.findElement(By.cssSelector("textarea[name='q']"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(2000);
        searchArea.clear();

        driver.navigate().refresh();

        /*
         * CSS Parent -> Child Structure
         * div.KxwPGc.AghGtd > a
         * div                = parent tag
         * .KxwPGc            = class
         * .AghGtd            = another class
         * > a                = direct child anchor tag
         */

        // Select all child anchor tags
        driver.findElements(By.cssSelector("div.KxwPGc.AghGtd > a"));

        // Select first child
        driver.findElement(By.cssSelector("div.KxwPGc.AghGtd > a:first-child"));

        // Select last child
        driver.findElement(By.cssSelector("div.KxwPGc.AghGtd > a:last-child"));

        // Select specific child
        driver.findElement(By.cssSelector("div.KxwPGc.AghGtd > a:nth-child(2)"));

        //XPATH EXAMPLES
        // Locate using XPath
        searchArea = driver.findElement(By.xpath("//textarea[@name='q']"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(2000);
        searchArea.clear();

        /*
         * XPath Parent -> Child Structure
         * //div[@class='KxwPGc AghGtd']/a
         * //div                      = parent div
         * [@class='...']            = attribute selection
         * /a                        = direct child anchor tag
         */

        // Select all child anchor tags
        List<WebElement> childElements = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));

        // Select first child
        driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[1]"));

        // Select last child
        driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[last()]"));

        // Select specific child
        driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[2]"));

        //LOOP THROUGH CHILD ELEMENTS

        for (WebElement child : childElements) {

            System.out.println(
                    "Child Text: " + child.getText()
            );
        }
    }
}
