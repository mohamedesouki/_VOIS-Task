package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCart extends PageBase {
    public PageCart(WebDriver driver) {
        super(driver);
    }
    private By cartIcon = By.cssSelector("[id=\"nav-cart-text-container\"]");
    private By itemTitle = By.cssSelector("span[class=\"a-truncate-cut\"]");
    private By itemImage = By.cssSelector("img[src=\"https://m.media-amazon.com/images/I/51Lg4MFuDzL._AC_AA180_.jpg\"]");


    public void cartNavigation(){
        click(waitUntilElementToBeClickable(cartIcon));
    }
    public String actualTitle(){
        String title = driver.findElement(itemTitle).getText();
        return title;
    }




}
