import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class WebTable2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/tables");
        driver.manage().window().maximize();

        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("Total No.of Rows in a Table: " + rows.size());

        List<WebElement> col=rows.get(0).findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Total No.of Columns in a Table: "+ col.size());

        System.out.println("Data from the Table.....");

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
