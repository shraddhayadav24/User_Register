import org.example.InvalidUserDetailExecption;
import org.example.User_Registration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



public class User_RegristrationTest {

    User_Registration userRegistration=new User_Registration();

    @Test
    public void checkFirstName(){
        try {
            String result= userRegistration.firstname("Shraddha");
            Assert.assertEquals(result, "Happy");
        }catch (InvalidUserDetailExecption e){
            System.out.println("Execption occurs" + e);
        }

    }

    @Test
    public void checkLastName(){
        try {
            String result=userRegistration.lastname("Yadav");
            Assert.assertEquals(result,"Happy");
        }catch (InvalidUserDetailExecption e){
            System.out.println("Execption Occurs" + e);
        }

    }

    @Test
    public void checkEmail(){
        try {
            String result= userRegistration.email("shraddhayadav@mail.com");
            Assert.assertEquals(result, "Happy");
        }catch (InvalidUserDetailExecption e){
            System.out.println("Execption Occurs" + e);
        }

    }

    @Test
    public void checkPhoneno(){
        try{
            String result=userRegistration.phoneNo("91 1234566783");
            Assert.assertEquals(result,"Happy");
        }catch (InvalidUserDetailExecption e){
            System.out.println("Execption occurs" + e);
        }
    }

    @Test
    public void checkPassword(){
        try {
            String result=userRegistration.passwordCharacter("Shraddha@24");
            Assert.assertEquals(result, "Happy");
        }catch (InvalidUserDetailExecption e){
            System.out.println("Execption occurs" + e);
        }
    }


    @ParameterizedTest
    @ValueSource(strings={
            "test@gmail.com",
            "testexample@gmail.com",
            "test-test@gmail.com",
            "test.example@gmail.com"
    })
    public void ValidEmail(String email){
        String result = userRegistration.email(email);
        Assert.assertEquals(result,"Happy");
    }
}
