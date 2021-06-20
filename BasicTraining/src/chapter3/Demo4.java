package chapter3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Demo4 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
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


        Constructor[] conts = clazz1.getDeclaredConstructors();
        for(Constructor c : conts){
            System.out.println(c.getName());
        }
        System.out.println("----------------");
        Method[] meths = clazz1.getDeclaredMethods();
        for(Method m : meths){
            System.out.println(m.getName());
        }
        System.out.println("-----------------");
        Field[] fields = clazz1.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f.getName());
        }
        //得到Test类中的print()方法
        Method m1 = clazz1.getMethod("print");
        m1.invoke(test);

        //得到Test类中的print(String str)方法
        Method m2 = clazz2.getMethod("print", java.lang.String.class);
        m2.invoke(test, "passedParameter");

        Constructor con = clazz1.getConstructor();
       Test test2 = (Test) con.newInstance();
       // 创造java实例有几种方式
        /**
         * 1. new
         * 2. java.lang.Class.newInstance();
         * 3. java.lang.reflect.Constructor.newInstance();
         */
        System.out.println("----------------");
        tradePlus();

    }

    private static void tradePlus() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz = Test.class;
        Method m = clazz.getMethod("trade");
        System.out.println(new Date());
        m.invoke(clazz.newInstance());
    }
}
