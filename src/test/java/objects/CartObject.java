package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class CartObject extends BaseObject {
    private By productToAddInCart = By.xpath("//*[@id='catalog_goods_block']//div[4]//button");
    private By chosenProduct = By.xpath("//*[@id='catalog_goods_block']//div[4]//div[3]");
    private By myProduct = By.className("cart-i-title");
    private String productInCart;
    private String nameOfChosenProduct;

    public CartObject(WebDriver driver){
        super(driver);
    }

    public void openNeedCategoryAndAddProductInCart(){
        HomeStuffObject goTo = new HomeStuffObject(driver);
        goToCategory(goTo.getCategory());
        BaseTest.pause(4);
        goToCategory(goTo.getInsideCategory());
        nameOfChosenProduct = driver.findElement(chosenProduct).getText();
        click(productToAddInCart);
        BaseTest.pause(4);
       productInCart = driver.findElement(myProduct).getText();
    }

    public String getNameOfChosenProduct() {
        return nameOfChosenProduct;
    }

    public String getProductInCart() {
        return productInCart;
    }
}
