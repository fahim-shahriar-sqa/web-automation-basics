package fahimshahriar;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BrowserNavigationActions extends DriverSetup{

    @Test
    public void testBrowser() throws InterruptedException {
        // Open URL
        driver.get("https://www.google.com/");

        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);

        // Get Page Title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Window Fullscreen
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        // Window Minimize
        driver.manage().window().minimize();
        Thread.sleep(3000);

        // Window Maximize
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Navigate to Another URL
        driver.navigate().to("https://www.facebook.com/");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Currently On: " + currentUrl);

        // Navigate Back
        driver.navigate().back();
        Thread.sleep(3000);

        // Navigate Forward
        driver.navigate().forward();
        Thread.sleep(3000);

        // Navigate to Google Again
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);

        // Refresh Page
        driver.navigate().refresh();
        Thread.sleep(3000);

        String refreshedUrl = driver.getCurrentUrl();
        System.out.println("After Refresh: " + refreshedUrl);

        // Open New TAB
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://x.com/");

        // Open New WINDOW
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://instagram.com/");

        // Get All Window Handles
        ArrayList<String> handles =
                new ArrayList<>(driver.getWindowHandles());

        for (String handle : handles) {
            System.out.println("Window Handle: " + handle);
        }

        // Switch Back to Original Window
        driver.switchTo().window(handles.get(0));

        System.out.println("Switched Back To: "
                + driver.getCurrentUrl());
    }
}
