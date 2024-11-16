package Task2;

import Task1.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHome extends PageBase {
    public PageHome(WebDriver driver) {
        super(driver);
    }
    By fromStation = By.cssSelector("input[placeholder=\"From Station\"]");
    By toStation = By.cssSelector("input[placeholder=\"To Station\"]");
    By datePick = By.cssSelector("input[placeholder=\"Onward Journey Date\"]");
    By dateSelect = By.cssSelector("span[data-date=\"17\"]");
    By searchBtn = By.cssSelector("button[class=\"btn btn-search filled primary lg inactive button\"]");



    public void searchTrip(String firstStation,String secondTrip){
        waitUntilElementToBeClickable(fromStation);
        setTextElement(fromStation,firstStation);
        waitUntilElementToBeClickable(toStation);
        setTextElement(toStation,secondTrip);
        click(waitUntilElementToBeClickable(datePick));
        click(waitUntilElementToBeClickable(dateSelect));

        click(waitUntilElementToBeClickable(searchBtn));
    }
}
