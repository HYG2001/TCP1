package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class P03_homePage extends PageBase{
    public P03_homePage(WebDriver driver) {
        super(driver);
    }
    By Register = By.linkText("Register");
    By login = By.linkText("Log in");
    By wishlist = By.linkText("Wishlist");
    By qty = By.className("wishlist-qty");

    By currencyDropdown = By.xpath("//*[@id='customerCurrency']");

    By FacebookLink = By.linkText("Facebook");
    By TwitterLink = By.linkText("Twitter");
    By RssLink = By.linkText("RSS");
    By YoutubeLink = By.linkText("YouTube");

    //By AddToWishlist = By.linkText("Add to wishlist");
    By AddToWishlist = By.className("add-to-wishlist-button");
    By AddToWishlistMsg=(By.xpath( "//div[@class='no-data']")) ;





    public void clickOnRegister(){
        clickElement(Register);
    }

    public void clickOnLogin(){
        clickElement(login);
    }
    public void clickOnWishlist(){
        clickElement(wishlist);
    }
    public void qtyValue(){

    }


    public void clickOnCurrencyDropdown() {
        Select select = new Select(driver.findElement(currencyDropdown));
        select.selectByIndex(1);
    }

    public void clickOnFacebook(){
        clickElement(FacebookLink);
    }

    public void clickOnTwitter(){
        clickElement(TwitterLink);
    }

    public void clickOnRss(){
        clickElement(RssLink);
    }

    public void clickOnYoutube(){
        clickElement(YoutubeLink);
    }

    public void clickOnAddToWishlist(){
        clickElement(AddToWishlist);
    }

    public void updatedWishListMsg(){
    }


}
