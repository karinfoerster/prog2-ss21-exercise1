package at.ac.fhcampuswien;

public class Password {
    public boolean checkPassword(String password) {
        return password != null
                && checkLength(password)
                && containsNumber(password)
                && hasNoRepeatNumbers(password);

    }

    public boolean checkLength(String password)
    {
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean containsNumber(String password)
    {
        return password.matches(".*\\d.*");
    }

    public boolean hasNoRepeatNumbers(String password)
    {
        if (password == null)
        {
            return false;
        }
        char[] chars = password.toCharArray();

        char helper = 0;
        int counter = 0;
        for (char c : chars)
        {
            if (Character.isDigit(c))
            {
                if (helper == 0)
                {
                    helper = c;
                    counter++;
                }
                else if (c == helper)
                {
                    counter++;
                }
                else
                {
                    counter = 0;
                }
                if (counter == 3)
                {
                    return false;
                }
            } else {
                counter = 0;
            }
        }
        return true;
    }

}