import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        // Configure ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");       // Maximized window
        options.addArguments("--disable-infobars");      // Disable info bars
        options.addArguments("--disable-extensions");    // Disable extensions
        options.addArguments("--disable-gpu");           // Disable GPU (for CI)
        options.addArguments("--no-sandbox");            // Linux CI safety
        options.addArguments("--disable-dev-shm-usage"); // Avoid /dev/shm issues
        options.addArguments("--headless");              // Run headless on CI

        // Initialize driver with options
        driver = new ChromeDriver(options);
        driver.get("https://adactinhotelapp.com//"); // Change to your test URL
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
