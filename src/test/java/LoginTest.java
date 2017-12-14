import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

/**
 * Created by IntelliJ IDEA.
 * User: Heghine
 * Date: 12/11/17
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginTest {
    private ChromeDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
       System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void login(){
       loginPage.loginWith("tomsmith", "SuperSecretPassword!");

       // if Enter is clicked on driver.findElement(By.id("password")).sendKeys(Keys.RETURN);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        assertTrue("Login was not succeed!", loginPage.isSuccessDisplayed());
               
        
        
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
