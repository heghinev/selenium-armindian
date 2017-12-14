package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private WebDriver driver;
    private String loginURL = "http://the-internet.herokuapp.com/login";
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By submitLocator = By.cssSelector("#login button");
    private By successLocator = By.cssSelector(".flash.success");
    private By errorLocator = By.cssSelector(".flash.error");


    public LoginPage(WebDriver webDriver){
        super(webDriver);
        visit(loginURL);
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }

    public void loginWith(String username, String password){

        find(usernameLocator).sendKeys(username);
        find(passwordLocator).sendKeys(password);
        find(submitLocator).click();
    }
    public boolean isSuccessDisplayed() {
        return find(successLocator).isDisplayed();
    }

    public boolean isErrorDisplayed() {
        return find(errorLocator).isDisplayed();
    }

    public String getErrormessage(){
        return find(errorLocator).getText();
    }
}
