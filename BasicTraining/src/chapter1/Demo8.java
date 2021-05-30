package chapter1;

public class Demo8 {

    public static void main(String[] args) {
        // 1
        Season[] seasonArray = Season.values();
        for (int i = 0; i < seasonArray.length; i++) {
            Season s = seasonArray[i];
            System.out.println(s.name());
        }
        // 2
        for (Season s : Season.values()){
            System.out.println(s.name());
        }
    }
}
