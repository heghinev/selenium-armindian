import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;
import pageobjects.HoverPage;

public class HoverPageTest {
    private ChromeDriver driver;
    private HoverPage hoverPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
        driver = new ChromeDriver();
        hoverPage = new HoverPage(driver);
    }

    @Test
    public void hoverText(){
        Assert.assertTrue(hoverPage.isHeaderInvisible(), "Header is not displayed");
        hoverPage.hoverAvatar();
        Assert.assertTrue(hoverPage.isHeaderDisplayed(), "Header is displayed");
        Assert.assertTrue(hoverPage.getFinish().getText().contains("name: user1"));
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
