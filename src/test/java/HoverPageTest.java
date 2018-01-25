import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;
import pageobjects.HoverPage;

public class HoverPageTest extends BaseTest {
    private HoverPage hoverPage;

    @BeforeMethod
    public void setUp() {
        hoverPage = new HoverPage();
    }

    @Test
    public void hoverText(){
        Assert.assertTrue(hoverPage.isHeaderNotDisplayed(), "Header is not displayed");
        hoverPage.hoverAvatar();
        Assert.assertTrue(hoverPage.isHeaderDisplayed(), "Header is displayed");
        Assert.assertTrue(hoverPage.getFinish().getText().contains("name: user1"));
    }

}
