package homepage;

import common.CommonAPI;
import report.TestLogger;

public class Homepage extends CommonAPI {

    public void clickOnSearchBar() {
        clickOnElementByXpath("//input[@id='gh-search-input']");
        TestLogger.log("search bar clicked");
    }

    public void typeOnSearchBar(String value) {
        typeOnElementByXpath("//input[@id='gh-search-input']",value);
        TestLogger.log(value + "type on the search bar");

    }
    public void clickOnAccountButton(){
        clickOnElementByXpath("/html//header[@id='header-block']//nav[@class='utility-navigation']/ul[@class='utility-navigation-list']/li[1]/button[@type='button']//span[@class='flyBtn']");

    }

}