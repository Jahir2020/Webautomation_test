package homepage;

import common.CommonAPI;

public class AutoSuggestion extends CommonAPI {
    public void bestgamesproduct(){
        clickOnElementByXpath("//i[@class='hm-icon nav-sprite']");
       clickOnElementByLinkText("Movies, Music & Games");
clickOnElementByLinkText("Video Games");
sleepFor(2);
    }
}
