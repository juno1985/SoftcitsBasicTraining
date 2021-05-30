package chapter1;

public enum Gender {

    MALE("male"),FEMALE("female");

    private String gender;

    //枚举类的构造器一定是private修饰的,并且默认就是private
    Gender(String gender) {
        this.gender = gender;
        System.out.println("Gender constructor is invoked: " + gender);
    }
}
