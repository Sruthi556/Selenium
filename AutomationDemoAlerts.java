import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutomationDemoAlerts {

    protected WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void handleSimpleAlert()
    {
        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        simpleAlert.accept();

    }
    public void confirmationAlert(){
        driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.accept();
       String str=driver.findElement(By.id("demo")).getText();
       System.out.println(str);

    }
    public void promtAlert(String inputText){
        driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']")).click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys(inputText);
        promptAlert.accept();
        String str=driver.findElement(By.id("demo1")).getText();
        System.out.println(str);

    }
    public static void main(String[] args){
        AutomationDemoAlerts demo=new AutomationDemoAlerts();
        demo.setUp();
        demo.handleSimpleAlert();
        demo.confirmationAlert();
        demo.promtAlert("Automation Testing user");
        demo.tearDown();
    }
}
