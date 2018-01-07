import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.JSAlertPage;
import pageobjects.JSConfirmOKPage;

public class JSConfirmOKTest {
    private ChromeDriver driver;
    private JSConfirmOKPage jsConfirmOKPage;



    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        jsConfirmOKPage = new JSConfirmOKPage(driver);
    }

    @Test
    public void acceptJSAlert(){
        jsConfirmOKPage.openJSAlert();
        jsConfirmOKPage.acceptAlert();
        Assert.assertTrue(jsConfirmOKPage.getResultText().getText().contains("You clicked: Ok"));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}

