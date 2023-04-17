package ex2;

public class Test {
    public static void main(String[] args) {
        String[] s1=new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
        String[] s2=new String[]{".@", "12345", "1234_", "abcde"};

        AccountExample c=new AccountExample();
        System.out.println("Kiểm tra s1:");
        for(String e:s1){
            boolean check= c.validate(e);
            System.out.println(check);
        }
        System.out.println("Kiểm tra s2:");
        for(String e:s2){
            boolean check=c.validate(e);
            System.out.println(check);
        }
    }
}
