package chapter4;

import sun.misc.PostVMInitHook;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {


    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        Person p = new Person();
        map.put("mark", p);
    }

}
