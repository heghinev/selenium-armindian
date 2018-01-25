import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;
import pageobjects.JSAlertPage;

public class JSAlertTest extends BaseTest{

    private JSAlertPage jsAlertPage;

    @BeforeMethod
    public void setUp() {
        jsAlertPage = new JSAlertPage();
    }

    @Test
    public void acceptJSAlert(){
        jsAlertPage.openJSAlert();
        //System.out.println(jsAlertPage.verifyText());
        Assert.assertTrue(jsAlertPage.verifyText().contains("I am a JS Alert"));
        jsAlertPage.acceptAlert();
        Assert.assertTrue(jsAlertPage.getResultText().getText().contains("You successfuly clicked an alert"));
    }


}
