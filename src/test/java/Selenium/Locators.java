package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        setup();
        highlight(driver.findElement(By.id("login_field"))); //input[@id='login_field']
        highlight(driver.findElement(By.name("password"))); //input[@name='password']
        highlight(driver.findElement(By.className("header-logo"))); //a[@class='header-logo']
        highlight(driver.findElement(By.tagName("h1"))); //h1[text()='Sign in to GitHub']
        highlight(driver.findElement(By.linkText("Forgot password?"))); //a[text()='Forgot password?']
        highlight(driver.findElement(By.partialLinkText("Create an"))); //a[contains(text(),'Create an')]
        highlight(driver.findElement(By.cssSelector("input[name='commit']"))); //input[name='commit']
        highlight(driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]"))); //label[contains(text(),'Username or email address')]
        quit();
    }
    public static void highlight(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow');",element);
        Thread.sleep(1000);
    }
    public static void setup(){
//        System.setProperty("webDriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
    }
    public static void quit(){
        if(driver!=null) {
            driver.quit();
        }
    }
}
