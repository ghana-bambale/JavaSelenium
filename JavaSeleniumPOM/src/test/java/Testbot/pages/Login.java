package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
// PageFactory imports
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login{
    WebDriver driver;

    // Locators - Without Page Factory
    /*
    By usernameLocator = By.xpath("//div[@class='_3wFoIb row']/descendant::input[@type='text']");
    By passwordLocator = By.xpath("//div[@class='_3wFoIb row']/descendant::input[@type='password']");
    By loginButtonLocator = By.xpath("//span[text()='Login']/ancestor::button");
    */
    
    // Locators - Using Page Factory
    @FindBy(xpath="//div[@class='_3wFoIb row']/descendant::input[@type='text']")
    WebElement usernameLocator;
    @FindBy(xpath="//div[@class='_3wFoIb row']/descendant::input[@type='password']")
    WebElement passwordLocator;
    @FindBy(xpath="//span[text()='Login']/ancestor::button")
    WebElement loginButtonLocator;



    public Login(WebDriver driver){
        //Pass
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void fillUsername(String usernameValue){
        // driver.findElement(usernameLocator).sendKeys(usernameValue);     //Without PageFactory
        usernameLocator.sendKeys(usernameValue);
    }

    public void fillPassword(String passwordValue){
        // driver.findElement(passwordLocator).sendKeys(passwordValue);     //Without PageFactory
        passwordLocator.sendKeys(passwordValue);
    }

    public void clickLogin(){
        // driver.findElement(loginButtonLocator).click();                  //Without PageFactory
        loginButtonLocator.click();
    }

}