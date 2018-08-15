package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public  WebDriver driver;

    @Before
    public  void  setup () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void pause(Integer seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeBrowser () {
        driver.quit();
    }
}
