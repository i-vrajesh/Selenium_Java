package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {
//        System.setProperty("webdriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/img1.jpg");
        FileUtils.copyFile(srcFile,destFile);
        System.out.println("Screenshot Saved");

        /*If ChromeDriver driver = new ChromeDriver();
        TypeCasting not required
        Then code will be

        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/img1.jpg");
        FileUtils.copyFile(srcFile,destFile);
        System.out.println("Screenshot Saved");
        */


    }
}
