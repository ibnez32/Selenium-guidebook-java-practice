package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Login extends Base {

    private WebDriver driver;
    By usernameLocator = By.id("username");
    By passwordLocator = By.id("password");
    By loginFormLocator = By.id("login");
    By successMessageLocator = By.cssSelector(".flash.success");
    By failureMessageLocator = By.cssSelector(".flash.error");

    public Login(WebDriver driver) {
        super(driver);
        visit("http://the-internet.herokuapp.com/login");
        // assertions are typically in the tests folder, exception to rule
        // Makes sure the selenium is in the right place before proceeding
        // Ensures that the tests will only proceed if the login form is present
        assertTrue("The login form is not present", isDisplayed(loginFormLocator));
    }

    public void with(String username, String password) {
        //driver.findElement(usernameLocator).sendKeys(username);
        type(username, usernameLocator);
        //driver.findElement(passwordLocator).sendKeys(password);
        type(password, passwordLocator);
        //driver.findElement(loginFormLocator).submit();
        submit(loginFormLocator);
    }

    public Boolean successMessagePresent() {
        return isDisplayed(successMessageLocator);
    }

    public Boolean failureMessagePresent() {
        return isDisplayed(failureMessageLocator);
    }
}
