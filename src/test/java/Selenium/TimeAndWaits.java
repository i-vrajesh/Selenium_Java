package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeAndWaits {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); Depricated
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  Depricated
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("txt2")).sendKeys("Inplicit Wait");
        Thread.sleep(3000);
        driver.navigate().refresh();
        //WebDriver - to reduce 2 lines of fluent wait to make easy
        WebDriverWait Wwait = new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofMillis(500));
        driver.findElement(By.id("btn1")).click();
        Wwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1"))).isDisplayed();
        driver.findElement(By.id("txt1")).sendKeys("WebDriver Wait");
        Thread.sleep(3000);
        driver.navigate().refresh();
        //FluentWait
        FluentWait<WebDriver> Fwait = new FluentWait<WebDriver>(driver);
        Fwait.withTimeout(Duration.ofSeconds(10));
        driver.findElement(By.id("btn1")).click();
        Fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1"))).isDisplayed();
        driver.findElement(By.id("txt1")).sendKeys("Fluent Wait");
        Thread.sleep(3000);
        driver.quit();    
    }
}
