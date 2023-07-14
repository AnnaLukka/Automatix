package HW5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ann_snj/Desktop/Chrome Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");

        Select box = new Select(driver.findElement(By.id("Carlist")));
        box.selectByVisibleText("Renault");
        Select country = new Select(driver.findElement(By.xpath("//select[@name=\"FromLB\"]")));
        country.selectByVisibleText("France");
        country.selectByVisibleText("Germany");
        country.selectByVisibleText("Italy");
        country.selectByVisibleText("Spain");
        List<WebElement> countries = country.getOptions();
        driver.findElement(By.xpath("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']")).click();

        WebElement carslist = driver.findElement(By.id("Carlist"));
        System.out.println("Автомобили доступные для выбора: "+"\n"+ carslist.getText());
        System.out.print("\n");
        WebElement countrieslist = driver.findElement(By.xpath("//select[@name='FromLB']"));
        System.out.println("Страны из первой таблицы: "+ "\n"+ countrieslist.getText());










    }}
