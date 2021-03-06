package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearchTestCase {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\parvi\\Desktop\\Duotech\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launches a new browser session



        // Navigate to google
        driver.get("https://www.google.com/");
        // Find the search field
        WebElement inputBox = driver.findElement(By.name("w"));

        //When findElement() cannot locate the element NoSuchElementException is thrown


        //WebElement interface represents an HTML element

         String searchTerm = "Audi R8";
        // Enter the search term
        inputBox.sendKeys(searchTerm + Keys.ENTER);

        // Click search
//        driver.findElement(By.name("btnK")).click();


        // Verify that the title contains the exact search term
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(searchTerm));

        driver.quit();
    }
}
