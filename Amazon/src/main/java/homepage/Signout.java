package homepage;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Signout extends CommonAPI {
    Login login;

    @BeforeMethod
    public void getloginclass() {
        login = PageFactory.initElements(driver, Login.class);
    }
@Test
    public void setloginclass() {
        login.logintest();
    }
//signout
    public void SignoutTest() {
clickOnElementByXpath("//a[@id='nav-link-accountList']//span[@class='nav-icon nav-arrow']");
clickOnElementByXpath("//span[contains(text(),'Sign Out')]");
    }


}