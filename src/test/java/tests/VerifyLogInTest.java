package tests;

import objects.HomeObject;
import objects.LogInObject;
import org.junit.Assert;
import org.junit.Test;

public class VerifyLogInTest extends BaseTest {
    LogInObject logIn;
    HomeObject homePageStart;

    @Test
    public void logInTest(){
        homePageStart = new HomeObject(driver);
        logIn = new LogInObject(driver);
        homePageStart.goToHomeObject();
        logIn.logIn();
        pause(4);
        logIn.verifyActualLogIn();
        
        Assert.assertEquals(logIn.getExpectedLogInName(), logIn.getActualLogInName());
    }
}
