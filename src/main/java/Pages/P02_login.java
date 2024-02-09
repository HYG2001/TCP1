package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends PageBase {


    public P02_login(WebDriver driver) {
        super(driver);
    }

    //By login = By.className("ico-login");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.linkText("Log in");


    /*public void clickOnLogin(){
        clickElement(login);
    }*/
    public void enterEmail (){
        enterText(emailField , "wrong@example.com");
    }

    public void enterPassword (){
        enterText(passwordField , "P@ssw0rd");
    }

    public void clickOnLoginButton (){
        clickElement(loginButton);
    }
}
