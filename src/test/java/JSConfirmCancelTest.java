import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.JSConfirmCancelPage;
import pageobjects.JSConfirmOKPage;

public class JSConfirmCancelTest {
    private ChromeDriver driver;
    private JSConfirmCancelPage jsConfirmCancelPage;



    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        jsConfirmCancelPage = new JSConfirmCancelPage(driver);
    }

    @Test
    public void acceptJSAlert(){
        jsConfirmCancelPage.openJSAlert();
        jsConfirmCancelPage.cancelAlert();
        Assert.assertTrue(jsConfirmCancelPage.getResultText().getText().contains("You clicked: Cancel"));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}

