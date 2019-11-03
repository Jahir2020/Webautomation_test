import common.CommonAPI;
import homepage.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testhomepage extends CommonAPI {

    Login login;

    @BeforeMethod
    public void getloginclass() {
        login = PageFactory.initElements(driver, Login.class);
    }

    @Test
    public void setloginclass() {
        login.logintest();
    }

    SearchProduct searchProduct;

    @BeforeMethod
    public void getsearchproductclass() {
        searchProduct = PageFactory.initElements(driver, SearchProduct.class);
    }

    @Test
    public void setSearchProduct() {
        searchProduct.searchvalue();
    }

    SearchAndVerify searchAndVerify;

    @BeforeMethod
    public void getsearchandverify() {
        searchAndVerify = PageFactory.initElements(driver, SearchAndVerify.class);
    }

    @Test
    public void setSearchAndVerify() {
        searchAndVerify.verifyproduct();
    }

    AutoSuggestion autoSuggestion;

    @BeforeMethod
    public void getautosuggestion() {
        autoSuggestion = PageFactory.initElements(driver, AutoSuggestion.class);
    }

    @Test
    public void setAutoSuggestion() {
        autoSuggestion.bestgamesproduct();
    }

    NavigateProduct navigateProduct;

    @BeforeMethod
    public void getnavigateproduct() {
        navigateProduct = PageFactory.initElements(driver, NavigateProduct.class);
    }

    @Test
    public void setNavigateProduct() {
        navigateProduct.productinfo();
    }

    Signout signout;

    @BeforeMethod
    public void getsignout() {
        signout = PageFactory.initElements(driver, Signout.class);
    }

    @Test
    public void setSignout() {
        signout.getloginclass();
        signout.setloginclass();
        signout.SignoutTest();
    }


}

