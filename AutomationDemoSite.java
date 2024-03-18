import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSite {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Maddineni");
        driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("sruthi");
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Hyderabad");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Maddineni56@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("12345678900");
        driver.findElement(By.xpath("//*[@value='FeMale']")).click();
        driver.findElement(By.id("checkbox2")).click();// driver.findElement(By.id("msdd"));
        Select sel=new Select(driver.findElement(By.id("Skills")));
        sel.selectByVisibleText("Software");
        driver.findElement(By.xpath("//*[@id='select2-country-container']"));
        Select sel1= new Select(driver.findElement(By.id("yearbox")));
        sel1.selectByVisibleText("1999");
        Select sel2=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        sel2.selectByVisibleText("August");
        Select sel3=new Select(driver.findElement(By.id("daybox")));
        sel3.deselectByValue("28");

        Thread.sleep(3000);

        driver.findElement(By.id("firstpassword")).sendKeys("Sruthi@3");
        driver.findElement(By.id("secondpassword")).sendKeys("Sruthi@3");

        driver.findElement(By.id("submitbtn")).click();












    }
}
