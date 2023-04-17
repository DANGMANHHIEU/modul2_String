package bai2;

public class Test {
    public static void main(String[] args) {
        String[] s1 = {"(84)-(0978489648)"};
        String[] s2={"(a8)-(22222222)"," (84)-(22b22222)", "(84)-(9978489648)"};
        Phone phone=new Phone();
        System.out.println("Kiểm tra s1:");
        for(String e:s1){
            boolean n = phone.checkPhone(e);
            System.out.println(n);
        }
        System.out.println("Kiểm tra s2:");
        for (String e:s2){
            boolean n = phone.checkPhone(e);
            System.out.println(n);
        }
    }
}
