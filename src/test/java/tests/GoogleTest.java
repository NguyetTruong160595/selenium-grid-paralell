package tests;

import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void searchTest() {
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
    }
}