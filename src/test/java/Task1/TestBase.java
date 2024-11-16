package Task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class TestBase {
    WebDriver driver;
    PageHome home;
    PageItem item;
    PageCart cart;
    PageTodayDeals deals;

    @BeforeMethod
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);

        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        home= new PageHome(driver);
        item = new PageItem(driver);
        cart= new PageCart(driver);
        deals = new PageTodayDeals(driver);

        File allureResults = new File("allure-results");
        if (allureResults.exists()) {
            for (File file : allureResults.listFiles()) {
                file.delete();
            }
        }
    }


    @AfterMethod
    void tearDown(){
        try {
            String allureCmd = "cmd /c start cmd.exe /K \"allure serve allure-results\"";
            Runtime.getRuntime().exec(allureCmd);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
