package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static setup.DriverSetup.getDriver;

public class DragAndDropPage extends BasePage {
    @FindBy(id = "draggable")
    private WebElement source;
    @FindBy(id = "droppable")
    private WebElement target;

    /*private By boxA = By.id("column-a");
    private By boxB = By.id("column-b");
    private By textA = By.cssSelector("#column-a.header");
    private By textB = By.cssSelector("#column-b.header");
*/
    public DragAndDropPage(){
        super(getDriver());
        visit(getUrl());
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        waitForElement(source);
    }

    public String getUrl(){
        //return BASE_URL + "/drag_and_drop";
        return "http://jqueryui.com/resources/demos/droppable/default.html";
    }

    public void dragAndDrop() {
        Actions actions = new Actions(driver);
        /*WebElement drag = driver.findElement(By.id("column-a"));
        WebElement drop = driver.findElement(By.id("column-b"));*/
        actions.dragAndDrop(source, target).build().perform();
    }


    //actions-ov mi hat drag-able mi hat el dropable webelement
}
