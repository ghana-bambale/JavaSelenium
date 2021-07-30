package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Login{
    WebDriver driver;
    String usernameLocator = "//div[@class='_3wFoIb row']/descendant::input[@type='text']";
    String passwordLocator = "//div[@class='_3wFoIb row']/descendant::input[@type='password']";
    String loginButtonLocator = "//span[text()='Login']/ancestor::button";
    
    public Login(WebDriver driver){
        //Pass
        this.driver = driver;
    }


    public void fillUsername(String usernameValue){
        driver.findElement(By.xpath(usernameLocator)).sendKeys(usernameValue);
    }

    public void fillPassword(String passwordValue){
        driver.findElement(By.xpath(passwordLocator)).sendKeys(passwordValue);
    }

    public void clickLogin(){
        driver.findElement(By.xpath(loginButtonLocator)).click();
    }

}