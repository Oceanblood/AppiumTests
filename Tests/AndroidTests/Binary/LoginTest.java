package AndroidTests.Binary;

import Utils.Currency;
import helper.APIv2Helper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.Android.Binary.LoginLayout;
import pages.Android.Binary.MainLayout;
import pages.Android.Binary.TutorialLayout;
import selenium.AndroidBaseTest;
import selenium.Waiter;

public class LoginTest extends AndroidBaseTest {
    LoginLayout loginLayout;
    MainLayout mainLayout;
    Waiter waiter;
    TutorialLayout tutorialLayout;
    APIv2Helper userHelper;

    @Before
    public void before() {
        loginLayout = new LoginLayout(driver);
        mainLayout = new MainLayout(driver);
        waiter = new Waiter(driver);
        tutorialLayout = new TutorialLayout(driver);
        userHelper = new APIv2Helper();
    }

    @Test
    public void correctLogin(){
        userHelper.registerAndroidUser("asdasd@yandex.ru", Currency.USD.toString());
        loginLayout.login("asdasd@yandex.ru","123123");
        tutorialLayout.closeTutorial();
        Assert.assertTrue(waiter.checkForMobileElementPresent(mainLayout.getBalancePnl()));
    }


    @Test
    public void invalidEmailCheckWarning() {
        loginLayout.clickSighInBtn();
        loginLayout.login("i.belchenkov@space307.com", "qwerty");
        Assert.assertTrue(waiter.checkForMobileElementPresent(loginLayout.getWarningText()));
    }

    @Test
    public void invalidPasswordCheckWarning() {
        loginLayout.clickSighInBtn();
        loginLayout.login("i.belchenko@space307.com", "qwerty678");
        Assert.assertTrue(waiter.checkForMobileElementPresent(loginLayout.getWarningText()));
    }
}

