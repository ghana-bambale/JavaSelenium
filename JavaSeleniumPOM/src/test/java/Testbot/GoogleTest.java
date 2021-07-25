package Testbot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class GoogleTest{
	@Test
	public void launchTest(){
	System.setProperty("webdriver.gecko.driver","/home/thebadcoder/TestWorkspace/drivers/geckodriver");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.in");
	driver.manage().window().maximize();
	
	}
}
