package chapter3;

public class Demo4 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //通过反射生成一个类型对象
        // 1
        Class<?> clazz1 = Test.class;

        //2
        Class<?> clazz2 = Class.forName("chapter3.Test");

        //3
        Test test = new Test();
//        Test test = (Test) clazz1.newInstance();
        Class<?> clazz3 = test.getClass();

        Test test1 = (Test) clazz3.newInstance();

       // System.out.println(test == test1);
        System.out.println(clazz1.isInstance(test));
        System.out.println(Object.class.isInstance(test));
        System.out.println(clazz1.isInterface());
        System.out.println(ExtraAudit.class.isInterface());

        int[] arrInt = new int[5];

        System.out.println(arrInt.getClass().isArray());
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getClassLoader());
    }
}
