package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownPage extends BasePage {
    private By dropdown = By.id("dropdown");
    //private By option1 = By.tagName(String "option");





    public DropdownPage(WebDriver webDriver) {
        super(webDriver);
        visit("http://the-internet.herokuapp.com/dropdown");
    }

    public WebElement getDropdown(){
        return find(dropdown);
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

}
