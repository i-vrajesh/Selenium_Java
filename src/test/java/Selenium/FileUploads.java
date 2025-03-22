package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploads {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.expandtesting.com/upload");
        WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
        String filePath = "C:\\Library\\FileUpload.txt";
        chooseFile.sendKeys(filePath);
        Thread.sleep(2000);
        driver.findElement(By.id("fileSubmit")).click();
        System.out.println("FileUploaded Msg: "+driver.findElement(By.id("uploaded-files")).getText());
        driver.quit();
    }
}
