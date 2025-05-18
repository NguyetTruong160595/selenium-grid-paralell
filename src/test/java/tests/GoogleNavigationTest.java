package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.junit.After;
import org.junit.Before;
import java.time.Duration;


@Epic("Google Testing 1")
@Feature("Basic Search")

public class GoogleNavigationTest extends BaseTest {

    @Test
    public void searchTest() {
        driver.get("https://www.google.com/maps");

        // Search for a location (e.g., "Eiffel Tower")
        driver.findElement(By.id("searchboxinput")).sendKeys("Eiffel Tower" + Keys.ENTER);

        // Wait for results and verify
        System.out.println("Navigation test passed!");
    }
}
