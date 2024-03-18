import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class DemoSite99 {
    public static void main(String args[]) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        driver.manage().window().fullscreen();

        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C://Users//anith//SeleniumPractice//DemoSite99.png"));


        driver.findElement(By.name("firstName")).sendKeys("Sruthi");
        driver.findElement(By.name("lastName")).sendKeys("Maddineni");
        driver.findElement(By.name("phone")).sendKeys("7893942035");
        driver.findElement(By.id("userName")).sendKeys("maddineni56@gmail.com");

        driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("Hyderabad");
        driver.findElement(By.name("city")).sendKeys("Hyedrabad");
        driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Telangana");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("522647");

        Select sel=new Select(driver.findElement(By.name("country")));
        sel.selectByVisibleText("INDIA");

        driver.findElement(By.id("email")).sendKeys("maddineni56@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Maddineni@123");
        driver.findElement(By.name("confirmPassword")).sendKeys("Maddineni@123");

        driver.findElement(By.xpath("//*[@type='submit']")) .click();

        File file1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file1, new File("C://Users//anith//SeleniumPractice//AfterSubmit.png"));

        System.out.println("Registered Successfully!!!!........");

        driver.findElement(By.linkText("SIGN-OFF")).click();

        driver.close();



    }
}
