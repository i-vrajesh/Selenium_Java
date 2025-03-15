package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBox {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement firstName = driver.findElement(By.id("firstName"));
        js.executeScript("arguments[0].scrollIntoView();", firstName);

        firstName.sendKeys("Test");
        Thread.sleep(1000);
        System.out.println(firstName.getAttribute("value"));
        firstName.clear();
        Thread.sleep(1000);
        driver.quit();
    }
}
