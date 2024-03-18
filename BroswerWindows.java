import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class BroswerWindows {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        driver.manage().window().maximize();
        String parent = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            Thread.sleep(3000);

            driver.findElement(By.id("windowButton")).click();

            for (String newHandle : driver.getWindowHandles()) {
                if (!newHandle.equals(parent)) {
                    driver.switchTo().window(newHandle);
                    break;
                }
            }

            String str = driver.findElement(By.id("sampleHeading")).getText();
            System.out.println("Button text on this window: " + str);

            driver.close();

            driver.switchTo().window(parent);
        }

        driver.quit();
    }
}
