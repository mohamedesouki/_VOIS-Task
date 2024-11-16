package Task2;

import Task1.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageTrip extends PageBase {
    public PageTrip(WebDriver driver) {
        super(driver);
    }
    private By selectSeatBtn = By.cssSelector("button[class=\"btn bus-info-btn filled primary sm inactive button\"]");
    private By seatBtn = By.cssSelector("button[class=\"seat sleeper\"]");
    private By continueBtn = By.cssSelector("button[class=\"btn  filled primary md inactive button\"]");
    private By numberField = By.cssSelector("input[class=\"true mobileNo-input\"]");

    public void selectSeat(){
        driver.findElements(selectSeatBtn).get(0).click();
        driver.findElements(seatBtn).get(0).click();
        click(waitUntilElementToBeClickable(continueBtn));
        setTextElement(numberField,"6789125987)");
    }

}
