package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static setup.DriverSetup.getDriver;

public class DropdownPage extends BasePage {
    @FindBy(id = "dropdown")
    private WebElement dropdown;
   // private By dropdown = By.id("dropdown");
    //private By option1 = By.tagName(String "option");


    public DropdownPage() {
        super(getDriver());
        visit(getUrl());
    }

    public String getUrl(){
        return BASE_URL + "/dropdown";
    }

    public WebElement getDropdown(){
        return dropdown;
    }

    public List<WebElement> getDropdownOptions(){
        return getDropdown().findElements(By.tagName("option"));
    }

    public void selectOption(String optionName){
        List<WebElement> options = getDropdownOptions();
        for (WebElement option:options){
            if (option.getText().equals(optionName)){
                option.click();
            }
        }
    }

    public String getSelectedOption(){
        List<WebElement> options = getDropdownOptions();
        for (WebElement option:options){
            if (option.isSelected()){
                return option.getText();
            }
        }
        return null;
    }

    public void forceAlert(){
        ((JavascriptExecutor) driver).executeScript("alert(\"Hello! i am an alert box!\")");
    }

    public void closeAlert(){
        driver.switchTo().alert().accept();
    }

    /*http://the-internet.herokuapp.com/javascript_alerts bolor 3 caseri ahmar(including OK/Cancel), grel arandzin window-nerum
    New window-i mej stugel texte
*/
}
