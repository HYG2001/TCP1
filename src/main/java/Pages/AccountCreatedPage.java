package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v118.input.Input;

public class AccountCreatedPage extends PageBase{
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    By AccountCreatedMessage = By.linkText("Your registration completed");

    public String AccountCreatedText(){
        String AccountCreatedText = driver.findElement(AccountCreatedMessage).getText();
        return AccountCreatedText();
    }
}
