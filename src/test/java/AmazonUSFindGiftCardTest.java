import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonUSFindGiftCardTest {
    private final By AMAZON_DONT_CHANGE_LOCATION_BTN = By.xpath(".//input[@data-action-type='DISMISS']");
    private final By AMAZON_GIFT_CART_BTN = By.xpath(".//*[contains (@ data-csa-c-content-id,'nav_cs_gc') ]");
    private final By GIFT_CARTS_FILTER_OPTION = By.xpath(".//div[@ class ='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']");
    private final By AMAZON_MENU_ITEMS_UNDER_GC = By.xpath(".//a[@ class ='nav-a']");
    private final By AMAZON_GC_BEST_SELLERS_FILTERS = By.xpath(".//div[@role='treeitem']/a");

    // String menuItemToSelect= "Best Sellers in Gift Cards ";
    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.amazon.com/");
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(AMAZON_DONT_CHANGE_LOCATION_BTN));

        browser.findElement(AMAZON_DONT_CHANGE_LOCATION_BTN).click();
        //WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));

        browser.findElement(AMAZON_GIFT_CART_BTN).click();

        List<WebElement> menuItems = browser.findElements(AMAZON_MENU_ITEMS_UNDER_GC);
        for (WebElement we : menuItems) {
            if (we.getText().equals("Best Sellers")) {
                we.click();
                break;
            }
        }
       List<WebElement>bestSellersFiltersGC= browser.findElements(AMAZON_GC_BEST_SELLERS_FILTERS);
       for (WebElement we : bestSellersFiltersGC) {
            if (we.getText().equals("Birthday")) {
               we.click();
               break;
    }

}


   }
}
