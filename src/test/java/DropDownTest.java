import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;

public class DropDownTest {
    private ChromeDriver driver;
    private DropdownPage dropdownPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void dropdown(){
        dropdownPage.selectOption("Option 1");
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 1");
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
