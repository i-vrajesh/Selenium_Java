package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No.of Links: "+links.size());
        for(WebElement link:links){
            String url = link.getAttribute("href");
            if(url==null || url.isEmpty()){
                System.out.println("Skipping empty URL");
                continue;
            }
            try{
                URL linkURL = new URL(url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)linkURL.openConnection();
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();
                if(httpURLConnection.getResponseCode()>=400){
                    System.out.println(link+" - "+httpURLConnection.getResponseMessage());
                }else{
                    System.out.println(link+" - "+httpURLConnection.getResponseMessage());
                }
            }catch(Exception e){
                System.out.println("Error in URL: "+url+" - "+e.getMessage());
            }
        }
        driver.quit();
    }
}
