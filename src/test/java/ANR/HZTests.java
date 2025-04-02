package ANR;

import baseTest.BaseTest;
import org.testng.annotations.*;

import java.time.LocalDateTime;

public class HZTests extends BaseTest {

    String deviceIndex = "-1";
    String platform = "";
    String runEnv = props.getProperty("runEnv");
    int noOfIterations = 35;
    int appLaunchFrequency = 0;
    int reloadChipsFrequency = Integer.MAX_VALUE;
    int switchToOtherApps = 1;
    int F2UFrequency = 0;
    int F2WebViewFrequency = 0;
    int addCashFrequency = 1;

    int bound = 5;
    @BeforeMethod(alwaysRun = true)
    @Parameters(value = {"deviceIndex","appType"})
    public void setup(String deviceIndex,@Optional(value="hzcash") String appType) {
        try {
            this.deviceIndex = deviceIndex;
            platform = appType;
            setAppPackageName(appType);
            if(runEnv.equalsIgnoreCase("local")) {
                driver = initAppiumDriver();
            } else {
                driver = launchBSDriverMultipleDevices(deviceIndex, appType);
            }
        } catch (Exception e) {
            System.out.println("Exception in setup method"+e);
            throw new RuntimeException(e);
        }
    }

    @Test
    @Parameters(value = {"deviceIndex", "appType"})
    public void HZAnrTests() throws InterruptedException {
//        flows.relaunchApp(platform);
        if(!runEnv.equalsIgnoreCase("local"))
            flows.hzLoginUser(platform, deviceIndex);

        for (int i = 1; i <= noOfIterations; i++) {
            System.out.println("Restart flows in Iteration =" + i + " at time="+ flows.timeStamp()); //Use logging
            try {
//                flows.navigateToHzPromotion();
                if(i % 2 == switchToOtherApps){
                    System.out.println("\n ****** switchToOtherApps Flow started Iteration i ="+i);
//                    if(runEnv.equalsIgnoreCase("local") || platform.equalsIgnoreCase("hzpscash")) {
                    flows.searchChromeBrowser(platform, 2,false);
                    flows.playYoutubeVideo(platform,2,true);
//                    }
                    System.out.println("\n ****** Play Youtube and Search Chrome browser passed in Iteration -"+i);
                }

                if (i % 2 == addCashFrequency) {
                    System.out.println("\n ****** addCashFrequency Flow started Iteration i ="+i);
                    flows.relaunchApp(platform);
                    System.out.println("Device Rotation Before Add Cash!");
//                    flows.randomRotation(bound);
//                    flows.addCashJuspayFlow(platform, deviceIndex);
                    flows.hzAddCashFlow(platform,deviceIndex);
                    System.out.println("\n ****** ADD CASH passed in Iteration -"+i);
                }

                if(i % 2 == F2WebViewFrequency){
                    System.out.println("\n ****** Flutter2WebView Flow started Iteration i ="+i);
                    flows.relaunchApp(platform);
                    flows.navigateToGSTPolicy();
                    flows.clickBackButtonAndroid();

//                    flows.removeContactsNudge();
                    flows.navigateRefEarnPlayVideo();
                    flows.clickBackButtonAndroid();
                    System.out.println("\n ****** Flutter2WebView Flow passed in Iteration i ="+i);
                }

                if (i % 3 == F2UFrequency) {
                    System.out.println("\n ****** Flutter2Unity Flow started Iteration i ="+i);
                    flows.relaunchApp(platform);
                    try {
                        flows.flutterToUnity(platform, runEnv);
                    } catch (InterruptedException e) {
                        System.out.println("Flutter game didnt load ");
                        flows.relaunchApp(platform, 1);
                    }
                    System.out.println("\n ****** Play practice rummy game passed in Iteration i ="+i);
                }

                if (i % 3 == appLaunchFrequency) {
                    System.out.println("\n ****** appLaunchFrequency Flow started - Time="+ LocalDateTime.now());
//                    flows.relaunchApp(platform);
                    flows.relaunchApp(platform, 1);
                    if(flows.isHzLobbyVisible(platform))
                        System.out.println("\n ****** App re-launch passed in Iteration -"+i);
                    else {
                        System.out.println("\n ****** App re-launch ANR in Iteration -"+i + " at time ="+flows.timeStamp());
                    }
                }

                if (i % 6 == reloadChipsFrequency ) {
                    System.out.println("\n ****** reloadChipsFrequency Flow started ****** ");
                    flows.reloadChips();
                }

                System.out.println("\n ****** Testcase Passed with All Condition, " +
                        "Iteration i ="+i + " at time=="+flows.timeStamp());
            } catch (Exception e) {
                System.out.println("\n ****** Exception In Iteration =" + i + "\n" + e);
//                flows.relaunchApp(platform, 1);
            }
        }
    }

    @AfterSuite(alwaysRun=true)
    public void tearDown() throws Exception {
        // Invoke driver.quit() to indicate that the test is completed.
        // Otherwise, it will appear as timed out on BrowserStack.
        if (driver != null) {
            System.out.println("\nQuit driver");
            //            resetApp();
            driver.quit();
        }
        if (service != null) {
            System.out.println("\nAppium service stop");
            service.stop();
        }
    }

}