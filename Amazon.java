import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Amazon {
    public static void main(String args[]) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb");

        driver.navigate().back();
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C://Users//anith//SeleniumPractice//Back.png"));

        driver.navigate().forward();

        File file1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file1, new File("C://Users//anith//SeleniumPractice//Forward.png"));


        driver.navigate().refresh();

        File file2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file2, new File("C://Users//anith//SeleniumPractice//Refresh.png"));

        driver.close();

    }
}
