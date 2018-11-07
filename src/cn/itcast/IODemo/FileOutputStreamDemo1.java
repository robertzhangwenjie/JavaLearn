package cn.itcast.IODemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream(file,true);
        fos.write("hello".getBytes());

        fos.write("world\r\n".getBytes());
        fos.close();
    }
}
