package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseObject {
    public WebDriver driver;

    public BaseObject (WebDriver driver){
        this.driver = driver;
    }

    public void click (By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    public void writeText (By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    public void goToCategory(By link){
        click(link);
    }
}
