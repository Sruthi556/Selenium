import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShetty {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().fullscreen();

        driver.findElement(By.xpath("//a[text()='Register here']")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("firstName")).sendKeys("Maddineni");
        driver.findElement(By.id("lastName")).sendKeys("Sruthi");
        driver.findElement(By.id("userEmail")).sendKeys("maddineni56@gmail.com");
        driver.findElement(By.id("userMobile")).sendKeys("1234567890");
        Select select=new Select(driver.findElement(By.className("custom-select")));
        select.selectByIndex(2);
        driver.findElement(By.xpath("//input[@value='Female']")).click();
        driver.findElement(By.id("userPassword")).sendKeys("Sruthi@3");
        driver.findElement(By.id("confirmPassword")).sendKeys("Sruthi@3");
        driver.findElement(By.xpath("//*[@type='checkbox']")).click();

        driver.findElement(By.id("login")).click();




    }
}
