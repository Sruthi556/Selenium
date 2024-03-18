import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulShettyLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().fullscreen();

        driver.findElement(By.id("userEmail")).sendKeys("maddineni56@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Sruthi@3");
        driver.findElement(By.id("login")).click();

    }
}
