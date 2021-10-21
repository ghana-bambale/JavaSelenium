package Testbot.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Testbot.tests.InitTest;

// import org.openqa.selenium.interactions.Actions;
public class Home{
    WebDriver driver = InitTest.getDriver();

    //Without Page Factory
    By userNameLoc = By.xpath("(//div[@class='exehdJ'])[1]");    // not a correct xpath - need to update
    // By userNameLoc = By.xpath("//div[text()='Fashion']/../div");
    By wishlistLocator = By.xpath("//div[text()='Wishlist']");   

    
    
    //With Page Factory
    /*
    @FindBy(xpath="//div[@class='exehdJ' and not(contains(text(),'RealUserName'))]")
    WebElement userName;

    @FindBy(xpath = "//div[text='Wishlist']")
    WebElement wishlist;
    */
    
    public void Home()
    {
        System.out.println("Constructor called.");
        // PageFactory.initElements(driver, this);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    public void hoverUsername()
    {
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, 30);
        
        System.out.println("Title of webpage: "+driver.getTitle());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Mobiles']")));

        // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[@class='_1_3w1N']")));
        // wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='exehdJ']"), 2));

        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='exehdJ' and contains(text(),'RealUserName')]")));
        
        WebElement userName = driver.findElement(userNameLoc);
        
        Actions hover = new Actions(driver);
        hover.moveToElement(userName).build().perform();
        driver.findElement(wishlistLocator).click();
        // userName.click();
    }
    public void openWishlist()
    {
        // wishlist.click();
        //driver.findElement(wishlistLocator).click();
        System.out.println("Wishlist clicked.");    
    }
}
