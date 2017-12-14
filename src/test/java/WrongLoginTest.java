import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WrongLoginTest {
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void loginFail(){
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("blabla");
        driver.findElement(By.id("password")).sendKeys("blablabla");
        driver.findElement(By.cssSelector("#login button")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        assertTrue("Your username is invalid!!",
                driver.findElement(By.cssSelector(".flash.error")).isDisplayed());





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
