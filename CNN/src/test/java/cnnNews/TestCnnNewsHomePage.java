package cnnNews;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCnnNewsHomePage extends CommonAPI {
    public static CnnHomePage cnnHome = null;

    @BeforeMethod
    public void init() {
        cnnHome = PageFactory.initElements(driver, CnnHomePage.class);
    }

    @Test
    public void currentUrlTest() throws InterruptedException {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("cnn.com"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void getTitleTest() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "CNN - Breaking News, Latest News and Videos");
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void usLinkTest() {
        clickOnElement("//a[@name='us' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("www.cnn.com/us"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void worldLinkTest() {
        clickOnElement("//a[@name='world' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/world"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void politicsLinkTest() {
        clickOnElement("//a[@name='politics' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/politics"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void businessLinkTest() {
        clickOnElement("//a[@name='business' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/business"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void healthLinkTest() {
        clickOnElement("//a[@name='health' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/health"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void entertainmentLinkTest() {
        clickOnElement("//a[@name='entertainment' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/entertainment"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void styleLinkTest() {
        clickOnElement("//a[@name='style' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/style"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void travelLinkTest() {
        clickOnElement("//a[@name='travel' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/travel"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void sportLinkTest() {
        clickOnElement("//a[@name='bleacher' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/sports"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void videoLinkTest() {
        clickOnElement("//a[@name='videos' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.cnn.com/videos"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void dropDownTest1() {
        clickOnElement("//div[@id='edition-picker-toggle-desktop']");
        clickOnElement("//li[@class='sc-jlyJG eKjbSG']//a[@name='international' and @class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 sc-gipzik enPspA']");
        Assert.assertTrue(cnnHome.dropDown1IsEnable());
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void linkedPageTitleTest() {
        clickOnElement("//div[@id='edition-picker-toggle-desktop']");
        clickOnElement("//li[@class='sc-jlyJG eKjbSG']//a[@name='international' and @class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 sc-gipzik enPspA']");
        String title = driver.getTitle();
        Assert.assertEquals(title, "CNN International - Breaking news, US News, World News and Videos ");
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void badgeIconBtnTest() {
        clickOnElement("//div[@id='edition-picker-toggle-desktop']");
        clickOnElement("//li[@class='sc-jlyJG eKjbSG']//a[@name='international' and @class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 sc-gipzik enPspA']");
        clickOnElement("//div//div//header//div[@class='Flex-sc-1sqrs56-0 sc-iwsKbI YyuVL']//a[@class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 jlzTwO']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://edition.cnn.com"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void linkedListWorldPageTest() {
        clickOnElement("//a[@name='world' and @class='sc-fjdhpX sc-chPdSV lcJwCV']");
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);

    }

    @Test
    public void videoPosterTest1() {
        mouseHoverByXpath("//video[@class='mp4-animations autoplaysinline']");
        Assert.assertTrue(cnnHome.videoPosterIsEnable());
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void searchBoxTest() {
        cnnHome.setSearchBtn();
        Assert.assertTrue(cnnHome.searchBoxIsEnable());
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void searchBoxTest1() {
        cnnHome.setSearchBtn();
        cnnHome.inputSearch("asia");
        cnnHome.setSubmitBtn();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://us.cnn.com/search?q=asia"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void userAccountTest() {
        clickOnElement("//div[@class='Box-sc-1fet97o-0 indexes__AccountIconButton-nujtvs-0 kmRdGR']");
        cnnHome.fillEmptyField(cnnHome.emailInput, "rockstar");
        cnnHome.fillEmptyField(cnnHome.passInput, "007");
        cnnHome.setLoginBtn();
        Assert.assertTrue(cnnHome.loginBtnEnable());
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void signUpTest() {
        clickOnElement("//div[@class='Box-sc-1fet97o-0 indexes__AccountIconButton-nujtvs-0 kmRdGR']");
        clickOnElement("//a[@id='login-registration-link']");
        cnnHome.fillEmptyField(cnnHome.regEmail, "123@gmail.com");
        cnnHome.fillEmptyField(cnnHome.regPass, "001122");
        cnnHome.fillEmptyField(cnnHome.zipCode, "48150");
        clickOnElement("//button[@class='user-account-shared__button user-account-registration__form-button']");
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void termAndConditionLinkTest() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK'and @name='terms-of-use']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://us.cnn.com/terms0"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void privacyPolicyTest() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK'and @name='privacy-policy']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://us.cnn.com/privacy0"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void doNotSellMyInfoTest() {
        clickOnElement("//li//a[@class='indexes__Link-sc-1g80pf1-0 indexes__SectionLink-sc-1g80pf1-4 gaMjau']");
        Assert.assertTrue(cnnHome.popUpDoNotSelDisplayed());
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void cnnStoreTest() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK' and @name='cnn-store']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://store.cnn.com"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void onlineCourseTest() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK' and @name='cnn-store']");
        selectOptionByVisibleText(cnnHome.onlineCoursesDropDown, "Online Courses");
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void onlineStoreTest() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK' and @name='cnn-store']");
        clickOnElement("//img[@alt='CNN White On-Air Mug']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://store.cnn.com/sales/cnn-white-on-air-mug-2"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void purchaseTest() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK' and @name='cnn-store']");
        clickOnElement("//img[@alt='CNN White On-Air Mug']");
        clickOnElement("//add-to-cart-button[@class='hidden-xs hidden-sm btn btn-lg btn-block btn-success js-purchase-submit btn-add-to-cart']");
        clickOnElement("//a[@class='btn btn-lg btn-success btn-block']");
        clickOnElement("//button[@class='ApplePayButton ApplePayButton--default ApplePayButton--dark']");
        clickOnElement("//button[@class='css-schhob']");
        cnnHome.fillEmptyField(cnnHome.customerEmail, "bmw@gmail.com");
        cnnHome.fillEmptyField(cnnHome.customerPass, "098765432");
        clickOnElement("//button[@class='css-52a4xl']");
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void purchaseTest1() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK' and @name='cnn-store']");
        clickOnElement("//img[@alt='CNN White On-Air Mug']");
        clickOnElement("//add-to-cart-button[@class='hidden-xs hidden-sm btn btn-lg btn-block btn-success js-purchase-submit btn-add-to-cart']");
        clickOnElement("//a[@class='btn btn-lg btn-success btn-block']");
        clickOnElement("//button[@class='ApplePayButton ApplePayButton--default ApplePayButton--dark']");
        clickOnElement("//button[@class='css-schhob']");
        clickOnElement("//input[@name='accept-custom-terms']");
        clickOnElement("//button[@class='ApplePayButton ApplePayButton--default ApplePayButton--dark']");
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void purchaseTest2() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK' and @name='cnn-store']");
        clickOnElement("//img[@alt='CNN White On-Air Mug']");
        clickOnElement("//add-to-cart-button[@class='hidden-xs hidden-sm btn btn-lg btn-block btn-success js-purchase-submit btn-add-to-cart']");
        clickOnElement("//a[@class='btn btn-lg btn-success btn-block']");
        clickOnElement("//button[@class='ApplePayButton ApplePayButton--default ApplePayButton--dark']");
        clickOnElement("//button[@class='css-schhob']");
        clickOnElement("//input[@name='accept-custom-terms']");
        clickOnElement("//div[@class='paypal-button-label-container']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.paypal.com/checkoutnow?sessionID=uid_46c038bc13_mja6mtq6mjy&buttonSessionID=uid_39df74fbd9_mja6mtc6mzc&fundingSource=paypal&buyerCountry=US&locale.x=en_US&commit=true&clientID=AeD4_qPdjOTWLKHJHkNQapnP6cakZGVIJWbCxf8mBnOiPhUc-Xv9FqX0wayqLPoEqWETAM1F2BzgSXoV&env=production&sdkMeta=eyJ1cmwiOiJodHRwczovL3d3dy5wYXlwYWwuY29tL3Nkay9qcz9jbGllbnQtaWQ9QWVENF9xUGRqT1RXTEtISkhrTlFhcG5QNmNha1pHVklKV2JDeGY4bUJuT2lQaFVjLVh2OUZxWDB3YXlxTFBvRXFXRVRBTTFGMkJ6Z1NYb1YmY3VycmVuY3k9VVNEJmRpc2FibGUtZnVuZGluZz1jcmVkaXQsY2FyZCZpbnRlbnQ9YXV0aG9yaXplIiwiYXR0cnMiOnsiZGF0YS11aWQiOiJ1aWRfaWNhZG5zc2lzaWFteWtzeG5zZXdlaHhuZGZwZHRjIn19&xcomponent=1&version=5.0.238&token=1UC22768YG9873808"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void purchaseTest3() {
        clickOnElement("//a[@class='sc-fjdhpX sc-chPdSV ereXeK' and @name='cnn-store']");
        clickOnElement("//img[@alt='CNN White On-Air Mug']");
        clickOnElement("//add-to-cart-button[@class='hidden-xs hidden-sm btn btn-lg btn-block btn-success js-purchase-submit btn-add-to-cart']");
        clickOnElement("//a[@class='btn btn-lg btn-success btn-block']");
        clickOnElement("//button[@class='ApplePayButton ApplePayButton--default ApplePayButton--dark']");
        clickOnElement("//button[@class='css-schhob']");
        clickOnElement("//input[@name='accept-custom-terms']");
        clickOnElement("//div[@class='paypal-button-label-container']");
        cnnHome.fillEmptyField(cnnHome.emailEbay, "123@gmail.com");
        cnnHome.fillEmptyField(cnnHome.passEbay, "0755");
        clickOnElement("//button[@class='button actionContinue scTrack:unifiedlogin-login-submit']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(cnnHome.ebayLoginBtnIsEnable());
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }
}
