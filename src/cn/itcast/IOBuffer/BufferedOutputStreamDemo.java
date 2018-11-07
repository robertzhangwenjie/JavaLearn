package cn.itcast.IOBuffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建一个字节输出流
        //FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        //创建字节输出流缓冲流的对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a.txt"));
        bos.write(55);
        byte[] bytes = "helloworld".getBytes();
        bos.write(bytes);
        bos.write(bytes,3,2);
        bos.close();

    }
}
