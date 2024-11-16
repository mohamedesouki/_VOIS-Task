package Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class BaseTest {
    WebDriver driver;
    PageHome home;
    PageTrip trip;

    @BeforeMethod
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        home = new PageHome(driver);
        trip= new PageTrip(driver);
        driver.navigate().to("https://www.abhibus.com/");
        driver.manage().window().maximize();

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
