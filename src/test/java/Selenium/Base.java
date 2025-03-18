package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

    static WebDriver driver;
    static Base base = new Base();

    public static void main(String[] args) throws InterruptedException {
        base.setup();
        base.quit();
    }
    public void setup() throws InterruptedException {
        //        System.setProperty("webdriver.chrome.driver","path");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); //instead of maximizing after launching
        driver = new ChromeDriver();
//        driver.manage().window().maximize(); //will maximize nly after launching
        driver.get("http://www.seleniumhq.org");
        String currentURL = driver.getCurrentUrl();
        System.out.println("Actual URL: http://www.seleniumhq.org");
        System.out.println("Current URL : "+currentURL);
        System.out.println("Title: "+ driver.getTitle());
        System.out.println("Page Source: "+driver.getPageSource());
        Thread.sleep(3000);
    }

    public void quit(){
        if(driver!=null) {
            driver.quit();
        }
    }


}
