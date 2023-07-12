package HW4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ann_snj/Desktop/Chrome Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.swedbank.ee/business");
        driver.findElement(By.xpath("//button[@class='button ui-cookie-consent__accept-button']")).click();
        WebElement mobilId = driver.findElement(By.id("MOBILE_ID-control"));
        System.out.println(mobilId.getTagName());
        System.out.println(mobilId.getAttribute("class"));
        System.out.println(mobilId.getAttribute("id"));
        System.out.println(mobilId.getText());
        System.out.println(mobilId.getLocation());
        System.out.println(mobilId.getLocation().x);
        System.out.println(mobilId.getLocation().y);
        System.out.println(mobilId.getSize().height);
        System.out.println(mobilId.getSize().width);

        int centerOfcontainerX = mobilId.getLocation().x + (mobilId.getSize().width)/2;
        int centerOfcontainerY = mobilId.getLocation().y + (mobilId.getSize().height)/2;
        System.out.println("Координаты центра контейнера: " +centerOfcontainerX +", " + centerOfcontainerY );

    }
}