package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageTodayDeals extends PageBase {
    public PageTodayDeals(WebDriver driver) {
        super(driver);
    }
    private By dismissBtn = By.cssSelector("input[data-action-type=\"DISMISS\"]");
    private By dealsBtn = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");
    private By seeMoreBtn = By.cssSelector("a[aria-labelledby=\"see-more-departments-label\"]");
    private By mainFilter = By.cssSelector("div[data-csa-c-element-id=\"filter-departments-Musical Instruments\"]");
    private By subFilter = By.xpath("//*[text()='Instrument Accessories']");
    private By discountFilter = By.xpath("//*[text()='10% off or more']");
    private By resultElements = By.cssSelector("a[data-testid=\"product-card-link\"]");
    private By addToCart = By.cssSelector("input[id=\"add-to-cart-button\"]");


    public void dealsNavigation(){
        click(dismissBtn);
        click(waitUntilElementToBeClickable(dealsBtn));


    }
    public void selectFilters(){
        click(waitUntilElementToBeClickable(seeMoreBtn));
        click(waitUntilElementToBeClickable(mainFilter));
        click(waitUntilElementToBeClickable(subFilter));
        click(waitUntilElementToBeClickable(discountFilter));
    }
    public void selectElement(){
        List<WebElement> elements =driver.findElements(resultElements);

        click(waitUntilElementToBeClickable(resultElements));
    }
    public void clickAddToCart(){
        click(waitUntilElementToBeClickable(addToCart));
    }
}
