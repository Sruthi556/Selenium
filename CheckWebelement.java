import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWebelement {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement storeElement=driver.findElement(By.xpath("//input[@type='email']"));

        System.out.println("Display Status:"+ storeElement.isDisplayed());

        System.out.println("Display Status:"+ storeElement.isEnabled());

        WebElement Female= driver.findElement(By.xpath("//input[@value='FeMale']"));

        System.out.println("Display Status:"+ Female.isSelected());

        Female.click();

        System.out.println("Display Status:"+ Female.isSelected());


        driver.close();

    }
}
