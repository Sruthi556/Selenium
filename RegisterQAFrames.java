import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterQAFrames {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.switchTo().frame("singleframe");

        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Sruthi Maddineni");

        driver.quit();


    }
}
