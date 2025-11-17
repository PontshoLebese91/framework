package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    private static WebDriver driver;

    // Locators
    private static By usernameField = By.id("username");
    private static By passwordField = By.id("password");
    private static By loginButton = By.id("login");

    // Constructor
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public static void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public static void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public static void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
