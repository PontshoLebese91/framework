package framework;

import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver driver;

    @beforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver.setup();
    }

}
