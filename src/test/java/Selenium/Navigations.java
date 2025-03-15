package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("APjFqb")).sendKeys("HYR Tutorials");
        Thread.sleep(1000);
        driver.findElement(By.id("APjFqb")).submit();
//        driver.findElement(By.className("recaptcha-checkbox-border")).click();
        Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("test@email.com");
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.quit();


    }
}
