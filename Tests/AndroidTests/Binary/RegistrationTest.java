package AndroidTests.Binary;

import Utils.UsersUtils;
import org.junit.Before;
import org.junit.Test;
import pages.Android.Binary.LoginLayout;
import pages.Android.Binary.MainLayout;
import pages.Android.Binary.RegistrationLayout;
import pages.Android.Binary.TutorialLayout;
import selenium.AndroidBaseTest;
import selenium.Waiter;



public class RegistrationTest extends AndroidBaseTest {
    LoginLayout loginLayout;
    MainLayout mainLayout;
    Waiter waiter;
    RegistrationLayout registrationLayout;
    TutorialLayout tutorialLayout;
    private String user;

    @Before
    public void before() {
        loginLayout = new LoginLayout(driver);
        mainLayout = new MainLayout(driver);
        waiter = new Waiter(driver);
        registrationLayout = new RegistrationLayout(driver);
        tutorialLayout = new TutorialLayout(driver);
        user = UsersUtils.getEmail();
    }

    @Test
    public void correctRegNewUser() {
        loginLayout.startRegBtnClick();
        registrationLayout.fullRegistration(user, "qwerty");
        registrationLayout.closeWarningImage();
        tutorialLayout.closeTutorial();
       // mainLayout.RisksChecker();
    }

    @Test
    public void checkWarningOfExistUser() {
        loginLayout.startRegBtnClick();
        registrationLayout.fullRegistration("i.belchenko@space307.com", "qwerty");
        registrationLayout.closeWarningImage();
    }

    @Test
    public void regOnLoginScreen() {
        loginLayout.regFromLogin();
        registrationLayout.fullRegistration(user, "qwerty");
        tutorialLayout.closeTutorial();
        mainLayout.CheckIfDownBtnPresent();
    }



}




