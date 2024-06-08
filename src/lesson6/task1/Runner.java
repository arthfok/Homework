package lesson6.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    public static void main(String[] args) {
        System.out.println(authorization("Author","Abcdfg1", "Abcdfg1"));
    }

    public static boolean authorization(String login, String password, String confirmPassword) {
        Pattern passwordPattern = Pattern.compile("^(?=.*\\d)\\S{1,20}$");
        Pattern loginPattern = Pattern.compile("^\\S{1,20}$");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        Matcher loginMatcher = loginPattern.matcher(login);

        
        if (!loginMatcher.matches()) {
            throw new WrongLoginException("Invalid login");
        }

        if (!passwordMatcher.matches()) {
            throw new WrongPasswordException("Invalid password");
        }

        return password.equals(confirmPassword);
    }
}
