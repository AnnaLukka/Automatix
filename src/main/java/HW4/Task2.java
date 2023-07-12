package HW4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ann_snj/Desktop/Chrome Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.swedbank.ee/business");
        driver.findElement(By.xpath("//button[@class='button ui-cookie-consent__accept-button']")).click();
        WebElement mobilId = driver.findElement(By.id("MOBILE_ID-control"));
        WebElement enter = driver.findElement(By.id("page-header__login"));

        System.out.println(mobilId.getLocation());
        System.out.println(enter.getLocation());

        System.out.println(mobilId.getSize());
        System.out.println(enter.getSize());


    }
}