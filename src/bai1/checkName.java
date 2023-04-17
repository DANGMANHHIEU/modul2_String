package bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkName {
    private static final String check_name="^[CAP]\\d{4}[GHIK]$";
    public checkName(){}
    public boolean check(String regex){
        Pattern p= Pattern.compile(check_name);
        Matcher m = p.matcher(regex);
        return m.matches();
    }
}
