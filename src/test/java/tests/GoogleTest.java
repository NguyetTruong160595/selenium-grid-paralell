package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Google Testing")
@Feature("Basic Search")
public class GoogleTest extends BaseTest {

    @Test(description = "Verify Google Title")
    @Severity(SeverityLevel.NORMAL)
    @Story("Open Google Homepage")
    public void searchTest() {
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
    }
}
