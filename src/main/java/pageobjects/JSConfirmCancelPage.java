package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static setup.DriverSetup.getDriver;

public class JSConfirmCancelPage extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Click for JS Confirm')]")
    private WebElement alertButton;
    @FindBy(id = "result")
    private WebElement resultText;

    //private By alertButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    //private By resultText = By.id("result");

    public JSConfirmCancelPage(){
        visit(getUrl());
    }

    public String getUrl(){
        return BASE_URL + "/javascript_alerts";
    }

    public void openJSAlert(){
        click(alertButton);
    }

    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public WebElement getResultText() {
        return resultText;
    }
}
