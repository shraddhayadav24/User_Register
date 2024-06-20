import org.example.User_Registration;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.PanelUI;

public class User_RegristrationTest {

    User_Registration userRegistration=new User_Registration();

    @Test
    public void checkFirstName(){
       String result= userRegistration.firstname("Shraddha");
        Assert.assertEquals(result, "Happy");
    }

    @Test
    public void checkLastName(){
       String result=userRegistration.lastname("Yadav");
       Assert.assertEquals(result,"Happy");

    }

    @Test
    public void checkEmail(){
       String result= userRegistration.email("shraddhayadav@mail.com");
        Assert.assertEquals(result, "Happy");
    }

    @Test
    public void checkPhoneno(){
        String result=userRegistration.phoneNo("91 1234566783");
        Assert.assertEquals(result,"Happy");

    }

    @Test
    public void checkPassword(){
        String result=userRegistration.passwordCharacter("Shraddha@24");
        Assert.assertEquals(result, "Happy");
    }

    @Test
    public void checkFirstNameInvalid(){
        String result= userRegistration.firstname("S");
        Assert.assertEquals(result, "Sad");
    }

   @Test
    public void checkLastNameInvalid(){
        String result=userRegistration.lastname("yADav");
        Assert.assertEquals(result,"Sad");
    }

    @Test
    public void checkEmailInvalid(){
        String result=userRegistration.email("shtenede");
        Assert.assertEquals(result, "Sad");
    }

    @Test
    public void checkPhoneNoInvalid(){
        String result=userRegistration.phoneNo("53648478");
        Assert.assertEquals(result,"Sad");
    }

    @Test
    public void checkPsswordInvalid(){
        String result=userRegistration.passwordCharacter("4bbyji7u");
        Assert.assertEquals(result,"Sad");
    }
}
