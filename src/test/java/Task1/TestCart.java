package Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends TestBase {


    @Test
    void cartFunctionality(){

        home.search();
        home.selectFirstItem();
        item.getTitle();
        item.clickAddToCart();
        cart.cartNavigation();
        Assert.assertTrue(item.expectedTitle.contains(cart.actualTitle()));
    }
}
