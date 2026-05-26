package fahimshahriar;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleBrowserRelatedTask extends DriverSetup{

    @Test
    public void testBrowserTask() throws InterruptedException {
        driver.get("https://www.google.com/");

        String title = driver.getTitle();
        System.out.print( "Title: " + title);

        Thread.sleep(3000);

        String url = driver.getCurrentUrl();
        System.out.print( "URL: " + url);

        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().minimize();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.x.com/");
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);

        String tanHandle = driver.getWindowHandle();
        System.out.println("Insta: " + tanHandle);

        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        for (String handle : handles) {
            System.out.println("Handle: " + handle);
        }

        System.out.println("Before switch: " + driver.getCurrentUrl());
        driver.switchTo().window(handles.get(0));
        System.out.println("After switch: " + driver.getCurrentUrl());

    }
}
