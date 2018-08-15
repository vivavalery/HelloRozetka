package objects;

import org.openqa.selenium.WebDriver;

public class HomeObject extends BaseObject {
    String homePageURl = "https://rozetka.com.ua/";

   public HomeObject(WebDriver driver) {
        super(driver);
    }

    public void goToHomeObject(){
       driver.get(homePageURl);
    }
}
