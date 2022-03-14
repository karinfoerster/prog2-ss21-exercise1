package at.ac.fhcampuswien;

public class Password {
    public boolean checkPassword(String password) {
        return password != null
                && checkLength(password);

    }

    public boolean checkLength(String password)
    {
        return password.length() >= 8 && password.length() <= 25;
    }

}