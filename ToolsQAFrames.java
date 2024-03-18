import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ToolsQAFrames {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/frames");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        driver.quit();
    }
}

