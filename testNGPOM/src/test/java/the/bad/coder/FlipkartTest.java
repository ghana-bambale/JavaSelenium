package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlipkartTest
{
    @Test
    public void HoverTest()
    {
        System.setProperty("webdriver.gecko.driver","/home/thebadcoder/TestWorkspace/drivers/geckodriver");
        WebDriver driver;
        driver = new FirefoxDriver();
        //driver.get("https://www.myntra.com");
        driver.get("https://www.flipkart.com/");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        /*
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='desktop-main' and text()='Kids']")));

        WebElement menu = driver.findElement(By.xpath("//a[@class='desktop-main' and text()='Kids']"));

        WebElement submenu= driver.findElement(By.xpath("//descendant::a[text()='Gini & Jony']"));

        Actions hover = new Actions(driver);
        hover.moveToElement(menu).build().perform();

        hover.moveToElement(submenu).build().perform();
        */
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_3wFoIb row']/descendant::input[@type='text']")));
        driver.findElement(By.xpath("//div[@class='_3wFoIb row']/descendant::input[@type='text']")).sendKeys("9970042828");
        driver.findElement(By.xpath("//div[@class='_3wFoIb row']/descendant::input[@type='password']")).sendKeys("beingdevil");
        driver.findElement(By.xpath("//span[text()='Login']/ancestor::button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='exehdJ' and contains(text(),'Ghansham')]")));
        
        Actions goHere = new Actions(driver);
        goHere.moveToElement(driver.findElement(By.xpath("//div[@class='exehdJ' and contains(text(),'Ghansham')]"))).build().perform();

    }
}
