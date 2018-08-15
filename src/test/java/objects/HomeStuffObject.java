package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeStuffObject extends BaseObject {
    private By category = By.xpath("//*[@id='5300']/a");
    private By insideCategory = By.xpath("//*[@class='pab-row pab-row-fifth']/div[3]//li[3]");
    private String expectedUrl = "https://rozetka.com.ua/tovary-dlya-doma/c2394287/";

    public HomeStuffObject(WebDriver driver) {
        super(driver);
    }

    public String getExpectedUrl() {
        return expectedUrl;
    }

    public By getCategory() {
        return category;
    }

    public By getInsideCategory() {
        return insideCategory;
    }
}
