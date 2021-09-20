
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
public class ItemFilterTest {
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
  public void itemFilter() {
    // Test name: ItemFilter
    // Step # | name | target | value
    // 1 | open | https://www.trendyol.com/ | 
    driver.get("https://www.trendyol.com/");
    // 2 | setWindowSize | 1536x824 | 
    driver.manage().window().setSize(new Dimension(1536, 824));
    // 3 | click | linkText=T-shirt | 
    driver.findElement(By.linkText("T-shirt")).click();
    // 4 | mouseOver | linkText=T-shirt | 
    {
      WebElement element = driver.findElement(By.linkText("T-shirt"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 5 | mouseOut | linkText=T-shirt | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 6 | click | css=.fltrs-wrppr:nth-child(2) .fltr-item-wrppr:nth-child(5) > .fltr-item-text | 
    driver.findElement(By.cssSelector(".fltrs-wrppr:nth-child(2) .fltr-item-wrppr:nth-child(5) > .fltr-item-text")).click();
    // 7 | click | css=.p-card-wrppr:nth-child(3) .p-card-img | 
    driver.findElement(By.cssSelector(".p-card-wrppr:nth-child(3) .p-card-img")).click();
    // 8 | click | css=.add-to-bs-tx | 
    driver.findElement(By.cssSelector(".add-to-bs-tx")).click();
    // 9 | click | css=.vrn-item:nth-child(1) | 
    driver.findElement(By.cssSelector(".vrn-item:nth-child(1)")).click();
    // 10 | click | linkText=Sepete Git | 
    driver.findElement(By.linkText("Sepete Git")).click();
  }
}
