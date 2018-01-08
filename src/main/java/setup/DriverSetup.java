package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
    private static WebDriver driver;
    public static String BROWSER = System.getProperty("selenium.browser", "chrome");

    public static WebDriver getDriver(){
        if (driver == null){
            switch(BROWSER) {
                case "chrome":
                    String chromeDriverLocation = System.getProperty("selenium.chromedriver", "C:\\dev\\chromedriver.exe");
                    System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    String firefoxDriverLocation = System.getProperty("selenium.geckodriver", "C:\\dev\\geckodriver.exe");
                    System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
                    driver = new FirefoxDriver();
                    break;
            }
       }
       return driver;
    }

  public static void quitDriver(){
            if(driver != null){
                driver.close();
                driver.quit();
                driver =null;
            }
        }
}
