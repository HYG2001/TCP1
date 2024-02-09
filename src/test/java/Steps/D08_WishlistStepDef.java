package Steps;


import Pages.P01_register;
import Pages.P02_login;
import Pages.P03_homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Base.testBase.driver;
public class D08_WishlistStepDef {
    P03_homePage p03homePageObject = new P03_homePage(driver);
    P01_register P01_registerObject = new P01_register(driver);
    P02_login P02_loginObject = new P02_login(driver);




    @When("user clicks on add to wishlist")
    public void user_clicks_on_add_to_wishlist() {
        p03homePageObject.clickOnAddToWishlist();


    }
    @When("item is added to wishlist message appeare")
    public void item_is_added_to_wishlist_message_appeare() {
        p03homePageObject.updatedWishListMsg();
    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {

    }



    @When("user clicks on wishlist")
    public void user_clicks_on_wishlist() {
        p03homePageObject.clickOnWishlist();
    }
    @When("the user is redirected to wishlist page")
    public void the_user_is_redirected_to_wishlist_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/wishlist");
    }




}
