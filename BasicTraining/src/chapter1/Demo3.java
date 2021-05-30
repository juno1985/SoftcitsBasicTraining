package chapter1;

public class Demo3 {

    static final String str;

    static{
        str = "aaa";
        System.out.println("static code stub is invoked");
    }

    public Demo3() {
        System.out.println("constructor is invoked");
    }

    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        Demo3 d2 = new Demo3();
    }
}
