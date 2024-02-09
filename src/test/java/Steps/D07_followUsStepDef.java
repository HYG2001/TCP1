package Steps;


import Pages.P01_register;
import Pages.P02_login;
import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WindowType;

import static Base.testBase.driver;

public class D07_followUsStepDef {

    P03_homePage p03homePageObject = new P03_homePage(driver);
    P01_register P01_registerObject = new P01_register(driver);
    P02_login P02_loginObject = new P02_login(driver);



    @When("user opens facebook link")
    public void user_opens_facebook_link() {
        p03homePageObject.clickOnFacebook();
        driver.switchTo().newWindow(WindowType.TAB);
        //driver.switchTo().window("https://demo.nopcommerce.com");
    }

    @Then("facebook link is opened in new tab")
    public void facebook_link_is_opened_in_new_tab() {
        /*driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().window("nopCommerce demo store");*/
    }


    @When("user opens twitter link")
    public void user_opens_twitter_link() {
        p03homePageObject.clickOnTwitter();
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @Then("twitter link is opened in new tab")
    public void twitter_link_is_opened_in_new_tab() {

    }


    @When("user opens rss link")
    public void user_opens_rss_link() {
        p03homePageObject.clickOnRss();
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @Then("rss link is opened in new tab")
    public void rss_link_is_opened_in_new_tab() {

    }


    @When("user opens youtube link")
    public void user_opens_youtube_link() {
        p03homePageObject.clickOnYoutube();
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @Then("youtube link is opened in new tab")
    public void youtube_link_is_opened_in_new_tab() {

    }
}
