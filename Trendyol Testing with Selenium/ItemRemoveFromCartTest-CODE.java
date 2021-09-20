
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
public class ItemRemoveFromCartTest {
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
  public void itemRemoveFromCart() {
    // Test name: ItemRemoveFromCart
    // Step # | name | target | value
    // 1 | open | https://www.trendyol.com/ | 
    driver.get("https://www.trendyol.com/");
    // 2 | setWindowSize | 1536x824 | 
    driver.manage().window().setSize(new Dimension(1536, 824));
    // 3 | click | css=.navigation-icon-basket | 
    driver.findElement(By.cssSelector(".navigation-icon-basket")).click();
    // 4 | click | linkText=Kaldır | 
    driver.findElement(By.linkText("Kaldır")).click();
    // 5 | click | css=.btn:nth-child(2) | 
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
    // 6 | mouseOver | css=.col-lg-3:nth-child(2) h4 | 
    {
      WebElement element = driver.findElement(By.cssSelector(".col-lg-3:nth-child(2) h4"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 7 | mouseOut | css=.col-lg-3:nth-child(2) h4 | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
