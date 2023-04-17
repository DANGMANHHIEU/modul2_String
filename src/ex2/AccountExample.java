package ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String Account_Example="^[_a-z0-9]{6,}$";
    public AccountExample(){
    }
    public boolean validate(String regex){
        Pattern pattern= Pattern.compile(Account_Example);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
