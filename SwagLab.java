import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLab {
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().fullscreen();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        System.out.println("Coming to the inventory page....");

        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Close Menu']")).click();

        driver.findElement(By.id("item_4_title_link")).click();

        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

        driver.findElement(By.xpath("//*[@data-prefix='fas']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();

        driver.findElement(By.id("first-name")).sendKeys("Sruhti");
        driver.findElement(By.id("last-name")).sendKeys("Maddineni");
        driver.findElement(By.id("postal-code")).sendKeys("522646");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.findElement(By.xpath("//*[text()='CANCEL']")).click();

        driver.close();











    }
}
