package ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkEmail {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Email_Regex="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public checkEmail(){
        pattern=Pattern.compile(Email_Regex);
    }
   public boolean validate(String regex){
        matcher= pattern.matcher(regex);
        return matcher.matches();
   }

}
