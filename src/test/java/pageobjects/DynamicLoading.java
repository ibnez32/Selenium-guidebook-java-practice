package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.Config;

public class DynamicLoading extends Base {

    By startButton = By.cssSelector("#start button");
    By finishText = By.id("finish");

    public DynamicLoading(WebDriver driver) {
        super(driver);
    }

    public void loadExample(String exampleNumber) {
        visit("/dynamic_loading/" + exampleNumber);
        click(startButton);
    }

    public Boolean finishTextPresent() {
        return waitForisDisplayed(finishText, 10);
    }

}
