package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSPromptOKPage extends BasePage {
    private By alertButton = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private By resultText = By.id("result");

    public JSPromptOKPage(WebDriver webDriver){
        super(webDriver);
        visit("http://the-internet.herokuapp.com/javascript_alerts");
    }

    public void openJSAlert(){
        click(alertButton);
    }

    public void typeText(){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("ggg");
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public WebElement getResultText() {
        return find(resultText);
    }
}
