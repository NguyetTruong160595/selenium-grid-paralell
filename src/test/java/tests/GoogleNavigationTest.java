import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.Duration;

public class GoogleNavigationTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setup() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleMapsNavigation() {
        // Navigate to Google Maps
        driver.get("https://www.google.com/maps");

        // Search for a location (e.g., "Eiffel Tower")
        driver.findElement(By.id("searchboxinput")).sendKeys("Eiffel Tower" + Keys.ENTER);

        // Wait for results and verify
        wait.until(d -> d.findElement(By.xpath("//h1[contains(text(), 'Eiffel Tower')]")));
        System.out.println("Navigation test passed!");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}