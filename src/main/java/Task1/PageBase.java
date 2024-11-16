package Task1;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    protected static WebDriver driver;
    private final long timeoutInSeconds = 20;
    WebDriverWait webDriverWait;
    Actions action;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));

    }
    protected void click(By locator) {
        driver.findElement(locator).click();

    }
    protected WebElement waitUntilElementToBeClickable(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.elementToBeClickable(locator));

    }
    protected WebElement waitUntilElementToBevisible(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;

    }
    protected void click(WebElement webElement) {
        webElement.click();
    }
    protected void setTextElement(By locator, String value) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);

    }
}
