package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.compress.utils.OsgiUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrames {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        driver.findElement(By.id("name")).sendKeys("Text1"); //Main Document
        System.out.println("Entered Text1 in MainDoc");

        driver.switchTo().frame("frm1"); //Frame1
        WebElement courseDd = driver.findElement(By.id("course"));
        Select select = new Select(courseDd);
        select.selectByVisibleText("Java");
        System.out.println("Selected Java in Frame1");
        Thread.sleep(1000);

        driver.switchTo().defaultContent(); //MainDocument
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Text2");
        System.out.println("Entered Text2 in MainDoc");
        Thread.sleep(1000);


        driver.switchTo().frame("frm2"); //Frame2
        driver.findElement(By.id("firstName")).sendKeys("John");
        System.out.println("Entered John in Frame2");
        Thread.sleep(1000);

        driver.switchTo().defaultContent(); //MainDocument
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Text3");
        System.out.println("Entered Text3 in MainDoc");
        Thread.sleep(1000);


//        driver.switchTo().frame("frm3"); //Frame3
//        driver.findElement(By.id("name")).sendKeys("Tony");
//        System.out.println("Entered Tony in Frame3");
//        Thread.sleep(1000);
//
//        driver.switchTo().frame("frm1"); //Frame3-1
//        System.out.println("Entered 3-1");
//        js.executeScript("arguments[0].scrollIntoView();",courseDd);
//        select.selectByVisibleText("Python");
//        System.out.println("Selected Python in 3-1");
//        Thread.sleep(1000);
//
//        driver.switchTo().parentFrame(); //Frame3
//        System.out.println("Entered Frame 3 after frame 3-1");
//        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("name")));
//        driver.findElement(By.id("name")).clear();
//        driver.findElement(By.id("name")).sendKeys("Gill");
//        System.out.println("Entered Gill in Frame3");
//        Thread.sleep(1000);
//
//        driver.switchTo().frame("frm2");//Frame3-2
//        System.out.println("Entered Frame 3-2");
//        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("firstName")));
//        driver.findElement(By.id("firstName")).sendKeys("Mark");
//        System.out.println("Entered Mark in Frame3");
//        Thread.sleep(1000);
//
//        driver.switchTo().defaultContent();//Frame3
//        driver.switchTo().defaultContent();//MainFrame
//        driver.findElement(By.id("name")).clear();
//        driver.findElement(By.id("name")).sendKeys("Text4");
        driver.quit();

    }
}
