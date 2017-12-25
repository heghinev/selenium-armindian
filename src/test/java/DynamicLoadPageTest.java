import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DynamicLoadPage;

public class DynamicLoadPageTest {
    private ChromeDriver driver;
    private DynamicLoadPage dynamicLoadPage;

        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
            driver = new ChromeDriver();
            dynamicLoadPage = new DynamicLoadPage(driver);
        }

        @Test
        public void dynamicLoad(){
            dynamicLoadPage.clickStart();
            Assert.assertTrue(dynamicLoadPage.isLoadingDisplayed(), "Loading is not displayed");
            Assert.assertTrue(dynamicLoadPage.isLoadingInvisible(), "Loading is still displayed");
            Assert.assertTrue(dynamicLoadPage.isFinishDisplayed(), "Blabla");
            Assert.assertEquals(dynamicLoadPage.getFinish().getText(),"Hello World!");
        }



        @AfterMethod
        public void tearDown() {
            driver.close();
            driver.quit();
        }


    }
