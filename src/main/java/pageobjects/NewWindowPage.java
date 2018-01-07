package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewWindowPage extends BasePage {
       private By text = By.tagName("h3");

       public NewWindowPage(WebDriver webDriver) {
        super(webDriver);
        visit("http://the-internet.herokuapp.com/windows");
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
               return find(text).isDisplayed();
           }catch (Exception e){
           }
        return false;
    }
}
