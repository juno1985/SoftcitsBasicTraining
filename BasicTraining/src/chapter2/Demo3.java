package chapter2;

import java.io.File;
import java.io.FilenameFilter;

public class Demo3 {

    public static void main(String[] args) {
        String path = "F:\\intermediate LS1\\14. Postcards IV";

        File file = new File(path);
        String[] fileList = file.list(new Mp3FileNameFilter());

        for (String mp3File : fileList){
            System.out.println(mp3File);
        }

    }
}
class Mp3FileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".mp3");
    }
}