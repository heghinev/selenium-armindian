package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static setup.DriverSetup.getDriver;

public class NewWindowPage extends BasePage {
    @FindBy(tagName = "h3")
    private WebElement text;

    //private By text = By.tagName("h3");

       public NewWindowPage() {
        super(getDriver());
        visit(getUrl());
    }

    public String getUrl(){
        return BASE_URL + "/windows";
    }

    public void clickLink(){
           find(".example a").click();
    }

    public Object[] getAllWindows(){
           return driver.getWindowHandles().toArray();
    }

    public void switchToWindow(int index){
         driver.switchTo().window(getAllWindows()[index].toString());
    }

    public boolean isTextDisplayed(){
           try {
               return text.isDisplayed();
           }catch (Exception e){
           }
        return false;
    }
}
