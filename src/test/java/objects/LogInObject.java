package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class LogInObject extends BaseObject {
   private By logInElement = By.xpath("//*[@id='header_user_menu_parent']/a");
   private By password = By.name("password");
   private By login = By.name("login");
   private By submit = By.name("auth_submit");
   private By banner =By.xpath("/html/body/a/span[2]");
   private By bannerTwo = By.xpath("/html/body/a/span");
   private String expectedLogInName = "vivatest";
   private String actualLogInName;

    public LogInObject(WebDriver driver) {
        super(driver);
    }

    public void logIn(){
        click(logInElement);
        BaseTest.pause(2);
        writeText(login, "cisexalup@zep-hyr.com");
        writeText(password, "Vivatest1");
        catchBanner();
        BaseTest.pause(6);
        click(submit);
    }

    public String verifyActualLogIn(){
        actualLogInName = driver.findElement(logInElement).getText();
        return actualLogInName;
    }

    public void catchBanner(){
        WebElement bannerCloseButton;
        try {
            bannerCloseButton = driver.findElement(banner);
            if (bannerCloseButton.isDisplayed()){
                bannerCloseButton.click();
            }
        } catch (Exception e){
        }
        try {
            bannerCloseButton = driver.findElement(bannerTwo);
            if (bannerCloseButton.isDisplayed()) {
                bannerCloseButton.click();
            }
        } catch (Exception e){
        }
    }

    public String getExpectedLogInName() {
        return expectedLogInName;
    }

    public String getActualLogInName() {
        return actualLogInName;
    }
}
