package Testbot.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

// import io.github.bonigarcia.wdm.WebDriverManager;
// import org.testng.annotations.BeforeSuite;
// import org.testng.annotations.AfterSuite;
public class InitTest{
    public static WebDriver driver;
    
    @Parameters({ "url_parameter" })
    @BeforeSuite
    public void setup(@Optional("https://jqueryui.com/droppable/") String url_parameter)
    {
        System.setProperty("webdriver.gecko.driver","/home/thebadcoder/TestWorkspace/drivers/geckodriver");
        // WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String baseURL = url_parameter;
        driver.get(baseURL);
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    @AfterSuite
    public void exitBrowser()
    {
        System.out.println("Thanks Ghana.");
        driver.close();
    }

}