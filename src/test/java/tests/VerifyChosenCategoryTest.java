package tests;

import objects.HomeObject;
import objects.HomeStuffObject;
import objects.LogInObject;
import org.junit.Assert;
import org.junit.Test;

public class VerifyChosenCategoryTest extends BaseTest {

    HomeStuffObject homeStuff;
    HomeObject homePageStart;
    LogInObject logIn;
    String actualUrl;

    @Test
    public void verifyChosenCategoryTest() {
        homePageStart = new HomeObject(driver);
        homeStuff = new HomeStuffObject(driver);
        logIn = new LogInObject(driver);
        homePageStart.goToHomeObject();
        logIn.logIn();

        homeStuff.goToCategory(homeStuff.getCategory());
        pause(4);
        actualUrl = driver.getCurrentUrl();
        String expectedUrl = homeStuff.getExpectedUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
