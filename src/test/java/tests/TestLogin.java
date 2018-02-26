package tests;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import pageobjects.Login;

import static org.junit.Assert.*;

public class TestLogin extends Base {

    private Login login;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/ibnezabed/Desktop/selenium-init-java-master/geckodriver");
        login = new Login(driver);
    }

    @Test
    public void succeeded() throws InterruptedException {
        login.with("tomsmith", "SuperSecretPassword!");
        Thread.sleep(2000);
        assertTrue("success message not present",
                login.successMessagePresent());
    }

    @Test
    public void failed() throws InterruptedException {
        login.with("tomsmith", "badpassword");
        Thread.sleep(2000);
        assertFalse("failure message wasn't present after wrong creds", login.successMessagePresent());
    }
}
