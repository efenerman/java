
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
public class ItemSearchTest {
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
  public void itemSearch() {
    // Test name: ItemSearch
    // Step # | name | target | value
    // 1 | open | https://www.trendyol.com/butik/liste/erkek | 
    driver.get("https://www.trendyol.com/butik/liste/erkek");
    // 2 | setWindowSize | 1051x806 | 
    driver.manage().window().setSize(new Dimension(1051, 806));
    // 3 | mouseOver | linkText=ERKEK | 
    {
      WebElement element = driver.findElement(By.linkText("ERKEK"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 4 | click | linkText=ERKEK | 
    driver.findElement(By.linkText("ERKEK")).click();
    // 5 | mouseOut | linkText=ERKEK | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 6 | click | css=.component-item:nth-child(1) img | 
    driver.findElement(By.cssSelector(".component-item:nth-child(1) img")).click();
    // 7 | click | css=.boutique-product:nth-child(5) .p-card-img | 
    driver.findElement(By.cssSelector(".boutique-product:nth-child(5) .p-card-img")).click();
    // 8 | runScript | window.scrollTo(0,152.9600067138672) | 
    js.executeScript("window.scrollTo(0,152.9600067138672)");
    // 9 | close |  | 
    driver.close();
  }
}
