import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYRTutorialsAlerts {
    protected WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public void simpleAlert(){
        driver.findElement(By.id("alertBox")).click();
        Alert alt=driver.switchTo().alert();
        System.out.println("SimpleAlert: "+ alt.getText());
        alt.accept();

    }
    public void confirmationAlert()
    {
        driver.findElement(By.id("confirmBox")).click();
        Alert alt=driver.switchTo().alert();
        System.out.println("confirmationAlert: "+ alt.getText());
        alt.accept();

    }
    public void promptAlert(String inputText)
    {
        driver.findElement(By.id("promptBox")).click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys(inputText);
        promptAlert.accept();
        String str=driver.findElement(By.id("output")).getText();
        System.out.println(str);
    }

    public static void main(String[] args){
        HYRTutorialsAlerts hyr=new HYRTutorialsAlerts();
        hyr.setUp();
        hyr.simpleAlert();
        hyr.confirmationAlert();
        hyr.promptAlert("Maddineni Sruthi");
        hyr.tearDown();
    }

}
