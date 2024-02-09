package Base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testBase extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @BeforeMethod
    public void startBrowser(){
        driver = new SafariDriver();
        driver.navigate().to("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
