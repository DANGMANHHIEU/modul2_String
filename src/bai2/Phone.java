package bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private static final String phone="^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public Phone(){}
    public boolean checkPhone(String regex){
        Pattern p = Pattern.compile(phone);
        Matcher m = p.matcher(regex);
        return m.matches();
    }
}
