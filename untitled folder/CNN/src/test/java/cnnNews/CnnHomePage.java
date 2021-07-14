package cnnNews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CnnHomePage {
    @FindBy(xpath = "//li[@class='sc-jlyJG eKjbSG']//a[@name='international' and @class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 sc-gipzik enPspA']")
    WebElement selectFrmDropDown1;
    @FindBy(xpath = "//video[@class='mp4-animations autoplaysinline']")
    WebElement videoPosterLink;
    @FindBy(xpath = "//button[@class='sc-jhAzac sc-gisBJw hioqcg'and @data-test='searchButton']")
    WebElement searchBtn;
    @FindBy(xpath = "//input[@id='header-search-bar']")
    WebElement searchInputField;
    @FindBy(xpath = "//div[@class='Text-sc-1amvtpj-0 iEWJSI']")
    WebElement submitBtn;
    @FindBy(xpath = "//input[@class='indexes__Input-sc-30af8a-8 ddNAqi'and @name='loginEmail']")
    WebElement emailInput;
    @FindBy(xpath = "//input[@class='indexes__Input-sc-30af8a-8 ddNAqi' and @name='loginPassword']")
    WebElement passInput;
    @FindBy(xpath = "//button[@class='indexes__ButtonContainer-oqeuru-1 evsXXx indexes__ThemedButton-sc-1l7akfd-8 gzyFD']")
    WebElement loginBtn;
    @FindBy(xpath = "//input[@id='registration-email-input']")
    WebElement regEmail;
    @FindBy(xpath = "//input[@id='registration-password-input']")
    WebElement regPass;
    @FindBy(xpath = "//input[@id='registration-zip-input']")
    WebElement zipCode;
    @FindBy(xpath = "//div[@id='onetrust-consent-sdk']")
    WebElement popUpDoNotSel;
    @FindBy(xpath = "//a[@class='mobile-dropdown-toggle nav-item-link js-root-menu-item']")
    WebElement onlineCoursesDropDown;
    @FindBy(xpath = "//input[@id='email']")
    WebElement customerEmail;
    @FindBy(xpath = "//input[@id='password']")
    WebElement customerPass;
    @FindBy(xpath = "//input[@name='login_email']")
    WebElement emailEbay;
    @FindBy(xpath = "//input[@name='login_password']")
    WebElement passEbay;
    @FindBy(xpath = "//button[@class='button actionContinue scTrack:unifiedlogin-login-submit']")
    WebElement submitLogin;

    public void dropDownSelection1() {
        selectFrmDropDown1.click();
    }

    public void setSearchBtn() {
        searchBtn.click();
    }

    public void fillEmptyField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void inputSearch(String value) {
        fillEmptyField(searchInputField, value);
    }

    public void setSubmitBtn() {
        submitBtn.click();
    }

    public void setSearchInputField(String value) {
        fillEmptyField(searchInputField, "Asia");
    }

    public void setLoginBtn() {
        loginBtn.click();
    }

    public boolean popUpDoNotSelDisplayed() {
        return popUpDoNotSel.isDisplayed();
    }

    public boolean dropDown1IsEnable() {
        return selectFrmDropDown1.isEnabled();
    }

    public boolean videoPosterIsEnable() {
        return videoPosterLink.isDisplayed();
    }

    public boolean searchBoxIsEnable() {
        return searchBtn.isEnabled();
    }

    public boolean loginBtnEnable() {
        return loginBtn.isEnabled();
    }

    public boolean ebayLoginBtnIsEnable() {
        return submitLogin.isEnabled();
    }
}



