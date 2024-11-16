package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class PageHome extends PageBase {
    public PageHome(WebDriver driver) {
        super(driver);
    }

    private By searchField = By.cssSelector("input[id=\"twotabsearchtextbox\"]");
    private By searchIcon = By.cssSelector("input[id=\"nav-search-submit-button\"]");
    private By resultList = By.cssSelector("div[class=\"a-section aok-relative s-image-square-aspect\"]");



    public void search(){
        waitUntilElementToBeClickable(searchField);
        driver.findElement(searchField).sendKeys("car accessories");
        click(searchIcon);

    }
    public void selectFirstItem(){
        List <WebElement> elements =driver.findElements(resultList);
        int last = elements.size()-1;
        click(waitUntilElementToBevisible(elements.get(last)));
    }
}
