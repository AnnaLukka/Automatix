import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HW6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ann_snj/Desktop/Chrome Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("L2AGLb")));
        driver.findElement(By.id("L2AGLb")).click();

        WebElement searchField = driver.findElement(By.id("APjFqb"));
        searchField.sendKeys("https://www.guinnessworldrecords.com/account/register?");
        searchField.sendKeys(Keys.ENTER);

        Actions actions = new Actions(driver);
        String window1Handle = driver.getWindowHandle();
        Set<String> window1 = driver.getWindowHandles();
        actions.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"))).keyUp(Keys.COMMAND)
                .build().perform();
        Set<String> window2 = driver.getWindowHandles();
        window2.removeAll(window1);
        String window2Handle = window2.iterator().next();

        WebDriverWait guinnes = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@class='M2vV3 vOY7J']")).click();

        WebElement searchField2 = driver.findElement(By.id("APjFqb"));
        searchField2.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        searchField2.sendKeys(Keys.ENTER);
        Actions actions2 = new Actions(driver);
        Set<String> window3 = driver.getWindowHandles();
        actions2.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"))).keyUp(Keys.COMMAND)
                .build().perform();
        Set<String> window4 = driver.getWindowHandles();
        window4.removeAll(window3);
        String window3Handle = window4.iterator().next();

        Set<String> window5 = driver.getWindowHandles();
        window5.removeAll(window4);
        driver.switchTo().window(window5.iterator().next());
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("accept-choices"))).click();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")));

        driver.findElement(By.id("fname")).clear();
        driver.findElement(By.id("fname")).sendKeys("Sergey");
        driver.findElement(By.id("lname")).clear();
        driver.findElement(By.id("lname")).sendKeys("Kudaev");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.switchTo().window(window2Handle);
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ez-accept-all"))).click();

        driver.findElement(By.id("LastName")).sendKeys("Kudaev");
        driver.findElement(By.id("FirstName")).sendKeys("Sergey");
        driver.findElement(By.id("DateOfBirthDay")).sendKeys("12");
        driver.findElement(By.id("DateOfBirthMonth")).sendKeys("6");
        driver.findElement(By.id("DateOfBirthYear")).sendKeys("1992");
        Select country = new Select(driver.findElement(By.id("Country")));
        country.selectByVisibleText("Ukraine");
        driver.findElement(By.id("State")).sendKeys("Dnipro");
        driver.findElement(By.id("EmailAddress")).sendKeys("mailmail@gmail.com");
        driver.findElement(By.id("ConfirmEmailAddress")).sendKeys("mailmail@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("1234567");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
        driver.findElement(By.id("ConfirmPassword")).sendKeys(Keys.ENTER);

        driver.switchTo().window(window3Handle);
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("alertBox")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("confirmBox")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        driver.findElement(By.id("promptBox")).click();
        Alert alert4 = driver.switchTo().alert();
        alert.sendKeys("Final step of this task");
        alert4.accept();
    }
}
