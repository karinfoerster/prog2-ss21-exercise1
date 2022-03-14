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
}
