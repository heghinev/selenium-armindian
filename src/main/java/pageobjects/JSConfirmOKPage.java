package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSConfirmOKPage extends BasePage {
    private By alertButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By resultText = By.id("result");

    public JSConfirmOKPage(WebDriver webDriver){
        super(webDriver);
        visit("http://the-internet.herokuapp.com/javascript_alerts");
    }

    public void openJSAlert(){
        click(alertButton);
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public WebElement getResultText() {
        return find(resultText);
    }
}
