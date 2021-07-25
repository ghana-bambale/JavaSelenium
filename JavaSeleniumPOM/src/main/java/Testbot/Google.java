package Testbot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google{

	public static void main(String[] args){
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.in");
	driver.manage().window().maximize();
	
	}
}
