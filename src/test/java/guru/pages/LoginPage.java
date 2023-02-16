package guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import guru.utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="uid")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name="btnLogin")
    public WebElement loginButton;

    @FindBy(id="message23")
    public WebElement BlankIdMessage;

    @FindBy(id="message18")
    public WebElement BlankPasswordMessage;


//    @FindBy(xpath = "//div[@role='alert']")
//    public WebElement errorMessage_incorrectEmailPass;
//
}
