import org.testng.annotations.Test;
import pages.loginPage;

public class loginTest extends base{

    @Test
    public void verifyLoginWorks(){
        loginPage LoginPage = new loginPage(driver);
        loginPage.enterUsername("admin");
        loginPage.enterPassword("pass");
        loginPage.clickLogin();

        System.out.println("Login test executed successfully.");
    }
}
