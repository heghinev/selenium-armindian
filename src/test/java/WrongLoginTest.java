import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

public class WrongLoginTest {
    private ChromeDriver driver;
    private LoginPage wrongLoginPage;


    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        wrongLoginPage = new LoginPage(driver);
    }

    @Test
    public void loginFail() throws InterruptedException{
        wrongLoginPage.loginWith("bla", "blabla!");
           assertTrue("Login was not succeed!",
                   wrongLoginPage.isErrorDisplayed());
           assertTrue("Error message is not correct!",
                   wrongLoginPage.getErrormessage().contains("Your username is invalid!"));




    }

    private void assertTrue(String s, boolean displayed) {
        //To change body of created methods use File | Settings | File Templates.
    }



    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
