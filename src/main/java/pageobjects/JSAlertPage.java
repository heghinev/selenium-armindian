package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSAlertPage extends BasePage {

    private By alertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By resultText = By.id("result");

    public JSAlertPage(WebDriver webDriver){
        super(webDriver);
        visit("http://the-internet.herokuapp.com/javascript_alerts");
    }

    public void openJSAlert(){
        click(alertButton);
    }

    public String verifyText(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public WebElement getResultText() {
        return find(resultText);
    }


}
