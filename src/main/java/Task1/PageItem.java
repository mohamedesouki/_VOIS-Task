package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageItem extends PageBase {
    public PageItem(WebDriver driver) {
        super(driver);
    }
   public static String expectedTitle = "";


    private By addToCart = By.cssSelector("input[id=\"add-to-cart-button\"]");
    private By itemTitle = By.cssSelector("span[id=\"productTitle\"]");


    public void clickAddToCart(){
        click(waitUntilElementToBeClickable(addToCart));
    }
    public void getTitle(){
         expectedTitle = driver.findElement(itemTitle).getText();
    }

}
