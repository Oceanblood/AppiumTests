package AndroidTests.CFD;

import org.junit.Before;
import org.junit.Test;
import pages.Android.CFD.RegistrationLayout;
import selenium.AndroidBaseTest;
import selenium.Waiter;

public class RegistrationTest extends AndroidBaseTest {

   RegistrationLayout registartionLayout;
   Waiter waiter;

   @Before
   public void before(){

      registartionLayout = new RegistrationLayout(this.driver);
      waiter = new Waiter(driver);



   }



   @Test
   public void  CorrecRegistration(){
      registartionLayout.FullRegistration("i.pop1ka@gmail.com","qwerty");

   }











}
