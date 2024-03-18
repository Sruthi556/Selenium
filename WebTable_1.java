import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTable_1 {

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            driver.get("https://cosmocode.io/automation-practice-webtable/");
            driver.manage().window().maximize();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("countries")));

            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
            System.out.println("Total no.of Rows in a table: " + rows.size());

            List<WebElement> headerCells = driver.findElements(By.xpath("//table[@id='countries']/thead/tr/th"));
            int columns = headerCells.size();
            System.out.println("Total No.of Columns in a Table: " + columns);

            System.out.println("Data from the Table....");

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


