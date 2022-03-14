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

}
