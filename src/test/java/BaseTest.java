import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import setup.listeners.SuiteListener;

import static setup.DriverSetup.quitDriver;

@Listeners(SuiteListener.class)
public class BaseTest {
    @AfterClass
    public void tearDownBase() {
        quitDriver();
    }
}
