import org.testng.annotations.Test;
import pageobjects.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkboxSelect(){
        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage.clickOnCheckBox("checkbox 1");
    }
}
