import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;
import pageobjects.NewWindowPage;

public class NewWindowTest {
    private ChromeDriver driver;
    private NewWindowPage newWindowPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        newWindowPage = new NewWindowPage(driver);
    }

    @Test
    public void openNewWindow(){
        newWindowPage.clickLink();
        newWindowPage.switchToWindow(0);
    }



    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
