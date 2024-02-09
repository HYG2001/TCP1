package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register extends PageBase{
    public P01_register(WebDriver driver) {
        super(driver);
    }
    By genderField = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By birthdateDayDropdown = By.name("DateOfBirthDay");
    By birthdateMonthDropdown = By.name("DateOfBirthMonth");
    By birthdateYearDropdown = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By companyField = By.id("Company");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");



    public void selectGender() {
        clickElement(genderField);
        /*Select select = new Select(driver.findElement(genderField));
        select.selectByValue("Female");*/
    }
    public void enterFirstName(String firstname){ enterText(firstNameField , "haneen");}
    public void enterLastName(String lastname){ enterText(lastNameField , "yasser");}
    public  void selectBirthdateDay(){
        Select select = new Select(driver.findElement(birthdateDayDropdown));
        select.selectByVisibleText("27");
    }

    public void selectBirthdateMonth(){
        Select select = new Select(driver.findElement(birthdateMonthDropdown));
        select.selectByIndex(0);
    }

    public void selectBirthdateYear(){
        Select select = new Select(driver.findElement(birthdateYearDropdown));
        select.selectByValue("2001");
    }
    public void enterEmail(String email){enterText(emailField , "hyd@gmail.com");}
    public void enterCompany(){enterText(companyField , "amit");}
    public void enterPassword(String password){enterText(passwordField , "123456");}
    public void enterConfirmationPassword(){enterText(confirmPasswordField , "123456");}
    public void clickOnRegisterButton(){
        clickElement(registerButton);
    }


}
