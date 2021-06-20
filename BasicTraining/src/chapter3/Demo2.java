package chapter3;

public class Demo2 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Demo1 demo1 = new Demo1();
        demo1.print();

        System.out.println("------------------------");

        //生成Demo1的类型对象
        Class<?> clazz = Demo1.class;
        //生成Demo1的对象
        Demo1 demo2 = (Demo1) clazz.newInstance();
        demo2.print();
    }

}
