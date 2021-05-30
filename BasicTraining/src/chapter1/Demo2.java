package chapter1;

public class Demo2 {

    static String static_str;
    String obj_str;
    public static void main(String[] args) {

        Demo2.static_str = "abc";

        //Demo2.obj_str = "abc";
        Demo2  d1 = new Demo2();
        d1.obj_str = "aaa";
        Demo2 d2 = new Demo2();
        d2.obj_str = "bbb";

        System.out.println(d1.obj_str);
        System.out.println(d2.obj_str);
        System.out.println(Demo2.static_str);
    }
}
