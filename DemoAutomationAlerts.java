import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DemoAutomationAlerts {

    protected WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void handleSimpleAlert() {

        driver.findElement(By.id("alertButton")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        simpleAlert.accept();
    }
    public void handleTimerAlert() throws InterruptedException {
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        Alert timerAlert = driver.switchTo().alert();
        System.out.println("Timer Alert Text: " + timerAlert.getText());
        timerAlert.accept();

    }
    public void handleConfirmationAlert() {
        driver.findElement(By.id("confirmButton")).click();
        Alert confirmAlert= driver.switchTo().alert();
        confirmAlert.accept();
        String str=driver.findElement(By.id("confirmResult")).getText();
        System.out.println(str);
    }
    public void handlePromptAlert(String inputText) {
        driver.findElement(By.id("promtButton")).click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys(inputText);
        promptAlert.accept();
        String str=driver.findElement(By.id("promptResult")).getText();
        System.out.println(str);

    }
    public static void main(String[] args) throws InterruptedException {
        DemoAutomationAlerts demo = new DemoAutomationAlerts();
        demo.setUp();
        demo.handleSimpleAlert();
        demo.handleTimerAlert();
        demo.handleConfirmationAlert();
        demo.handlePromptAlert("Maddineni");
        demo.tearDown();
    }
}







