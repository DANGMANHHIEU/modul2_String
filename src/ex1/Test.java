package ex1;

public class Test {
    public static void main(String[] args) {
        checkEmail c1=new checkEmail();
        String[] str1={"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        String[] str2={"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

        System.out.println("Kiểm tra str1:");
        for(String e:str1){
            boolean checkStr1=c1.validate(e);
            System.out.println(checkStr1);
        }
        System.out.println();
        System.out.println("Kiểm tra str2:");
        for (String e:str2){
            boolean checkStr2=c1.validate(e);
            System.out.println(checkStr2);
        }
    }
}
