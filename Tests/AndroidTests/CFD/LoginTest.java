package AndroidTests.CFD;

import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.Test;
import pages.Android.Binary.RegistrationLayout;
import pages.Android.CFD.LoginLayout;
import selenium.AndroidBaseTest;
import selenium.Waiter;

public class LoginTest extends AndroidBaseTest {

    LoginLayout loginLayout;
    Waiter waiter;
    RegistrationLayout registrationLayout;

    @Before
    public  void before(){
        loginLayout = new LoginLayout(driver);
        waiter = new Waiter(driver);
        registrationLayout = new RegistrationLayout(driver);
    }

    @Test
    public  void correctLogIn(){

        loginLayout.correctLogin("pepememespace@gmail.com","qwerty");
    }



































}
