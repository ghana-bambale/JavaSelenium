import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is the very first automation program using Java selenium, Steps as below-
 * 1. Install Java and configure JAVA_HOME in your environment variables, I have it in ubuntu so automaticall configured.
 * 2. Have an IDE like I have here VS code.
 * 3. Download and add the client combined jar to referenced libraries in your Java project
 * 4. Download your preferred browser's driver from official website, I am using firefox and it should be in specific location.
 * 5. Write the code below and run.
 */

public class GoogleTest {
    public static void main(String[] args) throws InterruptedException{
    System.out.println("Test started...!");
    // Tell the script which driver you are going to use and where to find it.
    System.setProperty("webdriver.gecko.driver", "/usr/local/share/gecko_driver/geckodriver");
    // Create driver object of respective browser
    WebDriver driver = new FirefoxDriver();

    // Launch the browser to some URL
    String baseUrl = "https://www.google.in";
    driver.get(baseUrl);
    driver.manage().window().maximize();

    //Do some additional normal thing with driver/automation
    String pageTitle = driver.getTitle();
    System.out.println("Page title found to be: " +pageTitle);

    //Sleep addded to see the action
    Thread.sleep(5000);

    //close the driver/browser
    driver.close();
    }
}
