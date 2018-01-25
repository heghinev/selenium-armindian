import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;

public class DropDownTest extends BaseTest {
    private DropdownPage dropdownPage;

    @BeforeMethod
    public void setUp() {
       dropdownPage = new DropdownPage();
       //dropdownPage = (DropdownPage) new DropdownPage().get(); ete uzum es LC-e ashxati
    }

    @Test
    public void dropdown(){
        dropdownPage.selectOption("Option 1");
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 1");
    }

    @Test
    public void dropdownSelect(){
        dropdownPage.forceAlert();
        dropdownPage.closeAlert();
    }

}
