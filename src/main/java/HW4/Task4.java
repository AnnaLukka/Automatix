package HW4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ann_snj/Desktop/Chrome Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        driver.findElement(By.name("q")).sendKeys("Хорек");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".icon--search")).click();
        driver.findElement(By.xpath("//a[@title='Витамины Беафар ПАСТА Мальт с двойным действием для хорьков 100г']")).click();
        driver.findElement(By.xpath("//span[@class='comparison-button__text']")).click();

        driver.findElement(By.name("q")).sendKeys("Медведь");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".icon--search")).click();
        driver.findElement(By.xpath("//div[@class='catalogCard-title']")).click();
        driver.findElement(By.xpath("//span[@class='comparison-button__text']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='comparison-view__button-text']")).click();
}

    }
