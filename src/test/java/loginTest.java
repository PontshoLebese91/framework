import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import pages.loginPage;

import org.testng.annotations.Test;
public class loginTest extends base{

    ExtentReports extent;
    ExtentTest test;

    @Test
    public void verifyLoginWorks() {

        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport222.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester","Pontsho");
        ExtentTest test = extent.createTest(this.getClass().getSimpleName());
        try {
            loginPage LoginPage = new loginPage(driver);
            loginPage.enterUsername("admin");
            loginPage.enterPassword("pass");
            loginPage.clickLogin();

            System.out.println("Login test executed successfully.");

            test.pass("Login test executed successfully..");
            extent.flush();
        }
        catch(Exception e)
        {
            test.fail(e);
            throw e;

        }
    }
}
