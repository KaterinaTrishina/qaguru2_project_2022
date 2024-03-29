import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TicketsTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class= 'gogogo']");

    private final By  FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");

    private WebDriver browser;
    private WebDriverWait wait;
    @Test
    public void reservationCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        Select airportFrom = new Select(browser.findElement(FROM));
        airportFrom.selectByValue("RIX");

        Select airportTo = new Select(browser.findElement(TO));
        airportTo.selectByValue("JFC");

        browser.findElement(GO_BTN).click();

        //browser.findElement(FIRST_NAME).clear();
       // browser.findElement(FIRST_NAME).sendKeys();





    }

    private void select(By locator, String value ){
//       WebElement we =  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
      // select select = new Select();
     //  select.selectByValue(value);




        }
    private void type(By locator, String text) {
        WebElement input =  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);



    }
}
