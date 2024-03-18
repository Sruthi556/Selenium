import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ToolsNestedFrames {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/nestedframes");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of Frames on the Page: " + countIframesInPage);

        driver.switchTo().frame("frame1");

        int countIframesInFrame1 = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside Frame1: " + countIframesInFrame1);

        WebElement innerIFrame = driver.findElement(By.xpath("/html/body/iframe"));
        driver.switchTo().frame(innerIFrame);

        driver.quit();
            }
        }

