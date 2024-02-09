package Steps;

import Pages.P03_homePage;
import Pages.P01_register;
import Pages.P02_login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Base.testBase.driver;


public class D02_loginStepDef {

    P03_homePage p03homePageObject = new P03_homePage(driver);
    P01_register P01_registerObject = new P01_register(driver);
    P02_login P02_loginObject = new P02_login(driver);

    @Given("user on home page")
    public void user_in_home_page() {
        //Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }

    @When("user clicks on login")
    public void user_clicks_on_login() {
        p03homePageObject.clickOnLogin();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL , "https://demo.nopcommerce.com/login?returnUrl=%2F");

    }
    @When("user login with email")
    public void user_login_with_email() {
        P02_loginObject.enterEmail();
    }
    @When("user login with password")
    public void user_login_with_password() {
        P02_loginObject.enterPassword();
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        P02_loginObject.clickOnLoginButton();
    }
    @Then("the user is redirected to home page")
    public void the_user_is_redirected_to_home_page() {
    }

    @Then("you can't login message appear")
    public void you_can_t_login_message_appear() {
        /*driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        WebElement MSG = driver.findElement(By.linkText("Returning Customer"));
        Assert.assertEquals(MSG.getText() , "No customer account found");*/

    }

}
