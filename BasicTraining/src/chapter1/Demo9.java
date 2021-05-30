package chapter1;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ints = new int[3];
        for (int i = 0; i < 3; i++) {
            ints[i] = scan.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(ints[i]);
        }
    }
}
