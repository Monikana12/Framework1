package homepage;

import common.CommonAPI;
import org.testng.Assert;

public class Search extends CommonAPI {

    public void searchFieldIsTypeAble() {


        //For understanding
        //boolean condition= isElementDisplayed("//input[@id='twotabsearchtextbox']");
        //Assert.assertEquals(condition,true);
        Assert.assertEquals(isElementDisplayed("//input[@id='gh-search-input']"), true);
        clickOnElementByXpath("//input[@id='gh-search-input']");
        typeOnElementByXpath("//input[@id='gh-search-input']", "Java Book");


    }

    public void clickOnSearchButton() {
        clickOnElementByXpath("//input[@type='submit' and @value='Go']");
    }
}
