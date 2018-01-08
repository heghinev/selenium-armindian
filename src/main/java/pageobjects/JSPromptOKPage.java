package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static setup.DriverSetup.getDriver;

public class JSPromptOKPage extends BasePage {
    private By alertButton = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private By resultText = By.id("result");

    public JSPromptOKPage(){
        super(getDriver());
        visit(getUrl());
    }

    public String getUrl(){
        return BASE_URL + "/javascript_alerts";
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
