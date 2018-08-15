package tests;

import objects.CartObject;
import objects.HomeObject;
import objects.LogInObject;
import org.junit.Assert;
import org.junit.Test;

public class VerifyIfProductInCartTest extends BaseTest {
    CartObject cart;
    String expectedProductInCart;
    String actualProductInCart;
    HomeObject homePageStart;
    LogInObject logIn;

    @Test
    public void verifyAddProductInCart(){
      homePageStart = new HomeObject(driver);
      logIn = new LogInObject(driver);

      homePageStart.goToHomeObject();
      logIn.logIn();
      cart = new CartObject(driver);
      cart.openNeedCategoryAndAddProductInCart();
      pause(4);

      expectedProductInCart = cart.getNameOfChosenProduct();
      actualProductInCart = cart.getProductInCart();

      Assert.assertEquals(expectedProductInCart, actualProductInCart);
    }
}
