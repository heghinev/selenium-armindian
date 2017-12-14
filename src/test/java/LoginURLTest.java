import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginURLTest {
    private ChromeDriver driver;
    private LoginPage loginURL;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        loginURL = new LoginPage(driver);
    }

    @Test
    public void loginSecure(){
       loginURL.loginWith("tomsmith", "SuperSecretPassword!");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, loginURL.getURL());
        // or driver.getCurrentUrl().contains("/secure");
        //assertTrue(driver.getCurrentUrl().contains("/secure"));

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}


