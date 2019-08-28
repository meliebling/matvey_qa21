import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SearchTests extends TestBase {

    @Test
public void searchWikiTest()  throws InterruptedException {


    click(By.id("searchInput"));
    driver.findElement(By.id("searchInput")).clear();
driver.findElement(By.id("searchInput")).sendKeys("java");

    click(By.id("searchButton"));

        tearDown();
    }

}
