import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.JSPromptOKPage;
import setup.DriverSetup;

import static setup.DriverSetup.getDriver;
import static setup.DriverSetup.quitDriver;

public class JSPromptOKTest {
    private JSPromptOKPage jsPromptOKPage;



    @BeforeMethod
    public void setUp() {
        jsPromptOKPage = new JSPromptOKPage();
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
        quitDriver();
    }

}

