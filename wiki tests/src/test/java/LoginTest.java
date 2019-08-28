import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


@Test
public void loginTest(){
    click(By.id("pt-login"));
    click(By.id("wpName1"));
    driver.findElement(By.id("wpName1")).clear();
    driver.findElement(By.id("wpName1")).sendKeys("teeeeest@yahoo.com");

    click(By.id("wpPassword1"));
    driver.findElement(By.id("wpPassword1")).clear();
    driver.findElement(By.id("wpPassword1")).sendKeys("passwordtest");

    click(By.id("wpLoginAttempt"));
}






}

