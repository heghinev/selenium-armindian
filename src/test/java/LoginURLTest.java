import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

import static setup.DriverSetup.getDriver;

public class LoginURLTest extends BaseTest {
    private LoginPage loginURL;

    @BeforeMethod
    public void setUp() {
        loginURL = new LoginPage();
    }

    @Test
    public void loginSecure() {
        loginURL.loginWith("tomsmith", "SuperSecretPassword!");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, loginURL.getURL());
        // or driver.getCurrentUrl().contains("/secure");
        //assertTrue(driver.getCurrentUrl().contains("/secure"));

    }

}


