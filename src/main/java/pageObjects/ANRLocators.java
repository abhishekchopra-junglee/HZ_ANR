package pageObjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ActionUtils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

public class ANRLocators extends ActionUtils {
    AndroidDriver driver;

    public ANRLocators(AndroidDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    @iOSXCUITFindBy(accessibility = "Allow")
    public WebElement allowButton;

    @AndroidFindBy(accessibility = "Log In")
    @iOSXCUITFindBy(accessibility = "Log In")
    public WebElement loginButton;

    @iOSXCUITFindBy(accessibility = "Allow While Using App")
    public WebElement allowWhileUsingApp;

    @AndroidFindBy(accessibility = "Login Using Password")
    @iOSXCUITFindBy(accessibility = "Login Using Password")
    public WebElement loginUsingPswd;

    @AndroidFindBy(accessibility = "Login via password")
    @iOSXCUITFindBy(accessibility = "Login via password")
    public WebElement loginViaPswd;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"7 Crore\")]/android.view.View[1]/android.widget.ImageView[1]")
    @iOSXCUITFindBy(accessibility = "Email or Mobile")
    public WebElement enterUsername;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"7 Crore\")]/android.view.View[1]/android.widget.ImageView[2]")
    @iOSXCUITFindBy(accessibility = "Password")
    public WebElement enterPassword;

    @AndroidFindBy(accessibility = "Login")
    @iOSXCUITFindBy(accessibility = "Login")
    public WebElement loginButtonExisting;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Skip\"]")
    @iOSXCUITFindBy(accessibility = "Skip")
    public WebElement skipButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" \"]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Junglee Rummy\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public WebElement welcomeBanner;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Dismiss\"]/android.view.View/android.view.View/android.view.View/android.widget.Button")
    public WebElement dismissBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Junglee Rummy\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public WebElement closeWelcomeBanner;

    @AndroidFindBy(accessibility = "OK")
    @iOSXCUITFindBy(accessibility = "OK")
    public WebElement okBtnReloadChips;

    @AndroidFindBy(accessibility = "ADD CASH")
    @iOSXCUITFindBy(accessibility = "ADD CASH")
    public WebElement addCashLobby;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc,\"0\")])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name, '0')])[2]")
    public WebElement firstTile;

    @AndroidFindBy(accessibility = "Select your bank….")
    @iOSXCUITFindBy(accessibility = "Select your bank….")
    public WebElement selectYourBank;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,\"ADD \")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name, 'ADD')]")
    public WebElement addCashButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"State Bank of India\"]")
    @iOSXCUITFindBy(accessibility = "State Bank of India")
    public WebElement bank;

    @iOSXCUITFindBy(accessibility = "Close")
    public WebElement closeButtonIPA;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Menu')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains(@name, 'Menu')]")
    public WebElement sideMenu;

    @AndroidFindBy(accessibility = "Help")
    @iOSXCUITFindBy(accessibility = "Help")
    public WebElement help;

    @AndroidFindBy(xpath = "//*[@resource-id='backButton']")
    public WebElement backBtnHelp;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Promotions\"]")
    @iOSXCUITFindBy(accessibility = "Promotions")
    public WebElement promotions;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Junglee Rummy\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
    public WebElement paymentBackBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Junglee Rummy\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    public WebElement SMBackBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Junglee Rummy\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
    public WebElement EABackBtn;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Pay')]/android.widget.ImageView")
    public WebElement uncheckBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
    @iOSXCUITFindBy(accessibility = "Yes")
    public WebElement juspayYesCancelBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Yes\"]")
    @iOSXCUITFindBy(accessibility = "Yes")
    public WebElement yesButton;

    @AndroidFindBy(accessibility = "nav-home-tab")
    public WebElement navHomeTab;

    @AndroidFindBy(accessibility = "PRACTICE")
    @iOSXCUITFindBy(accessibility = "PRACTICE")
    public WebElement practiceTab;

    @AndroidFindBy(accessibility = "2")
    @iOSXCUITFindBy(accessibility = "2")
    public WebElement select2Player;

    @AndroidFindBy(accessibility = "PLAY NOW")
    @iOSXCUITFindBy(accessibility = "PLAY NOW")
    public WebElement playNowBtn;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'How would you rate')]/android.view.View")
    public WebElement ratingPopUp;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[3]")
    @iOSXCUITFindBy(accessibility = "LEADERBOARD")
    public WebElement leaderBoard;

    @AndroidFindBy(accessibility = "Opt- in Now")
    @iOSXCUITFindBy(accessibility = "Opt- in Now")
    public WebElement optIn;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"LOBBY\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"LOBBY\"]")
    public WebElement lobby;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement locationOkButton;

    @AndroidFindBy(accessibility= "Leaderboard")
    @iOSXCUITFindBy(accessibility = "Leaderboard")
    public WebElement leaderBoardAccess;
    @AndroidFindBy(accessibility= "View all")
    @iOSXCUITFindBy(xpath= "(//XCUIElementTypeStaticText[@name=\"View all\"])[2]")
    public WebElement viewALL;

    @AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"CASH\"]")
    public WebElement cashTabButton;

    @AndroidFindBy(xpath= "//*[contains(@text,'LEADERBOARD')]")
    public WebElement rummyComLeaderBoard;

    @AndroidFindBy(accessibility = "Opt-In Now")
    public WebElement optInRummyCom;

    @AndroidFindBy(accessibility = "Lobby")
    public WebElement rummyComLobby;

    @AndroidFindBy(accessibility = "Search")
    public WebElement youtubeSearchBtn;

    @AndroidFindBy(id = "com.google.android.youtube:id/search_edit_text")
    public WebElement editSearch;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"hd video without ads\")")
    public WebElement clickSearchResult;

    @AndroidFindBy(id = "com.google.android.youtube:id/search_type_icon")
    public WebElement searchIcon;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[contains(@content-desc, \"play video\")]/android.view.ViewGroup[1]/android.widget.ImageView)[2]")
    public WebElement youtubeVideo;

    @AndroidFindBy(accessibility = "com.google.android.youtube:id/mealbar_dismiss_button")
    public WebElement dismissYoutubeSettings;

    @AndroidFindBy(accessibility = "qa_1")
    public WebElement selectEnvBox;

    @AndroidFindBy(accessibility = "qa_8")
    public WebElement QAEnv;

    @AndroidFindBy(accessibility = "Proceed")
    public WebElement proceed;

    @AndroidFindBy(xpath = "(//*[contains(@content-desc,\"Rummy\") or contains(@content-desc,\"RUMMY\")])[1]")
    public WebElement rummy;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Chips')]")
    public WebElement profile;

    @AndroidFindBy(accessibility = "Reload Chips")
    public WebElement reloadChips;

//    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    @AndroidFindBy(className = "android.widget.EditText")
    private WebElement mobileEditText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.google.android.gms:id/cancel\")")
    private WebElement cancelNumberPopUp;

    @iOSXCUITFindBy(accessibility = "CONTINUE")
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CONTINUE\" or @content-desc=\"Continue\"]")
    private WebElement continueMobileButton;

    @AndroidFindBy(uiAutomator ="new UiSelector().resourceId(\"com.truecaller:id/continueWithDifferentNumber\")")
    private WebElement trueCallerSkip;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.truecaller:id/consent_layout\")")
    private WebElement trueCallerPopup;

    @AndroidFindBy(className = "android.widget.EditText", uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement otpEditText;

    @iOSXCUITFindBy(accessibility = "CONTINUE")
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CONTINUE\" or @content-desc=\"Verify\" or @content-desc=\"Continue\"]")
    private WebElement otpSubmitButton;

    @AndroidFindBy(accessibility = "Start voice search")
    public WebElement voiceSearchButton;

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    public WebElement chromeSearchInput;

    @AndroidFindBy(id = "com.android.chrome:id/url_bar")
    public WebElement chromeUrlBar;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google\"]/android.widget.Image")
    public WebElement googleImageHeader;

    @AndroidFindBy(accessibility = "More", uiAutomator ="new UiSelector().className(\"android.widget.ImageView\").description(\"More\")")
    private WebElement hamburgerButton;

//    @AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.ImageView\").descriptionContains(\"Fantasy\")")
    @AndroidFindBy(xpath = "(//*[@content-desc=\"Fantasy\"])[2]")
    public WebElement fantasyTabApk;

//    @AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.ImageView\").descriptionContains(\"Howzat\")")
    @AndroidFindBy(xpath ="(//*[@content-desc=\"FANTASY\" or @content-desc=\"Howzat\"])[1]")
    public WebElement fantasyTabPSCash;

    @AndroidFindBy(xpath ="(//*[contains(@content-desc,\"Rummy\")])[1]")
    private WebElement rummyTabApk;

    @AndroidFindBy(xpath ="(//*[contains(@content-desc,\"RUMMY\")])[1]")
    private WebElement rummyTabPSCash;

    @AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.ImageView\").descriptionContains(\"Carrom\")")
    private WebElement carromTab;

    @AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.ImageView\").descriptionContains(\"Poker\")")
    private WebElement pokerTab;

    @AndroidFindBy(accessibility ="Maybe Later")
    private WebElement hzAddContactsNudge;

    @AndroidFindBy(accessibility = "Add Cash")
    @iOSXCUITFindBy(accessibility = "Add Cash")
    public WebElement hzAddCashRumLobby;

    @AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.ImageView\").descriptionContains(\"Add Cash\")")
    @iOSXCUITFindBy(xpath = "")
    public WebElement hzAddCashLobby;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement inputCashAmount;

    @AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.Button\").descriptionContains(\"Add \")")
    private WebElement addAmount;

    @AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"Continue\"]")
    private WebElement continueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").description(\"Change\")")
    private WebElement changeButton;

    @AndroidFindBy(id = "username")
    private WebElement netbankingLogin;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Yes\")")
    private WebElement cancelNetBankingLogin;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Payment Failed\"]/preceding-sibling::android.widget.Button")
    private WebElement hzClosePaymentFailurePopup;

     @AndroidFindBy(accessibility = "Yes, Exit")
    private WebElement exitPaymentMode;

//     @AndroidFindBy(xpath = "//android.view.View//android.widget.ImageView[6]")
     @AndroidFindBy(xpath = "(//android.widget.ScrollView/android.view.View[1]//android.widget.ImageView)[2]")
    private WebElement hzPromotionBox;

    @AndroidFindBy(accessibility = "Federal Bank")
    private WebElement paymentBankName;

    public void exitPaymentMode(){
        waitAndClick(exitPaymentMode);
        System.out.println("Exited payment mode selection screen");
    }
    public void exitNetBankingLogin(){
        driver.navigate().back();
        waitAndClick(cancelNetBankingLogin);
    }

    public void hzClosePaymentFailurePopup(){
        waitAndClick(hzClosePaymentFailurePopup);
    }

    public boolean isNetBankingLogin(){
        sleep(5000);
        /*try {
            System.out.println("ContextHandles=="+driver.getContextHandles());
        } catch (Exception e) {
            System.out.println("Exception ContextHandles");
        }
        try {
            System.out.println("getContext=="+driver.getContext());
        } catch (Exception e) {
            System.out.println("Exception getContext");
        }
        try {
            System.out.println("getPageSource=="+driver.getPageSource());
        } catch (Exception e) {
            System.out.println("Exception getPageSource");
        }

        try {
            System.out.println("getWindowHandles=="+driver.getWindowHandles());
        } catch (Exception e) {
            System.out.println("Exception getWindowHandles");
        }*/
        try {
//            driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println("Exception switchTo().defaultContent()");
        }
        return isElementPresent(waitAndFindElement(netbankingLogin));
    }

    public void clickAllowPermission()
    {
        if (isElementPresent(allowButton)) {
            click(allowButton);
        }
    }

    public void ClickLogIn()
    {
        if(isElementPresent(loginButton))
        {
            click(loginButton);
        }

    }

    public void ClickLoginUsingPassword() {
        if(isElementPresent(loginUsingPswd))
        {
            click(loginUsingPswd);
        }
    }

    public void ClickLoginViaPassword()
    {
        if(isElementPresent(loginViaPswd)) {
//        {
//            click(loginViaPswd);
//        }
            Rectangle rect = loginViaPswd.getRect();
            int x = rect.getX();
            int y = rect.getY();
            int height = rect.getHeight();
            int width = rect.getWidth();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tapByCoordinates(x + (width / 2), y + (height / 4));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void enterUsername(String userName)
    {
        waitAndClick(enterUsername);
        sendText(enterUsername,userName);
    }

    public void enterPassword(String password)
    {
        waitAndClick(enterPassword);
        sendText(enterPassword,password);
    }

    public void clickLoginButtonExisting()
    {
        waitAndClick(loginButtonExisting);
    }

    public void clickSkipButton()
    {
        waitAndClick(skipButton);
    }

    public void closeWelcomeBanner()
    {
        try {
            Thread.sleep(2000);
            click(closeWelcomeBanner);
        } catch (InterruptedException e) {
            System.out.println("Banner not present");
        }
    }

    public void closeRatingPopUp()
    {
        if (isElementPresent(ratingPopUp)) {
            click(ratingPopUp);
        }
    }

    public void clickReloadChips()
    {
        click(reloadChips);
    }

    public void clickProfile()
    {
        click(profile);
    }

    public void clickOkBtnReloadChips()
    {
        click(okBtnReloadChips);
    }

    public void clickAddCashLobby()
    {
        click(addCashLobby);
    }

    public void selectFirstTile()
    {
        click(firstTile);
    }

    public void clickSelectYourBank()
    {
        click(selectYourBank);
    }

    public void clickAddButton()
    {
        click(addCashButton);
    }

    public void clickJusPayYesCancelBtn()
    {
        click(juspayYesCancelBtn);
    }

    public void ClickYes_Button()
    {
        click(yesButton);
    }

    public void unCheckExpressCheckout()
    {
        click(uncheckBtn);
    }

    public void clickAnyBankInNetBanking()
    {
        click(bank);
    }

    public void clickSideMenuButton()
    {
        click(sideMenu);
    }

    public void goToHelpFromSideMenu()
    {
        click(help);
    }

    public void clickOnBackBtnHelp()
    {
        click(backBtnHelp);
    }

    public void goToPromotions()
    {
        click(promotions);
    }

    public void clickCloseButton()
    {
        click(closeButtonIPA);
    }

    public void clickPaymentBackBtn()
    {
        click(paymentBackBtn);
    }

    public void clickSMBackBtn()
    {
        click(SMBackBtn);
    }

    public void clickEABackBtn()
    {
        click(EABackBtn);
    }

    public void clickAllowWhileUsingApp()
    {
        try {
            click(allowWhileUsingApp);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void waitForNavHomeTabVisible()
    {
        try{
            FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOf(navHomeTab));
        }catch(Exception e){
            System.out.println(navHomeTab.toString()+" not found");
        }
    }

    public void cashTab()
    {
//        try{
//            FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
//                    .withTimeout(Duration.ofSeconds(30))
//                    .pollingEvery(Duration.ofSeconds(2))
//                    .ignoring(NoSuchElementException.class);
//            wait.until(ExpectedConditions.visibilityOf(cashTabButton));
//            timeStamp();//login->lobby
//            System.out.println("Timestamp form app launch to lobby ");
//        }catch(Exception e){
//            System.out.println(cashTabButton.toString()+" not found");
//        }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"CASH\"]")));
        timeStamp();//login->lobby
        System.out.println("Timestamp form app launch to lobby ");
    }

    public void goToPracticeTab()
    {
        click(practiceTab);
    }

    public void select2Player()
    {
        click(select2Player);
    }

    public void clickPlayNowBtn()
    {
        click(playNowBtn);
    }

    public void clickLocationOkBtn()
    {
        click(locationOkButton);
    }

    public void clickLeaderBoard()
    {
        if(isElementPresent(leaderBoard))
        {
            click(leaderBoard);
        }
    }

    public void clickOptIn()
    {
        if(isElementPresent(optIn))
        {
            click(optIn);
        }
    }

    public void clickLobby()
    {
        if(isElementPresent(lobby))
        {
            click(lobby);
        }
    }

    public void goToLeaderBoardFromSideMenu()
    {
        click(leaderBoardAccess);
    }

    public void scrollAndViewAll()
    {
        scrollWithCoordinates(driver, 364, 1257, 350, 183);
        if(isElementPresent(viewALL))
        {
            click(viewALL);
        }
    }

    public void clickSearchBtnYoutube()
    {

        click(youtubeSearchBtn);
        System.out.println("Clicked search button on youtube app");
    }

    public void searchVideo()
    {
        sendText(editSearch, "hd video without ads");
        if(isElementPresent(clickSearchResult))
            click(clickSearchResult);
        System.out.println("Searching youtube keyword");
    }

    public void clickSearchIcon()
    {
        if(isElementPresent(searchIcon))
            click(searchIcon);
        System.out.println("Clicked youtube video search");
    }

    public void clickOnVideo() {
        if(isElementPresent(dismissYoutubeSettings))
            click(dismissYoutubeSettings);
        click(youtubeVideo);
        System.out.println("Clicked on youtube video tile");
    }

    public void clickOnSelectEnvBox() {
        click(selectEnvBox);
    }

    public void clickOnQAEnv() {
        click(QAEnv);
    }

    public void clickProceedBtn() {
        click(proceed);
    }

    public void clickOnRummy() {
        click(rummy);
    }

    public void clickOnHZ() {
        System.out.println("Clicking on HZ Tab");
        click(fantasyTabPSCash);
        click(fantasyTabApk);

    }

    public void hzInputMobNo(String number) {
//        waitAndFindElement(mobileEditText).clear();
//        waitAndClick(mobileEditText);
        sleep(500);
        if (isElementPresent(cancelNumberPopUp)) {
            click(cancelNumberPopUp);
            click(mobileEditText);
        }
//        mobileEditText.clear();
        waitAndClick(mobileEditText);
        waitAndClick(mobileEditText);
        sendText(mobileEditText, number);
        if(waitAndFindElement(continueMobileButton) != null){
            System.out.println("Continue mobile number input button enabled="+waitAndFindElement(continueMobileButton).isEnabled());
            waitAndClick(continueMobileButton);
        }
        else{
            System.out.println("\nNew Login flow shown....\n");
        }

    }

    public boolean isTrueCallerPopupVisibleLong() {
        sleep(500);
        return isElementPresent(waitAndFindElement(trueCallerPopup));
    }

    public void trueCallerSkip() {
        click(trueCallerSkip);
    }

    public void hzEnterOTP(String otp) {
        waitAndClick(otpEditText);
        waitAndClick(otpEditText);
//        isElementPresent(otpEditText);
       sendText(otpEditText, otp);
       if(waitAndFindElement(otpSubmitButton)!=null && waitAndFindElement(otpSubmitButton).isEnabled()) {
           System.out.println("OTP submit button enabled");
           waitAndClick(otpSubmitButton);
       }
       else{
           System.out.println("\nNew Login Flow...\n");
       }
        sleep(500);
    }

    public void googleSearch(String searchText){
        isElementPresent(voiceSearchButton);
        if(isElementPresent(chromeSearchInput)) {
            sendText(chromeSearchInput, searchText);
        }
        else if (isElementPresent(chromeUrlBar))
            sendText(chromeUrlBar, searchText);

        isElementPresent(waitAndFindElement(googleImageHeader));

    }

    public boolean hzClickSideMenu() {
        try {
            isElementPresent(hamburgerButton);
            waitAndClick(hamburgerButton);
            return true;
        } catch (AssertionError error) {
            Assert.fail(error.getMessage());
            return false;
        }
    }


    public boolean isHzLobbyVisible(String platform) {
        handleHZPopups();
        handleTooltip();
        System.out.println("Lobby visible start time ="+ LocalDateTime.now());
        boolean isFantasyTabVisible,rummyTabVisible =false;
        // boolean pokerTabVisible = isElementPresent(pokerTab);
        // boolean carromTabVisible = isElementPresent(carromTab);
        if(platform.contains("pscash")){
            System.out.println("Platform is PSCash");
            isFantasyTabVisible = isElementPresent(fantasyTabPSCash);
            rummyTabVisible = isElementPresent(rummyTabPSCash);
        }
        else{
            System.out.println("Platform is Cash apk");
            isFantasyTabVisible = isElementPresent(fantasyTabApk) ;
            rummyTabVisible = isElementPresent(rummyTabApk);
        }
        System.out.println("Lobby visible end time ="+ LocalDateTime.now());
        return isFantasyTabVisible && rummyTabVisible;

    }

    public boolean hzClickMenuItem(String item) {
        try {
            String locator =
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\"android.widget.ImageView\").descriptionStartsWith(\""
                            + item
                            + "\"))";
            WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(locator));
            //      Assert.assertTrue(isDisplayed(element,3));
            waitAndClick(element);
            sleep(200);
            System.out.println("Navigated to side menu item - " + item);
            return true;
        } catch (AssertionError error) {
            error.getMessage();
            return false;
        }
    }

    public boolean isRummyLobbyDisplayed(){
       /* try {
            driver.switchTo().parentFrame();
        } catch (Exception e) {
            System.out.println("switchTo().parentFrame()");
        }

        try {
            driver.switchTo().frame(0);
        } catch (Exception e) {
            System.out.println("switchTo.frame()");
        }
        try {
            driver.context("HYBRID");
        } catch (Exception e) {
            System.out.println("context()");
        }
        try {
            System.out.println(driver.switchTo().activeElement().getTagName());
        } catch (Exception e) {
            System.out.println("activeElement()");
        }*/
        return isElementPresent(waitAndFindElement(playNowBtn));
    }

    public void removeContactsNudge(){
        if(isElementPresent(hzAddContactsNudge)){
            System.out.println("Contacts nudge appeared");
            waitAndClick(hzAddContactsNudge);
        }
        else
            System.out.println("Contacts nudge didnt appear");
    }

    public void clickHzAddCashRumLobby()
    {
        waitAndClick(hzAddCashRumLobby);
        System.out.println("Clicked HZ Add cash from Rummy lobby");
    }

    public void clickHzAddCashLobby()
    {
        waitAndClick(waitAndFindElement(hzAddCashLobby));
        System.out.println("Clicked HZ Add cash from Howzat lobby");

    }

    public void inputCash(String amount) {
        boolean flag = false;
        do {
            click(inputCashAmount);
            inputCashAmount.clear();
            System.out.println("Cleared EA field.");
            sleep(1000);
            click(inputCashAmount);
            inputCashAmount.sendKeys(amount);
            sleep(2000);
            driver.hideKeyboard();
            if (isElementPresent(addAmount)|| isElementPresent(continueButton)|| isElementPresent(changeButton)) {
                System.out.println("Add cash button enabled.");
                flag = true;
            }
        } while (!flag);
    }

    public boolean ContinueButton() {
        boolean flag = false;
        if (isElementPresent(continueButton)) {
            click(continueButton);
            flag = true;
        }
        else{
            System.out.println("Continue button not present");
        }
        return flag;
    }

    public void ChangeButton() {
        if (isElementPresent(changeButton)) {
            click(changeButton);
        } else {
            System.out.println("Change Button unavailable");
        }
    }

    public boolean hzSelectPaymentMode(String mode) {
        String locator =
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\"android.widget.ImageView\").descriptionStartsWith(\""+ mode+ "\"))";
        List<WebElement> elements = waitAndFindElements(driver.findElement(new AppiumBy.ByAndroidUIAutomator(locator)));
        System.out.println("On Payment Mode Page");
        if (elements.size() > 0) {
            waitAndClick(elements.get(0));
            return true;
        } else return false;
    }

    public boolean hzSelectNetBankingMode(String bankName) {
        try {
            // sleep(8000);
            //        String locator="new UiScrollable(new
            // UiSelector().scrollable(true).instance(0)).scrollIntoView(new
            // UiSelector().className(\"android.view.View\").descriptionStartsWith(\""+selectBank+"\"))";
            //        WebElement element=driver.findElement(new AppiumBy.ByAndroidUIAutomator(locator));
        String locator = "new UiSelector().className(\"android.widget.ImageView\").descriptionStartsWith(\""+bankName+"\")";
//            String locator = bankName;
        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(locator));
//            WebElement element = driver.findElement(new AppiumBy.ByAccessibilityId(locator));
            System.out.println("Is bank name element found-"+isElementPresent(element));
//            scrollUntilVisible(waitAndFindElement(element), "down",1);
            if (isElementPresent(element)) {
                System.out.println(bankName + " - selected for payment");
                waitAndClick(element);
            } else {
                return false;
            }
            // sleep(5000);
            // click(element);
            sleep(2000);
            return true;
        } catch (Exception e) {
            System.out.println("Exception in hzSelectNetBankingMode : "+e.getMessage());
            return false;
        }
    }

    public boolean clickHzPromotionBox() {
        boolean isPromotionBoxPresent = false;
        isPromotionBoxPresent = isElementPresent(hzPromotionBox);
        if(isPromotionBoxPresent){
            click(hzPromotionBox);
            scrollAndViewAll();
            sleep(2000);
        }
        return isPromotionBoxPresent;

    }


    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Know More\"]")
    private WebElement popupHWGCancel;
    @AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    private WebElement contactsPermissionAllow;
    public void handleHZPopups() {
        if(isElementPresent(popupHWGCancel))
            waitAndClick(popupHWGCancel);
        if(isElementPresent(hzAddContactsNudge)) {
            waitAndClick(contactsPermissionAllow);
            clickBackButtonAndroid();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'CASH')]/parent::android.view.View/android.widget.ImageView")
    private WebElement sideMenuHowzat;
    public void clickSideMenuHowzat() {
        if(isElementPresent(sideMenuHowzat))
            waitAndClick(sideMenuHowzat);
        else
            hzClickSideMenu();
    }

    @AndroidFindBy(xpath = "//android.webkit.WebView[@text=\"Howzat GST Guidelines\"]")
    private WebElement webViewPageGSTPolicy;
    public String getWebViewContentGSTPolicy() {
        return getText(webViewPageGSTPolicy);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Earn Cash\"]")
    private WebElement referAndEarnBottomTray;
    public void clickReferAndEarnBottomTray() {
        waitAndClick(referAndEarnBottomTray);
    }

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@content-desc,\"How it works\")]/preceding-sibling::android.view.View")
    private WebElement referAndEarnHowItWorksVideo;
    public void clickReferAndEarnHowItWorksVideo() {
        click(referAndEarnHowItWorksVideo);
    }

    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@content-desc,\"How it works\")]")
    private WebElement referAndEarnHowItWorks;
    public void clickHowItWorks(){
        click(referAndEarnHowItWorks);
        Rectangle rect= referAndEarnHowItWorks.getRect();
        System.out.println(rect.getDimension().getWidth());
        System.out.println(rect.getDimension().getHeight());
        System.out.println(rect.getX());
        System.out.println(rect.getY());
        System.out.println(rect.getPoint());
        System.out.println(referAndEarnHowItWorks.getSize());
        tapByCoordinates(900,780);
    }

    @AndroidFindBy(xpath = "//android.webkit.WebView[@text=\"How To Play Fantasy Sports Online In India\"]\n")
    private WebElement webViewPageReferAndEarn;
    public String getWebViewContentReferAndEarn() {
        return getText(webViewPageReferAndEarn);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,\"Chat with\")]")
    private WebElement chatTooltip;
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,\"Friends Feed\")]")
    private WebElement feedTooltip;
    public boolean isTooltipPresent() {
        return isElementPresent(chatTooltip) || isElementPresent(feedTooltip);
    }
    public void handleTooltip() {
        while (isTooltipPresent()){
            if (isElementPresent(chatTooltip)) {
                click(chatTooltip);
            }
            if (isElementPresent(feedTooltip)) {
                click(feedTooltip);
            }
        }
    }
}