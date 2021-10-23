package Testbot.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
// import org.testng.annotations.BeforeSuite;
// import org.testng.annotations.AfterSuite;
public class InitTest{
    public static WebDriver driver;
    
    @Parameters({ "url" })
    @BeforeSuite
    public void setup(@Optional("https://www.flipkart.com/") String urlParam)
    {
        // System.setProperty("webdriver.gecko.driver","/home/thebadcoder/TestWorkspace/drivers/geckodriver");
        
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String baseURL = urlParam;
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