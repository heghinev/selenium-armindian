package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSConfirmCancelPage extends BasePage {
    private By alertButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By resultText = By.id("result");

    public JSConfirmCancelPage(WebDriver webDriver){
        super(webDriver);
        visit("http://the-internet.herokuapp.com/javascript_alerts");
    }

    public void openJSAlert(){
        click(alertButton);
    }

    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public WebElement getResultText() {
        return find(resultText);
    }
}
