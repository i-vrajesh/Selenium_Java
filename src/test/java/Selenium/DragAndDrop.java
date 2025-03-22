package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Actions class method to drag and drop
        Actions actions = new Actions(driver);
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
        driver.switchTo().frame(iframe);
        WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
        //Perform dragAndDropBy
        actions.dragAndDropBy(img1, 100, 100).perform();
        System.out.println("Dropped");
        Thread.sleep(2000);
        driver.quit();
    }
}
