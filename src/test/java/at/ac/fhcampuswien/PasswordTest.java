package at.ac.fhcampuswien;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    //Password.checkPassword Tests
    @Test
    public void validPassword1()
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password01!!");
        assertTrue(result);
    }

    @Test
    public void validPassword2()
    {
        Password password = new Password();
        boolean result = password.checkPassword("pAsSword23//");
        assertTrue(result);
    }

    @Test
    public void tooShort() {
        Password password = new Password();
        boolean result = password.checkPassword("Spw1!!");
        assertFalse(result);
    }

    @Test
    public void tooLong()
    {
        Password password = new Password();
        boolean result = password.checkPassword("SorryThisPasswordIsTooLong87!!");
        assertFalse(result);
    }

    @Test
    public void noUppercase()
    {
        Password password = new Password();
        boolean result = password.checkPassword("password0131!!");
        assertFalse(result);
    }

    @Test
    public void noLowercase()
    {
        Password password = new Password();
        boolean result = password.checkPassword("THISISMYPASSWORD24!!");
        assertFalse(result);
    }

    @Test
    public void noNumbers()
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password!!");
        assertFalse(result);
    }

    @Test
    public void noSpecialCharacters()
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password3125");
        assertFalse(result);
    }

    @Test
    public void hasSequenceNumber()
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password1234!!");
        assertFalse(result);
    }

    @Test
    public void numbersRepeat()
    {
        Password password = new Password();
        boolean result = password.checkPassword("Password7777!!");
        assertFalse(result);
    }

    @Test
    public void checkLengthValid()
    {
        Password password = new Password();
        boolean result = password.checkLength("24973807");
        assertTrue(result);
    }

    @Test
    public void containsValidNumber()
    {
        Password password = new Password();
        boolean result = password.containsNumber("Password01!!");
        assertTrue(result);
    }

    @Test
    public void containsMissingNumber()
    {
        Password password = new Password();
        boolean result = password.containsNumber("Password!!");
        assertFalse(result);
    }

    @Test
    public void containsValidLowerAndUppercase()
    {
        Password password = new Password();
        boolean result = password.containsLowerAndUppercase("Password01!!");
        assertTrue(result);
    }

    @Test
    public void  containsFailedLowerAndUppercase1()
    {
        Password password = new Password();
        boolean result = password.containsLowerAndUppercase("password01!!");
        assertFalse(result);
    }

    @Test
    public void containsFailedLowerAndUppercase2()
    {
        Password password = new Password();
        boolean result = password.containsLowerAndUppercase("PASSWORD01!!");
        assertFalse(result);
    }

    @Test
    public void containsSpecialCharValid()
    {
        Password password = new Password();
        boolean result = password.containsSpecialChar("Password01!!");
        assertTrue(result);
    }

    @Test
    public void containsSpecialCharFailed()
    {
        Password password = new Password();
        boolean result = password.containsSpecialChar("Password01");
        assertFalse(result);
    }

    @Test
    public void hasSequenceNumberValid()
    {
        Password password = new Password();
        boolean result = password.hasNoSequenceNumber("Password01!!");
        assertTrue(result);
    }

    @Test
    public void hasSequenceNumberFailed()
    {
        Password password = new Password();
        boolean result = password.hasNoSequenceNumber("Password012!!");
        assertFalse(result);
    }

}
