package ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class HelloUiTest {

  WebDriver driver;

  @BeforeEach
  public void setup() {
    // Set path to your ChromeDriver or use WebDriverManager
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    driver = new ChromeDriver();
  }

  @Test
  public void testHomePageLoads() {
    driver.get("http://localhost:8080/");
    String heading = driver.findElement(By.tagName("h1")).getText();
    Assertions.assertEquals("Welcome to the Demo App!", heading);
  }

  @AfterEach
  public void teardown() {
    driver.quit();
  }
}