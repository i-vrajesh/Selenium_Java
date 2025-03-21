package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderControls {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        WebElement firstDatePicker = driver.findElement(By.id("first_date_picker"));
        WebElement secondDatePicker = driver.findElement(By.id("second_date_picker"));
        WebElement thirdDatePicker = driver.findElement(By.id("third_date_picker"));
        WebElement fourthDatePicker = driver.findElement(By.id("fourth_date_picker"));
        WebElement fifthDatePicker = driver.findElement(By.id("fifth_date_picker"));
        WebElement sixthDatePicker = driver.findElement(By.id("sixth_date_picker"));
        int date = 15;
        firstDatePicker.click();
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+date+"]")).click();
        Thread.sleep(3000);

//        String targetDate = "01/April/2001";
//        Calendar calendar = Calendar.getInstance();
//        try{
//            SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
//            targetDateFormat.setLenient(false);
//            Date formattedTargetDate = targetDateFormat.parse(targetDate);
//            calendar.setTime(formattedTargetDate);
//            int targetMonth = calendar.get(Calendar.MONTH);
//            int targetYear = calendar.get(Calendar.YEAR);
//        }catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
    }
}
