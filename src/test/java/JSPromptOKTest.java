import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.JSAlertPage;
import pageobjects.JSPromptOKPage;

public class JSPromptOKTest {
    private ChromeDriver driver;
    private JSPromptOKPage jsPromptOKPage;



    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        jsPromptOKPage = new JSPromptOKPage(driver);
    }

    @Test
    public void acceptJSAlert(){
        jsPromptOKPage.openJSAlert();
        jsPromptOKPage.typeText();
        jsPromptOKPage.acceptAlert();
        Assert.assertTrue(jsPromptOKPage.getResultText().getText().contains("You entered:"));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}

