package chapter4;


import java.lang.reflect.Field;

public class Person {

    @MyAnnotation
    private int legsNum;

    private String name;
    @Deprecated
    public void printName(){
        System.out.println(this.name);
    }

    public String printNameNew(){
        return this.name;
    }

    public void setLegsNum(int legsNum) {
        this.legsNum = legsNum;
    }

    public int getLegsNum() {
        return legsNum;
    }

    public static void main(String[] args) throws Exception{
        Person p1 = new Person();

        Class<Person> clazz = (Class<Person>) p1.getClass();
        Field field = clazz.getDeclaredField("legsNum");
        MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
        int defaultLegs = myAnnotation.legs();

        p1.setLegsNum(defaultLegs);

        System.out.println("Person 默认有几条腿: " + p1.legsNum);
    }

}
