package cn.itcast.IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        //method for stream object
        //write a bytes
        fos.write(100);
        fos.write(49);
        fos.write(48);
        fos.write(48);

        //write out part of byte arrays
        byte[] bytes = {65,66,67,68};
        fos.write(bytes,1,2);

        //write out string
        fos.write("hello".getBytes());
        fos.close();
    }
}
