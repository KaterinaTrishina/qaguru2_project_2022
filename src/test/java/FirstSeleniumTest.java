import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstSeleniumTest {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By DISCOVER_CARS_ELEMENT = By.xpath(".//div[@class='logo-cell']");
    private final By CURRENT_CURRENCY_ELEMENT = By.id("currentCurrency");
    private final By LOG_IN_ELEMENT = By.xpath(".//*[contains(@ class,'navigation-link action my')]");
    private final By PICK_UP_DATE = By.id("ui-datepicker-div");
    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browser.findElement(ACCEPT_COOKIES_BTN).click();

    }
 @Test
    public void findDiscoverCarsElement() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
     WebDriver browser = new ChromeDriver();
     browser.manage().window().maximize();
     browser.get("http://www.discovercars.com/");

     WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

     wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

     browser.findElement(ACCEPT_COOKIES_BTN).click();
     browser.findElement(DISCOVER_CARS_ELEMENT);

 }
@Test
    public void findCurrentCurrencyElement() {
    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
    WebDriver browser = new ChromeDriver();
    browser.manage().window().maximize();
    browser.get("http://www.discovercars.com/");

    WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

    browser.findElement(ACCEPT_COOKIES_BTN).click();
    browser.findElement(CURRENT_CURRENCY_ELEMENT);

}
@Test
    public void findLogInElement() {
    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
    WebDriver browser = new ChromeDriver();
    browser.manage().window().maximize();
    browser.get("http://www.discovercars.com/");

    WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

    browser.findElement(ACCEPT_COOKIES_BTN).click();
    browser.findElement(LOG_IN_ELEMENT);

    }
    @Test
    public void findPickUpDate() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browser.findElement(ACCEPT_COOKIES_BTN).click();
        browser.findElement(PICK_UP_DATE);
    }


