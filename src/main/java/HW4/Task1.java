package HW4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ann_snj/Desktop/Chrome Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/koshki/1074/");
        System.out.println(driver.getTitle());

        Set<String> windowHanles1 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> windowHanles2 = driver.getWindowHandles();
        windowHanles2.removeAll(windowHanles1);
        String newDescriptor = windowHanles2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get("https://zoo.kiev.ua/");
        System.out.println(driver.getTitle());

        Set<String> windowHanles3 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> windowHanles4 = driver.getWindowHandles();
        windowHanles4.removeAll(windowHanles3);
        driver.switchTo().window(windowHanles4.iterator().next());
        driver.get("https://www.w3schools.com/");
        System.out.println(driver.getTitle());

        Set<String> windowHanles5 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> windowHanles6 = driver.getWindowHandles();
        windowHanles6.removeAll(windowHanles5);
        driver.switchTo().window(windowHanles6.iterator().next());
        driver.get("https://taxi838.ua/ru/dnepr/");
        System.out.println(driver.getTitle());

        Set<String> windowHanles7 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open");
        Set<String> windowHanles8 = driver.getWindowHandles();
        windowHanles8.removeAll(windowHanles7);
        driver.switchTo().window(windowHanles8.iterator().next());
        driver.switchTo().window(newDescriptor);
        driver.get("https://klopotenko.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.quit();


        String[] url = {"https://uhomki.com.ua/ru/koshki/1074/",
                "https://zoo.kiev.ua/",
                "https://www.w3schools.com/",
                "https://taxi838.ua/ru/dnepr/",
                "https://klopotenko.com/"};

        driver.get(url[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            Set<String> set1 = driver.getWindowHandles();
            if (i + 1 == 5) {
                break;
            }
            ((JavascriptExecutor) driver).executeScript("window.open()");
            Set<String> set2 = driver.getWindowHandles();
            set2.removeAll(set1);
            String descriptor2 = set2.iterator().next();
            if (driver.getTitle().contains("Зоопарк")) {
                driver.close();
            }
            driver.switchTo().window(descriptor2);
            driver.get(url[i + 1]);
        }
        driver.quit();
    }
}


