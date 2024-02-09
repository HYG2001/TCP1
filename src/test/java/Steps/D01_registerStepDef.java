package Steps;






import Pages.AccountCreatedPage;
import Pages.P03_homePage;
import Pages.P01_register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Base.testBase.driver;

public class D01_registerStepDef {
    P03_homePage p03homePageObject = new P03_homePage(driver);
    P01_register P01_registerObject = new P01_register(driver);
    AccountCreatedPage AccountCreatedPageObject = new AccountCreatedPage(driver);




    @Given("user in home page")
    public void user_in_home_page() {
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");

    }
    @Given("user clicks on register")
    public void user_clicks_on_register() {
        p03homePageObject.clickOnRegister();
    }
    @Then("the user is redirected to register page")
    public void the_user_is_redirected_to_register_page() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL , "https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("user select gender type")
    public void user_select_gender_type() {
        P01_registerObject.selectGender();
    }
    @When("user enters first name {string}")
    public void user_enters_first_name(String firstname) {
        P01_registerObject.enterFirstName(firstname);

    }
    @When("user enters last name {string}")
    public void user_enters_last_name(String lastname) {
        P01_registerObject.enterLastName(lastname);

    }
    @When("user enters date of birth")
    public void user_enters_date_of_birth() {

    }
    @When("user enters email field {string}")
    public void user_enters_email_field(String email) {
        P01_registerObject.enterEmail(email);

    }
    @When("user fills Password fields {string}")
    public void user_fills_password_fields(String password) {
        P01_registerObject.enterPassword(password);

    }
    @When("user clicks on register button")
    public void user_clicks_on_register_button() {

    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {
        //Assert.assertEquals(AccountCreatedPageObject.AccountCreatedText(),"Your registration completed");
    }


}
