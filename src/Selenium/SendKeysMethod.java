package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendKeysMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\parvi\\Desktop\\Duotech\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launches a new browser session

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.SHIFT, "socks") + Keys.ENTER);

     //   Simulate pressing many keys at once in a "chord". Takes a sequence of Keys.XXXX or strings; appends each of the values to a string, and adds the chord termination key (Keys.NULL) and returns the resultant string.

        driver.findElement(By.name("q")).clear();
    }
}
