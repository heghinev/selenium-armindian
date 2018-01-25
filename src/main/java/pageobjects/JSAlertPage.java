package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static setup.DriverSetup.getDriver;

public class JSAlertPage extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Click for JS Alert')]")
    private WebElement alertButton;
    @FindBy(id = "result")
    private WebElement resultText;

    //private By alertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    //private By resultText = By.id("result");

    public JSAlertPage(){
        super(getDriver());
        visit(getUrl());
    }

    public String getUrl(){
        return BASE_URL + "/javascript_alerts";
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
        return resultText;
    }


}
