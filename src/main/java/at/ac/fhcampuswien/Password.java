package at.ac.fhcampuswien;

public class Password {
    public boolean checkPassword(String password) {
        return password != null
                && checkLength(password)
                && containsNumber(password);

    }

    public boolean checkLength(String password)
    {
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean containsNumber(String password)
    {
        return password.matches(".*\\d.*");
    }

}