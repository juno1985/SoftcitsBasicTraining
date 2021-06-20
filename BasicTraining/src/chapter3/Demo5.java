package chapter3;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

            String prefix = String.format("%-15s", s1);
            String suffix = String.format("%03d", x);
            System.out.println(prefix + suffix);
        }
        System.out.println("================================");

    }
}
