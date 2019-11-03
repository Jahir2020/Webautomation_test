package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class SearchAndVerify extends CommonAPI {
    public void verifyproduct(){
    typeOnElementByXpath("//input[@id='twotabsearchtextbox']","Java books");
    clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        sleepFor(2);
    clickOnElementByXpath("//span[contains(text(),'Learning WebRTC')]");
    System.out.println(driver.findElement(By.xpath("//h1[@id='title']")).getText());
    }
}
