import pages.loginPage;

import org.testng.annotations.Test;
public class loginTest extends base{

    @Test
    public void verifyLoginWorks() {

        /*ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        ExtentTest test = extent.createTest(this.getClass().getSimpleName());*/
        try {
            loginPage LoginPage = new loginPage(driver);
            loginPage.enterUsername("admin");
            loginPage.enterPassword("pass");
            loginPage.clickLogin();

            System.out.println("Login test executed successfully.");

            //test.pass("Login test executed successfully.");
        }
        catch(Exception e)
        {
            //test.fail(e);
            throw e;
        }
    }
}
