package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoadPage extends BasePage {
    private By startButton = By.cssSelector("#start button");
    private By finishText = By.id("finish");
    private By loadingText = By.id("loading");


   /* grel method vore piti unena es page-um
    isLoadingDisplayed()
    isLoadingInvisible()

        base page-um sarqel mi hat method
    isElementInvisible(WebElement, Integer timeout)

    teste poxel aynpes, vore click ani Start --> stugi vor loadinge exel e(visible)/assertion,
    heto vor loadinge chka (invisible)assertion, heto nor finish visible u texte


    Google
    searche poxel, vor resultsi qnakae ereva nor sharunaki (kareli e clicke hamarel avartac erb cliockic heto resulte ereva )
*/


    public DynamicLoadPage(WebDriver webDriver) {
        super(webDriver);
        visit("http://the-internet.herokuapp.com/dynamic_loading/1");
    }

    public void clickStart(){
        click(startButton);
    }

    public boolean isFinishDisplayed(){
       return isDisplayed(find(finishText), 10);
    }

    public boolean isLoadingDisplayed(){
        return isDisplayed(find(loadingText), 10);
    }

    public boolean isLoadingInvisible(){
        return isElementInvisible(find(loadingText), 10);
    }

    public WebElement getFinish(){
        return find(finishText);
    }
}
