package chapter2;

import java.io.File;

public class Demo2 {

    public static void main(String[] args) {
        String path = "F:\\intermediate LS1";
        recursiveFindFile(path);
    }

    private static void recursiveFindFile(String path){
        File rootPath = new File(path);
        if( rootPath.isDirectory()){
            String[] fileList = rootPath.list();
            for(String fileName : fileList){
                File file = new File(path + "\\" + fileName);
                if(file.isFile()){
                    System.out.println(file.getPath());
                }
                else{
                    recursiveFindFile(file.getPath());
                }
            }
        }
        else{
            System.out.println(rootPath.getPath());
        }
    }
}
