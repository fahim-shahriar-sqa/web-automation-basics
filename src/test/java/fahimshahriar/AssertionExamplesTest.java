package fahimshahriar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExamplesTest {

    @Test
    public void verifyHardAndSoftAssertions() {

        WebDriver driver = new ChromeDriver();

        /*
    @Test(priority = 0)
    public void testCase2() {
        System.out.println("This is the A Normal Test Case 2");
    }
    @Test(priority = 1)
    public void testCase1() {
        System.out.println("This is the A Normal Test Case 1");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite");
    }

    */

        try {
            // Navigate to Google
            driver.get("https://www.google.com/");

            // Hard Assertions
            Assert.assertEquals(driver.getTitle(), "Google");
            Assert.assertTrue(driver.getTitle().contains("Google"));
            Assert.assertFalse(driver.getTitle().contains("Facebook"));

            System.out.println("Hard assertions passed.");

            // Soft Assertions
            SoftAssert softAssert = new SoftAssert();

            System.out.println("Step 1: Validate search field");
            softAssert.assertEquals(1, 1);

            System.out.println("Step 2: Validate button state");
            softAssert.assertFalse(true); // Intentional failure for demonstration

            System.out.println("Step 3: Validate page visibility");
            softAssert.assertTrue(true);

            // Report all soft assertion failures
            softAssert.assertAll();

        } finally {
            driver.quit();
        }
    }
}

