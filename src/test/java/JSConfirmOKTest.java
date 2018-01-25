import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.JSAlertPage;
import pageobjects.JSConfirmOKPage;

public class JSConfirmOKTest extends BaseTest {
    private JSConfirmOKPage jsConfirmOKPage;



    @BeforeMethod
    public void setUp() {
        jsConfirmOKPage = new JSConfirmOKPage();
    }

    @Test
    public void acceptJSAlert(){
        jsConfirmOKPage.openJSAlert();
        jsConfirmOKPage.acceptAlert();
        Assert.assertTrue(jsConfirmOKPage.getResultText().getText().contains("You clicked: Ok"));
    }


}

