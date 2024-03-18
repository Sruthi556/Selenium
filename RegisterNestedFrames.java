import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterNestedFrames {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@href='#Multiple']")).click();

        WebElement iFrame=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
        driver.switchTo().frame(iFrame);

        int countIframesInFrame1 = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside Frame1: " + countIframesInFrame1);

        WebElement innerIFrame=driver.findElement(By.xpath("//*[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerIFrame);

        int countIframesFrame2 = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside Frame2: " + countIframesFrame2);

        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Sruthi Maddineni");



        driver.quit();

    }
}
