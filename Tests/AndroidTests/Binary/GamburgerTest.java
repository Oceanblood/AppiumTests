package AndroidTests.Binary;

import helper.APIv2Helper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.Android.Binary.*;
import selenium.AndroidBaseTest;
import selenium.Waiter;



    public class GamburgerTest extends AndroidBaseTest {
        LoginLayout loginLayout;
        MainLayout mainLayout;
        Waiter waiter;
        TutorialLayout tutorialLayout;
        APIv2Helper userHelper;
        ProfileLayout profileLayout;
        GamburgerLayout gamburgerLayout;
        MakeDepositLayout makeDepositLayout;





        @Before
        public void before() {
            loginLayout = new LoginLayout(driver);
            mainLayout = new MainLayout(driver);
            waiter = new Waiter(driver);
            tutorialLayout = new TutorialLayout(driver);
            userHelper = new APIv2Helper();
            profileLayout = new ProfileLayout(driver);
            gamburgerLayout = new GamburgerLayout(driver);
            makeDepositLayout = new MakeDepositLayout(driver);
            loginLayout.login("i.belchenko@space307.com", "qwerty");
            tutorialLayout.closeTutorial();
            mainLayout.clickOnSndwBtn();
        }



        @Test
        public void switchDemoOnRealAccountTest() {
            gamburgerLayout.swictAccount("Demo account");
           Assert.assertTrue(mainLayout.getBalancePnl().isDisplayed());
        }


        @Test
        public void howToTradeTest(){
            gamburgerLayout.clickOnGamburgerElement("How to trade?");
            Assert.assertTrue(tutorialLayout.getVideoPlayBtn().isDisplayed());
        }


        @Test
        public void educationTest(){
            gamburgerLayout.clickOnGamburgerElement("Education");
            Assert.assertTrue(gamburgerLayout.checkCurrentPage("Education"));
        }



        @Test
        public void makeDepositTest(){
            gamburgerLayout.clickOnGamburgerElement("Make a deposit");
            makeDepositLayout.CheckFirstPresentBtn();


        }



        @Test
        public void vivodTest(){
            gamburgerLayout.clickOnGamburgerElement("Withdrawal");
            Assert.assertTrue(gamburgerLayout.checkCurrentPage("MONEY WITHDRAWAL REQUEST "));
        }

        @Test
        public void myTradesTest(){
            gamburgerLayout.clickOnGamburgerElement("My Trades");
        }

        @Test
        public void profileTest(){
            gamburgerLayout.clickOnGamburgerElement("Profile");
            profileLayout.userIdCheck();
        }


        @Test
        public void kotirovkiTest(){
            gamburgerLayout.clickOnGamburgerElement("Quotes");
        }


        @Test
        public void settingsTest(){
            gamburgerLayout.clickOnGamburgerElement("Settings");
        }


        @Test
        public void clientSupport(){
            gamburgerLayout.clickOnGamburgerElement("Client Support");
        }


        @Test
        public void legalInformationTest(){
            gamburgerLayout.clickOnGamburgerElement("Legal Information");
        }


        @Test
        public void aboutUsTest(){
            gamburgerLayout.clickOnGamburgerElement("About us");
        }


        @Test
        public void signOffTest(){
            gamburgerLayout.clickOnGamburgerElement("Sign off");
        }












}
