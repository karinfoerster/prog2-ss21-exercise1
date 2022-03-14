package at.ac.fhcampuswien;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    //Password.checkPassword Tests
    @Test
    public void validPassword1() //checking from a valid password
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password01!!");
        assertTrue(result);
    }

    @Test
    public void validPassword2() //example and checking a correct password
    {
        Password password = new Password();
        boolean result = password.checkPassword("pAsSword23//!!");
        assertTrue(result);
    }

    @Test
    public void tooShort() //testing if the password is too short
    {
        Password password = new Password();
        boolean result = password.checkPassword("Spw1!!");
        assertFalse(result);
    }

    @Test
    public void tooLong() //testing if the password is too long
    {
        Password password = new Password();
        boolean result = password.checkPassword("SorryThisPasswordIsTooLong87!!");
        assertFalse(result);
    }

    @Test
    public void noUppercase() //testcase for password without uppercase
    {
        Password password = new Password();
        boolean result = password.checkPassword("password0131!!");
        assertFalse(result);
    }

    @Test
    public void noLowercase() //testcase for password without lowercase
    {
        Password password = new Password();
        boolean result = password.checkPassword("THISISMYPASSWORD24!!");
        assertFalse(result);
    }

    @Test
    public void noNumbers() //testcase for password without a number
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password!!");
        assertFalse(result);
    }

    @Test
    public void noSpecialCharacters() //testcase for password without a special character
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password3125");
        assertFalse(result);
    }

    @Test
    public void hasSequenceNumber() //testing if there is a sequence number in the password
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password1234!!");
        assertFalse(result);
    }

    @Test
    public void numbersRepeat() //testcase to check if there is a repeating number
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password7777!!");
        assertFalse(result);
    }

    @Test
    public void checkLengthValid() //test to check if the length is valid
    {
        Password password = new Password();
        boolean result = password.checkLength("24973807");
        assertTrue(result);
    }

    @Test
    public void containsValidNumber() //testcase to check if the number valid
    {
        Password password = new Password();
        boolean result = password.containsNumber("Password01!!");
        assertTrue(result);
    }

    @Test
    public void containsMissingNumber() //testcase if there is a missing number
    {
        Password password = new Password();
        boolean result = password.containsNumber("Password!!");
        assertFalse(result);
    }

    @Test
    public void containsValidLowerAndUppercase() //test to check if there are lower and uppercase in the password
    {
        Password password = new Password();
        boolean result = password.containsLowerAndUppercase("Password01!!");
        assertTrue(result);
    }

    @Test
    public void  containsFailedLowerAndUppercase1() //test if there is no uppercase
    {
        Password password = new Password();
        boolean result = password.containsLowerAndUppercase("password01!!");
        assertFalse(result);
    }

    @Test
    public void containsFailedLowerAndUppercase2() //test for missing lowercase
    {
        Password password = new Password();
        boolean result = password.containsLowerAndUppercase("PASSWORD01!!");
        assertFalse(result);
    }

    @Test
    public void containsSpecialCharValid() //checks if there is a special char in the password
    {
        Password password = new Password();
        boolean result = password.containsSpecialChar("Password01!!");
        assertTrue(result);
    }

    @Test
    public void containsSpecialCharFailed() //testcase for missing char in the password
    {
        Password password = new Password();
        boolean result = password.containsSpecialChar("Password01");
        assertFalse(result);
    }

    @Test
    public void hasSequenceNumberValid() //testcase to check if there is a sequence number in the password
    {
        Password password = new Password();
        boolean result = password.hasNoSequenceNumber("Password01!!");
        assertTrue(result);
    }

    @Test
    public void hasSequenceNumberFailed() //testcase with a sequence number
    {
        Password password = new Password();
        boolean result = password.hasNoSequenceNumber("Password012!!");
        assertFalse(result);
    }

    @Test
    public void hasNoRepeatNumberValid() //testcase without a repeating number
    {
        Password password = new Password();
        boolean result = password.hasNoRepeatNumbers("Password01!!");
        assertTrue(result);
    }

    @Test
    public void hasNoRepeatNumberFailed() //testcase with a repeating number
    {
        Password password = new Password();
        boolean result = password.hasNoRepeatNumbers("Password7777!!");
        assertFalse(result);
    }

}
