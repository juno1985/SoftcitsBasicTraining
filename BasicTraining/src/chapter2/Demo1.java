package chapter2;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        String fileName = "F:\\log\\stdout.log";
        File file = new File(fileName);

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.length() / 1024);

        File file1 = new File("F:\\log\\1.txt");
        System.out.println(file1.exists());
        System.out.println("---------------------------------------------");
        File file2 = new File("F:\\intermediate LS1");
        String[] list = file2.list();
        System.out.println(list.length);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);

        }
    }
}
