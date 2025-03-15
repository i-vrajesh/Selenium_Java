package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//        singleWindowHandle(driver);
//        singleTab(driver);
//        multipleWindows(driver);
//        multipleTabs(driver);
        multipleTabsAndWindows(driver);
        driver.quit();
    }

    public static void singleWindowHandle(WebDriver driver) throws InterruptedException {
        WebElement singleWindow = driver.findElement(By.id("newWindowBtn"));
        String parentWindowHandle = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",singleWindow);
        singleWindow.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String windowhandle : windowHandles){
            if(! windowhandle.equals(parentWindowHandle)){
                driver.switchTo().window(windowhandle);
                driver.manage().window().maximize();
                System.out.println(windowhandle + " || Title : "+driver.getTitle());
                WebElement fName = driver.findElement(By.id("firstName"));
                js.executeScript("arguments[0].scrollIntoView();",fName);
                fName.sendKeys("John");
                Thread.sleep(1000);
                System.out.println(fName.getText());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Switched to Parent Window");
    }

    public static void singleTab(WebDriver driver) throws InterruptedException {
        WebElement singleTab = driver.findElement(By.id("newTabBtn"));
        String parentWindowHandle = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",singleTab);
        singleTab.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle: windowHandles){
            if(! windowHandle.equals(parentWindowHandle)){
                driver.switchTo().window(windowHandle);
                driver.findElement(By.id("alertBox")).click();
                System.out.println(driver.switchTo().alert().getText());
                Thread.sleep(1000);
                driver.switchTo().alert().accept();
                System.out.println(driver.findElement(By.id("output")).getText());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Switched to Parent Window");
    }

    public static void multipleWindows(WebDriver driver) throws InterruptedException {
        WebElement multipleWindows = driver.findElement(By.id("newWindowsBtn"));
        String parentWindowHandle = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",multipleWindows);
        multipleWindows.click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        for(String windowHandle: windowHandles){
            if(!windowHandle.equals(parentWindowHandle)){
                driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();
                Thread.sleep(1000);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Switched to Parent Window");
    }

    public static void multipleTabs(WebDriver driver) throws InterruptedException {
        WebElement multipleTabs = driver.findElement(By.id("newTabsBtn"));
        String parentWindowHandle = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",multipleTabs);
        multipleTabs.click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        for(String windowHandle: windowHandles){
            if(!windowHandle.equals(parentWindowHandle)){
                driver.switchTo().window(windowHandle);
                Thread.sleep(1000);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Switched to Parent Window");
    }

    public static void multipleTabsAndWindows(WebDriver driver) throws InterruptedException {
        WebElement multipleTabsAndWindows = driver.findElement(By.id("newTabsWindowsBtn"));
        WebElement footer = driver.findElement(By.id("Footer widget(1)"));
        String parentWindowHandle = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",footer);
        System.out.println("Scrolled");
        multipleTabsAndWindows.click();
        System.out.println("Clicked");
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        for(String windowHandle: windowHandles){
            if(!windowHandle.equals(parentWindowHandle)){
                driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();
                Thread.sleep(1000);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandle);
        System.out.println("Switched to Parent Window");
    }
}
