package cn.itcast.IOBuffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *  字节输入流的缓冲流
 *      java.io.BufferedInputStream
 *      继承InputStream
 *      读取方法read()单个字节，字节数组
 *
 *      构造方法:
 *          BufferedInputStream(InputStream in)
 *          可以传递任意的字节输入流，传递是谁，就提高谁的效率
 *          可以传递的字节输入流FileOutputStream
 *
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节出入流的缓冲流的对象，构造方法中报装字节出入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.txt"));
        byte[] bytes = new byte[10];
        int len =0;
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        bis.close();

    }
}
