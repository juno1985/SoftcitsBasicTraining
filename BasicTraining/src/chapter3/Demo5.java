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
            String result = "";
            int str_len = s1.length();
            int blank_len = 15 - str_len;
            result += s1;
            for (int j = 1; j <= blank_len; j++) {
                result += " ";
            }

            String x_str = Integer.toString(x);
            if(x_str.length() == 1)
                x_str = "00" + x_str;
            else if(x_str.length() == 2)
                x_str = "0" + x_str;

            System.out.println(result + x_str);
        }
        System.out.println("================================");

    }
}
