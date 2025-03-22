package flows;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ANRLocators;

import java.time.Duration;
import java.util.Arrays;
import java.util.Random;

public class ANRFlows extends ANRLocators {
    AndroidDriver driver;
    String appPackageName;

    public ANRFlows(AndroidDriver driver, WebDriverWait wait, String appPackageName) {
        super(driver, wait);
        this.driver = driver;
        this.appPackageName = appPackageName;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void loginExistingUser(String platform, String deviceIndex) throws InterruptedException {
        selectQAEnv(deviceIndex);
        timeStamp();// splash->login
        if (platform.equalsIgnoreCase("ipa")) {
            clickAllowPermission();
        }
        clickAllowPermission();
        Thread.sleep(2000);
        if (deviceIndex.equalsIgnoreCase("2")) {
            scrollWithCoordinates(driver, 1055, 480, 50, 480);
            tapByCoordinates(600, 1739);
        }
        ClickLogIn();
        ClickLoginUsingPassword();
        ClickLoginViaPassword();
        switch (deviceIndex) {
            case "0":
                enterUsername("dbmundhra@gmail.com");
                enterPassword("1234@Test");
                break;
            case "1":
                enterUsername("7087537187");
                enterPassword("1234@Test");
                break;
            case "2":
                enterUsername("roohpreet.kaur@jungleegames.com");
                enterPassword("1234@Test");
                break;
            case "3":
                enterUsername("roohpreet002@gmail.com");
                enterPassword("1234@Test");
                break;
            case "4":
//                enterUsername("7999465910");
//                enterPassword("@Test1234");
                enterUsername("8979561161");
                enterPassword("Abcdef123!");
                break;
        }
        clickBackButtonAndroid();
        clickLoginButtonExisting();
        Thread.sleep(2000); //use wait for element visible
        if (platform.equalsIgnoreCase("ipa")) {
            clickAllowWhileUsingApp();
        } else {
            clickAllowPermission();
        }
        clickSkipButton();
        closeWelcomeBanner();
        closeWelcomeBanner();
        closeRatingPopUp();
    }

    public void hzLoginUser(String platform, String deviceIndex) throws InterruptedException {
//        selectQAEnv(deviceIndex);
        timeStamp();// splash->login
        if (platform.equalsIgnoreCase("ipa")) {
            clickAllowPermission();
        }
//        clickAllowPermission();
//        if (deviceIndex.equalsIgnoreCase("2")) {
//            scrollWithCoordinates(driver, 1055, 480, 50, 480);
//            tapByCoordinates(600, 1739);
//        }
        if (isTrueCallerPopupVisibleLong()) {
            System.out.println("App Launched");
            trueCallerSkip();
        }
        else{
            System.out.println("No truecaller signin");
        }

        switch (deviceIndex) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
                hzInputMobNo("6362104066"); //6362104066 //9742303340
                hzEnterOTP("126126");
                break;
//                hzInputMobNo("9958983132");
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Enter your name: ");
//                String name = scanner.nextLine();
//                System.out.println("Hello, OTP =" + name + "!");

            case "7":
                hzInputMobNo("5566555558");
                hzEnterOTP("123456");
                break;
            case "8":
                hzInputMobNo("5566555559");
                hzEnterOTP("123456");
                break;
        }

        Thread.sleep(2000); //use wait for element visible
        removeContactsNudge();
        if(isHzLobbyVisible(platform))
            System.out.println("HZ Lobby visible");
        else
            System.out.println("HZ Lobby is not visible");

        if (platform.equalsIgnoreCase("ipa")) {
            clickAllowWhileUsingApp();
        } else {
            clickAllowPermission();
        }

//        closeWelcomeBanner();
//        closeWelcomeBanner();
//        closeRatingPopUp();
    }
    public void reloadChips() {
        clickSideMenuButton();
        clickProfile();
        clickReloadChips();
        clickOkBtnReloadChips();
    }

    public void relaunchApp(String platform,int... appOptions) {
        switch (platform) {
            case "ipa":
                driver.terminateApp("com.jungleerummy.jungleerummy");
                driver.activateApp("com.jungleerummy.jungleerummy");
                break;
            case "psrmg":
                driver.terminateApp("com.jungleerummy.playcashgameonline");
                driver.activateApp("com.jungleerummy.playcashgameonline");
                break;
            case "native":
                driver.terminateApp("io.jungleerummy.jungleegames");
                driver.activateApp("io.jungleerummy.jungleegames");
                break;
            case "rummy.com":
                driver.terminateApp("com.rummydotcom.indianrummycashgame");
                driver.activateApp("com.jungleerummy.playcashgameonline");
                break;
            case "hzcash":
            case "hzpscash":
                if(appOptions.length>0 && appOptions[0]==1){
                    //Terminate App
                    driver.activateApp(appPackageName);
                    sleep(200);
                    driver.terminateApp(appPackageName);
                    sleep(200);
                }
                driver.activateApp(appPackageName);
                break;
        }
    }

    public void flutterToWebviewPromotions(String platform) throws InterruptedException {
        try {
            //  cashTab();
            clickSideMenuButton();
            goToHelpFromSideMenu();
            if (platform.equalsIgnoreCase("ipa")) {
                clickLobby();
            } else {
                clickOnBackBtnHelp();
            }
            Thread.sleep(3000);
            goToPromotions();
            Thread.sleep(7000);
            clickLeaderBoard();
            Thread.sleep(7000);
            clickOptIn();
            Thread.sleep(5000);
            clickLobby();
            //  clickBackButtonAndroid();
        } catch (TimeoutException e) {
            try {
                swipeToRight();
            } catch (Exception ex) {
                System.out.println(ex);
                relaunchApp(platform);
            }
        }
    }

    public void flutterToWebviewLeaderboard(String platform) throws InterruptedException {
        try {
            clickSideMenuButton();
            setNetworkSpeedBS("2g-gprs-lossy");
            goToHelpFromSideMenu();
            if (platform.equalsIgnoreCase("ipa")) {
                clickLobby();
            } else {
                clickBackButtonAndroid();
            }
            Thread.sleep(5000);
            goToPromotions();
            if (platform.equalsIgnoreCase("ipa")) {
                clickLobby();
            } else {
                clickOnBackBtnHelp();
            }
            clickSideMenuButton();
            setNetworkSpeedBS("reset");
            goToLeaderBoardFromSideMenu();
            Thread.sleep(5000);
            scrollAndViewAll();
            clickLobby();
        } catch (Exception e) {
            System.out.println(e);
            relaunchApp(platform);
        }
    }

    public void flutterToUnity(String platform, String... runEnv) throws InterruptedException {
        try {
            if(isHzLobbyVisible(platform)){
                System.out.println("flutterToUnity : HZ App launched");
            }
//            if (platform.contains("hzcash")) {
                clickOnRummy();
//            }
            goToPracticeTab();
            select2Player();
            //clickPlayNowBtn();
//            if(runEnv[0].equalsIgnoreCase("BS")){
                Thread clickPlayNowBtnThread = new Thread(this::clickPlayNowBtn);
                Thread setNetworkSpeedThread = new Thread(() -> setNetworkSpeedBS("4g-gprs-lossy"));
                    // Start both threads
                setNetworkSpeedThread.start();
                clickPlayNowBtnThread.start();
                    // Wait for both threads to finish
                setNetworkSpeedThread.join();
                clickPlayNowBtnThread.join(5000);


            System.out.println("Practice Rummy Game Joined at time::"+timeStamp());
            sleep(20000);
            System.out.println("Wait over after 10sec::Thread#1 isAlive="+clickPlayNowBtnThread.isAlive()+"****** Thread#2 isAlive="+setNetworkSpeedThread.isAlive());

            //Thread.sleep(6000);
            if(runEnv[0].equalsIgnoreCase("BS"))
                setNetworkSpeedBS("reset");

            searchChromeBrowser(platform,5, true);
            Thread.sleep(3000);

            if(runEnv[0].equalsIgnoreCase("BS")) {
                playYoutubeVideo(platform, 5, true);
                Thread.sleep(3000);
            }

            relaunchApp(platform);
            Thread.sleep(3000);

            if(runEnv[0].equalsIgnoreCase("BS"))
                captureScreenshot();
            randomRotation(5);
            if(runEnv[0].equalsIgnoreCase("BS"))
                setNetworkSpeedBS("2g-gprs-lossy");
            Thread.sleep(5000);
            if(runEnv[0].equalsIgnoreCase("BS"))
                setNetworkSpeedBS("reset");
            Thread.sleep(90000);
            System.out.println("90sec game finish wait completed");
            System.out.println("Practice Rummy Game Ended at time::"+timeStamp());
            if (!isRummyLobbyDisplayed()) {
                timeStamp();
                System.out.println("Something went wrong. Relaunching the app!");
                relaunchApp(platform, 1);
            }else {
                timeStamp();
                System.out.println("Rummy Lobby displayed");
            }

            clickOnHZ();

            if(isHzLobbyVisible(platform)){
                System.out.println("UnityToFlutter : Switched to HZ Lobby");
            }
        } catch (Exception e) {
            System.out.println("Exception flutterToUnity:"+ e);
        }
    }

    public void addCashJuspayFlow(String platform, String deviceIndex) throws InterruptedException {
        try {
            closeRatingPopUp();
            clickAddCashLobby();
            setNetworkSpeedBS("2g-gprs-lossy");
            selectFirstTile();
            Thread.sleep(4000);
            unCheckExpressCheckout();
            clickBackButtonAndroid();
            //clickEABackBtn();
            clickAddButton();//Not able to locate Add Cash Button (VIVO Y16)
            //tapByCoordinates(538,1837); // vivo y11
            clickSelectYourBank();
            clickAnyBankInNetBanking();
            randomRotation(5);
            Thread.sleep(8000);
            switch (platform) {
                case "android":
                    clickBackButtonAndroid();
                    clickJusPayYesCancelBtn();
                    clickBackButtonAndroid();
                    clickBackButtonAndroid();
                    ClickYes_Button();
                    clickBackButtonAndroid();
                    break;
                case "ipa":
                    clickCloseButton();
                    clickJusPayYesCancelBtn();
                    clickPaymentBackBtn();
                    clickSMBackBtn();
                    ClickYes_Button();
                    clickEABackBtn();
            }
            Thread.sleep(2000);
            setNetworkSpeedBS("reset");
        } catch (Exception e) {
            System.out.println(e);
            relaunchApp(platform);
        }
    }

    public void dropTable() throws InterruptedException {
        Thread.sleep(20000);
        final PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "FINGER");
        Point tapPoint = new Point(80, 28);
        Sequence tap = new Sequence(FINGER, 1);
        tap.addAction(FINGER.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(FINGER.createPointerMove(Duration.ofMillis(50),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));

        Thread.sleep(3000);

        final PointerInput FINGER1 = new PointerInput(PointerInput.Kind.TOUCH, "FINGER1");
        Point tapPoint1 = new Point(492, 361);
        Sequence tap1 = new Sequence(FINGER1, 1);
        tap1.addAction(FINGER1.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint1.x, tapPoint1.y));
        tap1.addAction(FINGER1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap1.addAction(FINGER1.createPointerMove(Duration.ofMillis(50),
                PointerInput.Origin.viewport(), tapPoint1.x, tapPoint1.y));
        tap1.addAction(FINGER1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap1));
    }

    public void randomRotation(int bound) throws InterruptedException {
        Random rand = new Random();
        int randomNumber = rand.nextInt(bound);
        System.out.println("Random rotation random no. ="+randomNumber);
        if (randomNumber <= 5) {
            for (int i = 0; i < randomNumber; i++) {
                try {
                    driver.rotate(ScreenOrientation.LANDSCAPE);
                } catch (Exception e) {
                    System.out.println("Exception in Method randomRotation() ");
                }
                Thread.sleep(1000);
            }
        }
    }

    public void playYoutubeVideo(String platform, int bound, boolean onlySwitchToApp) throws InterruptedException {
        Random rand = new Random();
        int randomNumber = rand.nextInt(bound);
        if(onlySwitchToApp){
            driver.activateApp("com.google.android.youtube");
        }
        else {
//            if (randomNumber <= 5) {
                driver.activateApp("com.google.android.youtube");
                try {
//                    randomRotation(bound);
                    clickSearchBtnYoutube();
                    searchVideo();
                    clickSearchIcon();
                    clickOnVideo();
                    Thread.sleep(6000);
                    driver.terminateApp("com.google.android.youtube");
                   /* switch (platform) {
                        case "ipa":
                            driver.activateApp("com.jungleerummy.jungleerummy");
                            break;
                        case "psrmg":
                            driver.activateApp("com.jungleerummy.playcashgameonline");
                            break;
                        case "native":
                            driver.activateApp("io.jungleerummy.jungleegames");
                            break;
                        case "rummy.com":
                            driver.activateApp("com.jungleerummy.playcashgameonline");
                            break;
                        case "hzcash":
                            driver.activateApp("com.howzat.howzatfantasy");
                            if (isHzLobbyVisible())
                                System.out.println("\n ReLaunch App "); //Use logging
                            else
                                System.out.println("App launch failure");
                            break;
                    }*/
                } catch (Exception e) {
//                    driver.activateApp("com.howzat.howzatfantasy");
                    System.out.println("Exception in Youtube app interaction :" + e.getMessage());
                }
            }
    }

    public void selectQAEnv(String deviceIndex) throws InterruptedException {
        if (deviceIndex.equalsIgnoreCase("2")) {
            Thread.sleep(5000);
            scrollWithCoordinates(driver, 1065, 480, 37, 480);
            tapByCoordinates(600, 1739);
        }
        if (isElementPresent(selectEnvBox)) {
            clickOnSelectEnvBox();
            clickOnQAEnv();
            clickProceedBtn();
        }
    }

    public void searchChromeBrowser(String platform, int bound, boolean onlySwitchToApp) throws InterruptedException {

            driver.activateApp("com.android.chrome");
//            driver.activateApp("com.android.chrome");
        if(!onlySwitchToApp) {
            randomRotation(bound);
            googleSearch("Map of Avenue=" + new Random().nextInt());
        }
//            driver.terminateApp("com.android.chrome");
//            relaunchApp(platform);

    }

    public void navigateToResponsibleGaming(){
        clickSideMenuButton();
        hzClickMenuItem("Responsible Gaming");
    }

    public void hzAddCashFlow(String platform, String deviceIndex) throws InterruptedException {
//        try {
            if(isRummyLobbyDisplayed())
                clickHzAddCashRumLobby();
            else
                clickHzAddCashLobby();
//            setNetworkSpeedBS("2g-gprs-lossy");
//            inputCash("5");
//            selectFirstTile();
//            Thread.sleep(4000);
//            unCheckExpressCheckout();
//            clickBackButtonAndroid();
            //clickEABackBtn();
//            clickAddButton();//Not able to locate Add Cash Button (VIVO Y16)
            //tapByCoordinates(538,1837); // vivo y11
//            if(!ContinueButton())
                ChangeButton();

            Thread.sleep(4000);
            String paymentMode = "Net Banking", selectBank = "State Bank of India";
            if(hzSelectPaymentMode(paymentMode)){
                System.out.println("Payment mode selected -"+paymentMode);
                if(hzSelectNetBankingMode(selectBank)) {
                    System.out.println("Net banking checkout page visible==" + isNetBankingLogin());
                    exitNetBankingLogin();
                    hzClosePaymentFailurePopup();
                }
                else{
                    System.out.println("Payment Bank "+selectBank+" not found");
                }

                driver.navigate().back();
                exitPaymentMode();

                driver.navigate().back();
                System.out.println("Return to lobby from Add cash EA screen");
                if(isRummyLobbyDisplayed()){
                    System.out.println("User at Rummy Lobby");
                }
                else{
                    System.out.println("User at Howzat Lobby");
                }
            }else
                System.out.println("Payment mode NOT selected -"+paymentMode);

//            randomRotation(5);
            Thread.sleep(8000);
            switch (platform) {
                case "android":
                    clickBackButtonAndroid();
                    clickJusPayYesCancelBtn();
                    clickBackButtonAndroid();
                    clickBackButtonAndroid();
                    ClickYes_Button();
                    clickBackButtonAndroid();
                    break;
                case "ipa":
                    clickCloseButton();
                    clickJusPayYesCancelBtn();
                    clickPaymentBackBtn();
                    clickSMBackBtn();
                    ClickYes_Button();
                    clickEABackBtn();
            }
            Thread.sleep(2000);
//            setNetworkSpeedBS("reset");
//        } catch (Exception e) {
//            System.out.println(e);
//            relaunchApp(platform);
//        }
    }

    public void navigateToHzPromotion(){
        if(clickHzPromotionBox())
        {
            System.out.println("Navigated to Hz Promotion Box");
            sleep(5000);
            if(!isElementPresent(fantasyTabPSCash))
                clickBackButtonAndroid();
            System.out.println("Navigated back to Hz Lobby");
        }
        else {
            System.out.println("Navigated to Responsible Gaming Menu =");navigateToResponsibleGaming();
        }

    }

    public void navigateToGSTPolicy(){
        clickSideMenuHowzat();
        hzClickMenuItem("New GST Policy");
        System.out.println("GST POLICY PAGE==="+getWebViewContentGSTPolicy());
    }

    public void navigateRefEarnPlayVideo(){
        clickReferAndEarnBottomTray();
        clickReferAndEarnHowItWorksVideo();
        sleep(2000);
        clickReferAndEarnHowItWorksVideo();
        clickHowItWorks();
    }


}