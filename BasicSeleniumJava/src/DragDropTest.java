package the.bad.coder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropTest {

    WebDriver driver;
    @Test
    public void dragNDrop()
    {
        WebDriverManager.firefoxdriver().setup();
        
        driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/droppable/");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        WebElement dragItem;
        WebElement dropItem;
        dragItem = driver.findElement(By.xpath("//div[@id='draggable']"));
        dropItem = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions dragNdrop = new Actions(driver);
        dragNdrop.dragAndDrop(dragItem, dropItem).build().perform();

        String color;
        color = dropItem.getCssValue("background-color");
        System.out.println("Back ground color: "+color);

    }
    
}
