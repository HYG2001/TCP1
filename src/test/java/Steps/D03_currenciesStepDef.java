package Steps;



import Pages.P01_register;
import Pages.P02_login;
import Pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static Base.testBase.driver;

public class D03_currenciesStepDef {

    P03_homePage p03homePageObject = new P03_homePage(driver);
    P01_register P01_registerObject = new P01_register(driver);
    P02_login P02_loginObject = new P02_login(driver);



    @When("user clicks on the currency selector")
    public void user_clicks_on_the_currency_selector() {
        p03homePageObject.clickOnCurrencyDropdown();

    }

    @Then("user can choose the currency")
    public void user_can_choose_the_currency() {

    }
}
