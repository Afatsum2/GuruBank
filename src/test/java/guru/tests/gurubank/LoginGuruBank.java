package guru.tests.gurubank;

import guru.pages.LoginPage;
import org.testng.annotations.Test;
import guru.utilities.ConfigReader;
import guru.utilities.Driver;

public class LoginGuruBank {
//    http://www.demo.guru99.com/V4/
//   Verify login section of the application using page object model

    @Test
    public void logInTest(){
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        LoginPage testLoginPage = new LoginPage();

        testLoginPage.userName.sendKeys("mngr478658");

        testLoginPage.password.sendKeys("mngr478658");

        testLoginPage.loginButton.click();


//        TestLoginPage testLoginPage = new TestLoginPage();
//        TestHomePage testHomePage = new TestHomePage();
//        testLoginPage.username.sendKeys("techproed");
//        testLoginPage.password.sendKeys("SuperSecretPassword");
//        testLoginPage.submitButton.click();
//        verifying login is successful
//        Assert.assertTrue(testHomePage.loginMessage.isDisplayed());
//        ReusableMethods.verifyElementDisplayed(testHomePage.loginMessage);//DONE WITH REUSABLE METHOD. RECOMMENDED.


    }
}
