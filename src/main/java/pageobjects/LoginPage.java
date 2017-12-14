package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private String loginURL = "http://the-internet.herokuapp.com/login";
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By submitLocator = By.cssSelector("#login button");
    private By successLocator = By.cssSelector(".flash.success");
    private By errorLocator = By.cssSelector(".flash.error");


    public LoginPage(WebDriver webDriver){
        this.driver = webDriver;
        driver.get(loginURL);
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }

    public void loginWith(String username, String password){

        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(submitLocator).click();
    }
    public boolean isSuccessDisplayed() {
        return driver.findElement(successLocator).isDisplayed();
    }

    public boolean isErrorDisplayed() {
        return driver.findElement(errorLocator).isDisplayed();
    }

    public String getErrormessage(){
        return driver.findElement(errorLocator).getText();
    }
}
