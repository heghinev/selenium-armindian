import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;
import pageobjects.NewWindowPage;

public class NewWindowTest extends BaseTest {
    private NewWindowPage newWindowPage;

    @BeforeMethod
    public void setUp() {
        newWindowPage = new NewWindowPage();
    }

    @Test
    public void openNewWindow(){
        newWindowPage.clickLink();
        newWindowPage.switchToWindow(0);

        Assert.assertTrue(newWindowPage.isTextDisplayed(), "Text is not displayed!");
    }


}
