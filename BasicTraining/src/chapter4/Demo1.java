package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();

        List<Integer> listInt = new ArrayList<>();

        System.out.println(listInt.getClass());

        List<String> listStr = new ArrayList<>();
        List<String> listStr1 = new ArrayList<>();
        System.out.println(listStr.getClass());
        System.out.println(listInt.getClass() == listStr.getClass());



       /* list.add("alex");
        list.add(5);


        for(String s : list){
            System.out.println(s.length());
        }*/
    }
}
