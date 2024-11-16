package Task1;

import org.testng.annotations.Test;

public class TestDeals extends TestBase {

    @Test
    void test(){
        deals.dealsNavigation();
        deals.selectFilters();
        deals.selectElement();
        deals.clickAddToCart();
    }
}
