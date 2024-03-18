import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableTechListic {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customers")));

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        System.out.println("Total no.of Rows in a table:" + rows.size());

        List<WebElement> headerCells = rows.get(0).findElements(By.tagName("th"));
        int col = headerCells.size();
        System.out.println("Total No.of Columns in a Table:" + col);

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "     ");
            }
            System.out.println();
        }
        driver.close();
    }









    }




