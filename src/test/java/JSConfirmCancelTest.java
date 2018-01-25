import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.JSConfirmCancelPage;
import pageobjects.JSConfirmOKPage;

public class JSConfirmCancelTest extends BaseTest{
    private JSConfirmCancelPage jsConfirmCancelPage;


    @BeforeMethod
    public void setUp() {
        jsConfirmCancelPage = new JSConfirmCancelPage();
    }

    @Test
    public void acceptJSAlert(){
        jsConfirmCancelPage.openJSAlert();
        jsConfirmCancelPage.cancelAlert();
        Assert.assertTrue(jsConfirmCancelPage.getResultText().getText().contains("You clicked: Cancel"));
    }


}

