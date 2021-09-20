
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TrendyolLoginTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  public void tearDown() {
    driver.quit();
  }
  @Test
  public void trendyolLogin() {
    // Test name: TrendyolLogin
    // Step # | name | target | value
    // 1 | open | https://www.trendyol.com/ | 
    driver.get("https://www.trendyol.com/");
    // 2 | setWindowSize | 1536x824 | 
    driver.manage().window().setSize(new Dimension(1536, 824));
    // 3 | click | css=#accountBtn > .icon-container | 
    driver.findElement(By.cssSelector("#accountBtn > .icon-container")).click();
    // 4 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 5 | type | id=email | efenerman@hotmail.com
    driver.findElement(By.id("email")).sendKeys("efenerman@hotmail.com");
    // 6 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 7 | type | id=password | 07121997efe
    driver.findElement(By.id("password")).sendKeys("07121997efe");
    // 8 | click | id=loginSubmit | 
    driver.findElement(By.id("loginSubmit")).click();
  }
}
