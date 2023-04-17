package bai1;

public class Test {
    public static void main(String[] args) {
        String[] s1={"C0223G", "A0323K"};
        String[] s2={" M0318G", "P0323A"};
        checkName checkName=new checkName();

        System.out.println("Kiểm tra s1:");
        for(String e:s1){
            boolean n= checkName.check(e);
            System.out.println(n);
        }
        System.out.println("Kiểm tra s2:");
        for (String e:s2){
            boolean n = checkName.check(e);
            System.out.println(n);
        }
    }
}
