import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DragAndDropPage;

public class DragDropTest extends BaseTest {
    private DragAndDropPage dragAndDropPage;

    @BeforeMethod
    public void setUp() {
        dragAndDropPage = new DragAndDropPage();
    }

    @Test
    public void moveElement(){
       dragAndDropPage.dragAndDrop();
    }

}
