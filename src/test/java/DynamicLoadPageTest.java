import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DynamicLoadPage;

public class DynamicLoadPageTest extends BaseTest {
    private DynamicLoadPage dynamicLoadPage;

        @BeforeMethod
        public void setUp() {
           dynamicLoadPage = new DynamicLoadPage();
        }

        @Test
        public void dynamicLoad(){
            dynamicLoadPage.clickStart();
            Assert.assertTrue(dynamicLoadPage.isLoadingDisplayed(), "Loading is not displayed");
            Assert.assertTrue(dynamicLoadPage.isLoadingInvisible(), "Loading is still displayed");
            Assert.assertTrue(dynamicLoadPage.isFinishDisplayed(), "Blabla");
            Assert.assertEquals(dynamicLoadPage.getFinish().getText(),"Hello World!");
        }

    }
