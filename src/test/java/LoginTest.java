import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Heghine
 * Date: 12/11/17
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginTest {
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
       System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void login(){
       driver.get("http://the-internet.herokuapp.com/login");
       driver.findElement(By.id("username")).sendKeys(...keysToSend: "tomsmith");
       driver.findElement(By.id("password")).sendKeys(...keysToSend: "SuperSecretPassword!");
       driver.findElement(By.cssSelector("#login button")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        assertTrue("Login was not succeed!",
                driver.findElement(By.cssSelector(".flash.success")).isDisplayed());
               
        
        
    }

    private void assertTrue(String s, boolean displayed) {
        //To change body of created methods use File | Settings | File Templates.
    }

    private void assertTrue(Object p0) {
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
