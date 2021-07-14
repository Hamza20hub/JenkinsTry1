package cnnNews;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnEntertainmentTest extends CommonAPI {
    public static CnnHomePage cnnEnt = null;

    @BeforeMethod
    public void init() {
        cnnEnt = PageFactory.initElements(driver, CnnHomePage.class);
    }

    @Test
    public void entainmentLinkTest() {
        clickOnElement("//ul//a[@name='entertainment'and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/entertainment"));
    }
}
