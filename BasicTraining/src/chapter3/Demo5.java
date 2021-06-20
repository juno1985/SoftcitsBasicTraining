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


            String str = "";
            int shang;
            int yu;
            while((shang=x/10) != 0){
                yu = x % 10;
                str = yu + str;
                x /= 10;
            }
            yu = x % 10;
            str = yu + str;

            if(str.length() < 2){
                str = "00"+str;
            }
            else if(str.length() < 3){
                str = "0"+str;
            }
            System.out.println(result + str);
        }
        System.out.println("================================");

    }
}
