package chapter2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args)
    {
        try(
                // 创建字节输入流
                FileInputStream fis = new FileInputStream("F:\\log\\stdout.log");
                // 创建字节输出流
                FileOutputStream fos = new FileOutputStream("F:\\log\\new.txt")) {
            byte[] bbuf = new byte[8096];
            int hasRead = 0;
            // 循环从输入流中取出数据
            while ((hasRead = fis.read(bbuf)) > 0) {
                // 每读取一次，即写入文件输出流，读了多少，就写多少。
                fos.write(bbuf, 0, hasRead);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
