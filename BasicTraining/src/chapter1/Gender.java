package chapter1;

public enum Gender {

    MALE("male"),FEMALE("female");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
        System.out.println("Gender constructor is invoked: " + gender);
    }
}
