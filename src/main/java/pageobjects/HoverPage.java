package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoverPage extends BasePage {


    public HoverPage(WebDriver webDriver) {
        super(webDriver);
        visit("http://the-internet.herokuapp.com/hovers");
    }

    public void hoverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void hoverAvatar() {
        hoverElement(find(By.className("figure")));
    }

    public boolean isHeaderDisplayed() {
        return isDisplayed(find(By.className("figcaption")), 5);
    }

    public boolean isHeaderInvisible() {
        return isElementInvisible(find(By.className("figcaption")), 5);
    }

    public WebElement getFinish() {
        return find(By.className("figure"));
    }
}
