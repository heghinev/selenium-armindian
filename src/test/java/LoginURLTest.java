import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginURLTest {
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void loginSecure(){
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("#login button")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://the-internet.herokuapp.com/secure" );
        // or driver.getCurrentUrl().contains("/secure");

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}


