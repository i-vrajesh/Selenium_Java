package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    static WebDriver driver;
    static Base base = new Base();

    public static void main(String[] args) throws InterruptedException {
        base.setup();
        base.quit();
    }
    public void setup(){
        //        System.setProperty("webdriver.chrome.driver","path");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        driver.manage().window().maximize();
    }

    public void quit(){
        if(driver!=null) {
            driver.quit();
        }
    }


}
