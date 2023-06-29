import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Less2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/ann_snj/Desktop/Chrome Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Hello Anna");
        driver.quit();*/

        driver.get("https://www.guinnessworldrecords.com/records/");
        driver.findElement(By.xpath( "//i[@class = 'icon icon-search']")).click();
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//input[@id = 'search-term']"));
        element.click();
        Thread.sleep(4000);
        element.sendKeys("Whaaaaat");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@id = 'search-button']")).click();
    }


    }


