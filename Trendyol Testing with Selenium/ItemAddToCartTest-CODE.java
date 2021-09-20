
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
public class ItemAddToCartTest {
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
  public void itemAddToCart() {
    // Test name: ItemAddToCart
    // Step # | name | target | value
    // 1 | open | https://www.trendyol.com/ | 
    driver.get("https://www.trendyol.com/");
    // 2 | setWindowSize | 1536x824 | 
    driver.manage().window().setSize(new Dimension(1536, 824));
    // 3 | click | linkText=ERKEK | 
    driver.findElement(By.linkText("ERKEK")).click();
    // 4 | click | css=.component-item:nth-child(1) img | 
    driver.findElement(By.cssSelector(".component-item:nth-child(1) img")).click();
    // 5 | click | css=.p-card-wrppr:nth-child(3) .p-card-img | 
    driver.findElement(By.cssSelector(".p-card-wrppr:nth-child(3) .p-card-img")).click();
    // 6 | mouseOver | css=.add-to-bs-tx | 
    {
      WebElement element = driver.findElement(By.cssSelector(".add-to-bs-tx"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 7 | click | css=.add-to-bs-tx | 
    driver.findElement(By.cssSelector(".add-to-bs-tx")).click();
    // 8 | mouseOut | css=.add-to-bs-tx | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 9 | click | css=.vrn-item:nth-child(2) | 
    driver.findElement(By.cssSelector(".vrn-item:nth-child(2)")).click();
    // 10 | mouseOver | css=.add-to-bs | 
    {
      WebElement element = driver.findElement(By.cssSelector(".add-to-bs"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 11 | mouseOut | css=.add-to-bs | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 12 | click | linkText=Sepete Git | 
    driver.findElement(By.linkText("Sepete Git")).click();
  }
}
