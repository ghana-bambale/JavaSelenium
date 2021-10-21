package Testbot.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Testbot.tests.InitTest;
// PageFactory imports
public class Login{
    
    WebDriver driver = InitTest.getDriver();

    // Locators - Without Page Factory
    
    By usernameLocator = By.xpath("//div[@class='_3wFoIb row']/descendant::input[@type='text']");
    By passwordLocator = By.xpath("//div[@class='_3wFoIb row']/descendant::input[@type='password']");
    By loginButtonLocator = By.xpath("//span[text()='Login']/ancestor::button");
    
    
    /*
    // Locators - Using Page Factory
    @FindBy(xpath="//div[@class='_3wFoIb row']/descendant::input[@type='text']")
    WebElement usernameLocator;
    @FindBy(xpath="//div[@class='_3wFoIb row']/descendant::input[@type='password']")
    WebElement passwordLocator;
    @FindBy(xpath="//span[text()='Login']/ancestor::button")
    WebElement loginButtonLocator;
    */

    public void Login(){
        
        System.out.println("Login constructor.");
        // PageFactory.initElements(driver, this);
    }


    public void fillUsername(String usernameValue){
        
        System.out.println("Username entered.");
        driver.findElement(usernameLocator).sendKeys(usernameValue);     //Without PageFactory
        // usernameLocator.sendKeys(usernameValue);
    }

    public void fillPassword(String passwordValue){
        System.out.println("Password provided.");
        driver.findElement(passwordLocator).sendKeys(passwordValue);     //Without PageFactory
        // passwordLocator.sendKeys(passwordValue);
    }

    public void clickLogin(){
        System.out.println("Login Button clicked.");
        WebElement submitButton = driver.findElement(loginButtonLocator);                  //Without PageFactory
        submitButton.click();
        // loginButtonLocator.click();
    }

}
