package AndroidTests.Binary;

import helper.APIv2Helper;
import helper.AndroidHelper;
import org.junit.Before;
import org.junit.Test;
import pages.Android.Binary.*;
import selenium.AndroidBaseTest;
import selenium.Waiter;

public class ProfileTest extends AndroidBaseTest {
    LoginLayout loginLayout;
    MainLayout mainLayout;
    Waiter waiter;
    TutorialLayout tutorialLayout;
    APIv2Helper userHelper;
    ProfileLayout profileLayout;
    GamburgerLayout gamburgerLayout;

    @Before
    public void before() {
        loginLayout = new LoginLayout(driver);
        mainLayout = new MainLayout(driver);
        waiter = new Waiter(driver);
        tutorialLayout = new TutorialLayout(driver);
        userHelper = new APIv2Helper();
        profileLayout = new ProfileLayout(driver);
        gamburgerLayout = new GamburgerLayout(driver);
        loginLayout.login("i.belchenko@space307.com","qwerty");
        tutorialLayout.closeTutorial();
        AndroidHelper.executeScriptWithoutReturn(AndroidHelper.Activity.PROFILE_SCRIPT.getScript());
    }

    @Test
    public void changeUserName(){
        profileLayout.changeName("plokonsу3");
    }
    @Test
    public void changeUserLastName(){
        profileLayout.changeLastName("lolkaк4");
    }

    @Test
    public void choseMale(){
        profileLayout.choseMale();
    }


























}



